package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import javax.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.core.runtime.CoreException
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModel
import org.eclipse.pde.internal.core.project.PDEProject

/**
 * For each metamodel, create a new fr.inria.diverse.melange.adapter
 * contribution in plugin.xml towards each of its implemented model types,
 * registering the appropriate adapter for the pair <MM,MT>
 */
class AdapterExtensionPointProcessor extends DispatchMelangeProcessor
{
	@Inject extension NamingHelper
	@Inject extension MetamodelExtensions
	@Inject extension ASTHelper

	private static Logger log = Logger::getLogger(AdapterExtensionPointProcessor)

	private static final String MELANGE_RESOURCE_PLUGIN = "fr.inria.diverse.melange.resource"
	private static final String ADAPTER_EXTENSION_POINT = "fr.inria.diverse.melange.adapter"
	private static final String ADAPTER_ELEMENT_NAME = "adapter"
	private static final String ADAPTER_CLASS_ATTR = "class"
	private static final String ADAPTER_METAMODEL_URI_ATTR = "metamodel_uri"
	private static final String ADAPTER_MODELTYPE_NAME_ATTR = "modeltype_name"

	def dispatch void preProcess(ModelTypingSpace root) {
		val project = root.metamodels.head.project
		val pluginXml = PDEProject::getPluginXml(project)
		val pluginModel = PDECore::getDefault.modelManager.findModel(project)
		val fModel = new WorkspacePluginModel(pluginXml, false)
		val pluginBase = fModel.pluginBase
		val melangeResourcePlugin = PDECore::getDefault.modelManager.allModels.findFirst[
			bundleDescription.name == MELANGE_RESOURCE_PLUGIN
		]
		val adapterExtensionPoint = melangeResourcePlugin.extensions.extensionPoints.findFirst[
			fullId == ADAPTER_EXTENSION_POINT
		]

		fModel.editable = true
		fModel.load

		if (pluginModel !== null && melangeResourcePlugin !== null && adapterExtensionPoint !== null && pluginBase !== null) {
			root.metamodels.forEach[mm |
				mm.^implements.forEach[mt |
					val resourceAdapterName = mm.adapterNameFor(mt)
					val newExtension = fModel.factory.createExtension
					val adapterElement = fModel.factory.createElement(newExtension)

					try {
						adapterElement.setName(ADAPTER_ELEMENT_NAME)
						adapterElement.setAttribute(ADAPTER_CLASS_ATTR, resourceAdapterName)
						adapterElement.setAttribute(ADAPTER_METAMODEL_URI_ATTR, mm.packageUri)
						adapterElement.setAttribute(ADAPTER_MODELTYPE_NAME_ATTR, mt.name)
						newExtension.point = adapterExtensionPoint.id
						newExtension.add(adapterElement)
						if (!newExtension.isInTheModel) {
							fModel.extensions.add(newExtension)
							log.debug('''Registered new adapter contribution <«mm.name», «mt.name», «resourceAdapterName»> in plugin.xml''')
						}
					} catch (CoreException e) {
						log.debug('''Failed to register new adapter contribution''', e)
					}
				]
			]
		}

		fModel.save
	}
}
