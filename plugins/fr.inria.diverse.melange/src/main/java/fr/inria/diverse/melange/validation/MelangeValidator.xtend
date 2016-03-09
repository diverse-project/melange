package fr.inria.diverse.melange.validation

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.AspectExtensions
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.lib.ModelUtils
import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Import
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.LanguageOperator
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.ModelingElement
import fr.inria.diverse.melange.metamodel.melange.NamedElement
import fr.inria.diverse.melange.metamodel.melange.ResourceType
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.metamodel.melange.Weave
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.validation.Check

class MelangeValidator extends AbstractMelangeValidator
{
	@Inject extension AspectExtensions
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension EcoreExtensions
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper

	@Check
	def void checkElementsAreNamed(NamedElement e) {
		if (e.name.nullOrEmpty)
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
			&& e_.name == e.name
		])
			error(
				"Names must be unique",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.ELEMENT_NAME_DUPLICATED
			)
	}

	@Check
	def void checkNameIsValid(Language l) {
		if (l.name.nullOrEmpty || !Character.isUpperCase(l.name.charAt(0)))
			error(
				"Language name should start with an uppercase",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_NAME_INVALID
			)
	}

	@Check
	def void checkLanguageNameIsntAmbiguous(Language l) {
		if (!l.name.nullOrEmpty && l.name.endsWith("MT"))
			error(
				"Language shouldn't end with 'MT' to avoid ambiguities with model type names",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_NAME_AMBIGUOUS
			)
	}

	@Check
	def void checkNameIsValid(ModelType mt) {
		if (mt.name.nullOrEmpty || !Character.isUpperCase(mt.name.charAt(0)))
			error(
				"Model type name should start with an uppercase",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.MODELTYPE_NAME_INVALID
			)
	}

	@Check
	def void checkEcoreIsSet(ModelType mt) {
		if (mt.extracted === null) {
			if (mt.ecoreUri.nullOrEmpty)
				error(
					"Please specify the Ecore file defining the model type's syntax",
					MelangePackage.Literals.NAMED_ELEMENT__NAME,
					MelangeValidationConstants.MODELTYPE_ECORE_EMPTY
				)
			else if (mt.ecoreUri !== null && modelUtils.loadPkg(mt.ecoreUri) === null)
				error(
					'''The Ecore file "«mt.ecoreUri»" couldn't be loaded''',
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.MODELTYPE_ECORE_UNLOADABLE
				)
		}
	}

	@Check
	def void checkEcoreIsSet(Language l) {
		if (!l.hasSyntax)
			error(
				"Please specify the Ecore file defining the language's syntax",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.METAMODEL_ECORE_EMPTY
			)
	}

	@Check
	def void checkExactTypeIsSet(Language l) {
		if (l.exactType === null)
			error(
				"Please specify the language's exact type name",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_EXACTTYPE_EMPTY
			)
	}

	@Check
	def void checkImportIsValid(Import i) {
		try {
			val lang = i.eContainer as Language
			val ecore = modelUtils.loadPkg(i.ecoreUri)

			if (ecore === null)
				error(
					'''The Ecore file "«i.ecoreUri»" couldn't be loaded''',
					MelangePackage.Literals.IMPORT__ECORE_URI,
					MelangeValidationConstants.IMPORT_INVALID_URI
				)

			// If its an Xcore file, the Genmodel is directly embedded within it
			if (!lang.syntax.isXcore) {
				if (i.genmodelUris.empty) {
					val speculativeGenmodelPath = i.ecoreUri.substring(0, i.ecoreUri.lastIndexOf(".")) + ".genmodel"
					if (modelUtils.loadGenmodel(speculativeGenmodelPath) === null)
						error(
							'''No associated genmodel found at "«speculativeGenmodelPath»"''',
							MelangePackage.Literals.IMPORT__ECORE_URI,
							MelangeValidationConstants.IMPORT_INVALID_GENMODEL
						)
				} else {
					i.genmodelUris.forEach[gmUri, n |
						if (modelUtils.loadGenmodel(gmUri) === null)
							error(
								'''Couldn't load the specified Genmodel "«gmUri»"''',
								MelangePackage.Literals.IMPORT__GENMODEL_URIS,
								n,
								MelangeValidationConstants.IMPORT_INVALID_GENMODEL
							)
					]
				}
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

	@Check
	def void checkImplements(Language l) {
		l.^implements
		.forEach[mt, i |
			if (!matchingHelper.match(
				l.syntax.pkgs, mt.pkgs, l.mappings.findFirst[to == mt]
			))
				error(
					'''«l.name» doesn't match the interface «mt.name»''',
					MelangePackage.Literals.NAMED_ELEMENT__NAME,
					MelangeValidationConstants.METAMODEL_IMPLEMENTS_ERROR
				)
		]
	}

	@Check
	def void checkNoCyclicInheritance(Language l) {
		if (l.allSuperLanguages.exists[ll | ll.allSuperLanguages.contains(l)])
			error(
				"Cannot inherit from self",
				MelangePackage.Literals.LANGUAGE_OPERATOR__TARGET_LANGUAGE,
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
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_NO_EMF_RUNTIME
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
	def void checkFindAspectedClass(Aspect asp) {
		
		val lang = asp.eContainer as Language
		val correspondingWeave = lang.operators.filter(Weave).findFirst[aspectTypeRef.simpleName == asp.aspectTypeRef.simpleName]
		val clsName = correspondingWeave?.aspectTypeRef.aspectAnnotationValue

		if (asp.hasAspectAnnotation && clsName === null && correspondingWeave !== null)
			error(
				'''Cannot find in the classpath the class targeted by «asp.aspectTypeRef.qualifiedName»''',
				correspondingWeave,
				MelangePackage.Literals.WEAVE__ASPECT_TYPE_REF,
				MelangeValidationConstants.WEAVE_INVALID_TARGET
			)
	}

	@Check
	def void checkWildcardAspectImport(Weave w) {
		if (
			   w.aspectWildcardImport !== null
			&& !w.aspectWildcardImport.endsWith(".*")
		)
			error(
				"Only wildcard imports are supported, e.g. my.pkg.*",
				MelangePackage.Literals.WEAVE__ASPECT_WILDCARD_IMPORT,
				MelangeValidationConstants.ASPECT_INVALID_WILDCARD
			)
	}

	@Check
	def void checkSliceCriteria(Slice s) {
		val invalidRoots = s.roots.filter[clsName | s.targetLanguage.syntax.findClassifier(clsName) === null]
		val invalidRootsSize = invalidRoots.size

		if (invalidRootsSize > 0)
			error(
				'''Invalid slicing criterion: cannot find class«IF invalidRootsSize > 1»es«ENDIF»: «invalidRoots.join(", ")»''',
				MelangePackage.Literals.SLICE__ROOTS,
				MelangeValidationConstants.SLICE_INVALID_ROOT
			)
	}

	@Check
	def void checkEveryLanguagePackageHasACorrectGenPackage(Language l) {
		if (!l.isGeneratedByMelange) {
			val invalidPkgs = l.syntax.EPackagesWithoutGenPackage

			if (invalidPkgs.size > 0)
				error(
					'''Unexpected error: cannot find a GenPackage for: «invalidPkgs.map[name].join(", ")».''' +
					''' Please check whether the associated Genmodel is up to date.''',
					MelangePackage.Literals.NAMED_ELEMENT__NAME,
					MelangeValidationConstants.METAMODEL_NO_GENPACKAGE
				)
			else {
				val invalidCls = l.syntax.EClassifiersWithoutGenClassifier

				if (invalidCls.size > 0)
					error(
						'''Unexpected error: cannot find a GenClassifier for: «invalidCls.map[name].join(", ")».''' +
						''' Please check whether the associated Genmodel is up to date.''',
						MelangePackage.Literals.NAMED_ELEMENT__NAME,
						MelangeValidationConstants.METAMODEL_NO_GENPACKAGE
					)
			}
		}
	}

	@Check
	def void checkEveryModelTypePackageHasACorrectGenPackage(ModelType mt) {
		val invalidPkgs = mt.EPackagesWithoutGenPackage

		if (invalidPkgs.size > 0)
			error(
				'''Cannot find a GenPackage for: «invalidPkgs.map[name].join(", ")».''' +
				''' Please check whether the associated Genmodel is up to date.''',
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.METAMODEL_NO_GENPACKAGE
			)
		else {
			val invalidCls = mt.EClassifiersWithoutGenClassifier

			if (invalidCls.size > 0)
				error(
					'''Cannot find a GenClassifier for: «invalidCls.map[name].join(", ")».''' +
					''' Please check whether the associated Genmodel is up to date.''',
					MelangePackage.Literals.NAMED_ELEMENT__NAME,
					MelangeValidationConstants.METAMODEL_NO_GENPACKAGE
				)
		}
	}

	private def Iterable<EPackage> getEPackagesWithoutGenPackage(ModelingElement m) {
		return m.pkgs.filter[m.getGenPkgFor(it) === null]
	}

	private def Iterable<EClassifier> getEClassifiersWithoutGenClassifier(ModelingElement m) {
		return	m.allClassifiers.filter[!isAspectSpecific && m.getGenClassifierFor(it) === null]
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
	
	@Check
	def void checkOperators(LanguageOperator op){
		val targetLang = op.targetLanguage

		if(targetLang.isInError) {
			error(
				"Language \'"+targetLang.name+"\' has errors in its definition",
				MelangePackage.Literals.LANGUAGE_OPERATOR__TARGET_LANGUAGE,
				MelangeValidationConstants.METAMODEL_IN_ERROR
			)
		}
	}

	@Check
	def void checkEntryPoints(Language lang){
		val entries = lang.entryPoints
		if(entries.isEmpty && lang.ecl.isEmpty && !lang.semantics.isEmpty){
			warning(
				"Language "+lang.name+" doesn't define entry point. An Aspect's method should be tagged with @Main to be identified as an entry point for the execution.",
				MelangePackage.Literals.NAMED_ELEMENT__NAME,
				MelangeValidationConstants.LANGUAGE_NO_MAIN
			)
		}
	}
}
