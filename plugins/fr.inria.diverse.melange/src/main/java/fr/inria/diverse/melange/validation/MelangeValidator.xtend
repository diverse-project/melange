package fr.inria.diverse.melange.validation

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.MetamodelExtensions

import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.lib.ModelUtils

import fr.inria.diverse.melange.metamodel.melange.Aspect
import fr.inria.diverse.melange.metamodel.melange.Element
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

import java.util.Collections

import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.validation.Check

class MelangeValidator extends AbstractMelangeValidator
{
	@Inject extension MetamodelExtensions
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper

	@Check
	def void checkElementsAreNamed(Element e) {
		if (e.name === null || e.name.length == 0)
			error(
				"All elements must be named",
				MelangePackage.Literals.ELEMENT__NAME,
				MelangeValidationConstants.ELEMENT_NAME_EMPTY
			)
	}

	@Check
	def void checkNamesAreUnique(Element e) {
		if ((e.eContainer as ModelTypingSpace).elements.exists[e_ |
			   e_ != e
			//&& e_.eClass == e.eClass
			&& e_.name == e.name
		])
			error(
				"Names must be unique",
				MelangePackage.Literals.ELEMENT__NAME,
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
	def void checkEcoreIsSet(Metamodel mm) {
		if (mm.ecoreUri === null && mm.inheritanceRelation?.superMetamodel?.ecoreUri === null)
			error(
				"A valid Ecore file must be imported",
				MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
				MelangeValidationConstants.METAMODEL_ECORE_EMPTY
			)
	}

	@Check
	def void checkGenModelIsSet(Metamodel mm) {
		if (mm.ecoreUri !== null && mm.ecoreUri.endsWith(".ecore") && mm.genmodelUris.head === null) {
			// !!!
			val speculativeGenmodelPath = mm.ecoreUri.substring(0, mm.ecoreUri.lastIndexOf(".")) + ".genmodel"
			try {
				if (modelUtils.loadGenmodel(speculativeGenmodelPath) !== null)
					warning(
						"Using Genmodel file found at " + speculativeGenmodelPath,
						MelangePackage.Literals.METAMODEL__GENMODEL_URIS,
						MelangeValidationConstants.METAMODEL_GENMODEL_INFERRED)
				else
					error(
						"A valid Genmodel file must be imported",
						MelangePackage.Literals.METAMODEL__GENMODEL_URIS,
						MelangeValidationConstants.METAMODEL_GENMODEL_UNLOADABLE
					)
			} catch (Exception e) {
				error(
					"A valid Genmodel file must be imported",
					MelangePackage.Literals.METAMODEL__GENMODEL_URIS,
					MelangeValidationConstants.METAMODEL_GENMODEL_UNLOADABLE
				)
			}
		}
	}

	@Check
	def void checkEcoreIsLoadable(Metamodel mm) {
		try {
			if (mm.ecoreUri !== null && modelUtils.loadPkg(mm.ecoreUri) === null)
				error(
					"Couldn't load specified Ecore",
					MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
					MelangeValidationConstants.METAMODEL_ECORE_UNLOADABLE
				)
		} catch (Exception e) {}
	}

	@Check
	def void checkGenModelIsLoadable(Metamodel mm) {
		try {
			if (mm.genmodelUris.head !== null && modelUtils.loadGenmodel(mm.genmodelUris.head) === null)
				error(
					"Couldn't load specified GenModel",
					MelangePackage.Literals.METAMODEL__GENMODEL_URIS,
					MelangeValidationConstants.METAMODEL_GENMODEL_UNLOADABLE
				)
		} catch (Exception e) {}
	}

	@Check
	def void checkAspectExists(Aspect a) {
		if (a.aspectTypeRef?.type === null || !(a.aspectTypeRef.type instanceof JvmDeclaredType))
			error(
				"Cannot find imported aspect class",
				MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
				MelangeValidationConstants.ASPECT_NOT_FOUND
			)
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
	def void checkAspectHasAnnotation(Aspect a) {
		if (
			a.aspectTypeRef?.type instanceof JvmDeclaredType
			&& (a.aspectAnnotationValue === null || a.aspectAnnotationValue.length == 0)
		)
			error(
				"Cannot find @Aspect annotation",
				MelangePackage.Literals.ASPECT__ASPECT_TYPE_REF,
				MelangeValidationConstants.ASPECT_NO_ANNOTATION
			)
	}

	// FIXME: Only one package is checked there,
	//        and mtPkg may be null
	// TODO: This should be replaced by an algebra call.
	//       -> ecore files must be loaded prior to this
	@Check
	def void checkImplements(Metamodel mm) {
		val mmPkg = modelUtils.loadPkg(mm.ecoreUri)

		mm.^implements
		.forEach[mt |
			val mtPkg = modelUtils.loadPkg(mt.ecoreUri)

			if (!matchingHelper.match(
				Collections.singletonList(mmPkg), Collections.singletonList(mtPkg)
			))
				error(
					'''«mm.name» doesn't match the interface «mt.name»''',
					MelangePackage.Literals.ELEMENT__NAME,
					MelangeValidationConstants.METAMODEL_IMPLEMENTS_ERROR
				)
		]
	}

	@Check
	def void checkMetamodelTypeIsSet(Metamodel mm) {
		if (mm.exactTypeName === null || mm.exactType === null)
			error(
				"exactType feature must be set",
				MelangePackage.Literals.METAMODEL__EXACT_TYPE_NAME,
				MelangeValidationConstants.METAMODEL_EXACTTYPE_ERROR
			)
	}

	@Check
	def void checkNoSelfInheritance(Metamodel mm) {
		if (mm.inheritanceRelation.superMetamodel == mm)
			error(
				"Cannot inherit from self",
				MelangePackage.Literals.METAMODEL__INHERITANCE_RELATION,
				MelangeValidationConstants.METAMODEL_SELF_INHERITANCE
			)
	}

	@Check
	def void checkXtextResourceProperlyConfigured(Metamodel mm) {
		if (
			   mm.resourceType == fr.inria.diverse.melange.metamodel.melange.ResourceType.XTEXT
			&& mm.xtextSetupRef === null
		)
			error(
				"Xtext resources needs a 'setup' class",
				MelangePackage.Literals.METAMODEL__RESOURCE_TYPE,
				MelangeValidationConstants.METAMODEL_XTEXT_SETUP
			)
	}

	@Check
	def void checkRuntimeHasBeenGenerated(Metamodel mm) {
		if (mm.isGeneratedByMelange && !mm.runtimeHasBeenGenerated) {
			error(
				"Cannot find EMF runtime for" + mm.name,
				MelangePackage.Literals.MODELING_ELEMENT__ECORE_URI,
				MelangeValidationConstants.METAMODEL_NO_EMF_RUNTIME
			)
		}
	}
}
