package fr.inria.diverse.melange.processors

import com.google.inject.Inject

import fr.inria.diverse.melange.ast.ASTHelper

import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

/**
 * This class creates new Model types corresponding to Exact types of each Metamodel
 * and add them in the Melange model
 */
class ExactTypeInferrer extends DispatchMelangeProcessor
{
	@Inject extension ASTHelper

	def dispatch void preProcess(ModelTypingSpace root, boolean preLinkingPhase) {
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
	}
}
