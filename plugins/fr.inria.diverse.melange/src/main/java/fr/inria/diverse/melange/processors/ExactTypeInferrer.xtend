package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * This class creates new Model types corresponding to Exact types of each Metamodel
 * and add them in the Melange model
 */
class ExactTypeInferrer extends DispatchMelangeProcessor
{
	@Inject extension ASTHelper
	List<ModelType> inferredMTs = newArrayList

	def dispatch void preProcess(ModelTypingSpace root, boolean preLinkingPhase) {
		inferredMTs = newArrayList

		root.languages.filter[exactTypeName !== null].forEach[l |
			val newMT = MelangeFactory.eINSTANCE.createModelType => [
				name = l.exactTypeName
			]

			if (!root.modelTypes.exists[name == newMT.name])
				inferredMTs += newMT
		]

		root.elements += inferredMTs
		root.languages.forEach[l |
			l.exactType = root.modelTypes.findFirst[name == l.exactTypeName]
		]
	}

	def dispatch void postProcess(ModelTypingSpace root) {
		inferredMTs.forEach[EcoreUtil::remove(it)]
	}
}
