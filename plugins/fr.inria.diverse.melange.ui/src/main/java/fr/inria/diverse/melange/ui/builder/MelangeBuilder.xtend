package fr.inria.diverse.melange.ui.builder

import com.google.inject.Inject
import com.google.inject.Provider
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.MetamodelExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.processors.ExtensionPointProcessor
import fr.inria.diverse.melange.processors.ModelTypeSerializer
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.OutputConfigurationProvider

class MelangeBuilder
{
	@Inject IGenerator generator
	@Inject Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider
	@Inject OutputConfigurationProvider outputProvider
	@Inject ModelTypeSerializer serializer
	@Inject EclipseProjectHelper eclipseHelper
	@Inject ExtensionPointProcessor extensionProcessor
	@Inject extension LanguageExtensions
	@Inject extension MetamodelExtensions
	@Inject extension EcoreExtensions

	def void generateInterfaces(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		val mts = root.elements.filter(ModelType)

		monitor.beginTask("Generating interfaces", mts.size)

		mts.forEach[mt |
			if (monitor.canceled)
				throw new OperationCanceledException

			serializer.preProcess(mt, false)
			monitor.worked(1)
		]
	}

	def void generateLanguages(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		val toGenerate = root.elements.filter(Language).filter[generatedByMelange]

		monitor.beginTask("Generating EMF runtime for languages", toGenerate.size)

		toGenerate.forEach[l |
			if (monitor.canceled)
				throw new OperationCanceledException

			eclipseHelper.createEMFRuntimeProject(l.externalRuntimeName, l)
			l.createExternalEcore
			l.createExternalGenmodel
			l.createExternalAspects
			l.syntax.genmodels.head.generateCode
			eclipseHelper.addDependencies(project, #[l.externalRuntimeName])

			monitor.worked(1)
		]
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

	def void generatePluginXml(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		extensionProcessor.preProcess(root, false)
	}
}
