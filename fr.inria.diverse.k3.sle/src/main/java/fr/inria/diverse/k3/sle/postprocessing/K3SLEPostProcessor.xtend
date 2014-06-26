package fr.inria.diverse.k3.sle.postprocessing

import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator

class K3SLEPostProcessor extends JvmModelAssociator
{
	override discardDerivedState(DerivedStateAwareResource resource) {
		super.discardDerivedState(resource)
	}

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		super.installDerivedState(resource, preLinkingPhase)
	}
}
