package fr.inria.diverse.melange.ui.menu

import java.util.List
import org.eclipse.core.expressions.Expression
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Platform
import org.eclipse.jface.action.IContributionItem
import org.eclipse.jface.action.MenuManager
import org.eclipse.jface.action.Separator
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.menus.CommandContributionItem
import org.eclipse.ui.menus.CommandContributionItemParameter
import org.eclipse.ui.menus.ExtensionContributionFactory
import org.eclipse.ui.menus.IContributionRoot
import org.eclipse.ui.services.IServiceLocator

class OpenAs extends ExtensionContributionFactory {

    static final String EXACTTYPE      = "exactType"
    static final String SUBTYPE        = "subType"
    static final String SUBTYPING      = "subtyping"
    static final String EDITORID       = "editorID"
    static final String MODELTYPEID    = "modeltypeId"
    static final String EXTENSIONS     = "extensions"
    static final String FILE_EXTENSION = "fileExtension"
    static final String ID             = "id"
    static final String EDITORS        = "org.eclipse.ui.editors"
    static final String LANGUAGE       = "fr.inria.diverse.melange.language"
    static final String MODELTYPE      = "fr.inria.diverse.melange.modeltype"
    static final String COMMAND_NAME   = "fr.inria.diverse.melange.ui.command.open"


	override createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {

		val m = new MenuManager("Open &As")

		val select = PlatformUI.workbench.activeWorkbenchWindow.selectionService.selection

		if (select instanceof IStructuredSelection) {
			val file = select.firstElement
			val name = getLanguageName(file)

			if (name != null){

				// create a command to open the current selected fil with its own editor
				val ext = (file as IFile).fileExtension
				val language = createCommand(serviceLocator, name, getEditorID(ext))
				m.add(language)

				// create a command for each subtype
				val subtypes = getSubtypes(name)

				if (subtypes != null) {
					val sep = new Separator(SUBTYPE)
					m.add(sep)
					subtypes.forEach[
						m.add(createCommand(serviceLocator, it, getEditorFromSubtype(it), name, it))
					]
				}
			}
			additions.addContributionItem(m, Expression::TRUE)
		}
	}


	def IContributionItem createCommand(IServiceLocator serviceLocator,
		    String name, String editorID) {
			return createCommand(serviceLocator, name, editorID, null, null)
		}


	def IContributionItem createCommand(IServiceLocator serviceLocator,
		    String name, String editorID, String exactType, String subType) {
		val map = newHashMap()
		//NDD: you need to declare all the parameters you put in the map in the plugin.xml
		//     file. If you don't, the handler won't work and won't throw any error. debugging%
		map.put(EXACTTYPE, exactType)
		map.put(SUBTYPE, subType)
		map.put(EDITORID, editorID)
		return new CommandContributionItem (
				new CommandContributionItemParameter(
					serviceLocator, "melange."+name, COMMAND_NAME,
					map, null, null, null, name, "o", null, CommandContributionItem.STYLE_PUSH, null, true
				))
	}


	def String getLanguageName(Object file) {

		if (! (file instanceof IFile))
				return null

		val ext = (file as IFile).fileExtension
		val reg = Platform.extensionRegistry.getConfigurationElementsFor(EDITORS)
					.filter[it.attributeNames.contains(EXTENSIONS)]

		if( ! (reg.exists[it.getAttribute(EXTENSIONS) == ext] || ext != "xmi") || ext == null) {
			return null
		}

		val search = Platform.extensionRegistry.getConfigurationElementsFor(LANGUAGE)
					.findFirst[it.getAttribute(FILE_EXTENSION) == ext]

		if (search == null)
			return null

		val lang = search.getAttribute(EXACTTYPE)

		return lang
	}


	def List<String> getSubtypes(String exactType) {

		val subtypes = newArrayList()

		val lang = Platform.extensionRegistry.getConfigurationElementsFor(MODELTYPE)
					.filter[it.getAttribute(ID) == exactType]
					.get(0)
					.getChildren(SUBTYPING)

		if (lang.length == 0)
			return null

		lang.forEach[subtypes.add(it.getAttribute(MODELTYPEID))]
		return subtypes
	}


	def String getEditorFromSubtype(String subType) {

		val ext = Platform.extensionRegistry.getConfigurationElementsFor(LANGUAGE)
					.findFirst[it.getAttribute(EXACTTYPE) == subType]
					.getAttribute(FILE_EXTENSION)

		return getEditorID(ext)
	}


	// We use the file extension to find the editor's ID
	def String getEditorID(String ext) {
		val editors = Platform.extensionRegistry.getConfigurationElementsFor(EDITORS)
						.filter[it.attributeNames.contains(EXTENSIONS)]


		val editorID = if (editors.length == 0)
							""
						else
							editors.findFirst[it.getAttribute(EXTENSIONS) == ext]
							.getAttribute(ID)

		return editorID
	}
}