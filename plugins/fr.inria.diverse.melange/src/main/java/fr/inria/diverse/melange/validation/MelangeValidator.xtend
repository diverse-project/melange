package fr.inria.diverse.melange.validation

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Inheritance
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.NamedElement
import fr.inria.diverse.melange.metamodel.melange.ResourceType
import java.util.Collections
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import fr.inria.diverse.melange.ast.AspectExtensions
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.common.types.JvmGenericType
import org.eclipse.xtext.common.types.JvmField
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Operator

class MelangeValidator extends AbstractMelangeValidator
{
	@Inject extension LanguageExtensions
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper
	@Inject extension AspectExtensions
	@Inject extension MetamodelExtensions
	@Inject JvmTypeReferenceBuilder.Factory builderFactory

	@Check
	def void checkElementsAreNamed(NamedElement e) {
		if (e.name === null || e.name.length == 0)
			error(
				"All elements must be named",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.ELEMENT_NAME_EMPTY
			)
	}

	@Check
	def void checkNamesAreUnique(NamedElement e) {
		val root =
			if (e.eContainer instanceof ModelTypingSpace) e.eContainer
			else if (e.eContainer.eContainer instanceof ModelTypingSpace) e.eContainer.eContainer

		if ((root as ModelTypingSpace).elements.filter(NamedElement).exists[e_ |
			   e_ != e
			//&& e_.eClass == e.eClass
			&& e_.name == e.name
		])
			error(
				"Names must be unique",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.ELEMENT_NAME_DUPLICATED
			)
	}

	@Check
	def void checkEcoreIsSet(ModelType mt) {
		if (mt.extracted === null && (mt.ecoreUri === null || mt.ecoreUri.empty))
			error(
				"A valid Ecore file must be imported",
				MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
				MelangeValidationConstants.MODELTYPE_ECORE_EMPTY
			)
	}

	@Check
	def void checkEcoreIsLoadable(ModelType mt) {
		try {
			if (mt.extracted === null && mt.ecoreUri !== null && modelUtils.loadPkg(mt.ecoreUri) === null)
				error(
					"Couldn't load specified Ecore",
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.MODELTYPE_ECORE_UNLOADABLE
				)
		} catch (Exception e) {}
	}

	@Check
	def void checkEcoreIsSet(Language l) {
		if (l.operators.filter(Import).filter[ecoreUri !== null].empty
			&& l.operators.filter(Inheritance).forall[superLanguage?.syntax.ecoreUri === null]
			&& l.operators.empty
			&& l.syntax?.ecoreUri === null
		)
			error(
				"A valid Ecore file must be imported",
				l.syntax,
				MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
				MelangeValidationConstants.METAMODEL_ECORE_EMPTY
			)
	}

	@Check
	def void checkGenModelIsSet(Language l) {
		if (l.syntax.ecoreUri !== null && l.syntax.ecoreUri.endsWith(".ecore") && l.syntax.genmodelUris.head === null) {
			// !!!
			val speculativeGenmodelPath = l.syntax.ecoreUri.substring(0, l.syntax.ecoreUri.lastIndexOf(".")) + ".genmodel"
			try {
				if (modelUtils.loadGenmodel(speculativeGenmodelPath) === null)
					error(
						"A valid Genmodel file must be imported",
						l.syntax,
						MelangePackage.Literals.METAMODEL__GENMODEL_URIS,
						MelangeValidationConstants.METAMODEL_GENMODEL_UNLOADABLE
					)
			} catch (Exception e) {
				error(
					"A valid Genmodel file must be imported",
					l.syntax,
					MelangePackage.Literals.METAMODEL__GENMODEL_URIS,
					MelangeValidationConstants.METAMODEL_GENMODEL_UNLOADABLE
				)
			}
		}
	}

	@Check
	def void checkEcoreIsLoadable(Language l) {
		try {
			if (!l.generatedByMelange && l.syntax.ecoreUri !== null && modelUtils.loadPkg(l.syntax.ecoreUri) === null)
				error(
					"Couldn't load specified Ecore",
					l.syntax,
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.METAMODEL_ECORE_UNLOADABLE
				)
		} catch (Exception e) {}
	}

	@Check
	def void checkGenModelIsLoadable(Language l) {
		try {
			if (!l.generatedByMelange && l.syntax.genmodelUris.head !== null && modelUtils.loadGenmodel(l.syntax.genmodelUris.head) === null)
				error(
					"Couldn't load specified GenModel",
					l.syntax,
					MelangePackage.Literals.METAMODEL__GENMODEL_URIS,
					MelangeValidationConstants.METAMODEL_GENMODEL_UNLOADABLE
				)
		} catch (Exception e) {}
	}
//
//	@Check
//	def void checkAspectExists(Aspect a) {
//		if (a.aspectTypeRef?.type === null || !(a.aspectTypeRef.type instanceof JvmDeclaredType))
//			error(
//				"Cannot find imported aspect class",
//				MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
//				MelangeValidationConstants.ASPECT_NOT_FOUND
//			)
//	}
	
	@Check
	def void checkHasAnnotationProcessorDependency(Aspect asp) {
		if (asp.aspectTypeRef?.type !== null && asp.aspectTypeRef.type instanceof JvmDeclaredType && 
			(asp.aspectTypeRef.type as JvmDeclaredType).annotations.exists[annotation.eIsProxy]
		)
			error(
				"Cannot find dependency to annotation processor. Please add k3.al.annotationprocessor",
				MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
				MelangeValidationConstants.INVALID_ASPECT_IMPORT
			)
	}

//	@Check
//	def void checkAspectHasAnnotation(Aspect a) {
//		if (
//			a.aspectTypeRef?.type instanceof JvmDeclaredType
//			&& (a.aspectAnnotationValue === null || a.aspectAnnotationValue.length == 0)
//		)
//			error(
//				"Cannot find @Aspect annotation",
//				MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
//				MelangeValidationConstants.ASPECT_NO_ANNOTATION
//			)
//	}

