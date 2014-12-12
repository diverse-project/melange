package fr.inria.diverse.melange.validation

import com.google.inject.Inject

import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.lib.ModelUtils

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
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper

	@Check
	def void checkNamesAreUnique(Element e) {
		if ((e.eContainer as ModelTypingSpace).elements.exists[e_ |
			   e_ != e
			&& e_.eClass == e.eClass
			&& e_.name == e.name
		])
			error("Names must be unique", MelangePackage.Literals.ELEMENT__NAME)
	}

	@Check
	def void checkEcoreIsSet(ModelType mt) {
		if (mt.extracted === null && (mt.ecoreUri === null || mt.ecoreUri.empty))
			error("A valid Ecore file must be imported", MelangePackage.Literals.MODEL_TYPE__ECORE_URI)
	}

	@Check
	def void checkEcoreIsLoadable(ModelType mt) {
		try {
			if (mt.extracted === null && mt.ecoreUri !== null && modelUtils.loadPkg(mt.ecoreUri) === null) {
				error("Couldn't load specified Ecore", MelangePackage.Literals.MODEL_TYPE__ECORE_URI)
			}
		} catch (Exception e) {}
	}

	@Check
	def void checkEcoreIsSet(Metamodel mm) {
		if (mm.ecoreUri === null && mm.inheritanceRelation?.superMetamodel?.ecoreUri === null) {
			error("A valid Ecore file must be imported", MelangePackage.Literals.METAMODEL__ECORE_URI)
		} else if (mm.ecoreUri !== null && mm.inheritanceRelation?.superMetamodel?.ecoreUri !== null) {
			error("An Ecore file has already been imported in the super metamodel", MelangePackage.Literals.METAMODEL__ECORE_URI)
		}
	}

	@Check
	def void checkGenModelIsSet(Metamodel mm) {
		if (mm.ecoreUri !== null && mm.ecoreUri.endsWith(".ecore") && mm.genmodelUris.head === null) {
			// !!!
			val speculativeGenmodelPath = mm.ecoreUri.substring(0, mm.ecoreUri.lastIndexOf(".")) + ".genmodel"
			try {
				if (modelUtils.loadGenmodel(speculativeGenmodelPath) !== null)
					warning("Using Genmodel file found at " + speculativeGenmodelPath, MelangePackage.Literals.METAMODEL__GENMODEL_URIS)
				else error("A valid Genmodel file must be imported", MelangePackage.Literals.METAMODEL__GENMODEL_URIS)

			} catch (Exception e) {
				error("A valid Genmodel file must be imported", MelangePackage.Literals.METAMODEL__GENMODEL_URIS)
			}
		}
	}

	@Check
	def void checkEcoreIsLoadable(Metamodel mm) {
		try {
			if (mm.ecoreUri !== null && modelUtils.loadPkg(mm.ecoreUri) === null) {
				error("Couldn't load specified Ecore", MelangePackage.Literals.METAMODEL__ECORE_URI)
			}
		} catch (Exception e) {}
	}

	@Check
	def void checkGenModelIsLoadable(Metamodel mm) {
		try {
			if (mm.genmodelUris.head !== null && modelUtils.loadGenmodel(mm.genmodelUris.head) === null) {
				error("Couldn't load specified GenModel", MelangePackage.Literals.METAMODEL__GENMODEL_URIS)
			}
		} catch (Exception e) {}
	}

	@Check
	def void checkAspectsAreValid(Metamodel mm) {
		if (!mm.aspects.forall[aspectTypeRef?.type !== null && aspectTypeRef.type instanceof JvmDeclaredType])
			error("Imported aspect is invalid", MelangePackage.Literals.METAMODEL__ASPECTS)
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
			error("exactType feature must be set", MelangePackage.Literals.METAMODEL__EXACT_TYPE_NAME)
	}
}

