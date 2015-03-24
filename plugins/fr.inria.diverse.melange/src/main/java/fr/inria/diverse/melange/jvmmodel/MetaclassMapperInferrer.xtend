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
import fr.inria.diverse.melange.metamodel.melange.PropertyBinding

class MetaclassMapperInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension MetamodelExtensions
	@Inject extension NamingHelper
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension ModelTypeExtensions
	@Inject extension JvmAnnotationReferenceBuilder$Factory jvmAnnotationReferenceBuilderFactory
	
	extension JvmAnnotationReferenceBuilder jvmAnnotationReferenceBuilder
	extension JvmTypeReferenceBuilder typeRefBuilder
	
	def void generateMapper(ClassBinding binding, ModelType sourceMT, ModelType targetMT, IJvmDeclaredTypeAcceptor acceptor, extension JvmTypeReferenceBuilder builder) {
		typeRefBuilder = builder
		jvmAnnotationReferenceBuilder = jvmAnnotationReferenceBuilderFactory.create(targetMT.extracted.eResource.resourceSet)
		
		
		val sourceClass = sourceMT.allClasses.findFirst[name == binding.from]
		val targetClass = targetMT.allClasses.findFirst[name == binding.to]
		
		val mapperName = sourceMT.mapperNameFor(targetMT,targetClass)
		acceptor.accept(binding.toClass(mapperName))
		[jvmCls |
			
			jvmCls.superTypes += EObjectAdapter.typeRef(sourceMT.interfaceNameFor(sourceClass).typeRef)
			jvmCls.superTypes += targetMT.interfaceNameFor(targetClass).typeRef
			
			jvmCls.members += targetMT.toField("adaptersFactory", sourceMT.getMappersFactoryNameFor(targetMT).typeRef)

			jvmCls.members += targetMT.toConstructor[
				body = '''
					super(«sourceMT.getMappersFactoryNameFor(targetMT)».getInstance()) ;
				'''
			]

			targetClass.EAllAttributes.filter[!derived].forEach[targetAttr |
				val propBinding = binding.properties.findFirst[propBinding | propBinding.to == targetAttr.name]
				if(propBinding != null){
					val sourceAttr = sourceClass.EAllAttributes.findFirst[name == propBinding.from]
					processAttribute(sourceAttr,targetAttr,sourceMT, targetMT, jvmCls)
				}
				else{
					processAttribute(null,targetAttr,sourceMT, targetMT, jvmCls)
				}
			]
			targetClass.EAllReferences.filter[!derived].forEach[targetRef |
				val propBinding = binding.properties.findFirst[propBinding | propBinding.to == targetRef.name]
				if(propBinding != null){
					val sourceRef = sourceClass.EAllReferences.findFirst[name == propBinding.from]
					processReference(sourceRef,targetRef,sourceMT, targetMT, jvmCls)
				}
				else{
					processReference(null,targetRef,sourceMT, targetMT, jvmCls)
				}
			]
			targetClass.EAllOperations.sortByOverridingPriority.forEach[processOperation(sourceMT, targetMT, jvmCls)]
		]
	}
	
	/**
	 * @sourceAttr == null means we can use getter/setter
	 */
	private def void processAttribute(EAttribute sourceAttr, EAttribute targetAttr, ModelType sourceMT, ModelType targetMT, JvmGenericType jvmCls) {
		
		val attrType = targetMT.typeRef(targetAttr, #[jvmCls])
		val getterName = if (!targetMT.extracted.isUml(targetAttr.EContainingClass)) targetAttr.getterName else targetAttr.umlGetterName
		val setterName = targetAttr.setterName
		
		var mappedGetter = ""
		var mappedSetter = ""
		if(sourceAttr != null){
			mappedGetter = if (!sourceMT.extracted.isUml(sourceAttr.EContainingClass)) sourceAttr.getterName else sourceAttr.umlGetterName
			mappedSetter = sourceAttr.setterName
		}
		val mappedGetterName = mappedGetter
		val mappedSetterName = mappedSetter
		
		jvmCls.members += targetMT.toMethod(getterName, attrType)[
//			annotations += Override.annotationRef

			if(sourceAttr == null){
				body = '''
					throw new UnsupportedOperationException("This attribute is not mapped");
				'''
			}
			else if (targetAttr.EType instanceof EEnum)
				body = '''
					return «targetMT.getFqnFor(targetAttr.EType)».get(adaptee.«getterName»().getValue());
				'''
			else
				body = '''
					return adaptee.«mappedGetterName»() ; 
				'''
		]

		if (targetAttr.needsSetter) {
			jvmCls.members += targetMT.toMethod(setterName, Void::TYPE.typeRef)[
//				annotations += Override.annotationRef
				parameters += targetMT.toParameter("o", attrType)

				if(sourceAttr == null){
					body = '''
						throw new UnsupportedOperationException("This attribute is not mapped");
					'''
				}
				else if (targetAttr.EType instanceof EEnum)
					body = '''
						adaptee.«mappedSetterName»(«targetMT.getFqnFor(targetAttr.EType)».get(o.getValue())) ;
					'''
				else
					body = '''
						adaptee.«mappedSetterName»(o) ;
					'''
			]
		}
	}
	
	/**
	 * @sourceRef == null means we can use getter/setter
	 */
	private def void processReference(EReference sourceRef, EReference targetRef, ModelType sourceMT, ModelType targetMT, JvmGenericType jvmCls) {
		
		val refType = targetMT.typeRef(targetRef, #[jvmCls])
		val mapName = sourceMT.mapperNameFor(targetMT, targetRef.EReferenceType)
		val getterName = if (!targetMT.extracted.isUml(targetRef.EContainingClass)) targetRef.getterName else targetRef.umlGetterName
		val setterName = targetRef.setterName
		
		var mappedGetter = ""
		var mappedSetter = ""
		if(sourceRef != null){
			mappedGetter = if (!sourceMT.extracted.isUml(sourceRef.EContainingClass)) sourceRef.getterName else sourceRef.umlGetterName
			mappedSetter = sourceRef.setterName
		}
		val mappedGetterName = mappedGetter
		val mappedSetterName = mappedSetter

		if (targetRef.isEMFMapDetails) // Special case: EMF Map$Entry
			jvmCls.members += targetMT.toMethod("getDetails", EMap.typeRef(String.typeRef, String.typeRef))[
				body = '''return adaptee.getDetails() ;'''
			]
		else
			jvmCls.members += targetMT.toMethod(getterName, refType)[
//				annotations += Override.annotationRef

				if(sourceRef == null){
					body = '''
						throw new UnsupportedOperationException("This method is not mapped");
					'''
				}
				else{
					body = '''
					«IF targetRef.many»
						return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.«mappedGetterName»(), «mapName».class) ;
					«ELSE»
						return adaptersFactory.create«sourceMT.simpleMapperNameFor(targetMT, targetRef.EReferenceType)»(adaptee.«mappedGetterName»()) ;
					«ENDIF»
				'''
				}
			]

		if (targetRef.needsSetter) {
			jvmCls.members += targetMT.toMethod(setterName, Void::TYPE.typeRef)[
//				annotations += Override.annotationRef
				parameters += targetMT.toParameter("o", refType)

				if(sourceRef == null){
					body = '''
						throw new UnsupportedOperationException("This method is not mapped");
					'''
				}
				else{
					body = '''
						adaptee.«mappedSetterName»(((«mapName») o).getAdaptee()) ;
					'''
				}
			]
		}
	}
	
	private def void processOperation(EOperation op, ModelType sourceMT, ModelType targetMT, JvmGenericType jvmCls) {
		val opName = if (!targetMT.extracted.isUml(op.EContainingClass)) op.name else op.formatUmlOperationName
		
		val newOp = op.toMethod(opName, null)[m |
//			m.annotations += Override.annotationRef

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

			op.EParameters.forEach[p | m.parameters += op.toParameter(p.name, targetMT.typeRef(p, #[m, jvmCls]))]

			// TODO: Manage exceptions
			op.EExceptions.forEach[e |
				m.exceptions += typeRef(if (e.instanceClass !== null) e.instanceClass.name else e.instanceTypeName)
			]

			// TODO: Manage generic exceptions
			op.EGenericExceptions.forEach[e |]
			
			m.body = '''
				throw new UnsupportedOperationException("This method is not mapped");
			'''
		]

		newOp.returnType = targetMT.typeRef(op, #[newOp, jvmCls])
		jvmCls.members += newOp
	}	
}