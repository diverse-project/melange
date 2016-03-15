package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.EListAdapter
import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.ClassBinding
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import org.eclipse.emf.common.util.EMap
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * @deprecated Mappers aren't in use for now
 */
class MetaclassMapperInferrer
{
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper
	@Inject extension EcoreExtensions
	@Inject extension MelangeTypesBuilder
	@Inject extension ModelingElementExtensions
	@Inject extension JvmAnnotationReferenceBuilder.Factory jvmAnnRefBuilderFact
	
	extension JvmAnnotationReferenceBuilder jvmAnnRefBuilder
	extension JvmTypeReferenceBuilder typeRefBuilder
	
	def void generateMapper(
		ClassBinding binding,
		Metamodel sourceModel,
		ModelType targetMT,
		IJvmDeclaredTypeAcceptor acceptor,
		extension JvmTypeReferenceBuilder builder
	) {
		typeRefBuilder = builder
		jvmAnnRefBuilder =
			jvmAnnRefBuilderFact.create(targetMT.extracted.eResource.resourceSet)

		val sourceClass =
			sourceModel.allClasses
			.findFirst[name == binding.from]
		val targetClass =
			targetMT.allClasses
			.findFirst[name == binding.to]

		val mapperName = sourceModel.mapperNameFor(targetMT,targetClass)
		acceptor.accept(binding.toClass(mapperName))
		[jvmCls |
			jvmCls.superTypes += EObjectAdapter.typeRef(
				sourceModel.typeRef(sourceClass, #[jvmCls]))
			jvmCls.superTypes += targetMT.getFqnFor(targetClass).typeRef
			
			jvmCls.members += targetMT.toField("adaptersFactory",
				sourceModel.getMappersFactoryNameFor(targetMT).typeRef)

			jvmCls.members += targetMT.toConstructor[
				body = '''
					super(«sourceModel.getMappersFactoryNameFor(targetMT)»«
					».getInstance());
				'''
			]

			targetClass
			.EAllAttributes
			.forEach[targetAttr |
				val propBinding =
					binding.properties
					.findFirst[to == targetAttr.name]

				if (propBinding !== null) {
					val sourceAttr =
						sourceClass.EAllAttributes
						.findFirst[name == propBinding.from]

					processAttribute(sourceAttr, targetAttr, targetMT, jvmCls)
				} else {
					processAttribute(null, targetAttr, targetMT, jvmCls)
				}
			]

			targetClass
			.EAllReferences
			.forEach[targetRef |
				val propBinding =
					binding.properties
					.findFirst[to == targetRef.name]

				if (propBinding !== null) {
					val sourceRef =
						sourceClass.EAllReferences
						.findFirst[name == propBinding.from]

					processReference(sourceRef, targetRef,sourceModel,
						targetMT, jvmCls)
				} else {
					processReference(null, targetRef, sourceModel,
						targetMT, jvmCls)
				}
			]

			targetClass
			.EAllOperations
			.sortByOverridingPriority
			.forEach[
				processOperation(targetMT, jvmCls)
			]
		]
	}

	/**
	 * sourceAttr != null means we can use getter/setter
	 */
	private def void processAttribute(
		EAttribute sourceAttr,
		EAttribute targetAttr,
		ModelType targetMT,
		JvmGenericType jvmCls
	) {
		val attrType = targetMT.typeRef(targetAttr, #[jvmCls])

		jvmCls.members += targetMT.toMethod(targetAttr.getterName, attrType)[
//			annotations += Override.annotationRef

			if (sourceAttr === null)
				body = '''
					throw new UnsupportedOperationException«
					»("This attribute is not mapped");
				'''
			else if (targetAttr.EType instanceof EEnum)
				body = '''
					return «targetMT.getFqnFor(targetAttr.EType)»«
					».get(adaptee.«sourceAttr.getterName»().getValue());
				'''
			else
				body = '''
					return adaptee.«sourceAttr.getterName»(); 
				'''
		]

		if (targetAttr.needsSetter)
			jvmCls.members += targetMT.toMethod(targetAttr.setterName,
				Void::TYPE.typeRef)[
//				annotations += Override.annotationRef
				parameters += targetMT.toParameter("o", attrType)

				if (sourceAttr === null)
					body = '''
						throw new UnsupportedOperationException«
						»("This attribute is not mapped");
					'''
				else if (targetAttr.EType instanceof EEnum)
					body = '''
						adaptee.«sourceAttr.setterName»«
						»(«targetMT.getFqnFor(targetAttr.EType)».get(o.getValue()));
					'''
				else
					body = '''
						adaptee.«sourceAttr.setterName»(o);
					'''
			]
	}
	
	/**
	 * sourceRef != null means we can use getter/setter
	 */
	private def void processReference(
		EReference sourceRef,
		EReference targetRef,
		Metamodel sourceModel,
		ModelType targetMT,
		JvmGenericType jvmCls
	) {	
		
		val refType = targetMT.typeRef(targetRef, #[jvmCls])
		val mapName = sourceModel.mapperNameFor(targetMT, targetRef.EReferenceType)

		if (targetRef.isEMFMapDetails) // Special case: EMF Map$Entry
			jvmCls.members += targetMT.toMethod("getDetails",
				EMap.typeRef(String.typeRef, String.typeRef))[
				body = '''return adaptee.getDetails();'''
			]
		else
			jvmCls.members += targetMT.toMethod(targetRef.getterName, refType)[
//				annotations += Override.annotationRef

				if (sourceRef === null)
					body = '''
						throw new UnsupportedOperationException«
						»("This method is not mapped");
					'''
				else {
					val mapperName = sourceModel.simpleMapperNameFor(targetMT,
						targetRef.EReferenceType)

					body = '''
						«IF targetRef.many»
							return «EListAdapter».newInstance(adaptee.«
							»«sourceRef.getterName»(), «mapName».class);
						«ELSE»
							return adaptersFactory.create«mapperName»«
							»(adaptee.«sourceRef.getterName»());
						«ENDIF»
					'''
				}
			]

		if (targetRef.needsSetter)
			jvmCls.members += targetMT.toMethod(targetRef.setterName, Void::TYPE.typeRef)[
//				annotations += Override.annotationRef
				parameters += targetMT.toParameter("o", refType)

				if (sourceRef === null)
					body = '''
						throw new UnsupportedOperationException«
						»("This method is not mapped");
					'''
				else
					body = '''
						adaptee.«sourceRef.setterName»(((«mapName») o)«
						».getAdaptee());
					'''
			]
	}

	private def void processOperation(
		EOperation op,
		ModelType targetMT,
		JvmGenericType jvmCls
	) {
		val opName =
			if (!op.EContainingClass.EPackage.isUml)
				op.name
			else
				op.formatUmlOperationName

		val newOp = op.toMethod(opName, null)[m |
//			m.annotations += Override.annotationRef

			op.ETypeParameters.forEach[t |
				m.typeParameters +=
					TypesFactory.eINSTANCE.createJvmTypeParameter => [tp |
						tp.name = t.name
					]
			]

			op.ETypeParameters.forEach[t |
				t.EBounds
				.forEach[b |
					val tp = m.typeParameters.findFirst[name == t.name]

					if (b.EClassifier !== null)
						tp.constraints +=
							TypesFactory.eINSTANCE.createJvmUpperBound => [
								typeReference = targetMT.typeRef(b, #[m, jvmCls])
							]
					else if (b.ETypeParameter !== null)
						tp.constraints +=
							TypesFactory.eINSTANCE.createJvmUpperBound => [
								typeReference = createTypeParameterReference(
									#[m, jvmCls], b.ETypeParameter.name)
							]
				]
			]

			op.EParameters.forEach[p |
				m.parameters += op.toParameter(p.name,
					targetMT.typeRef(p, #[m, jvmCls]))
			]

			// TODO: Manage exceptions
			op.EExceptions.forEach[e |
				m.exceptions += typeRef(
					if (e.instanceClass !== null)
						e.instanceClass.name
					else
						e.instanceTypeName
				)
			]

			// TODO: Manage generic exceptions
			op.EGenericExceptions.forEach[e |]
			
			m.body = '''
				throw new UnsupportedOperationException«
				»("This method is not mapped");
			'''
		]

		newOp.returnType = targetMT.typeRef(op, #[newOp, jvmCls])
		jvmCls.members += newOp
	}	
}
