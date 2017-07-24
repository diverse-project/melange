package fr.inria.diverse.melange.utils

import com.google.inject.Inject
import org.eclipse.gemoc.event.commons.model.property.PropertyPackage
import org.eclipse.gemoc.event.commons.model.scenario.ScenarioPackage
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import java.io.IOException
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import org.apache.log4j.Logger
import org.eclipse.emf.codegen.ecore.genmodel.GenJDKLevel
import org.eclipse.emf.codegen.ecore.genmodel.GenModel
import org.eclipse.emf.codegen.ecore.genmodel.GenModelFactory
import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.UniqueEList
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EOperation
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.EcoreFactory
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.common.types.JvmBooleanAnnotationValue
import org.eclipse.xtext.common.types.JvmCustomAnnotationValue
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmField
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.XBooleanLiteral
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder

/**
 * Infers the minimal Ecore file (an {@link EPackage}) corresponding to the
 * "modeling intention" of a K3 aspect. For example, from the following aspect:
 * 
 * <code>
 * \@Aspect(className = A)
 * class AspectA {
 *     public int foo
 *     def void bar() {}
 * }
 * </code>
 * 
 * it will infer a new {@link EPackage} containing an {@link EClass} {@code A}
 * with an {@link EAttribute} {@code foo} and an {@link EOperation} {@code foo}.
 */
class EventExtensions {
	@Inject extension LanguageExtensions
	@Inject extension EcoreExtensions
	@Inject JvmTypeReferenceBuilder.Factory typeRefBuilderFactory

	static final String STEP_ANNOTATION_FQN =
		"fr.inria.diverse.k3.al.annotationprocessor.Step"
	static final List<String> K3_PREFIXES =
		#["_privk3", "super_"]
	public static final String PROP_NAME = "AspectProperties"

	private static final Logger log = Logger.getLogger(EventExtensions)
	
	var EClass eventSpecificClass
	
	var EClass abstractPropertySpecificClass
	
	var EClass temporalPropertySpecificClass
	
	var EClass propertySpecificClass
	
	var EClass statePropertySpecificClass
	
	var EClass stepPropertySpecificClass
	
	var Map<EClass, EClass> rtToProp
	
	var Map<EClassifier, EClass> rtToProv
	
	var Map<EClassifier, EClass> rtToRef
	
	var Map<EClassifier, EClass> rtToQuery
	
	var Map<EClass, List<EClass>> propToFProps
	
	var EPackage pkg
	
	var EPackage eventPkg
	
	var EPackage propertyPkg
	
	var EPackage scenarioPkg
	
	var EPackage arbiterPkg
	
	var EPackage providerPkg
	
	var Set<GenPackage> refGenPackages
	
	def String getScenarioGenerationPath(Language l) {
		return '''../«l.externalRuntimeName».scenario/src/'''
	}
	
