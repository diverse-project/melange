package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import org.eclipse.emf.ecore.EObject

class DispatchMelangeProcessor implements MelangeProcessor
{
	@Inject extension ModelTypeExtensions
	@Inject extension LanguageExtensions

	override preProcess(EObject object, boolean preLinkingPhase) {
		object._preProcess(preLinkingPhase)
	}

	def void _preProcess(EObject object, boolean preLinkingPhase) {
		if (object !== null)
			object.eContents.forEach[preProcess(preLinkingPhase)]
	}

	override postProcess(EObject object) {
		object._postProcess
	}

	def void _postProcess(EObject object) {
		if (object !== null)
			object.eContents.forEach[postProcess]
	}
}
