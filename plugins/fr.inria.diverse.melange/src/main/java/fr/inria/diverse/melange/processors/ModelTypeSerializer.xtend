package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.ModelType
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EPackage

/**
 * Serializes an Ecore for each model type and registers it
 */
class ModelTypeSerializer extends DispatchMelangeProcessor
{
	private final static Logger log = Logger::getLogger(ModelTypeSerializer)
	@Inject extension ModelTypeExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension EclipseProjectHelper

	def dispatch void preProcess(ModelType mt, boolean preLinkingPhase) {
		if (!mt.isComplete || preLinkingPhase)
			return

		// TODO: Need to maintain a cache here...
		val project = mt.eResource.project

		if (project !== null) {
			val ecoreUri = '''platform:/resource/«project.name»/model-gen/«mt.name».ecore'''

			log.debug('''Registering new EPackage for «mt.name» in EMF registry''')
			if (!EPackage.Registry.INSTANCE.containsKey(mt.pkgs.head.nsURI))
				EPackage.Registry.INSTANCE.put(mt.pkgs.head.nsURI, mt.pkgs.head)

			log.debug('''Serializing Ecore interface description for «mt.name» in «ecoreUri»''')
			mt.createEcore(ecoreUri, mt.uri)
		}
	}
}