	def String getScenarioEcoreUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName».scenario/model/«l.name»Scenario.ecore'''
	}

	def String getScenarioGenmodelUri(Language l) {
		return '''platform:/resource/«l.externalRuntimeName».scenario/model/«l.name»Scenario.genmodel'''
	}
	
	def void createGenmodelAndGenerateCode(Language l) {
		val resSet = new ResourceSetImpl
		val pkgRes = resSet.getResource(URI::createURI(l.scenarioEcoreUri), true)
		val pkgs = pkgRes.contents.map[it as EPackage]

		val genmodel = GenModelFactory.eINSTANCE.createGenModel => [
			complianceLevel = GenJDKLevel.JDK70_LITERAL
			modelDirectory = l.scenarioGenerationPath
				.replaceFirst("platform:/resource", "").replaceFirst("..", "")
			foreignModel += l.externalEcoreUri
			usedGenPackages += (resSet.getResource(URI::createPlatformPluginURI("fr.inria.diverse.event.commons.model/model/property.genmodel", true), true).contents.head as GenModel).genPackages
			modelName = l.name + "scenario"
			modelPluginID = l.externalRuntimeName + ".scenario"
			initialize(pkgs)
			genPackages.forEach[gp|
				gp.basePackage = l.externalRuntimeName + ".scenario"
				if (!l.fileExtension.nullOrEmpty) {
					gp.fileExtensions = l.fileExtension + "s"
				} else {
					gp.fileExtensions = l.name.toLowerCase.toString + "s"
				}
			]
		]
		
		val res = resSet.createResource(URI::createURI(l.scenarioGenmodelUri))
		res.contents += genmodel
		
		fixedGenModels.clear
		genmodel.fixUsedGenPackages(resSet)
		
		try {
			res.save(null)
		} catch (IOException e) {
			log.error("Error while serializing new genmodel", e)
		}
		
		pkgRes.unload
		pkgRes.load(null)
		
		genmodel.generateCode
	}
	
	private var Set<EPackage> basePkgs
	
	def void createEcore(Language l) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.getResource(URI.createURI(l.externalEcoreUri, true), true);
		// Cleaning up
		rtToProp = new HashMap
		rtToProv = new HashMap
		rtToRef = new HashMap
		rtToQuery = new HashMap
		propToFProps = new HashMap
		basePkgs = resource.allContents.filter(EPackage).toSet
		pkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = (l.name + "scenario").toLowerCase
			nsPrefix = name
			nsURI = l.externalPackageUri+"scenario/"
		]
		arbiterPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = l.name + "Arbiter"
			nsPrefix = name
			nsURI = '''«l.externalPackageUri»scenario/«name»/'''
			pkg.ESubpackages.add(it)
		]
		eventPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = l.name + "Event"
			nsPrefix = name
			nsURI = '''«l.externalPackageUri»scenario/«name»/'''
			pkg.ESubpackages.add(it)
		]
		propertyPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = l.name + "Property"
			nsPrefix = name
			nsURI = '''«l.externalPackageUri»scenario/«name»/'''
			pkg.ESubpackages.add(it)
		]
		providerPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = l.name + "Provider"
			nsPrefix = name
			nsURI = '''«l.externalPackageUri»scenario/«name»/'''
			pkg.ESubpackages.add(it)
		]
		scenarioPkg = EcoreFactory.eINSTANCE.createEPackage => [
			name = l.name + "Scenario"
			nsPrefix = name
			nsURI = '''«l.externalPackageUri»scenario/«name»/'''
			pkg.ESubpackages.add(it)
		]
		
		val resSet = new ResourceSetImpl
		val usedGenpkgRes = resSet.getResource(URI::createURI(l.externalGenmodelUri), true)
		refGenPackages = (usedGenpkgRes.contents.head as GenModel).genPackages.toSet
		
		eventSpecificClass = EcoreFactory.eINSTANCE.createEClass => [c|
			c.name = l.name + "Event"
			c.abstract = true
			val typeParameter = EcoreFactory.eINSTANCE.createETypeParameter => [
				name = "T"
			]
			c.ETypeParameters += typeParameter
			c.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = ScenarioPackage.Literals.EVENT
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					ETypeParameter = typeParameter
				]
			]
		]
		
		eventPkg.EClassifiers += eventSpecificClass
		
		val allEOperations = resource.allContents.filter(EOperation).toSet
		val allStepEOperations = new HashSet
		
		l.allAspects.forEach[a|
			val t = a.aspectTypeRef.type
			if (t instanceof JvmDeclaredType) {
				val aspect = t as JvmDeclaredType
				val typeRefBuilder = typeRefBuilderFactory.create(aspect.eResource.resourceSet)
				// Parses all the interesting public operations in the aspect
				aspect.declaredOperations
				.filter[!isK3Specific && visibility == JvmVisibility.PUBLIC]
				.forEach[op |
					val featureName = findFeatureNameFor(aspect, op, typeRefBuilder)
					// If we can't infer a feature name, it's obviously really an operation
					if (featureName === null) {
						if (isStep(op)) {
							val eOperation = allEOperations.findFirst[
								it.name == op.simpleName && it.EContainingClass.name == a.aspectedClass.name
							]
							if (eOperation != null) {
								allStepEOperations.add(eOperation)
							}
							// If it's an event handler, we create a new metaclass for this event
							if (isInputEvent(op)) {
								val eventName = a.aspectedClass.name.toFirstUpper + op.simpleName.toFirstUpper + "Event"
								op.generateInputEvent(eventName)
							} else if (isOutputEvent(op)) {
								val eventName = a.aspectedClass.name.toFirstUpper + op.simpleName.toFirstUpper + "Event"
								op.generateOutputEvent(eventName)
							}
						}
					}
				]
			}
		]
		
		abstractPropertySpecificClass = EcoreFactory.eINSTANCE.createEClass => [
			name = l.name + "AbstractProperty"
			abstract = true
			ESuperTypes += PropertyPackage.Literals.ABSTRACT_PROPERTY
		]
		
		temporalPropertySpecificClass = EcoreFactory.eINSTANCE.createEClass => [
			name = l.name + "TemporalProperty"
			abstract = true
			ESuperTypes += PropertyPackage.Literals.TEMPORAL_PROPERTY
		]
		temporalPropertySpecificClass.ESuperTypes += abstractPropertySpecificClass
		
		propertySpecificClass = EcoreFactory.eINSTANCE.createEClass => [
			name = l.name + "Property"
			abstract = true
			ESuperTypes += PropertyPackage.Literals.PROPERTY
		]
		propertySpecificClass.ESuperTypes += abstractPropertySpecificClass
		
		statePropertySpecificClass = EcoreFactory.eINSTANCE.createEClass => [
			name = l.name + "StateProperty"
			abstract = true
			val typeParameter = EcoreFactory.eINSTANCE.createETypeParameter => [
				name = "T"
			]
			ETypeParameters += typeParameter
			EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = PropertyPackage.Literals.STATE_PROPERTY
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					ETypeParameter = typeParameter
				]
			]
			ESuperTypes += propertySpecificClass
		]
		
		stepPropertySpecificClass = EcoreFactory.eINSTANCE.createEClass => [
			name = l.name + "StepProperty"
			abstract = true
			val typeParameter = EcoreFactory.eINSTANCE.createETypeParameter => [
				name = "T"
			]
			ETypeParameters += typeParameter
			EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = PropertyPackage.Literals.STEP_PROPERTY
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					ETypeParameter = typeParameter
				]
			]
			ESuperTypes += propertySpecificClass
		]
		
		allStepEOperations.forEach[op|op.generateStepProperty]
		
		propertyPkg.EClassifiers += abstractPropertySpecificClass
		propertyPkg.EClassifiers += temporalPropertySpecificClass
		propertyPkg.EClassifiers += propertySpecificClass
		propertyPkg.EClassifiers += statePropertySpecificClass
		propertyPkg.EClassifiers += stepPropertySpecificClass
		
		l.runtimeRootPackage.allClasses.forEach[processRuntimeClass]
		
		val scenarioClass = EcoreFactory.eINSTANCE.createEClass
		val scenarioElementClass = EcoreFactory.eINSTANCE.createEClass
		val eventOccurrenceClass = EcoreFactory.eINSTANCE.createEClass
		val scenarioFSMClass = EcoreFactory.eINSTANCE.createEClass
		val scenarioFSMStateClass = EcoreFactory.eINSTANCE.createEClass
		val scenarioFSMTransitionClass = EcoreFactory.eINSTANCE.createEClass
		scenarioPkg.EClassifiers += scenarioClass
		scenarioPkg.EClassifiers += scenarioElementClass
		scenarioPkg.EClassifiers += eventOccurrenceClass
		scenarioPkg.EClassifiers += scenarioFSMClass
		scenarioPkg.EClassifiers += scenarioFSMStateClass
		scenarioPkg.EClassifiers += scenarioFSMTransitionClass
		scenarioClass.name = l.name + "Scenario"
		scenarioElementClass.name = l.name + "ScenarioElement"
		eventOccurrenceClass.name = l.name + "EventOccurrence"
		scenarioFSMClass.name = l.name + "ScenarioFSM"
		scenarioFSMStateClass.name = l.name + "ScenarioFSMState"
		scenarioFSMTransitionClass.name = l.name + "ScenarioFSMTransition"
		scenarioElementClass.abstract = true
		val scenarioGenericType = EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.SCENARIO
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = scenarioElementClass
			]
		]
		scenarioClass.EGenericSuperTypes += scenarioGenericType
		val scenarioElementGenericType = EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.SCENARIO_ELEMENT
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = propertySpecificClass
			]
		]
		scenarioElementClass.EGenericSuperTypes += scenarioElementGenericType
		val eventTypeArgument = EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = eventSpecificClass
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType
		]
		val propertyTypeArgument = EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = propertySpecificClass
		]
		eventOccurrenceClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.EVENT_OCCURRENCE
			ETypeArguments += eventTypeArgument
			ETypeArguments += propertyTypeArgument
		]
		eventOccurrenceClass.ESuperTypes += scenarioElementClass
		
		scenarioFSMClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.SCENARIO_FSM
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = propertySpecificClass
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = eventSpecificClass
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = scenarioFSMStateClass
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = scenarioFSMTransitionClass
			]
		]
		scenarioFSMClass.ESuperTypes += scenarioElementClass
		
		scenarioFSMStateClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.SCENARIO_FSM_STATE
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = eventSpecificClass
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = scenarioFSMTransitionClass
			]
		]
		
		scenarioFSMTransitionClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.SCENARIO_FSM_TRANSITION
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = propertySpecificClass
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = scenarioFSMStateClass
			]
		]
		
		val arbiterClass = EcoreFactory.eINSTANCE.createEClass
		val arbiterStateClass = EcoreFactory.eINSTANCE.createEClass
		val arbiterTransitionClass = EcoreFactory.eINSTANCE.createEClass
		arbiterPkg.EClassifiers += arbiterClass
		arbiterPkg.EClassifiers += arbiterStateClass
		arbiterPkg.EClassifiers += arbiterTransitionClass
		arbiterClass.name = l.name + "Arbiter"
		arbiterStateClass.name = l.name + "ArbiterState"
		arbiterTransitionClass.name = l.name + "ArbiterTransition"
		
		arbiterClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.ARBITER
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = propertySpecificClass
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = arbiterStateClass
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = arbiterTransitionClass
			]
		]
		
		arbiterStateClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.ARBITER_STATE
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = propertySpecificClass
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = arbiterTransitionClass
			]
		]
		
		arbiterTransitionClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = ScenarioPackage.Literals.ARBITER_TRANSITION
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = propertySpecificClass
			]
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = arbiterStateClass
			]
		]
		
		val nextClass = EcoreFactory.eINSTANCE.createEClass
		val untilClass = EcoreFactory.eINSTANCE.createEClass
		val releaseClass = EcoreFactory.eINSTANCE.createEClass
		val negationTemporalClass = EcoreFactory.eINSTANCE.createEClass
		propertyPkg.EClassifiers += nextClass
		propertyPkg.EClassifiers += untilClass
		propertyPkg.EClassifiers += releaseClass
		propertyPkg.EClassifiers += negationTemporalClass
		nextClass.name = l.name + "NextProperty"
		untilClass.name = l.name + "UntilProperty"
		releaseClass.name = l.name + "ReleaseProperty"
		negationTemporalClass.name = l.name + "NegationTemporalProperty"
		
		nextClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = PropertyPackage.Literals.NEXT_PROPERTY
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = abstractPropertySpecificClass
			]
		]
		nextClass.ESuperTypes += temporalPropertySpecificClass
		
		untilClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = PropertyPackage.Literals.UNTIL_PROPERTY
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = abstractPropertySpecificClass
			]
		]
		untilClass.ESuperTypes += temporalPropertySpecificClass
		
		releaseClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = PropertyPackage.Literals.RELEASE_PROPERTY
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = abstractPropertySpecificClass
			]
		]
		releaseClass.ESuperTypes += temporalPropertySpecificClass
		
		negationTemporalClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			EClassifier = PropertyPackage.Literals.NEGATION_TEMPORAL_PROPERTY
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = temporalPropertySpecificClass
			]
		]
		negationTemporalClass.ESuperTypes += temporalPropertySpecificClass
		
		val res = resSet.createResource(URI.createPlatformResourceURI(l.externalRuntimeName+".scenario/model/"+l.name+"Scenario.ecore", true))
		res.contents += pkg
		res.save(null)
	}
	
	def private void generateStepProperty(EOperation op) {
		val stepPropertyClass = EcoreFactory.eINSTANCE.createEClass
			propertyPkg.EClassifiers += stepPropertyClass
			stepPropertyClass.name = op.EContainingClass.name + op.name.toFirstUpper + "Property"
			stepPropertyClass.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = stepPropertySpecificClass
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					val targetClassifier = op.EContainingClass
					EClassifier = targetClassifier
					// Creating the <Target>Reference class if it does not exist yet
					targetClassifier.elementReferenceClass
					// Creating the <Target>Provider class if it does not exist yet
					targetClassifier.elementProviderClass
					// Creating the <Target>Query class if it does not exist yet
					targetClassifier.elementQueryClass
				]
			]
			
			val getOperationEOperation = EcoreFactory.eINSTANCE.createEOperation
			val getOperationAnnotation = EcoreFactory.eINSTANCE.createEAnnotation
			getOperationEOperation.EAnnotations.add(getOperationAnnotation)
			getOperationEOperation.name = "getOperation"
			getOperationEOperation.lowerBound = 0
			getOperationEOperation.upperBound = 1
			getOperationEOperation.EType = EcorePackage.Literals.EOPERATION
			getOperationAnnotation.source = GenModelPackage.eNS_URI
			getOperationAnnotation.details.put("body", op.stringOperationLiteral)
			stepPropertyClass.EOperations += getOperationEOperation
	}
	
	def private void generateInputEvent(JvmOperation op, String eventName) {
		val params = op.parameters
		eventPkg.EClassifiers += EcoreFactory.eINSTANCE.createEClass => [c|
			c.name = eventName
			// Creating the generic super type of the property and binding it
			c.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = eventSpecificClass
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					val targetTypeName = params.head.parameterType.type.simpleName
					val targetClassifier = basePkgs.findFirst[getEClassifier(targetTypeName) != null]?.getEClassifier(targetTypeName)
					EClassifier = targetClassifier
					// Creating the <Target>Reference class if it does not exist yet
					targetClassifier.elementReferenceClass
					// Creating the <Target>Query class if it does not exist yet
					targetClassifier.elementQueryClass
				]
			]
			
			params.tail.forEach[opParam|
				val parameterTypeName = opParam.parameterType.type.simpleName
				if (parameterTypeName == "String" || parameterTypeName == "Integer" || parameterTypeName == "Boolean") {
					c.EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
						name = opParam.name.toFirstLower
						lowerBound = 0
						upperBound = 1
						EType = switch (parameterTypeName) {
							case "String": EcorePackage.Literals.ESTRING
							case "Integer": EcorePackage.Literals.EINT
							case "Boolean": EcorePackage.Literals.EBOOLEAN
						}
					]
				} else {
					val parameterClassifier = basePkgs.findFirst[getEClassifier(parameterTypeName) != null]?.getEClassifier(parameterTypeName)
					if (parameterClassifier != null) {
						// Creating the <Parameter>Reference class if it does not exist yet
						parameterClassifier.elementReferenceClass
						// Creating the <Parameter>Query class if it does not exist yet
						getElementQueryClass(parameterClassifier)
						c.EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
							EType = parameterClassifier.elementProviderClass
							upperBound = 1
							lowerBound = 1
							containment = true
							name = opParam.name.toFirstLower + "Provider"
						]
					}
				}
			]
		]
	}
	
	def private void generateOutputEvent(JvmOperation op, String eventName) {
		eventPkg.EClassifiers += EcoreFactory.eINSTANCE.createEClass => [c|
			c.name = eventName
			// Creating the generic super type of the property and binding it
			c.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = eventSpecificClass
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					val targetTypeName = op.parameters.head.parameterType.type.simpleName
					val targetClassifier = basePkgs.findFirst[getEClassifier(targetTypeName) != null]?.getEClassifier(targetTypeName)
					EClassifier = targetClassifier
					// Creating the <Target>Reference class if it does not exist yet
					targetClassifier.elementReferenceClass
				]
			]
			
			op.returnType => [retType|
				val returnTypeName = retType.type.simpleName
				if (returnTypeName == "String" || returnTypeName == "Integer" || returnTypeName == "Boolean") {
					c.EStructuralFeatures += EcoreFactory.eINSTANCE.createEAttribute => [
						name = "value"
						lowerBound = 0
						upperBound = 1
						EType = switch (returnTypeName) {
							case "String": EcorePackage.Literals.ESTRING
							case "Integer": EcorePackage.Literals.EINT
							case "Boolean": EcorePackage.Literals.EBOOLEAN
						}
					]
				} else {
					val returnClassifier = basePkgs.findFirst[getEClassifier(returnTypeName) != null]?.getEClassifier(returnTypeName)
					if (returnClassifier != null) {
						c.EStructuralFeatures += EcoreFactory.eINSTANCE.createEReference => [
							// Creating the <Parameter>Reference class if it does not exist yet
							returnClassifier.elementReferenceClass
							EType = returnClassifier.elementProviderClass
							lowerBound = 0
							upperBound = 1
							containment = true
							name = "valueProvider"
						]
					}
				}
			]
		]
	}
	
	def private EClass getElementProviderClass(EClassifier c) {
		rtToProv.computeIfAbsent(c, [cls|
			val prov = EcoreFactory.eINSTANCE.createEClass => [
				name = cls.name + "Provider"
				abstract = true
				EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = ScenarioPackage.Literals.ELEMENT_PROVIDER
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = cls
					]
				]
			]
			providerPkg.EClassifiers += prov
			return prov
		])
	}
	
	def private EClass getElementReferenceClass(EClassifier c) {
		rtToRef.computeIfAbsent(c, [cls|
			val ref = EcoreFactory.eINSTANCE.createEClass => [
				name = c.name + "Reference"
				EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = ScenarioPackage.Literals.ELEMENT_REFERENCE
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = c
					]
				]
				EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = cls.elementProviderClass
				]
			]
			providerPkg.EClassifiers += ref
			return ref
		])
	}
	
	def private EClass getElementQueryClass(EClassifier c) {
		rtToQuery.computeIfAbsent(c, [cls|
			val query = EcoreFactory.eINSTANCE.createEClass => [
				name = cls.name + "Query"
				EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = ScenarioPackage.Literals.ELEMENT_QUERY
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = cls
					]
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = PropertyPackage.Literals.STATE_PROPERTY
						ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
							EClassifier = cls
						]
					]
				]
				EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = cls.elementProviderClass
				]
			]
			providerPkg.EClassifiers += query
			return query
		])
	}
	
	private def void processRuntimeClass(EClass runtimeClass) {
		// Creating the abstract property associated to the runtime class
		if (!rtToProp.containsKey(runtimeClass)) {
			val classProperty = EcoreFactory.eINSTANCE.createEClass
			rtToProp.put(runtimeClass, classProperty)
			propertyPkg.EClassifiers += classProperty
			
			classProperty.name = runtimeClass.name + "Property"
			classProperty.abstract = true
			val typeParameter = EcoreFactory.eINSTANCE.createETypeParameter => [
				name = "T"
				EBounds += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = runtimeClass
				]
			]
			classProperty.ETypeParameters += typeParameter
			if (runtimeClass.ESuperTypes.empty) {
				classProperty.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = statePropertySpecificClass
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						ETypeParameter = typeParameter
					]
				]
			} else {
				runtimeClass.ESuperTypes.forEach[c|
					classProperty.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = c.associatedProperty
						ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
							ETypeParameter = typeParameter
						]
					]
				]
			}
			
			// Creating the corresponding unary property
			val negationProperty = EcoreFactory.eINSTANCE.createEClass
			propertyPkg.EClassifiers += negationProperty
			negationProperty.name = "Unary" + runtimeClass.name + "Property"
			negationProperty.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = classProperty
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = runtimeClass
				]
			]
			// Creating the generic super type of the property and binding it
			negationProperty.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = PropertyPackage.Literals.UNARY_PROPERTY
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = classProperty
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = runtimeClass
					]
				]
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = runtimeClass
				]
			]
			
			// Creating the corresponding binary property
			val binaryProperty = EcoreFactory.eINSTANCE.createEClass
			propertyPkg.EClassifiers += binaryProperty
			binaryProperty.name = "Binary" + runtimeClass.name + "Property"
			binaryProperty.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = classProperty
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = runtimeClass
				]
			]
			// Creating the generic super type of the property and binding it
			binaryProperty.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = PropertyPackage.Literals.BINARY_PROPERTY
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = classProperty
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = runtimeClass
					]
				]
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = runtimeClass
				]
			]
			
			propToFProps.put(runtimeClass, runtimeClass.EAllStructuralFeatures.map[f|f.processStructuralFeature(runtimeClass)].flatten.toList)
		}
	}
	
	private def List<EClass> processStructuralFeature(EStructuralFeature feature, EClass runtimeClass) {
		val isAttribute = feature instanceof EAttribute
		val result = new ArrayList
		if (!isAttribute) {
			val ref = feature as EReference
			if (ref.containment && ref.EOpposite == null) {
				val property = EcoreFactory.eINSTANCE.createEClass
				result += property
				propertyPkg.EClassifiers += property
				property.name = feature.EType.name + runtimeClass.name + "ContainerProperty"
				property.addGetFeatureOperation(null)
				property.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					// Creating the domain-specific 'ClassProperty' generic super type
					EClassifier = feature.EType.associatedProperty
					// Creating and binding the type argument
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = feature.EType
					]
				]
				property.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = PropertyPackage.Literals.CONTAINER_REFERENCE_PROPERTY
					// Creating and binding the first type argument
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = feature.EContainingClass.associatedProperty
						ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
							EClassifier = feature.EContainingClass
						]
					]
					// Creating and binding the second type argument
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = feature.EType
					]
				]
			}
		}
		val property = EcoreFactory.eINSTANCE.createEClass
		result += property
		propertyPkg.EClassifiers += property
		property.name = runtimeClass.name + feature.name.toFirstUpper + "Property"
		property.addGetFeatureOperation(feature)
		property.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
			// Creating the domain-specific 'ClassProperty' generic super type
			EClassifier = runtimeClass.associatedProperty
			// Creating and binding the type argument
			ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
				EClassifier = runtimeClass
			]
		]
		//TODO handle enums
		if (isAttribute) {
			if (!((feature as EAttribute).EType instanceof EEnum)) {
				property.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = (feature as EAttribute).attributePropertySuperType
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = runtimeClass
					]
				]
			}
		} else {
			property.EGenericSuperTypes += EcoreFactory.eINSTANCE.createEGenericType => [
				// Creating the multiplicity (many/single) generic super type
				if (feature.many) EClassifier = PropertyPackage.Literals.MANY_REFERENCE_PROPERTY
				else EClassifier = PropertyPackage.Literals.SINGLE_REFERENCE_PROPERTY
				// Creating and binding the first type argument
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = feature.EType.associatedProperty
					ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
						EClassifier = feature.EType
					]
				]
				// Creating and binding the second type argument
				ETypeArguments += EcoreFactory.eINSTANCE.createEGenericType => [
					EClassifier = runtimeClass
				]
			]
		}
		
		return result
	}
	
	private def EClass getAssociatedProperty(EClassifier runtimeClass) {
		var property = rtToProp.get(runtimeClass)
		if (property == null) {
			(runtimeClass as EClass).processRuntimeClass
			property = rtToProp.get(runtimeClass)
		}
		return property
	}
	
	private def EClass getAttributePropertySuperType(EAttribute attribute) {
		val eType = attribute.EType
		if (eType == EcorePackage.Literals.EINT) {
			if (attribute.many) return PropertyPackage.Literals.MANY_INTEGER_ATTRIBUTE_PROPERTY
			return PropertyPackage.Literals.INTEGER_ATTRIBUTE_PROPERTY
		}
		if (eType == EcorePackage.Literals.EBOOLEAN) {
			if (attribute.many) return PropertyPackage.Literals.MANY_BOOLEAN_ATTRIBUTE_PROPERTY
			return PropertyPackage.Literals.BOOLEAN_ATTRIBUTE_PROPERTY
		}
		if (eType == EcorePackage.Literals.ESTRING) {
			if (attribute.many) return PropertyPackage.Literals.MANY_STRING_ATTRIBUTE_PROPERTY
			return PropertyPackage.Literals.STRING_ATTRIBUTE_PROPERTY
		}
		return null
	}
	
	private def addGetFeatureOperation(EClass propertyClass, EStructuralFeature feature) {
		val getFeatureEOperation = EcoreFactory.eINSTANCE.createEOperation
		val getFeatureAnnotation = EcoreFactory.eINSTANCE.createEAnnotation
		getFeatureEOperation.EAnnotations.add(getFeatureAnnotation)
		getFeatureEOperation.name = "getFeature"
		getFeatureEOperation.lowerBound = 0
		getFeatureEOperation.upperBound = 1
		getFeatureEOperation.EType = EcorePackage.Literals.ESTRUCTURAL_FEATURE
		getFeatureAnnotation.source = GenModelPackage.eNS_URI
		getFeatureAnnotation.details.put("body", '''return «if (feature == null) "null" else feature.stringFeatureLiteral»;''')
		propertyClass.EOperations += getFeatureEOperation
	}
	
	private def String getBase(GenPackage gp) {
		var String base = ""
		if (gp.basePackage != null && gp.superGenPackage == null) {
			base = gp.basePackage + "."
		}
		return base
	}
	
	private def String getBaseFQN(EPackage p) {
		val EPackage superP = p.getESuperPackage
		if (superP != null) {
			return getBaseFQN(superP) + "." + p.name
		} else {
			return p.name
		}
	}
	
	private def String getJavaFQN(EPackage p, Set<GenPackage> refGenPackages) {

		var String base = ""
		val gp = getGenPackage(p, refGenPackages)
		if (gp != null) {
			base = getBase(gp)
		}
		return base + getBaseFQN(p);
	}
	
	private def GenPackage getGenPackage(EPackage p, Set<GenPackage> refGenPackages) {
		if (p != null) {
			for (gp : refGenPackages) {
				val packageInGenpackage = gp.getEcorePackage
				if (packageInGenpackage != null) {
					val s1 = getBaseFQN(p)
					val s2 = getBaseFQN(packageInGenpackage)
					if (s1 != null && s2 != null && s1.equalsIgnoreCase(s2)) {
						return gp
					}
				}
			}
		}
		return null
	}
	
	private def String stringFeatureLiteral(EStructuralFeature f) {
		val EClass containingClass = f.EContainingClass
		val EPackage p = containingClass.EPackage
		val GenPackage gp = getGenPackage(p, refGenPackages)
		return getJavaFQN(p, refGenPackages) + "." + gp.prefix + "Package.Literals." +
			containingClass.name.camelToUnderscores.toUpperCase + "__" + f.name.camelToUnderscores.toUpperCase;
	}
	
	private def String stringOperationLiteral(EOperation op) {
		val EClass containingClass = op.EContainingClass
		val EPackage p = containingClass.EPackage
		val GenPackage gp = getGenPackage(p, refGenPackages)
		return
				'''
					java.util.Iterator<EOperation> it = «getJavaFQN(p, refGenPackages)».«gp.prefix»Package.Literals.«containingClass.name.camelToUnderscores.toUpperCase».getEOperations().iterator();
					EOperation result = null;
					while (it.hasNext() && result == null) {
						EOperation op = it.next();
						if (op.getName().equals("«op.name»")) {
							result = op;
						}
					}
					return result;
				'''
	}
	
	private def EPackage getRuntimeRootPackage(Language l) {
		val runtimeURI = l.externalEcoreUri
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.getResource(URI.createURI(runtimeURI, true), true);
		return (resource.allContents.findFirst[o|o instanceof EPackage] as EPackage).rootPackage
	}
	
	/**
	 * For the getter or setter {@code op} in {@code type}, infers the
	 * corresponding feature name (eg. getXyz()/setXyz() associated to the
	 * "xyz" feature).
	 * 
	 * @param type The {@link JvmDeclaredType} of an aspect.
	 * @param op   A {@link JvmOperation} of {@code type}.
	 * @return the corresponding feature name, or null if it cannot be determined.
	 */
	def String findFeatureNameFor(JvmDeclaredType type, JvmOperation op, JvmTypeReferenceBuilder typeRefBuilder) {
		// @Aspect case 1
		// ie. int getX() / void setX(int)
		if (
			(  op.simpleName.startsWith("get")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 1
			&& op.returnType.simpleName != "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("get", "set")
				&& opp.parameters.get(1).parameterType.qualifiedName == op.returnType.qualifiedName
				&& opp.returnType.simpleName == "void"
			])
		||	(  op.simpleName.startsWith("set")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 2
			&& op.returnType.simpleName == "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("set", "get")
				&& opp.returnType.qualifiedName == op.parameters.get(1).parameterType.qualifiedName
			])
		)
			return op.simpleName.substring(3, op.simpleName.length).toFirstLower
		// @Aspect case 2
		// eg. int x() / void x(int)
		else if (
			type.declaredOperations.exists[opp |
				   opp !== op
				&& opp.simpleName == op.simpleName
				&& ((
					   op.parameters.size == 1
					&& op.returnType.simpleName != "void"
					&& opp.parameters.size == 2
					&& opp.returnType.simpleName == "void"
					&& op.returnType.qualifiedName == opp.parameters.get(1).parameterType.qualifiedName
				) || (
					opp.parameters.size == 1
					&& opp.returnType.simpleName != "void"
					&& op.parameters.size == 2
					&& op.returnType.simpleName == "void"
					&& op.parameters.get(1).parameterType.qualifiedName == opp.returnType.qualifiedName
				))
			]
		)
			return op.simpleName
		else if(op.isGetter(typeRefBuilder))
			return op.simpleName
		// No @Aspect (plain Java)
		// we expect something in the line of getX() / setX()
		else if (
			(  op.simpleName.startsWith("get")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 0
			&& op.returnType.simpleName != "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("get", "set")
				&& opp.parameters.size == 1
				&& opp.parameters.get(0).parameterType.qualifiedName == op.returnType.qualifiedName
				&& opp.returnType.simpleName == "void"
			])
		||	(  op.simpleName.startsWith("set")
			&& Character.isUpperCase(op.simpleName.charAt(3))
			&& op.parameters.size == 1
			&& op.returnType.simpleName == "void"
			&& type.declaredOperations.exists[opp |
				   opp.simpleName == op.simpleName.replaceFirst("set", "get")
				&& opp.parameters.size == 0
				&& opp.returnType.qualifiedName == op.parameters.get(0).parameterType.qualifiedName
			])
		)
			return op.simpleName.substring(3, op.simpleName.length).toFirstLower
		else return null
	}
	
	/**
	 * Checks whether the given operation is a step or not
	 */
	private def boolean isStep(JvmOperation operation) {
		val stepAnnotation = operation.annotations.findFirst[a|a.annotation.qualifiedName == STEP_ANNOTATION_FQN]
		return stepAnnotation != null
	}
	
	/**
	 * Checks whether the given operation is an input event or not
	 */
	private def boolean isInputEvent(JvmOperation operation) {
		var result = false
		val stepAnnotation = operation.annotations
			.findFirst[a|a.annotation.qualifiedName == STEP_ANNOTATION_FQN]
		if (stepAnnotation != null) {
			val triggerableValue = stepAnnotation.values
				.findFirst[v|v.valueName == "eventTriggerable"]
			result = switch triggerableValue {
				JvmBooleanAnnotationValue: triggerableValue.values?.head
				JvmCustomAnnotationValue: (triggerableValue.values.head as XBooleanLiteral).isTrue
			}
		}
		return result
	}
	
	/**
	 * Checks whether the given operation is an output event or not
	 */
	private def boolean isOutputEvent(JvmOperation operation) {
		var result = false
		val stepAnnotation = operation.annotations
			.findFirst[a|a.annotation.qualifiedName == STEP_ANNOTATION_FQN]
		if (stepAnnotation != null) {
			val triggerableValue = stepAnnotation.values
				.findFirst[v|v.valueName == "outputEvent"]
			result = switch triggerableValue {
				JvmBooleanAnnotationValue: triggerableValue.values?.head
				JvmCustomAnnotationValue: (triggerableValue.values.head as XBooleanLiteral).isTrue
			}
		}
		return result
	}

	/**
	 * Checks whether the given operation is some obscure K3 code or not
	 */
	private def boolean isK3Specific(JvmOperation op) {
		return K3_PREFIXES.exists[p | op.simpleName.startsWith(p)]
	}
	
	/**
	 * Return true if {@link op} is an Aspect generated getter for final field 
	 */
	private def boolean isGetter(JvmOperation op, JvmTypeReferenceBuilder typeRefBuilder) {
		try {
			if( op.parameters.size == 1 ){
				val eclass = op.parameters.get(0).parameterType.simpleName
				val className = op.declaringType.qualifiedName
				val aspectProperties = typeRefBuilder.typeRef(className + eclass + PROP_NAME)
				val type = aspectProperties.type as JvmGenericType
				
				return type.members.filter(JvmField).exists[simpleName == op.simpleName && isFinal]
			}
		}
		catch(Exception e){
			//Do nothing :)
			//TODO: log
		}
		
		false
	}
	
	private Set<GenModel> fixedGenModels = new HashSet

	/**
	 * Tries to fix the "usedGenPackages" collection of a genmodel (and recursively of all genmodels it references)
	 * 1) remove all usedGenPackages that have a null genModel (for a mysterious reason...)
	 * 2) use the magical method 'computeMissingGenPackages' to find missing packages, and add them to usedGenPackages
	 * 3) as a bonus, store all referenced gen packages in 'referencedGenPackages' for later use
	 */
	private def void fixUsedGenPackages(GenModel genModel, ResourceSet resourceSet) {
		if (!fixedGenModels.contains(genModel)) {
			fixedGenModels.add(genModel)
			genModel.usedGenPackages.removeAll(genModel.usedGenPackages.immutableCopy.filter[p|p.genModel == null])
			val List<GenPackage> missingGenPackages = genModel.computeMissingGenPackages(resourceSet)
			for (genPackage : missingGenPackages) {
				genPackage.genModel.fixUsedGenPackages(resourceSet)
			}
			genModel.usedGenPackages += missingGenPackages
		}
	}
	
	private def List<GenPackage> computeMissingGenPackages(GenModel genModel, ResourceSet resourceSet) {
		val List<GenPackage> missingGenPackages = new UniqueEList<GenPackage>()
		val Map<String, URI> genModelLocationMapTargetEnvironment = EcorePlugin.getEPackageNsURIToGenModelLocationMap(true)
		val Map<String, URI> genModelLocationMapEnvironment = EcorePlugin.getEPackageNsURIToGenModelLocationMap(false)
		for (EPackage ePackage : genModel.getMissingPackages()) {
			if (ePackage != null) { // happens for activities
				var URI missingGenModelURI = genModelLocationMapEnvironment.get(ePackage.getNsURI())
				if (missingGenModelURI == null) {
					missingGenModelURI = genModelLocationMapTargetEnvironment.get(ePackage.getNsURI())
				}
				if (missingGenModelURI == null) {
					throw new RuntimeException(
						"Unable to load generator model of required package \'" + ePackage.getNsURI() + "\'.")
				}
				var Resource missingGenModelResource = null
				try {
					missingGenModelResource = resourceSet.getResource(missingGenModelURI, true)
				} catch (RuntimeException e) {
					throw new RuntimeException(
						"Unable to load generator model of required package \'" + ePackage.getNsURI() + "\'.")
				}
				val GenModel missingGenModel = missingGenModelResource.getContents().get(0) as GenModel
				missingGenModel.reconcile
				missingGenPackages.addAll(missingGenModel.getGenPackages())
			}
		}
		return missingGenPackages;
	}
}
