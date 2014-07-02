package fr.inria.diverse.k3.sle.ast

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.lib.ModelUtils

import fr.inria.diverse.k3.sle.lib.EcoreExtensions.*
import fr.inria.diverse.k3.sle.lib.MatchingHelper
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import com.google.inject.Inject
import fr.inria.diverse.k3.sle.lib.EcoreExtensions

class ModelTypeExtensions
{
	@Inject extension EcoreExtensions
	@Inject MatchingHelper matchingHelper

	def isExtracted(ModelType mt) {
		mt.extracted !== null
	}

	def isImported(ModelType mt) {
		mt.ecore !== null
	}

	def getAllSubPkgs(ModelType mt) {
		val allSubPkgs = newArrayList
		mt.pkgs.head.getAllSubPkgs(allSubPkgs)

		return allSubPkgs
	}

	def subtypeOf(ModelType mt1, ModelType mt2) {
		matchingHelper.match(mt1.pkgs.head, mt2.pkgs.head)
	}

	def findClassifier(ModelType mt, String clsName) {
		mt.allClassifiers.findFirst[name == clsName]
	}

	def findClass(ModelType mt, String clsName) {
		mt.allClasses.findFirst[name == clsName]
	}

	def getAllClassifiers(ModelType mt) {
		mt.pkgs.map[EClassifiers].flatten
	}

	def getAllClasses(ModelType mt) {
		mt.allClassifiers.filter(EClass)
	}

	def isUml(ModelType mt, EClassifier cls) {
		val pkg = mt.pkgs.findFirst[EClassifiers.exists[name == cls.name]]
		return pkg.name == "uml"
	}
}
