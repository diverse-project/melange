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

		root.languages.forEach[l |
			val newMT = MelangeFactory.eINSTANCE.createModelType => [
				name = l.exactTypeName
			]

			if (!root.modelTypes.exists[name == newMT.name])
				newMTs += newMT
		]

		root.elements += newMTs
		root.languages.forEach[l |
			l.exactType = root.modelTypes.findFirst[name == l.exactTypeName]
		]
	}
}
