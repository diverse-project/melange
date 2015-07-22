package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import fr.inria.diverse.melange.ui.builder.MelangeBuilder
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job

class GenerateAdapters extends AbstractHandler {
	@Inject MelangeBuilder builder

	override execute(ExecutionEvent event) throws ExecutionException {
		new Job("Melange: Generating adapters code") {
			override protected run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Generating adapters code", IProgressMonitor.UNKNOWN)

					val res = builder.getResourceForEvent(event)
					val project = builder.getProjectForEvent(event)
					builder.generateAdapters(res, project, monitor)
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
