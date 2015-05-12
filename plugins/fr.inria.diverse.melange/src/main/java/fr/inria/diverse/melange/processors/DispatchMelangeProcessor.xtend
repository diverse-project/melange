package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.processors.MelangeProcessor
import org.eclipse.emf.ecore.EObject

class DispatchMelangeProcessor implements MelangeProcessor
{
	override preProcess(EObject object) {
		object._preProcess
	}

	def void _preProcess(EObject object) {
		if (object !== null)
			object.eContents.forEach[preProcess]
	}

	override postProcess(EObject object) {
		object._postProcess
	}

	def void _postProcess(EObject object) {
		if (object !== null)
			object.eContents.forEach[postProcess]
	}
}
