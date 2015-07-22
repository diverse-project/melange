package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import fr.inria.diverse.melange.ui.builder.MelangeBuilder
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.SubProgressMonitor
import org.eclipse.core.runtime.jobs.Job

class GenerateAll extends AbstractHandler {
	@Inject MelangeBuilder builder

	override execute(ExecutionEvent event) throws ExecutionException {
		new Job("Melange: Generate All") {
			override run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Generating all artifacts", 3)

					val res = builder.getResourceForEvent(event)
					val project = builder.getProjectForEvent(event)

					builder.generateInterfaces(res, project, new SubProgressMonitor(monitor, 1))
					builder.generateLanguages(res, project, new SubProgressMonitor(monitor, 1))
					builder.generateAdapters(res, project, new SubProgressMonitor(monitor, 1))
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
