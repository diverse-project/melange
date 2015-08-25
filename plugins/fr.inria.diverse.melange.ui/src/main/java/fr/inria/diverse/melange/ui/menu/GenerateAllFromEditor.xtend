package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import fr.inria.diverse.melange.ui.builder.MelangeBuilder
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider

class GenerateAllFromEditor extends AbstractHandler {
	@Inject MelangeBuilder builder
	@Inject XtextResourceSetProvider rsProvider

	override execute(ExecutionEvent event) throws ExecutionException {
		new Job("Melange: Generate All") {
			override run(IProgressMonitor monitor) {
				try {
					monitor.beginTask("Generating all artifacts", 4)

					val activeEditor = HandlerUtil.getActiveEditor(event)
					val file = activeEditor.editorInput.getAdapter(typeof(IFile)) as IFile
					
					if (file !== null) {
						val project = file.project
						val rs = rsProvider.get(project)
						val res = rs.getResource(URI::createPlatformResourceURI(file.fullPath.toString, true), true) as DerivedStateAwareResource

						builder.generateAll(res, project, monitor)
					}
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
