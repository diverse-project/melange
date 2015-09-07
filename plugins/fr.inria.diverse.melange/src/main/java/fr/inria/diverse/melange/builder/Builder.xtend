package fr.inria.diverse.melange.builder

import fr.inria.diverse.melange.metamodel.melange.Operator
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.ecore.EPackage

abstract class Builder<T extends Operator>{

	protected EPackage model
	protected List<Error> errors

	def void make()
	
	def void preBuild(){
		model = null
		errors = new ArrayList
	}
	def void postBuild(){
		
	}
	
	def EPackage getModel(){
		return model
	}
	
	def  List<Error> getErrors(){
		return  errors
	}
	
	def final void build(){
		
		preBuild()
		make()
		postBuild()
		
	}
	
	def void reset(){
		model = null
	}
}