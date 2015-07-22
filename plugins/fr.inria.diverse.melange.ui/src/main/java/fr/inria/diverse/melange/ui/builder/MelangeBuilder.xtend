package fr.inria.diverse.melange.ui.builder

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.OutputConfigurationProvider

class MelangeBuilder
{
	@Inject IGenerator generator
	@Inject Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider
	@Inject OutputConfigurationProvider outputProvider

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
}
