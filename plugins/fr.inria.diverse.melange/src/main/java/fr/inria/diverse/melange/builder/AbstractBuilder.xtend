package fr.inria.diverse.melange.builder

import java.util.List
import org.eclipse.emf.ecore.EPackage

abstract class AbstractBuilder implements Builder {
	protected EPackage model
	protected List<Error> errors

	override preBuild() {
		model = null
		errors = newArrayList
	}

	override postBuild() {
	}

	def EPackage getModel() {
		return model
	}

	override getErrors() {
		return errors
	}

	def final void build() {
		preBuild()
		make()
		postBuild()
	}
//	
//	def void reset(){
//		model = null
//	}
}
