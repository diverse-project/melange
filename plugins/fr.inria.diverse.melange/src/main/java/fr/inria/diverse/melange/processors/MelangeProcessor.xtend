package fr.inria.diverse.melange.processors

import org.eclipse.emf.ecore.EObject

interface MelangeProcessor
{
	def void preProcess(EObject object, boolean preLinkingPhase)
	def void postProcess(EObject object)
}
