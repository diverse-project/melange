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

	override createContributionItems(IServiceLocator serviceLocator, IContributionRoot additions) {

		val m = new MenuManager("Open &As")
		
		// retrieve the language name of the selectd file
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
					val sep = new Separator("subtypes")
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
		//     file. If you don't, the handler won't work and won't throw any error.
		map.put("exactType", exactType)
		map.put("subType", subType)
		map.put("editorID", editorID)
		return new CommandContributionItem (
				new CommandContributionItemParameter(
					serviceLocator, "melange."+name, "fr.inria.diverse.melange.ui.command.open", 
					map, null, null, null, name, "o", null, CommandContributionItem.STYLE_PUSH, null, true
				))
	}

	def String getLanguageName(Object file) {

		if (! (file instanceof IFile))
				return null		

		val ext = (file as IFile).fileExtension
		val reg = Platform.extensionRegistry.getConfigurationElementsFor("org.eclipse.ui.editors")
					.filter[it.attributeNames.contains("extensions")]
					
		if( ! (reg.exists[it.getAttribute("extensions") == ext] || ext != "xmi") || ext == null) {
			return null	
		}

		val search = Platform.extensionRegistry.getConfigurationElementsFor("fr.inria.diverse.melange.language")
					.findFirst[it.getAttribute("fileExtension") == ext]

		if (search == null)
			return null

		val lang = search.getAttribute("exactType")

		return lang
	}

	def List<String> getSubtypes(String exactType) {

		val subtypes = newArrayList()

		val lang = Platform.extensionRegistry.getConfigurationElementsFor("fr.inria.diverse.melange.modeltype")
					.filter[it.getAttribute("id") == exactType]
					.get(0)
					.getChildren("subtyping")

		if (lang.length == 0)
			return null

		lang.forEach[subtypes.add(it.getAttribute("modeltypeId"))]
		return subtypes
	}

	def String getEditorFromSubtype(String subType) {
		
		val ext = Platform.extensionRegistry.getConfigurationElementsFor("fr.inria.diverse.melange.language")
					.findFirst[it.getAttribute("exactType") == subType]
					.getAttribute("fileExtension")

		return getEditorID(ext)
	}

	// We use the file extension to find the editor's ID
	def String getEditorID(String ext) {
		val editors = Platform.extensionRegistry.getConfigurationElementsFor("org.eclipse.ui.editors")
						.filter[it.attributeNames.contains("extensions")]
						
		
		val editorID = if (editors.length == 0) 
							""
						else
							editors.findFirst[it.getAttribute("extensions") == ext]
							.getAttribute("id")

		return editorID
	}
}