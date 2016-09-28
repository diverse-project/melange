package fr.inria.diverse.melange.jvmmodel

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.EListAdapter
import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.MappingExtensions
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Mapping
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.utils.AspectToEcore
import fr.inria.diverse.melange.utils.TypeReferencesHelper
import java.util.Collection
import org.eclipse.emf.common.util.EMap
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference
import org.eclipse.xtext.common.types.JvmTypeReference
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.common.types.TypesFactory
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Generates a Java adapter for a given {@link EClass} in a pair (MM, MT)
 * where MM implements (<#) MT.
 */
class MetaclassAdapterInferrer
{
	@Inject extension JvmModelInferrerHelper
	@Inject extension JvmTypesBuilder
	@Inject extension NamingHelper
	@Inject extension AspectExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension EcoreExtensions
	@Inject extension AspectToEcore
	@Inject extension MelangeTypesBuilder
	@Inject extension TypeReferencesHelper
	@Inject extension JvmAnnotationReferenceBuilder.Factory jvmAnnRefBuilderFact
	@Inject extension MappingExtensions
	@Inject extension IQualifiedNameProvider
	extension JvmAnnotationReferenceBuilder jvmAnnRefBuilder
	extension JvmTypeReferenceBuilder typeRefBuilder

	/**
	 * Generates the appropriate Java adapter between {@code mm} and {@code mt}
	 * for the {@link EClass} {@code cls}. The adapter essentially implements
	 * the methods defined in the interface materialized by {@code mt} and
	 * delegates the implementation to the corresponding meta-class in the
	 * implementing {@link Metamodel} {@code mm}.
	 * 
	 * @see EObjectAdapter
	 */
	def void generateAdapter(
		Metamodel mm,
		ModelType superType,
		EClass cls,
		IJvmDeclaredTypeAcceptor acceptor,
		extension JvmTypeReferenceBuilder builder
	) {
		val task = Stopwatches.forTask("generate metaclass adapters")
		task.start

		typeRefBuilder = builder
		jvmAnnRefBuilder =
			jvmAnnRefBuilderFact.create(mm.eResource.resourceSet)

		val mapping = mm.owningLanguage.mappings.findFirst[to == superType]
		val mmCls = mm.allClasses.findFirst[mapping.namesMatch(it, cls)]

		acceptor.accept(mm.toClass(mm.adapterNameFor(superType, cls)))
		[jvmCls |
			// For each ETypeParameter of cls, create a corresponding type
			// parameter in the JVM model
			cls.ETypeParameters.forEach[p |
				jvmCls.typeParameters +=
					TypesFactory::eINSTANCE.createJvmTypeParameter => [
						name = p.name
					]
			]

			// Implement the EObjectAdapter interface, and the appropriate
			// interface of the implemented model type
			jvmCls.superTypes += EObjectAdapter.typeRef(mm.typeRef(mmCls, #[jvmCls]))
			jvmCls.superTypes += superType.typeRef(cls, #[jvmCls])

			// TODO: Generic super types
			cls.EGenericSuperTypes.forEach[sup |]

			// Hold a reference to the adapters factory for the couple <MM, MT>
			// to ease the creation of adapters in the remainder of the class
			val adaptersFactoryFqn = mm.getAdaptersFactoryNameFor(superType)
			jvmCls.members += mm.toField("adaptersFactory", adaptersFactoryFqn.typeRef)
			jvmCls.members += mm.toConstructor[
				body = '''
					super(«adaptersFactoryFqn».getInstance());
					adaptersFactory = «adaptersFactoryFqn».getInstance();
				'''
			]

			// For each non-aspect-specific attribute, delegate to processAttribute()
			cls.EAllAttributes
			.filter[!isAspectSpecific]
			.forEach[
				processAttribute(mmCls, mm, superType, mapping, jvmCls)
			]

			// For each non-aspect-specific reference, delegate to processReference()
			cls.EAllReferences
			.filter[!isAspectSpecific]
			.forEach[
				processReference(mmCls, mm, superType, mapping, jvmCls)
			]

			// For each non-aspect-specific operation, delegate to processOperation()
			cls.EAllOperations
			.sortByOverridingPriority
			.filter[!hasSuppressedVisibility && !isAspectSpecific]
			.forEach[
				processOperation(mm, superType, jvmCls)
			]

			// For each aspect woven on cls, delegate to processAspect()
			mm.owningLanguage
			.findAspectsOn(cls)
			.sortByOverridingPriority
			.forEach[
				processAspect(mm, superType, jvmCls)
			]

			// Finally, generate all the necessary code for handling
			// reflective EMF calls
			cls.processReflectiveLayer(mm, superType, jvmCls)
		]

		task.stop
	}

	/**
	 * Creates accessors/mutators for the {@link EAttribute} {@code attr}
	 * and adds them to the currently generated {@code jvmCls}
	 */
	private def void processAttribute(
		EAttribute attr,
		EClass mmCls,
		Metamodel mm,
		ModelType superType,
		Mapping mapping,
		JvmGenericType jvmCls
	) {
		val attrType = superType.typeRef(attr, #[jvmCls])
		val mmAttr = mapping.findCorrespondingFeature(mmCls, attr)

		// Generate a getter in any case: T getX()
		jvmCls.members += mm.toMethod(attr.getterName, attrType)[
			annotations += Override.annotationRef

			if (attr.EType instanceof EEnum)
				body = '''
					return «superType.getFqnFor(attr.EType)»«
					».get(adaptee.«mmAttr.getterName»().getValue());
				'''
			else
				body = '''
					return adaptee.«mmAttr.getterName»();
				'''
		]

		// If needed, the corresponding setter: void setX(T)
		if (attr.needsSetterImplementation) {
			jvmCls.members += mm.toMethod(attr.setterName, Void::TYPE.typeRef)[
				if (attr.needsSetterInterface)
					annotations += Override.annotationRef

				parameters += mm.toParameter("o", attrType)

				if (attr.EType instanceof EEnum)
					body = '''
						adaptee.«mmAttr.setterName»«
						»(«mm.getFqnFor(attr.EType)».get(o.getValue()));
					'''
				else
					body = '''
						adaptee.«mmAttr.setterName»(o);
					'''
			]
		}

		// void unsetX()
		if (attr.needsUnsetterImplementation)
			jvmCls.members += mm.toUnsetter(attr, mm)

		// boolean isSetX()
		if (attr.needsUnsetterCheckerImplementation)
			jvmCls.members += mm.toUnsetterCheck(attr, mm)
	}

	/**
	 * Creates accessors/mutators for the {@link EReference} {@code ref}
	 * and adds them to the currently generated {@code jvmCls}
	 */
	private def void processReference(
		EReference ref,
		EClass mmCls,
		Metamodel mm,
		ModelType superType,
		Mapping mapping,
		JvmGenericType jvmCls
	) {
		val refType = superType.typeRef(ref, #[jvmCls])
		val mmRef = mapping.findCorrespondingFeature(mmCls, ref)
		val adapName = mm.adapterNameFor(superType, ref.EReferenceType)

		// Special case: EMF Map$Entry from Ecore
		// ... don't know how to generate this one properly
		if (ref.isEMFMapDetails) {
			val eMapTypeRef = EMap.typeRef(String.typeRef, String.typeRef)

			jvmCls.members += mm.toMethod("getDetails", eMapTypeRef)[
				body = '''return adaptee.getDetails();'''
			]
		}
		// Any other reference
		else {
			// If this is a many reference, we keep a pointer to it in a local
			// field to avoid recreating a new EListAdapter everytime it is accessed
			val refFieldName = ref.name +"_"
			if (ref.many)
				jvmCls.members += mm.toField(refFieldName, refType)

			// T getX()
			jvmCls.members += mm.toMethod(ref.getterName, refType)[
				annotations += Override.annotationRef

				body = '''
					«IF mm.owningLanguage.hasAdapterFor(superType, ref.EReferenceType)»
						«IF ref.many»
							if («refFieldName» == null)
								«refFieldName» = «EListAdapter.canonicalName»«
								».newInstance(adaptee.«mmRef.getterName»(),«
								» adaptersFactory, eResource);
							return «refFieldName»;
						«ELSE»
							return («refType.type») adaptersFactory.createAdapter«
							»(adaptee.«mmRef.getterName»(), eResource);
						«ENDIF»
					«ELSE»
						return adaptee.«mmRef.getterName»();
					«ENDIF»
				'''
			]
		}

		// void setX(T)
		if (ref.needsSetterImplementation) {
			jvmCls.members += mm.toMethod(ref.setterName, Void::TYPE.typeRef)[
				if (ref.needsSetterInterface)
					annotations += Override.annotationRef

				parameters += mm.toParameter("o", refType)

				body = '''
					if (o != null)
						adaptee.«mmRef.setterName»(((«adapName») o).getAdaptee());
					else adaptee.«mmRef.setterName»(null);
				'''
			]
		}

		// void unsetX()
		if (ref.needsUnsetterImplementation)
			jvmCls.members += mm.toUnsetter(ref, mm)

		// boolean isSetX()
		if (ref.needsUnsetterCheckerImplementation)
			jvmCls.members += mm.toUnsetterCheck(ref, mm)
	}

	/**
	 * Implements the {@link EOperation} {@code op}, delegates its execution
	 * to the corresponding operation in the implementing language, and adds
	 * it to the currently created {@code jvmCls}
	 */
	private def void processOperation(
		EOperation op,
		Metamodel mm,
		ModelType superType,
		JvmGenericType jvmCls
	) {
		val opName =
			if (!op.EContainingClass.EPackage.isUml)
				op.name
			else
				op.formatUmlOperationName

		val newOp = mm.toMethod(opName, null)[m |
			m.annotations += Override.annotationRef

			val paramsList = new StringBuilder

			// For each ETypeParameter of the operation, first create
			// the corresponding type parameters in the JVM model...
			op.ETypeParameters.forEach[t |
				m.typeParameters +=
					TypesFactory.eINSTANCE.createJvmTypeParameter => [tp |
						tp.name = t.name
					]
			]

			// Then, specify the bounds of each of the previously inferred
			// type parameters
			op.ETypeParameters.forEach[t |
				t.EBounds
				.forEach[b |
					val tp = m.typeParameters.findFirst[name == t.name]

					if (b.EClassifier !== null)
						tp.constraints +=
							TypesFactory.eINSTANCE.createJvmUpperBound => [
								typeReference = superType.typeRef(b, #[m, jvmCls])
							]
					else if (b.ETypeParameter !== null)
						tp.constraints +=
							TypesFactory.eINSTANCE.createJvmUpperBound => [
								typeReference = createTypeParameterReference(
									#[m, jvmCls], b.ETypeParameter.name)
							]
				]
			]

			// Then browse the EParameters of the current EOperation and create
			// a comma-separated list of the arguments that will be forwarded to
			// the corresponding operation in the implementing language 
			paramsList.append(
				'''«FOR p : op.EParameters SEPARATOR ","»
					«IF p.EType instanceof EClass
						&& mm.owningLanguage.hasAdapterFor(superType, p.EType)»
						«IF p.many»
							((«EListAdapter.canonicalName») «p.name»).getAdaptee()
						«ELSE»
							((«mm.adapterNameFor(superType, p.EType as EClass)»)«
							» «p.name»).getAdaptee()
						«ENDIF»
					«ELSEIF p.EType instanceof EEnum»
						«mm.getFqnFor(p.EType)».get(«p.name».getValue())
					«ELSE»
						«p.name»
					«ENDIF»«ENDFOR»
				'''
			)

			// Create the corresponding parameters in the current op
			op.EParameters.forEach[p |
				m.parameters +=
					mm.toParameter(p.name, superType.typeRef(p, #[m, jvmCls]))
			]

			// Copy type references to the declared exceptions
			op.EExceptions.forEach[e |
				m.exceptions +=
					typeRef(
						if (e.instanceClass !== null)
							e.instanceClass.name
						else
							e.instanceTypeName
					)
			]

			// TODO: Manage generic exceptions
			op.EGenericExceptions.forEach[e |]

			m.body = '''
				«IF op.EType instanceof EClass
					&& mm.owningLanguage.hasAdapterFor(superType, op.EType)»
					«IF op.many»
						return «EListAdapter.canonicalName».newInstance«
						»(adaptee.«opName»(«paramsList»), adaptersFactory, eResource);
					«ELSE»
						return («superType.typeRef(op, #[jvmCls]).type») «
						»adaptersFactory.createAdapter(«
						»adaptee.«opName»(«paramsList»), eResource);
					«ENDIF»
				«ELSEIF op.EType !== null»
					return adaptee.«opName»(«paramsList»);
				«ELSE»
					adaptee.«opName»(«paramsList»);
				«ENDIF»
			'''
		]

		newOp.returnType = superType.typeRef(op, #[newOp, jvmCls])
		jvmCls.members += newOp
	}

	/**
	 * Browse the meaningful (ie. not _privk3, super_) methods of the
	 * {@code aspect}, infer the corresponding implementation in the adapter,
	 * and add them to the currently processed {@code jvmCls}
	 */
	private def void processAspect(
		Aspect aspect,
		Metamodel mm,
		ModelType superType,
		JvmGenericType jvmCls
	) {
		// At this stage, we have to link to the *actual* aspect to be used
		// i.e. the one that may have been "type-group-transformed"
		// (which means we assume it exists/has been generated/is a JvmDeclaredType)
		if (!aspect.isValid)
			return;

		// Just change the actual type reference to the aspect transiently
		// and then put it back to its original value once the generation is done
		val oldRef = aspect.aspectTypeRef
		aspect.aspectTypeRef =
			if (!aspect.aspectTypeRef.isDefinedOver(mm))
				typeRef('''«mm.owningLanguage.aspectsNamespace».«
				»«aspect.aspectTypeRef.simpleName»''')
			else
				oldRef

		val aspType = aspect.aspectTypeRef.type
		if (aspType !== null)
			if (aspType instanceof JvmDeclaredType)
				aspType.declaredOperations
				.filter[op |
					   !op.simpleName.startsWith("_privk3")
					&& !op.simpleName.startsWith("super_")
					// FIXME: check for overriding instead? :/
					&& !jvmCls.members.exists[opp | opp.simpleName == op.simpleName]
					&& op.visibility == JvmVisibility.PUBLIC
				]
				.forEach[
					processAspectOperation(aspect, mm, superType, jvmCls)
				]

		aspect.aspectTypeRef = oldRef
	}

	/**
	 * Wololo, wololo wololo.
	 */
	private def void processAspectOperation(
		JvmOperation op,
		Aspect aspect,
		Metamodel mm,
		ModelType superType,
		JvmGenericType jvmCls
	) {
		val asp = aspect.aspectTypeRef.type as JvmDeclaredType
		val paramsList = new StringBuilder
		val featureName = asp.findFeatureNameFor(op, typeRefBuilder)
		val realType =
			if (op.returnType.isCollection)
				(op.returnType as JvmParameterizedTypeReference)
				.arguments.head.type.qualifiedName
			else
				op.returnType.qualifiedName
		val mtCls =
			if (op.returnType.isCollection)
				superType.findClass(realType)
			else
				superType.findClass(realType)
		val retType =
			if (op.returnType.simpleName == "void")
				typeRef(Void.TYPE)
			else if (mtCls !== null)
				if (op.returnType.isCollection)
					"org.eclipse.emf.common.util.EList".typeRef(
						superType.typeRef(mtCls, #[jvmCls]))
				else
					superType.typeRef(mtCls, #[jvmCls])
			else if (op.returnType.isCollection)
				"org.eclipse.emf.common.util.EList".typeRef(
					(op.returnType as JvmParameterizedTypeReference)
					.arguments.head.qualifiedName.typeRef)
			else
				op.returnType.qualifiedName.typeRef

		paramsList.append("adaptee")
		// First parameter is _self, drop it
		op.parameters.drop(1).forEach[p, i |
			val realTypeP =
				if (p.parameterType.isCollection)
					(p.parameterType as JvmParameterizedTypeReference)
					.arguments.head.type.qualifiedName
				else
					p.parameterType.qualifiedName

			// Build the comma-separated list of operation arguments
			paramsList.append('''
				«IF mm.owningLanguage.hasAdapterFor(superType, p.parameterType.qualifiedName)»
					, («p.parameterType.qualifiedName»)((EObjectAdapter)«p.name»).getAdaptee()
				«ELSEIF p.parameterType.isCollection
					&& mm.owningLanguage.hasAdapterFor(superType, realTypeP)»
					, ((«EListAdapter.canonicalName») «p.name»).getAdaptee()
				«ELSE»
					, «p.name»
				«ENDIF»
			''')
		]

		val opName =
			if (featureName === null)
				op.simpleName
			else if (op.parameters.size == 1)
				op.getterName
			else
				op.setterName
		val correspondingCls = superType.findClass(aspect.aspectedClass?.fullyQualifiedName.toString)

		// If the super type doesn't expose this method, we don't need to generate it
		val correspondingFeature =
			correspondingCls.EAllStructuralFeatures
			.findFirst[name == featureName]
		val isSetter = correspondingFeature !== null && op.parameters.size == 2
		if ((correspondingFeature !== null
			|| correspondingCls.EAllOperations.exists[name == opName])
			&&
			(!isSetter || correspondingFeature.needsSetterInterface)) {
			jvmCls.members += mm.toMethod(opName, retType)[
				annotations += Override.annotationRef

				// Drop first _self argument
				op.parameters.drop(1).forEach[p |
					val realTypeP =
						if (p.parameterType.isCollection)
							(p.parameterType as JvmParameterizedTypeReference)
							.arguments.head.type.simpleName
						else
							p.parameterType.simpleName
					val pCls = superType.findClassifier(realTypeP)
					val pType =
						if (pCls !== null)
							if (p.parameterType.isCollection)
								p.parameterType.type.typeRef(
									superType.typeRef(pCls, #[jvmCls]))
							else
								superType.typeRef(pCls, #[jvmCls])
						else
							p.parameterType.qualifiedName.typeRef

					parameters += mm.toParameter(p.name, pType)
				]

				body = '''
					«IF retType.isValidReturnType»
						«IF mm.owningLanguage.hasAdapterFor(superType, realType)»
							«IF op.returnType.isCollection»
								return «EListAdapter.canonicalName».«
								»newInstance(«asp.qualifiedName».«
								»«op.simpleName»(«paramsList»), adaptersFactory, eResource);
							«ELSE»
								return («retType.type») adaptersFactory.«
								»createAdapter(«asp.qualifiedName».«
								»«op.simpleName»(«paramsList»), eResource);
							«ENDIF»
						«ELSE»
							return «asp.qualifiedName».«op.simpleName»«
							»(«paramsList»);
						«ENDIF»
					«ELSE»
						«asp.qualifiedName».«op.simpleName»(«paramsList»);
					«ENDIF»
				'''
			]
		}
	}

	/**
	 * Generates the necessary methods in {@code jvmCls} for handling
	 * reflective EMF calls on elements through a model type, ie.
	 * eClass(), eSet(), eGet(), eUnset(), eIsSet().
	 * <br>
	 * Closely inspired by the code generation of EMF for those methods.
	 */
	private def void processReflectiveLayer(
		EClass cls,
		Metamodel mm,
		ModelType superType,
		JvmGenericType jvmCls
	) {
		val genCls = superType.getGenClsFor(cls)
		val negativeOffsetCorrection =
			if (genCls.hasOffsetCorrection)
				" - " + genCls.getOffsetCorrectionField(null)
		val positiveOffsetCorrection =
			if (genCls.hasOffsetCorrection)
				" + " + genCls.getOffsetCorrectionField(null)

		// For each feature in the class for which a EDefault is needed,
		// generate the static instance field holding its default value
		genCls.allGenFeatures
		.filter[hasEDefault && !ecoreFeature.many]
		.forEach[genFeature |
			jvmCls.members += mm.toField(genFeature.EDefault,
				genFeature.getImportedType(genCls).typeRef)[
				visibility = JvmVisibility::PROTECTED
				static = true
				final = true
				initializer = '''«genFeature.staticDefaultValue»'''
			]
		]

		// eClass() always returns the EClass of the super model type,
		// so that reflective calls can only access the meta-information
		// provided by the interface, not the one of the underlying meta-class
		jvmCls.members += mm.toMethod("eClass", EClass.typeRef)[
			annotations += Override.annotationRef
			
			val safeName = 
				if(cls.name.equals("Class"))
					cls.name+"_"
				else
					cls.name
			body = '''
				return «superType.getFqnFor(cls.EPackage)».eINSTANCE.get«safeName»();
			'''
		]

		if (!genCls.allGenFeatures.empty) {
			// The generic eGet() methods are directly available since we inherit
			// from EObjectImpl through EObjectAdapter. We only need to specify
			// the most precise eGet(boolean, int, int) that will be invoked
			// ultimately by the other eGet(...) methods
			jvmCls.members += mm.toMethod("eGet", Object.typeRef)[
				annotations += Override.annotationRef

				parameters += mm.toParameter("featureID", Integer::TYPE.typeRef)
				parameters += mm.toParameter("resolve", Boolean::TYPE.typeRef)
				parameters += mm.toParameter("coreType", Boolean::TYPE.typeRef)

				body = '''
					switch (featureID«negativeOffsetCorrection») {
						«FOR genFeature : genCls.allGenFeatures»
						case «genCls.getQualifiedFeatureID(genFeature)»:
							«IF genFeature.primitiveType»
								«IF genFeature.booleanType»
									return «genFeature.getAccessor»() «
									»? Boolean.TRUE : Boolean.FALSE;
								«ELSE»
									return new «genFeature.getObjectType(genCls)»«
									»(«genFeature.getAccessor»());
								«ENDIF»
							«ELSE» 
								return «genFeature.getAccessor»();
							«ENDIF»
						«ENDFOR»
					}

					return super.eGet(featureID, resolve, coreType);
				'''
			]

			// Same thing for eUnset(), we only implement the
			// eUnset(int) version
			if (!genCls.allGenFeatures.filter[unsettable].empty)
				jvmCls.members += mm.toMethod("eUnset", Void::TYPE.typeRef)[
					annotations += Override.annotationRef
	
					parameters += mm.toParameter("featureID", Integer::TYPE.typeRef)
	
					body = '''
						switch (featureID«negativeOffsetCorrection») {
							«FOR genFeature : genCls.allGenFeatures.filter[unsettable]»
							case «genCls.getQualifiedFeatureID(genFeature)»:
								«IF genFeature.listType && !genFeature.unsettable»
									«genFeature.getAccessor»().clear();
								«ELSEIF genFeature.unsettable»
									unset«genFeature.accessorName»();
								«ELSEIF !genFeature.hasEDefault»
									set«genFeature.accessorName»«
									»((«genFeature.getImportedType(genCls)») null);
								«ELSE»
									set«genFeature.accessorName»(«genFeature.EDefault»);
								«ENDIF»
							«ENDFOR»
							return;
						}

						super.eUnset(featureID);
					'''
				]

			// Same thing for eIsSet(), we only implement the
			// eIsSet(int) version
			jvmCls.members += mm.toMethod("eIsSet", Boolean::TYPE.typeRef)[
				annotations += Override.annotationRef

				parameters += mm.toParameter("featureID", Integer::TYPE.typeRef)

				body = '''
					switch (featureID«negativeOffsetCorrection») {
						«FOR genFeature : genCls.allGenFeatures»
						case «genCls.getQualifiedFeatureID(genFeature)»:
							«IF genFeature.listType && !genFeature.unsettable»
								return «genFeature.getAccessor»() != null «
								»&& !«genFeature.getAccessor»().isEmpty();
							«ELSEIF genFeature.unsettable»
								return isSet«genFeature.accessorName»();
							«ELSEIF !genFeature.hasEDefault»
								return «genFeature.getAccessor»() != null;
							«ELSE»
								return «genFeature.getAccessor»() «
								»!= «genFeature.EDefault»;
							«ENDIF»
						«ENDFOR»
					}

					return super.eIsSet(featureID);
				'''
			]

		if (!genCls.allGenFeatures.filter[changeable].empty)
			// Same thing for eSet(), we only implement the most precise
			// signature, ie. eSet(int, Object)
			jvmCls.members += mm.toMethod("eSet", Void::TYPE.typeRef)[
				annotations += Override.annotationRef

				parameters += mm.toParameter("featureID", Integer::TYPE.typeRef)
				parameters += mm.toParameter("newValue", Object.typeRef)

				body = '''
					switch (featureID«negativeOffsetCorrection») {
						«FOR genFeature : genCls.allGenFeatures.filter[changeable]»
						case «genCls.getQualifiedFeatureID(genFeature)»:
							«IF genFeature.listType»
								«genFeature.getAccessor»().clear();
								«genFeature.getAccessor»().«
								»addAll((«Collection») newValue);
							«ELSEIF genFeature.primitiveType»
								set«genFeature.accessorName»(((«
								»«genFeature.getObjectType(genCls)») newValue)«
								».«genFeature.primitiveValueFunction»());
							«ELSE»
								set«genFeature.accessorName»«
								»(«IF genFeature.typeGenDataType === null
								|| !genFeature.typeGenDataType.isObjectType
								|| !genFeature.rawType.equals(genFeature.getType(genCls))»
								(«genFeature.getObjectType(genCls)»)
								«ENDIF» newValue);
							«ENDIF»
							return;
						«ENDFOR»
					}

					super.eSet(featureID, newValue);
				'''
			]

			// Just the incomprehensible and esoteric EMF mixture.
			// Wololo, wololo wololo.
			if (!genCls.mixinGenFeatures.empty || genCls.hasOffsetCorrection) {
				jvmCls.members +=
					mm.toMethod("eBaseStructuralFeatureID", Integer::TYPE.typeRef)[
						annotations += Override.annotationRef

						parameters += mm.toParameter("derivedFeatureID",
							Integer::TYPE.typeRef)
						parameters += mm.toParameter("baseClass",
							Class.typeRef(
								TypesFactory::eINSTANCE.createJvmWildcardTypeReference
							))

						body = '''
						«FOR mixinCls : genCls.mixinGenClasses»
							if (baseClass == «
								»«mixinCls.rawImportedInterfaceName».class) {
								switch (derivedFeatureID«negativeOffsetCorrection») {
									«FOR genFeature : mixinCls.genFeatures»
									case «genCls.getQualifiedFeatureID(genFeature)»:
										return «mixinCls.getQualifiedFeatureID(genFeature)»;
									«ENDFOR»
									default: return -1;
								}
							}
						«ENDFOR»

						return super.eBaseStructuralFeatureID«
						»(derivedFeatureID, baseClass);
						'''
					]

				jvmCls.members += mm.toMethod("eDerivedStructuralFeatureID",
					Integer::TYPE.typeRef)[
					annotations += Override.annotationRef

					parameters += mm.toParameter("baseFeatureID",
						Integer::TYPE.typeRef)
					parameters += mm.toParameter("baseClass",
						Class.typeRef(
							TypesFactory::eINSTANCE.createJvmWildcardTypeReference
						))

					body = '''
					«FOR mixinCls : genCls.mixinGenClasses»
						if (baseClass == «mixinCls.rawImportedInterfaceName».class) {
							switch (baseFeatureID) {
								«FOR genFeature : mixinCls.genFeatures»
									case «mixinCls.getQualifiedFeatureID(genFeature)»:
										return «genCls.getQualifiedFeatureID(genFeature)»;
								«ENDFOR»
								default: return -1;
							}
						}
					«ENDFOR»

					«IF genCls.hasOffsetCorrection»
						if (baseClass == «genCls.rawImportedInterfaceName».class) {
							switch (baseFeatureID«negativeOffsetCorrection») {
								«FOR genFeature : genCls.genFeatures»
									case «genCls.getQualifiedFeatureID(genFeature)»:
										return «genCls.getQualifiedFeatureID(genFeature)»«
										»«positiveOffsetCorrection»;
								«ENDFOR»
								default: return -1;
							}
						}
					«ENDIF»

					return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
					'''
				]
			}
		}
	}

	/**
	 * Checks whether the given {@link JvmTypeReference} {@code ref} can be
	 * used in code generation, ie. it points to a non-null {@link JvmType}
	 */
	private def boolean isValidReturnType(JvmTypeReference ref) {
		return ref.type !== null && ref.type.simpleName != "void" && ref.type.simpleName != "null"
	}

//	private def JvmTypeReference wrapperIfPrimitiveType(JvmTypeReference ref) {
//		return
//			switch (ref.simpleName) {
//				case "int": Integer.typeRef
//				case "float": Float.typeRef
//				case "boolean": Boolean.typeRef
//				case "double": Double.typeRef
//				case "short": Short.typeRef
//				case "byte": Byte.typeRef
//				case "char": Character.typeRef
//				default: ref
//			}
//	}
//
//	def boolean +=(EList<JvmMember> members, JvmOperation m) {
//		if (!members.filter(JvmOperation).exists[overrides(m)])
//			members += (m as JvmMember)
//
//		return false
//	}
}
