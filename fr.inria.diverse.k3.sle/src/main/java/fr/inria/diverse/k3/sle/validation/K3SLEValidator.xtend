package fr.inria.diverse.k3.sle.validation

import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3slePackage

import fr.inria.diverse.k3.sle.lib.ModelUtils

import org.eclipse.xtext.validation.Check

class K3SLEValidator extends AbstractK3SLEValidator
{
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
		if (mm.ecore?.uri !== null && mm.ecore?.uri.endsWith(".ecore") && mm.ecore?.genmodelUri === null) {
			// !!!
			val speculativeGenmodelPath = mm.ecore.uri.substring(0, mm.ecore.uri.lastIndexOf(".")) + ".genmodel"

			try {
				if (ModelUtils.loadGenModel(speculativeGenmodelPath) !== null) {
					warning("Using Genmodel file found at " + speculativeGenmodelPath, K3slePackage.Literals.METAMODEL__ECORE)
					return
				}
			} catch (Exception e) {}
			finally {
				error("A valid Genmodel file must be imported", K3slePackage.Literals.METAMODEL__ECORE)
			}
		}
	}

	@Check
	def checkEcoreIsLoadable(Metamodel mm) {
		try {
			if (mm.ecore?.uri !== null && ModelUtils.loadPkg(mm.ecore.uri) === null) {
				error("Couldn't load specified Ecore", K3slePackage.Literals.METAMODEL__ECORE)
			}
		} catch (Exception e) {}
	}

	@Check
	def checkGenModelIsLoadable(Metamodel mm) {
		try {
			if (mm.ecore?.genmodelUri !== null && ModelUtils.loadGenModel(mm.ecore.genmodelUri) === null) {
				error("Couldn't load specified GenModel", K3slePackage.Literals.METAMODEL__ECORE)
			}
		} catch (Exception e) {}
	}
}

