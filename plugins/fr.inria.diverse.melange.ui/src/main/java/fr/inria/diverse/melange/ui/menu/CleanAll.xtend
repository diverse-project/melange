package fr.inria.diverse.melange.ui.menu

import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil

class CleanAll extends AbstractHandler {
	override execute(ExecutionEvent event) throws ExecutionException {
		new Job("Melange: Cleaning all generated artifacts") {
			override run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Cleaning all generated artifacts", IProgressMonitor.UNKNOWN)
					val sel = HandlerUtil.getActiveMenuSelection(event)
					val selection = sel as IStructuredSelection
					val resource = selection.firstElement as IResource
					val project = resource.project

					val srcGenFolder = project.getFolder("src-gen/")
					val modelGenFolder = project.getFolder("model-gen/")

					if (srcGenFolder.exists)
						srcGenFolder.members.forEach[delete(true, monitor)]
					if (modelGenFolder.exists)
						modelGenFolder.members.forEach[delete(true, monitor)]
				} catch (OperationCanceledException e) {
					return Status.CANCEL_STATUS
				} finally {
					monitor.done
				}

				return Status.OK_STATUS
			}
		}.schedule

		return null
	}
}
