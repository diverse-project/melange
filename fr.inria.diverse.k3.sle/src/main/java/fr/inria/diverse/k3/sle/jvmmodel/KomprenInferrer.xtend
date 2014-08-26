package fr.inria.diverse.k3.sle.jvmmodel

import com.google.inject.Inject

import fr.inria.diverse.k3.sle.metamodel.k3sle.KomprenSlicer

import org.eclipse.core.resources.ResourcesPlugin

import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path

import org.eclipse.emf.common.util.URI

import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2

import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IOutputConfigurationProvider

import org.eclipse.xtext.resource.IResourceServiceProvider

import org.eclipse.xtext.util.internal.Stopwatches

class KomprenInferrer
{
	@Inject IResourceServiceProvider.Registry reg

	// FIXME: Buggy stuff + won't work in standalone mode
	def void generateSlicer(KomprenSlicer transfo) {
		val task = Stopwatches.forTask('''KomprenInferrer.generateSlicer(«transfo.slicer.name»)''')
		task.start

		val injector = reg.getResourceServiceProvider(URI.createURI("http://kompren/fr.inria.diverse.kompren"))
		val generator = injector.get(IGenerator)
		val fsa = injector.get(EclipseResourceFileSystemAccess2)
		val outputConfigs = injector.get(IOutputConfigurationProvider)
		val defaultKomprenConfig = outputConfigs.outputConfigurations.head
		val resURI = transfo.eResource.URI.toPlatformString(true)

		defaultKomprenConfig.outputDirectory = "kompren-gen"

		fsa.monitor = new NullProgressMonitor
		fsa.outputConfigurations = #{IFileSystemAccess.DEFAULT_OUTPUT -> defaultKomprenConfig}
		fsa.project = ResourcesPlugin.workspace.root.getFile(new Path(resURI)).project

		generator.doGenerate(transfo.eResource, fsa)

		task.stop
	}
}
