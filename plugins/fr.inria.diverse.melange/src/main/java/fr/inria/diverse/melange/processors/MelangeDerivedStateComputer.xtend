package fr.inria.diverse.melange.processors

import com.google.inject.Inject

import fr.inria.diverse.melange.jvmmodel.MelangeTypesBuilder
import fr.inria.diverse.melange.jvmmodel.JvmModelInferrerHelper

import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace

import fr.inria.diverse.melange.utils.EPackageProvider

import java.util.List

import org.apache.log4j.Logger

import org.eclipse.xtext.resource.DerivedStateAwareResource

import org.eclipse.xtext.util.internal.Stopwatches

import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator

import static org.eclipse.xtext.util.internal.Stopwatches.*

class MelangeDerivedStateComputer extends JvmModelAssociator
{
	@Inject MelangeTypesBuilder builder
	@Inject JvmModelInferrerHelper helper
	List<MelangeProcessor> processors = newArrayList
	@Inject EPackageProvider provider

	static final Logger log = Logger.getLogger(MelangeDerivedStateComputer)

	// FIXME: Because Guice's Multibinders aren't available,
	//         quick & dirty solution
	@Inject
	new(ExactTypeInferrer e, ModelLoader l, ASTCompleter c, ASTValidator v) {
		processors += e
		processors += l
		processors += c
		processors += v
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		// Post-inferring processors
		val root = resource.contents.head as ModelTypingSpace
		processors.forEach[postProcess(root)]

		super.discardDerivedState(resource)

		// Print stop watches metrics
		log.debug(Stopwatches.getPrintableStopwatchData)
	}

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		val task = Stopwatches.forTask("installing derived state")
		task.start

		// Activate stop watches before anything happens
		Stopwatches.enabled = true

		// Reset EPackage provider registry
		provider.reset

		// Pre-inferring processors
		val root = resource.contents.head as ModelTypingSpace

		if (root !== null)
			processors.forEach[preProcess(root)]

		// Setting context for non-inferrer helper classes
		builder.setContext(resource.resourceSet)
		helper.setContext(resource.resourceSet)

		task.stop
		super.installDerivedState(resource, preLinkingPhase)
	}
}
