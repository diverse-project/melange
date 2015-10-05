package fr.inria.diverse.melange.resource

import com.google.inject.Inject
import fr.inria.diverse.melange.jvmmodel.JvmModelInferrerHelper
import fr.inria.diverse.melange.jvmmodel.MelangeTypesBuilder
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Transformation
import fr.inria.diverse.melange.processors.ExactTypeInferrer
import fr.inria.diverse.melange.processors.LanguageProcessor
import fr.inria.diverse.melange.processors.MelangeProcessor
import fr.inria.diverse.melange.processors.TypingInferrer
import fr.inria.diverse.melange.processors.WildcardAspectResolver
import fr.inria.diverse.melange.utils.EPackageProvider
import java.util.List
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage
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
		WildcardAspectResolver r,
		LanguageProcessor l,
		ExactTypeInferrer e,
		TypingInferrer t
	) {
		processors += r
		processors += l
		processors += e
		processors += t
	}

	override discardDerivedState(DerivedStateAwareResource resource) {
		// Post-inferring processors
		val root = resource.contents.head as ModelTypingSpace

		if (root !== null)
			processors.forEach[postProcess(root)]

		super.discardDerivedState(resource)

		// Print stop watches metrics
		log.debug(Stopwatches.getPrintableStopwatchData)
		Stopwatches.resetAll
	}

	override installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		val task = Stopwatches.forTask("installing derived state")
		task.start

		// In a test environment, automatic XMLNamespacePackage
		// initialization may fail for no apparent reason
		val testsBug = XMLNamespacePackage::eINSTANCE

		// Activate stop watches before anything happens
		Stopwatches.enabled = true

		// Reset EPackage provider registry
		provider.reset

		// Pre-inferring processors
		val root = resource.contents.head as ModelTypingSpace

		if (root !== null) {
			processors.forEach[p |
				val pTask = Stopwatches.forTask(p.class.simpleName)
				pTask.start
				p.preProcess(root, preLinkingPhase)
				pTask.stop
			]

			// Setting context for non-inferrer helper classes
			builder.setContext(resource.resourceSet)
			helper.setContext(resource.resourceSet)

			task.stop
			// Avoid computing al the derived state when unnecessary
			if (root.containsTransformations)
				super.installDerivedState(resource, preLinkingPhase)
			else
				super.installDerivedState(resource, true)
		}
	}

	def boolean containsTransformations(ModelTypingSpace root) {
		return !root.elements.filter(Transformation).empty
	}

	/**
	 * Should be invoked just before code generation to complete
	 * the derived state model
	 */
	def void inferFullDerivedState(DerivedStateAwareResource resource) {
		super.installDerivedState(resource, false)
	}
}
