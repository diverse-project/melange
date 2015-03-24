package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.metamodel.melange.ClassBinding
import fr.inria.diverse.melange.metamodel.melange.ModelType
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EOperation
import org.eclipse.xtext.common.types.JvmGenericType
import fr.inria.diverse.melange.lib.EcoreExtensions
import org.eclipse.emf.ecore.EEnum
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.emf.common.util.EMap
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.emf.ecore.EClass
import fr.inria.diverse.melange.ast.ModelTypeExtensions

class MetaclassMapperInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension MetamodelExtensions
	@Inject extension NamingHelper
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension ModelTypeExtensions
	extension JvmAnnotationReferenceBuilder jvmAnnotationReferenceBuilder
	extension JvmTypeReferenceBuilder typeRefBuilder
	def void generateMapper(ClassBinding binding, ModelType sourceMT, ModelType targetMT, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		
		val sourceClass = sourceMT.allClasses.findFirst[name == binding.from] 
		val targetClass = targetMT.allClasses.findFirst[name == binding.to]
		
		val mapperName = sourceMT.mapperNameFor(targetMT,targetClass)
		acceptor.accept(binding.toClass(mapperName))
		[jvmCls |
			
			jvmCls.superTypes += EObjectAdapter.typeRef(sourceMT.interfaceNameFor(sourceClass).typeRef)
			jvmCls.superTypes += targetMT.interfaceNameFor(targetClass).typeRef
			
			targetClass.EAllAttributes.filter[!derived].forEach[processAttribute(sourceMT, targetMT, jvmCls)]
			targetClass.EAllReferences.filter[!derived].forEach[processReference(sourceMT, targetMT, jvmCls)]
			targetClass.EAllOperations.sortByOverridingPriority.forEach[processOperation(sourceMT, targetMT, jvmCls)]
		]
	}
	
	private def void processAttribute(EAttribute attr, ModelType sourceMT, ModelType targetMT, JvmGenericType jvmCls) {
		val attrType = targetMT.typeRef(attr, #[jvmCls])
		val getterName = if (!targetMT.extracted.isUml(attr.EContainingClass)) attr.getterName else attr.umlGetterName
		val setterName = attr.setterName
		
		jvmCls.members += attr.toMethod(getterName, attrType)[
			annotations += Override.annotationRef

			if (attr.EType instanceof EEnum)
				body = '''
					return «targetMT.getFqnFor(attr.EType)».get(adaptee.«getterName»().getValue());
				'''
			else//TODO: do the mapping
				body = '''
					return adaptee.«getterName»() ; 
				'''
		]

		if (attr.needsSetter) {
			jvmCls.members += attr.toMethod(setterName, Void::TYPE.typeRef)[
				annotations += Override.annotationRef
				parameters += attr.toParameter("o", attrType)

				if (attr.EType instanceof EEnum)
					body = '''
						adaptee.«setterName»(«targetMT.getFqnFor(attr.EType)».get(o.getValue())) ;
					'''
				else //TODO: do the mapping
					body = '''
						adaptee.«setterName»(o) ;
					'''
			]
		}
	}
	
	private def void processReference(EReference ref, ModelType sourceMT, ModelType targetMT, JvmGenericType jvmCls) {
		val refType = targetMT.typeRef(ref, #[jvmCls])
		val mapName = sourceMT.mapperNameFor(targetMT, ref.EReferenceType)
		val getterName = if (!targetMT.extracted.isUml(ref.EContainingClass)) ref.getterName else ref.umlGetterName
		val setterName = ref.setterName

		if (ref.isEMFMapDetails) // Special case: EMF Map$Entry
			jvmCls.members += ref.toMethod("getDetails", EMap.typeRef(String.typeRef, String.typeRef))[
				body = '''return adaptee.getDetails() ;'''
			]
		else//TODO: do the mapping
			jvmCls.members += ref.toMethod(getterName, refType)[
				annotations += Override.annotationRef

				body = '''
					«IF ref.many»
						return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.«getterName»(), «mapName».class) ;
					«ELSE»
						return adaptersFactory.create«sourceMT.mapperNameFor(targetMT, ref.EReferenceType)»(adaptee.«getterName»()) ;
					«ENDIF»
				'''
			]

		if (ref.needsSetter) {//TODO: do the mapping
			jvmCls.members += ref.toMethod(setterName, Void::TYPE.typeRef)[
				annotations += Override.annotationRef
				parameters += ref.toParameter("o", refType)

				body = '''
					adaptee.«setterName»(((«mapName») o).getAdaptee()) ;
				'''
			]
		}
	}
	
	private def void processOperation(EOperation op, ModelType sourceMT, ModelType targetMT, JvmGenericType jvmCls) {
		val opName = if (!targetMT.extracted.isUml(op.EContainingClass)) op.name else op.formatUmlOperationName
		
		val newOp = op.toMethod(opName, null)[m |
			m.annotations += Override.annotationRef

//			val paramsList = new StringBuilder

			op.ETypeParameters.forEach[t |
				m.typeParameters += TypesFactory.eINSTANCE.createJvmTypeParameter => [tp |
					tp.name = t.name
				]
			]

			op.ETypeParameters.forEach[t |
				t.EBounds
				.forEach[b |
					val tp = m.typeParameters.findFirst[name == t.name]

					if (b.EClassifier !== null)
						tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
							typeReference = targetMT.typeRef(b, #[m, jvmCls])
						]
					else if (b.ETypeParameter !== null)
						tp.constraints += TypesFactory.eINSTANCE.createJvmUpperBound => [
							typeReference = createTypeParameterReference(#[m, jvmCls], b.ETypeParameter.name)
						]
				]
			]

//			paramsList.append('''«FOR p : op.EParameters SEPARATOR ","»
//				«IF p.EType instanceof EClass && mm.hasAdapterFor(superType, p.EType)»
//					((«mm.adapterNameFor(superType, p.EType as EClass)») «p.name»).getAdaptee()
//				«ELSE»
//					«p.name»
//				«ENDIF»«ENDFOR»
//			''')

			op.EParameters.forEach[p | m.parameters += op.toParameter(p.name, targetMT.typeRef(p, #[m, jvmCls]))]

			// TODO: Manage exceptions
			op.EExceptions.forEach[e |
				m.exceptions += typeRef(if (e.instanceClass !== null) e.instanceClass.name else e.instanceTypeName)
			]

			// TODO: Manage generic exceptions
			op.EGenericExceptions.forEach[e |]

//			m.body = '''
//				«IF op.EType instanceof EClass && mm.hasAdapterFor(superType, op.EType)»
//					«IF op.many»
//						return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.«opName»(«paramsList»), «mm.adapterNameFor(superType, op.EType as EClass)».class) ;
//					«ELSE»
//						return adaptersFactory.create«mm.simpleAdapterNameFor(superType, op.EType as EClass)»(adaptee.«opName»(«paramsList»)) ;
//					«ENDIF»
//				«ELSEIF op.EType !== null»
//					return adaptee.«opName»(«paramsList») ;
//				«ELSE»
//					adaptee.«opName»(«paramsList») ;
//				«ENDIF»
//			'''
		]

		newOp.returnType = targetMT.typeRef(op, #[newOp, jvmCls])
		jvmCls.members += newOp
	}	
}