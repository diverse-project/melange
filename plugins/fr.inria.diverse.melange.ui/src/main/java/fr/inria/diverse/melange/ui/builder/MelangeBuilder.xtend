package fr.inria.diverse.melange.ui.builder

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider

class MelangeBuilder
{
	@Inject IGenerator generator
	@Inject Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider
	@Inject OutputConfigurationProvider outputProvider
	@Inject XtextResourceSetProvider rsProvider

	def void generateInterfaces(Resource res, IProject project, IProgressMonitor monitor) {
	}

	def void generateLanguages(Resource res, IProject project, IProgressMonitor monitor) {
	}

	def void generateAdapters(Resource res, IProject project, IProgressMonitor monitor) {
		val fsa = fileSystemAccessProvider.get => [f |
			f.monitor = monitor
			f.project = project
		]

		outputProvider.outputConfigurations.forEach [
			fsa.outputConfigurations.put(name, it)
		]

		generator.doGenerate(res, fsa)
	}

	def IProject getProjectForEvent(ExecutionEvent event) {
		val sel = HandlerUtil.getActiveMenuSelection(event)
		val selection = sel as IStructuredSelection
		val resource = selection.firstElement as IResource

		return resource.project
	}

	def Resource getResourceForEvent(ExecutionEvent event) {
		val sel = HandlerUtil.getActiveMenuSelection(event)
		val selection = sel as IStructuredSelection
		val resource = selection.firstElement as IResource
		val project = resource.project
		val rs = rsProvider.get(project)

		return rs.getResource(URI::createPlatformResourceURI(resource.fullPath.toString, true), true) as DerivedStateAwareResource
	}
}
