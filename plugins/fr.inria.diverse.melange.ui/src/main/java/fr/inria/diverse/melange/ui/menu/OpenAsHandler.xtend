package fr.inria.diverse.melange.ui.menu

import java.net.URI
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.jface.viewers.TreeSelection
import org.eclipse.ui.PartInitException
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.part.FileEditorInput

class OpenAsHandler extends AbstractHandler{

	static final String EDITORID    = "editorID"
    static final String SUBTYPE     = "subType"

	override execute(ExecutionEvent event) throws ExecutionException {

		// "I have concealed my sins as people do, by hiding my guilt in bytecode"

		val file =  (HandlerUtil.getActiveMenuSelection(event) as TreeSelection).firstElement as IFile
		val currentPage = HandlerUtil.getActiveWorkbenchWindow(event).activePage

		val editorID = event.parameters.get(EDITORID) as String

		if (editorID == null)
			return null

		val subType = event.parameters.get(SUBTYPE) as String

		/** if you want to open the file with another language's editor
		/* we provide the editor a custom input object
		/* it will gives eclise a melange URI */
		val input = if (subType == null)
				new FileEditorInput(file)
			else
				new MelangeEditorInput(file, subType)
		try {
			currentPage.openEditor(input, editorID)
		} catch (PartInitException e){
			throw new RuntimeException(e)
		}

		return null
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
		return URI::create("melange:/resource"+ this.fileURI +"?mt="+this.subtype)
	}

	// I want to open the file with a custom URI
	// to do so I need the adapter/path/storage method to return null
    // check the getURI method from EditUIUtil class

	override getAdapter(Class clazz) {
	    return null
	}

	override getPath() {
	    return null
	}

	override getStorage() {
	    return null
	}
}
