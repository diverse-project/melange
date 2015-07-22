package fr.inria.diverse.melange.ui.menu

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Status
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider

class Compile extends AbstractHandler{
	@Inject XtextResourceSetProvider rsProvider
	@Inject IGenerator generator
	@Inject Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider
	@Inject OutputConfigurationProvider outputProvider

	override execute(ExecutionEvent event) throws ExecutionException {
		new Job("Full Melange build") {
			override protected run(IProgressMonitor monitor) {
		    	val ISelection sel = HandlerUtil.getActiveMenuSelection(event)
		    	val IStructuredSelection selection =  sel as IStructuredSelection
				val IResource resource = selection.firstElement as IResource
				val project = resource.project

				val rs = rsProvider.get(project)
				val res = rs.getResource(URI::createPlatformResourceURI(resource.fullPath.toString, true), true) as DerivedStateAwareResource
				val fsa = fileSystemAccessProvider.get
				fsa.monitor = new NullProgressMonitor
				fsa.project = project
				outputProvider.outputConfigurations.forEach[
					fsa.outputConfigurations.put(name, it)
				]

				generator.doGenerate(res, fsa)
				return Status.OK_STATUS
			}
		}.schedule

		return null
	}
}
