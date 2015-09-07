package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import fr.inria.diverse.melange.ui.builder.MelangeBuilder
import java.lang.reflect.InvocationTargetException
import org.apache.log4j.Logger
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.dialogs.ProgressMonitorDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider

import static fr.inria.diverse.melange.ui.menu.GenerateAllFromEditor.*

class GenerateAllFromEditor extends AbstractHandler {
	@Inject MelangeBuilder builder
	@Inject XtextResourceSetProvider rsProvider
	static final Logger log = Logger.getLogger(MelangeBuilder)

	override execute(ExecutionEvent event) throws ExecutionException {
		val shell = HandlerUtil.getActiveWorkbenchWindow(event).shell
		try {
			new ProgressMonitorDialog(shell).run(true, true, new IRunnableWithProgress() {
				override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					val activeEditor = HandlerUtil.getActiveEditor(event)
					val file = activeEditor.editorInput.getAdapter(typeof(IFile)) as IFile

					if (file !== null) {
						val project = file.project
						val rs = rsProvider.get(project)
						val res = rs.getResource(URI::createPlatformResourceURI(file.fullPath.toString, true), true) as DerivedStateAwareResource

						builder.generateAll(res, project, monitor)
					}
				}
			})
		} catch (InvocationTargetException e) {
			log.error("Error while generating", e)
		} catch (InterruptedException e) {
			log.error("Error while generating", e)
		}

		return null
	}
}
