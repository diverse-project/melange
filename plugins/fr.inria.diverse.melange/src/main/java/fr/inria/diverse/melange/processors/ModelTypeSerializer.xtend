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
	@Inject ErrorHelper errorHelper
	
	def dispatch void preProcess(ModelType mt) {
		try {
			val userDefinedUri =
				if (mt.isExtracted) mt.extracted.exactTypeUri
				else mt.mtUri	
			if(mt.name == null) {
				return // cannot process until it is completely defined
			}	
			val mtUri = userDefinedUri ?: '''http://«mt.name.toLowerCase»/'''
	
			// TODO: Need to maintain a cache here...
			val resource = mt.eResource
	
			if (resource !== null) {
				val project = ResourcesPlugin.workspace.root.getFile(new Path(resource.URI.toPlatformString(true))).project
	
				if (project !== null) {
					val ecoreUri = '''platform:/resource/«project.name»/model-gen/«mt.name».ecore'''	
	
					log.debug('''Serializing Ecore interface description for «mt.name» in «ecoreUri»''')
					val pkg = mt.createEcore(ecoreUri, mtUri)
					
					log.debug('''Registering new EPackage for «mt.name» in EMF registry''')
					if(pkg == null){
						return // cannot process until it is completely defined
					}
					if (!EPackage.Registry.INSTANCE.containsKey(mtUri))
						EPackage.Registry.INSTANCE.put(mtUri, pkg)
					
				}
			}
		
		} catch (Exception e) {
			log.error("Unexpected error", e)
			errorHelper.addError(mt, "Unexpected error in ModelTypeSerializer: "+e.message+", please analyze the log", null)
		}
	}
}
