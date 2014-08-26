package fr.inria.diverse.k3.sle.postprocessing

import org.apache.log4j.Logger

import org.eclipse.xtext.resource.DerivedStateAwareResource

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator

class K3SLEPostProcessor extends JvmModelAssociator
{
	private static final Logger log = Logger.getLogger(K3SLEPostProcessor);

	override discardDerivedState(DerivedStateAwareResource resource) {
		super.discardDerivedState(resource)

		log.debug(Stopwatches.getPrintableStopwatchData)
	}

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		Stopwatches.enabled = true

		super.installDerivedState(resource, preLinkingPhase)
	}
}
