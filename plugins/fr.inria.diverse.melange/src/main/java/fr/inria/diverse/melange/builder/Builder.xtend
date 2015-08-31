package fr.inria.diverse.melange.builder

import org.eclipse.emf.ecore.EPackage
import java.util.List
import java.util.ArrayList

abstract class Builder{

	protected EPackage model

	def List<Error> make()
	
	def List<Error> preBuild(){
		return new ArrayList
	}
	def List<Error> postBuild(){
		return new ArrayList
	}
	
	def EPackage	getModel(){
		return model
	}
	
	def final List<Error> build(){
		val  List<Error> res = new ArrayList
		
		res.addAll(preBuild())
		res.addAll(make())
		res.addAll(postBuild())
		
		return res
	}
	
	def void reset(){
		model = null
	}
}