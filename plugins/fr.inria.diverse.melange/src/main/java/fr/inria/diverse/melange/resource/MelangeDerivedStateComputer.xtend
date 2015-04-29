package fr.inria.diverse.melange.resource

import com.google.inject.Inject
import fr.inria.diverse.melange.jvmmodel.JvmModelInferrerHelper
import fr.inria.diverse.melange.jvmmodel.MelangeTypesBuilder
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.processors.AspectsCopier
import fr.inria.diverse.melange.processors.AspectsWeaver
import fr.inria.diverse.melange.processors.EcoreUriInferrer
import fr.inria.diverse.melange.processors.ExactTypeInferrer
import fr.inria.diverse.melange.processors.ExtensionPointProcessor
import fr.inria.diverse.melange.processors.MelangeProcessor
import fr.inria.diverse.melange.processors.ModelTypeSerializer
import fr.inria.diverse.melange.processors.TypingInferrer
import fr.inria.diverse.melange.utils.EPackageProvider
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.util.internal.Stopwatches
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator

import static org.eclipse.xtext.util.internal.Stopwatches.*

/**
 * This class merge aspects into the base model of the metamodel,
 * creates Model types for each Exact types and compute the
 * Model type hierarchy 
 */
class MelangeDerivedStateComputer extends JvmModelAssociator
{
	@Inject MelangeTypesBuilder builder
	@Inject JvmModelInferrerHelper helper
	List<MelangeProcessor> processors = newArrayList
	@Inject EPackageProvider provider

	static final Logger log = Logger.getLogger(MelangeDerivedStateComputer)

	// FIXME: Because Guice's Multibinders aren't available,
	//         quick & dirty solution
	/** 
	 * The parameters of this constructor define the list of the processors and the order in which they'll be applied
	 */
	@Inject
	new(
		EcoreUriInferrer i,
		AspectsCopier c,
		AspectsWeaver a,
		ExactTypeInferrer e,
		TypingInferrer t,
		ExtensionPointProcessor p,
		ModelTypeSerializer s
	) {
		processors += i
		processors += c
		processors += a
		processors += e
		processors += t
		processors += p
		processors += s
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		// Post-inferring processors
		val root = resource.contents.head as ModelTypingSpace

		if (root !== null)
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
			processors.forEach[p |
				val pTask = Stopwatches.forTask(p.class.simpleName)
				pTask.start
				p.preProcess(root)
				pTask.stop
			]

		// Setting context for non-inferrer helper classes
		builder.setContext(resource.resourceSet)
		helper.setContext(resource.resourceSet)

		task.stop
		super.installDerivedState(resource, preLinkingPhase)
	}
}
