package fr.inria.diverse.k3.sle.processors

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

import java.util.List

import org.apache.log4j.Logger

import org.eclipse.xtext.resource.DerivedStateAwareResource

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator

import static org.eclipse.xtext.util.internal.Stopwatches.*

class K3SLEDerivedStateComputer extends JvmModelAssociator
{
	List<? extends K3SLEProcessor> processors = #[
		new ModelLoader,
		new ASTValidator,
		new ASTCompleter
	]

	static final Logger log = Logger.getLogger(K3SLEDerivedStateComputer)

	override discardDerivedState(DerivedStateAwareResource resource) {
		super.discardDerivedState(resource)

		// Post-inferring processors
		// TODO: AST completion & validation should go there
		val root = resource.contents.head as ModelTypingSpace
		processors.forEach[postProcess(root)]

		// Print stop watches metrics
		log.debug(Stopwatches.getPrintableStopwatchData)
	}

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		// Activate stop watches before anything happens
		Stopwatches.enabled = true

		// Pre-inferring processors
		// TODO: AST completion & validation should go there
		val root = resource.contents.head as ModelTypingSpace
		processors.forEach[preProcess(root)]

		super.installDerivedState(resource, preLinkingPhase)
	}
}
