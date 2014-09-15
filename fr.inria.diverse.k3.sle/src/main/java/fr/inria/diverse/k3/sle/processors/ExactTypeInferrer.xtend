package fr.inria.diverse.k3.sle.processors

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.ast.ASTHelper

import fr.inria.diverse.k3.sle.metamodel.k3sle.K3sleFactory
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

class ExactTypeInferrer implements K3SLEProcessor
{
	@Inject extension ASTHelper

	override preProcess(ModelTypingSpace root) {
		val newMTs = newArrayList

		root.metamodels.forEach[mm |
			val newMT = K3sleFactory.eINSTANCE.createModelType => [
				name = mm.exactTypeName
			]

			if (!root.modelTypes.exists[name == newMT.name])
				newMTs += newMT
		]

		root.elements += newMTs
		root.metamodels.forEach[mm |
			mm.exactType = root.modelTypes.findFirst[name == mm.exactTypeName]
		]

		return true
	}

	override postProcess(ModelTypingSpace root) {
		// ...
		return true
	}
}
