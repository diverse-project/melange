package fr.inria.diverse.melange.processors

import fr.inria.diverse.melange.ast.ASTHelper
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.ast.NamingHelper
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import javax.inject.Inject
import org.apache.log4j.Logger
import org.eclipse.core.runtime.CoreException
import org.eclipse.pde.internal.core.PDECore
import org.eclipse.pde.internal.core.plugin.WorkspacePluginModel
import org.eclipse.pde.internal.core.project.PDEProject
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * For each model type, create a new fr.inria.diverse.melange.modeltype
 * contribution in plugin.xml.
 * For each language, create a new fr.inria.diverse.melange.language
 * contribution in plugin.xml, with the list of adapters towards
 * implemented model types.
 */
class ExtensionPointProcessor extends DispatchMelangeProcessor
{
	@Inject extension NamingHelper
	@Inject extension ModelingElementExtensions
	@Inject extension MetamodelExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension ASTHelper
	@Inject extension EclipseProjectHelper
	@Inject extension IQualifiedNameProvider
	@Inject IEObjectDocumentationProvider documentationProvider

	private static Logger log = Logger::getLogger(ExtensionPointProcessor)

	private static final String MELANGE_RESOURCE_PLUGIN = "fr.inria.diverse.melange.resource"
	private static final String LANGUAGE_EXTENSION_POINT = "fr.inria.diverse.melange.language"
	private static final String MODELTYPE_EXTENSION_POINT = "fr.inria.diverse.melange.modeltype"

	def dispatch void preProcess(ModelTypingSpace root) {
		val project = root.eResource.project

		if (project !== null) {
			val pluginXml = PDEProject::getPluginXml(project)
			val pluginModel = PDECore::getDefault.modelManager.findModel(project)
			val fModel = new WorkspacePluginModel(pluginXml, false)
			val pluginBase = fModel.pluginBase
			val melangeResourcePlugin = PDECore::getDefault.modelManager.allModels.findFirst[
				bundleDescription.name == MELANGE_RESOURCE_PLUGIN
			]
			val languageExtensionPoint = melangeResourcePlugin.extensions.extensionPoints.findFirst[
				fullId == LANGUAGE_EXTENSION_POINT
			]
			val modeltypeExtensionPoint = melangeResourcePlugin.extensions.extensionPoints.findFirst[
				fullId == MODELTYPE_EXTENSION_POINT
			]

			fModel.editable = true
			fModel.load

			if (pluginModel !== null && pluginBase !== null) {
				val modelTypes = root.modelTypes.filter[isComplete]
				val metamodels = root.metamodels.filter[isComplete]

				if (modelTypes.size > 0 && modeltypeExtensionPoint !== null) {
					val newExtension = fModel.factory.createExtension => [
						point = modeltypeExtensionPoint.id
					]

					modelTypes.forEach[mt |
						try {
							val fqn = mt.fullyQualifiedName.toString
							val doc = documentationProvider.getDocumentation(mt)
							val modeltypeElement = fModel.factory.createElement(newExtension) => [
								name = "modeltype"
								setAttribute("id", fqn)
								setAttribute("uri", mt.uri)

								if (doc !== null && !doc.empty)
									setAttribute("description", doc)
							]

							// Register subtypings
							mt.subtypingRelations.forEach[superMt |
								modeltypeElement.add(fModel.factory.createElement(modeltypeElement) => [
									name = "subtyping"
									setAttribute("modeltypeId", superMt.superType.fullyQualifiedName.toString)									
								])
							]

							newExtension.add(modeltypeElement)
							if (!newExtension.isInTheModel) {
								fModel.extensions.add(newExtension)
								log.debug('''Registered new modeltype contribution <«fqn», «mt.uri»> in plugin.xml''')
							}
						} catch (CoreException e) {
							log.debug('''Failed to register new model type contribution''', e)
						}
					]
				}

				if (metamodels.size > 0 && languageExtensionPoint !== null) {
					val newExtension = fModel.factory.createExtension => [
						point = languageExtensionPoint.id
					]

					metamodels.forEach[mm |
						try {
							val fqn = mm.fullyQualifiedName.toString
							val doc = documentationProvider.getDocumentation(mm)
							val languageElement = fModel.factory.createElement(newExtension) => [
								name = "language"
								setAttribute("id", fqn)
								setAttribute("exactType", mm.exactType.fullyQualifiedName.toString)
								setAttribute("uri", mm.pkgs.head.nsURI)

								if (doc !== null && !doc.empty)
									setAttribute("description", doc)	
							]

							// Register adapters
							mm.implements.forEach[mt |
								languageElement.add(fModel.factory.createElement(languageElement) => [
									name = "adapter"
									setAttribute("modeltypeId", mt.fullyQualifiedName.toString)
									setAttribute("class", mm.adapterNameFor(mt))
								])
							]

							newExtension.add(languageElement)
							if (!newExtension.isInTheModel) {
								fModel.extensions.add(newExtension)
								log.debug('''Registered new language contribution <«fqn»> in plugin.xml''')
							}
						} catch (CoreException e) {
							log.debug('''Failed to register language contribution''', e)
						}
					]
				}
			}

			fModel.save
		}
	}
}
