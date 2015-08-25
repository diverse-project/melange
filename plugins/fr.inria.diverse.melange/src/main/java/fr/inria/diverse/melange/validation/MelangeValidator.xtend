package fr.inria.diverse.melange.validation

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
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
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import java.util.Collections
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.validation.Check

class MelangeValidator extends AbstractMelangeValidator
{
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	@Inject extension MetamodelExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension NamingHelper
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper

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
		if (mt.extracted === null) {
			if (mt.ecoreUri === null || mt.ecoreUri.empty)
				error(
					"A valid Ecore file must be imported",
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.MODELTYPE_ECORE_EMPTY
				)
			else if (mt.ecoreUri !== null && modelUtils.loadPkg(mt.ecoreUri) === null)
				error(
					"Couldn't load specified Ecore",
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.MODELTYPE_ECORE_UNLOADABLE
				)
		}
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
	def void checkImportIsValid(Import i) {
		try {
			val ecore = modelUtils.loadPkg(i.ecoreUri)

			if (ecore === null)
				error(
					"Couldn't load specified Ecore",
					MelangePackage.Literals.IMPORT__ECORE_URI,
					MelangeValidationConstants.IMPORT_INVALID_URI
				)

			if (i.genmodelUris.empty) {
				val speculativeGenmodelPath = i.ecoreUri.substring(0, i.ecoreUri.lastIndexOf(".")) + ".genmodel"
				if (modelUtils.loadGenmodel(speculativeGenmodelPath) === null)
					error(
						"A valid Genmodel file must be imported",
						MelangePackage.Literals.IMPORT__GENMODEL_URIS,
						MelangeValidationConstants.IMPORT_INVALID_GENMODEL
					)
			} else {
				i.genmodelUris.forEach[gmUri |
					if (modelUtils.loadGenmodel(gmUri) === null)
						error(
							"A valid Genmodel file must be imported",
							MelangePackage.Literals.IMPORT__GENMODEL_URIS,
							MelangeValidationConstants.IMPORT_INVALID_GENMODEL
						)
				]
			}
		} catch (Exception e) {
			error(
				"Unexpected error while loading Ecore/Genmodel",
				MelangePackage.Literals.IMPORT__ECORE_URI,
				MelangeValidationConstants.IMPORT_LOADING_EXCEPTION
			)
		}
	}

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
	def void checkNoCyclicInheritance(Language l) {
		if (l.allSuperLanguages.exists[ll | ll.allSuperLanguages.contains(l)])
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
	def void checkAspectAnnotationIsValid(Aspect asp) {
		val clsName = asp.aspectTypeRef.aspectAnnotationValue
		val lang = asp.eContainer as Language
		val correspondingWeave = lang.operators.filter(Weave).findFirst[aspectTypeRef.simpleName == asp.aspectTypeRef.simpleName]

		if (clsName !== null && correspondingWeave !== null && asp.aspectedClass === null)
			error(
				'''Cannot find target class «clsName»''',
				correspondingWeave,
				MelangePackage.Literals.WEAVE__ASPECT_TYPE_REF,
				MelangeValidationConstants.WEAVE_INVALID_TARGET
			)
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
	def void checkSliceCriteria(Slice s) {
		val invalidRoots = s.roots.filter[clsName | s.slicedLanguage.syntax.findClassifier(clsName) === null]
		val invalidRootsSize = invalidRoots.size

		if (invalidRootsSize > 0)
			error(
				'''Invalid slicing criterion: cannot find class«IF invalidRootsSize > 1»es«ENDIF»: «invalidRoots.join(", ")»''',
				MelangePackage.Literals.SLICE__ROOTS,
				MelangeValidationConstants.SLICE_INVALID_ROOT
			)
	}

	@Check
	def void checkEveryPackageHasAGenPackage(Language l) {
		val invalidPkgs = l.syntax.pkgs.filter[l.syntax.getGenPackageFor(it) === null]

		if (invalidPkgs.size > 0)
			error(
				'''Unexpected error: cannot find a GenPackage for: «invalidPkgs.map[name].join(", ")»''',
				MelangePackage.Literals.LANGUAGE__SYNTAX,
				MelangeValidationConstants.METAMODEL_NO_GENPACKAGE
			)
	}

	@Check
	def void checkLanguageNameDoesntConflictWithClassifier(Language l) {
		if (l.syntax.findClassifier(l.name) !== null)
			error(
				'''Language name conflicts with one of its meta-classes: «l.name»''',
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_NAME_CONFLICTS_METACLASS
			)
	}
}
