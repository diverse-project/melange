package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import fr.inria.diverse.melange.ui.builder.MelangeBuilder
import java.lang.reflect.InvocationTargetException
import org.apache.log4j.Logger
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.dialogs.ProgressMonitorDialog
import org.eclipse.jface.operation.IRunnableWithProgress
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider

import static fr.inria.diverse.melange.ui.menu.GenerateAdapters.*

class GenerateAdapters extends AbstractHandler {
	@Inject MelangeBuilder builder
	@Inject XtextResourceSetProvider rsProvider
	static final Logger log = Logger.getLogger(MelangeBuilder)

	override execute(ExecutionEvent event) throws ExecutionException {
		val shell = HandlerUtil.getActiveWorkbenchWindow(event).shell
		try {
			new ProgressMonitorDialog(shell).run(true, true, new IRunnableWithProgress() {
				override run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					val sel = HandlerUtil.getActiveMenuSelection(event)
					val selection = sel as IStructuredSelection
					val resource = selection.firstElement as IResource
					val project = resource.project
					val rs = rsProvider.get(project)
					val res = rs.getResource(URI::createPlatformResourceURI(resource.fullPath.toString, true), true) as DerivedStateAwareResource
//					val srcGenFolder = project.getFolder("src-gen/")
//
//					if (srcGenFolder.exists)
//						srcGenFolder.members.forEach[delete(true, monitor)]
					builder.generateAdapters(res, project, monitor)
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
