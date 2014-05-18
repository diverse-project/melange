package fr.inria.diverse.k3.sle.typing

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel

import static extension fr.inria.diverse.k3.sle.ast.ASTHelper.*
import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory

class K3SLETyping
{
	def dispatch void complete(ModelTypingSpace root) {
		val newMTs = newArrayList

		root.metamodels.forEach[mm |
			val newMT = K3sleFactory.eINSTANCE.createModelType => [
				name = mm.exactTypeRef
			]

			if (!root.modelTypes.exists[name == newMT.name])
				newMTs += newMT
		]

		root.elements += newMTs
		root.metamodels.forEach[mm |
			mm.exactType = root.modelTypes.findFirst[name == mm.exactTypeRef]
		]
		
		root.elements.forEach[complete]
	}
	
	def dispatch void complete(Metamodel mm) {
		
	}
	
	def dispatch void complete(ModelType mt) {
		
	}
	
	def dispatch void complete(Transformation t) {
		
	}
	
	def isValid() {
		true
	}
}
