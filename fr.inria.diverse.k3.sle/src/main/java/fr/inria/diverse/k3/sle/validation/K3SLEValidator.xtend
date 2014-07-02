package fr.inria.diverse.k3.sle.validation

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.lib.MatchingHelper
import fr.inria.diverse.k3.sle.lib.ModelUtils

import fr.inria.diverse.k3.sle.metamodel.k3sle.Element
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

import org.eclipse.xtext.common.types.JvmDeclaredType

import org.eclipse.xtext.validation.Check

class K3SLEValidator extends AbstractK3SLEValidator
{
	@Inject ModelUtils modelUtils
	@Inject MatchingHelper matchingHelper

	@Check
	def checkNamesAreUnique(Element e) {
		if ((e.eContainer as ModelTypingSpace).elements.exists[e_ |
			   e_ != e
			&& e_.eClass == e.eClass
			&& e_.name == e.name
		])
			error("Names must be unique", K3slePackage.Literals.ELEMENT__NAME)
	}

	@Check
	def checkEcoreIsSet(Metamodel mm) {
		if (mm.ecore?.uri === null && mm.inheritanceRelation?.superMetamodel?.ecore?.uri === null) {
			error("A valid Ecore file must be imported", K3slePackage.Literals.METAMODEL__ECORE)
		} else if (mm.ecore?.uri !== null && mm.inheritanceRelation?.superMetamodel?.ecore?.uri !== null) {
			error("An Ecore file has already been imported in the super metamodel", K3slePackage.Literals.METAMODEL__ECORE)
		}
	}

	@Check
	def checkGenModelIsSet(Metamodel mm) {
		if (mm.ecore?.uri !== null && mm.ecore?.uri.endsWith(".ecore") && mm.ecore?.genmodelUris.head === null) {
			// !!!
			val speculativeGenmodelPath = mm.ecore.uri.substring(0, mm.ecore.uri.lastIndexOf(".")) + ".genmodel"
			try {
				if (modelUtils.loadGenmodel(speculativeGenmodelPath) !== null)
					warning("Using Genmodel file found at " + speculativeGenmodelPath, K3slePackage.Literals.METAMODEL__ECORE)
				else error("A valid Genmodel file must be imported", K3slePackage.Literals.METAMODEL__ECORE)

			} catch (Exception e) {
				error("A valid Genmodel file must be imported", K3slePackage.Literals.METAMODEL__ECORE)
			}
		}
	}

	@Check
	def checkEcoreIsLoadable(Metamodel mm) {
		try {
			if (mm.ecore?.uri !== null && modelUtils.loadPkg(mm.ecore.uri) === null) {
				error("Couldn't load specified Ecore", K3slePackage.Literals.METAMODEL__ECORE)
			}
		} catch (Exception e) {}
	}

	@Check
	def checkGenModelIsLoadable(Metamodel mm) {
		try {
			if (mm.ecore?.genmodelUris.head !== null && modelUtils.loadGenmodel(mm.ecore.genmodelUris.head) === null) {
				error("Couldn't load specified GenModel", K3slePackage.Literals.METAMODEL__ECORE)
			}
		} catch (Exception e) {}
	}

	@Check
	def checkAspectsAreValid(Metamodel mm) {
		if (!mm.aspects.forall[aspectRef?.type !== null && aspectRef.type instanceof JvmDeclaredType])
			error("Imported aspect is invalid", K3slePackage.Literals.METAMODEL__ASPECTS)
	}

	@Check
	def checkImplements(Metamodel mm) {
		val mmPkg = modelUtils.loadPkg(mm.ecore.uri)

		mm.^implements
		.forEach[mt |
			val mtPkg = modelUtils.loadPkg(mt.ecore.uri)

			if (!matchingHelper.match(mmPkg, mtPkg))
				error(
					'''«mm.name» doesn't match the interface «mt.name»''',
					K3slePackage.Literals.ELEMENT__NAME,
					K3SLEValidationConstants.METAMODEL_IMPLEMENTS_ERROR
				)
		]
	}
}

