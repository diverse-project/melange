package fr.inria.diverse.melange.processors

import org.eclipse.emf.ecore.EObject

/**
 * Just a dummy implementation of {@link MelangeProcessor} that automatically
 * browses the current {@link Resource} and dispatches to the most precise
 * method depending on the actual type of the current {@link EObject}. 
 */
class DispatchMelangeProcessor implements MelangeProcessor
{
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
