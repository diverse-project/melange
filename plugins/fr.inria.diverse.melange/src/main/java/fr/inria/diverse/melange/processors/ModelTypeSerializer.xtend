package fr.inria.diverse.melange.processors

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.metamodel.melange.ModelType
import org.apache.log4j.Logger
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.ecore.EPackage
import fr.inria.diverse.melange.utils.ErrorHelper

/**
 * Serializes an Ecore for each model type and registers it
 */
class ModelTypeSerializer extends DispatchMelangeProcessor
{
	private final static Logger log = Logger::getLogger(ModelTypeSerializer)
	@Inject extension ModelTypeExtensions
	@Inject extension ModelingElementExtensions

	def dispatch void preProcess(ModelType mt) {
		if (!mt.isComplete)
			return

		val userDefinedUri =
			if (mt.isExtracted) mt.extracted.exactTypeUri
			else mt.mtUri
		val mtUri = userDefinedUri ?: '''http://«mt.name.toLowerCase»/'''

		// TODO: Need to maintain a cache here...
		val resource = mt.eResource

		if (resource !== null) {
			try
			{
				val project = ResourcesPlugin.workspace.root.getFile(new Path(resource.URI.toPlatformString(true))).project

				if (project !== null) {
					val ecoreUri = '''platform:/resource/«project.name»/model-gen/«mt.name».ecore'''

					log.debug('''Registering new EPackage for «mt.name» in EMF registry''')
					if (!EPackage.Registry.INSTANCE.containsKey(mt.pkgs.head.nsURI))
						EPackage.Registry.INSTANCE.put(mt.pkgs.head.nsURI, mt.pkgs.head)

					log.debug('''Serializing Ecore interface description for «mt.name» in «ecoreUri»''')
					mt.createEcore(ecoreUri, mtUri)
				}
			} catch (IllegalStateException e) {
				// ...
			}
		}
	}
}
