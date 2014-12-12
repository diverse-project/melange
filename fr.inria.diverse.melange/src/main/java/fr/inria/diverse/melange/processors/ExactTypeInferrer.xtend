package fr.inria.diverse.melange.processors

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.ASTHelper

import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

class ExactTypeInferrer implements MelangeProcessor
{
	@Inject extension ASTHelper

	override preProcess(ModelTypingSpace root) {
		val newMTs = newArrayList

		root.metamodels.forEach[mm |
			val newMT = MelangeFactory.eINSTANCE.createModelType => [
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
