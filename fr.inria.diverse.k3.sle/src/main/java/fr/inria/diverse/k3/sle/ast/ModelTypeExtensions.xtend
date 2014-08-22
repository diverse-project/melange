package fr.inria.diverse.k3.sle.ast

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.lib.EcoreExtensions
import fr.inria.diverse.k3.sle.lib.MatchingHelper

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EClassifier
import java.util.List
import org.eclipse.emf.ecore.EPackage

class ModelTypeExtensions
{
	@Inject extension EcoreExtensions
	@Inject MatchingHelper matchingHelper

	def boolean isExtracted(ModelType mt) {
		return mt.extracted !== null
	}

	def boolean isImported(ModelType mt) {
		return mt.ecore !== null
	}

	def List<EPackage> getAllSubPkgs(ModelType mt) {
		return mt.pkgs.head.allSubPkgs
	}

	def boolean subtypeOf(ModelType mt1, ModelType mt2) {
		return matchingHelper.match(mt1.pkgs.head, mt2.pkgs.head)
	}

	def EClassifier findClassifier(ModelType mt, String clsName) {
		return mt.allClassifiers.findFirst[name == clsName]
	}

	def EClass findClass(ModelType mt, String clsName) {
		return mt.allClasses.findFirst[name == clsName]
	}

	def Iterable<EClassifier> getAllClassifiers(ModelType mt) {
		return mt.pkgs.map[EClassifiers].flatten
	}

	def Iterable<EClass> getAllClasses(ModelType mt) {
		return mt.allClassifiers.filter(EClass)
	}

	def boolean isUml(ModelType mt, EClassifier cls) {
		return mt.pkgs.findFirst[EClassifiers.exists[name == cls.name]] == "uml"
	}
}
