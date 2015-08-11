package fr.inria.diverse.melange.ui.menu

import java.net.URI
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.Platform
import org.eclipse.jface.viewers.TreeSelection
import org.eclipse.ui.PartInitException
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.part.FileEditorInput

class OpenAsHandler extends AbstractHandler{

	override execute(ExecutionEvent event) throws ExecutionException {

		// "I have concealed my sins as people do, by hiding my guilt in bytecode"

		val file =  (HandlerUtil.getActiveMenuSelection(event) as TreeSelection).firstElement as IFile
		val currentPage = HandlerUtil.getActiveWorkbenchWindow(event).activePage

		val editorID = event.parameters.get("editorID") as String

		if (editorID == null) 
			return null

//		val exactType = event.parameters.get("exactType") as String
		val subType = event.parameters.get("subType") as String
		
		val input = if (subType == null)
				new FileEditorInput(file)
			else
//				new MelangeEditorInput(file, getAdapter(exactType, subType))
				new MelangeEditorInput(file, subType)
		try {
			currentPage.openEditor(input, editorID)
		} catch (PartInitException e){
			throw new RuntimeException(e)
		}

		return null
	}
	
	
	// Not used. But it may be needed in the future.
	def String getAdapter(String exactType, String subType) {

		val adapter = Platform.extensionRegistry.getConfigurationElementsFor("fr.inria.diverse.melange.language")
						.findFirst[it.getAttribute("exactType") == exactType]
						.getChildren("adapter")
						.findFirst[it.getAttribute("modeltypeId") == subType]
						.getAttribute("class")

		return adapter
	}

}

class MelangeEditorInput extends FileEditorInput {

	private String fileURI
	private String subtype
	
	new (IFile file, String subtype) {
		super(file)
		this.fileURI = file.fullPath.toString
		this.subtype = subtype
		}
	
	new(IFile file) {
		super(file)
		this.fileURI = file.fullPath.toString
	}

	override getURI() {
		return new URI("melange:/resource"+ this.fileURI +"?mt="+this.subtype)
	}
	
	// @TODO: Need to fix the ClassNotFoundException,
	// The adapter class is out of scope
	@SuppressWarnings("rawtypes")
	override getAdapter(Class adapter) {
//		return Class.forName(this.adpt)
		return null
	}
}