	// FIXME: Only one package is checked there,
	//        and mtPkg may be null
	// TODO: This should be replaced by an algebra call.
	//       -> ecore files must be loaded prior to this
	@Check
	def void checkImplements(Language l) {
		val mmPkg = modelUtils.loadPkg(l.syntax.ecoreUri)

		l.^implements
		.forEach[mt |
			val mtPkg = modelUtils.loadPkg(mt.ecoreUri)

			if (!matchingHelper.match(
				Collections.singletonList(mmPkg), Collections.singletonList(mtPkg), null
			))
				error(
					'''«l.name» doesn't match the interface «mt.name»''',
					MelangePackage.Literals.LANGUAGE__IMPLEMENTS,
					MelangeValidationConstants.METAMODEL_IMPLEMENTS_ERROR
				)
		]
	}

	@Check
	def void checkExactTypeIsSet(Language l) {
		if (l.exactTypeName === null || l.exactType === null)
			error(
				"exactType feature must be set",
				MelangePackage.Literals.LANGUAGE__EXACT_TYPE_NAME,
				MelangeValidationConstants.METAMODEL_EXACTTYPE_ERROR
			)
	}

	@Check
	def void checkNoSelfInheritance(Language l) {
		if (l.superLanguages.exists[ll | ll.superLanguages.contains(l)])
			error(
				"Cannot inherit from self",
				MelangePackage.Literals.INHERITANCE__SUPER_LANGUAGE,
				MelangeValidationConstants.METAMODEL_SELF_INHERITANCE
			)
	}

	@Check
	def void checkXtextResourceProperlyConfigured(Language l) {
		if (
			   l.resourceType == ResourceType.XTEXT
			&& l.xtextSetupRef === null
		)
			error(
				"Xtext resources needs a 'setup' class",
				MelangePackage.Literals.LANGUAGE__RESOURCE_TYPE,
				MelangeValidationConstants.METAMODEL_XTEXT_SETUP
			)
	}

	@Check
	def void checkRuntimeHasBeenGenerated(Language l) {
		if (l.isGeneratedByMelange && !l.runtimeHasBeenGenerated) {
			warning(
				"Cannot find EMF runtime for" + l.name,
				l.syntax,
				MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
				MelangeValidationConstants.METAMODEL_NO_EMF_RUNTIME
			)
		}
	}

	@Check
	def void checkWildcardAspectImport(Aspect asp) {
		if (
			   asp.aspectWildcardImport !== null
			&& !asp.aspectWildcardImport.endsWith(".*")
		)
			error(
				"Only wildcard imports are supported, e.g. my.pkg.*",
				MelangePackage.Literals.ASPECT__ASPECT_WILDCARD_IMPORT,
				MelangeValidationConstants.ASPECT_INVALID_WILDCARD
			)
	}
	
	@Check
	def void checkOverriding(Aspect asp){
		val aspectName = asp.aspectTypeRef.qualifiedName
		val aspectedClass = asp.aspectTypeRef.aspectAnnotationValue
		
		val language = asp.eContainer as Language 
		val typeRefBuilder = builderFactory.create(language.eResource.resourceSet)
		
		val ref = typeRefBuilder.typeRef(aspectName+aspectedClass+"AspectProperties")
		val aspectProperties = ref.type as JvmGenericType
		
		aspectProperties.members.filter(JvmField).forEach[field |
			val fieldName = field.simpleName
			val fieldType = field.type.type
			
			language.operators.forEach[operator | 
				
				val superLang = getLanguage(operator)
				
				val superClass = superLang.syntax.findClass(aspectedClass)
				if(superClass !== null){
					val superField = superClass.EAllAttributes.findFirst[name == fieldName]
					if(superField !== null){
						val superFieldType = superField.EType
						
						if(fieldType.simpleName != superFieldType.name){
							error(
								"Aspect \'"+aspectName+"\' has an attribute \'"+fieldName+"\' typed "+fieldType.simpleName+" but in \'"+superLang.name+"\' it is typed "+superFieldType.name,
								MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
								MelangeValidationConstants.MERGE_ATTRIBUTE_OVERRIDING
							)
						}
					}
					
					val superRef = superClass.EAllReferences.findFirst[name == fieldName]
					if(superRef !== null){
						val superFieldType = superRef.EType
						
						if(fieldType.simpleName != superFieldType.name){
							error(
								"Aspect \'"+aspectName+"\' has a reference \'"+fieldName+"\' typed "+fieldType.simpleName+" but in \'"+superLang.name+"\' it is typed "+superFieldType.name,
								MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
								MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING
							)
						}
					}
				}
			]
		]
	}
	
	/**
	 * Return the Language if {@link operator} is a Inheritance, Merge or Slice.
	 * Return null otherwise. 
	 */
	private def Language getLanguage(Operator operator){
		if(operator instanceof Inheritance){
			return (operator as Inheritance).superLanguage
		}
		else if(operator instanceof Merge){
			return (operator as Merge).mergedLanguage
		}
		else if(operator instanceof Slice){
			return (operator as Slice).slicedLanguage
		}
		return null
	}
}
