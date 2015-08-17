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

	static final String EDITORID    = "editorID"
	static final String EXACTTYPE   = "exactType"
    static final String SUBTYPE     = "subType"
    static final String MODELTYPEID = "modeltypeId"
    static final String ADAPTER     = "adapter"
    static final String CLASS       = "class"
    static final String LANGUAGE    = "fr.inria.diverse.melange.language"

	override execute(ExecutionEvent event) throws ExecutionException {

		// "I have concealed my sins as people do, by hiding my guilt in bytecode"

		val file =  (HandlerUtil.getActiveMenuSelection(event) as TreeSelection).firstElement as IFile
		val currentPage = HandlerUtil.getActiveWorkbenchWindow(event).activePage

		val editorID = event.parameters.get(EDITORID) as String

		if (editorID == null)
			return null

		val subType = event.parameters.get(SUBTYPE) as String

		// if you want to open the file with another language's editor
		// we provide the editor a custom input object
		// it will gives eclise a melange URI
		// I don't take care about the adapters, the melange's URI processor do
		// this is not the best way to open a file but since the adapters are
		// out-of-scope, it's not the worst we can do!
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


	// Not used. But it may be needed in the future.
	def String getAdapter(String exactType, String subType) {

		val adapter = Platform.extensionRegistry.getConfigurationElementsFor(LANGUAGE)
						.findFirst[it.getAttribute(EXACTTYPE) == exactType]
						.getChildren(ADAPTER)
						.findFirst[it.getAttribute(MODELTYPEID) == subType]
						.getAttribute(CLASS)

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
		return URI::create("melange:/resource"+ this.fileURI +"?mt="+this.subtype)
	}

	// @TODO: Need to fix the ClassNotFoundException,
	// The adapter class is out of scope
	@SuppressWarnings("rawtypes")
	override getAdapter(Class adapter) {
//		return Class.forName(this.adpt)
		return null
	}
}