package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.metamodel.melange.MelangeFactory
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * For each {@link Language} in the current {@link Resource}, extract its
 * exact {@link ModelType}. The new model type is named $LanguageName$MT, or
 * can be explicitly specified by the user using the 'exactType' clause.
 */
class ExactTypeInferrer extends DispatchMelangeProcessor
{
	@Inject extension ASTHelper
	List<ModelType> inferredMTs = newArrayList

	def dispatch void preProcess(ModelTypingSpace root, boolean preLinkingPhase) {
		inferredMTs = newArrayList

		root.languages.forEach[l |
			if (l.exactTypeName === null)
				l.exactTypeName = l.name + "MT"

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
		root.mappings.forEach[m |
			m.to = root.modelTypes.findFirst[name == m.to?.name]
		]
	}

	def dispatch void postProcess(ModelTypingSpace root) {
		inferredMTs.forEach[EcoreUtil::remove(it)]
	}
}
