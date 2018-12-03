/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.ui.builder

import com.google.inject.Inject
import com.google.inject.Provider
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.eclipse.EclipseProjectHelper
import fr.inria.diverse.melange.lib.EcoreExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.processors.ExtensionPointProcessor
import fr.inria.diverse.melange.resource.MelangeDerivedStateComputer
import fr.inria.diverse.melange.utils.DispatchOverrider
import org.apache.log4j.Logger
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.OperationCanceledException
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.core.runtime.jobs.Job
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.OutputConfigurationProvider
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider
import org.eclipse.core.resources.IResource
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.gemoc.commons.eclipse.pde.classpath.BuildPropertiesHelper

class MelangeBuilder
{
	@Inject IGenerator generator
	@Inject MelangeDerivedStateComputer computer
	@Inject Provider<EclipseResourceFileSystemAccess2> fileSystemAccessProvider
	@Inject OutputConfigurationProvider outputProvider
	@Inject EclipseProjectHelper eclipseHelper
	@Inject ExtensionPointProcessor extensionProcessor
	@Inject extension LanguageExtensions
	@Inject extension ModelingElementExtensions
	@Inject extension ModelTypeExtensions
	@Inject extension EcoreExtensions
	@Inject extension IQualifiedNameProvider
	@Inject DispatchOverrider dispatchWriter
	@Inject XtextResourceSetProvider rsProvider
	private static final Logger log = Logger.getLogger(MelangeBuilder)

	def void generateAll(Resource res, IProject project, IProgressMonitor monitor) {
		monitor.beginTask("Generating all artifacts", 700)
		val SubMonitor subMonitor = SubMonitor.convert(monitor, 700);
		generateInterfaces(res, project, subMonitor.split(50))
		generateLanguages(res, project, subMonitor.split(300))
		generateAdapters(res, project, subMonitor.split(300))
		generatePluginXml(res, project, subMonitor.split(10))
		
		refreshProjects(res, project,  subMonitor.split(10))
	}

	def void generateInterfaces(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		val mts = root.elements.filter(ModelType)
		val nb = mts.size

		monitor.beginTask("Generating interfaces", 10 * nb)

		mts.filter[isExtracted && !isExternal].forEach[mt |
			if (monitor.canceled)
				throw new OperationCanceledException

			monitor.subTask("Generating interface for " + mt.name)

			log.debug('''Registering new EPackage for «mt.name» in EMF registry''')
			if (!EPackage.Registry.INSTANCE.containsKey(mt.pkgs.head.nsURI))
				EPackage.Registry.INSTANCE.put(mt.pkgs.head.nsURI, mt.pkgs.head)

			val ecoreUri = mt.inferredEcoreUri
			log.debug('''Serializing Ecore interface description for «mt.name» in «ecoreUri»''')
			mt.createEcore(ecoreUri, mt.uri, false)
			val gmUri = ecoreUri.substring(0, ecoreUri.lastIndexOf(".")) + ".genmodel"
			val gm = mt.createGenmodel(ecoreUri, gmUri)
			gm.generateModelTypeCode
			
			val exportedPkg = newArrayList
			gm.allGenPkgs
			.filter[it.packageName != "ecore"]
			.forEach[p |
				exportedPkg.add(p.qualifiedPackageName.toString)
				exportedPkg.add(p.qualifiedPackageName+".impl")
				exportedPkg.add(p.qualifiedPackageName+".util")
			]
			eclipseHelper.addExportedPackages(project,exportedPkg)
			
			monitor.worked(10)
		]
	}

	def void generateLanguages(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		val toGenerate = root.elements.filter(Language).filter[generatedByMelange]
		val nb = toGenerate.size
		
		val SubMonitor subMonitor = SubMonitor.convert(monitor,100 * nb + 10*nb)
		subMonitor.beginTask("Generating EMF runtime for languages", 100 * nb + 10*nb)
		
		toGenerate.forEach[l |
			if (monitor.canceled)
				throw new OperationCanceledException

			val sub = subMonitor.split(100)
			sub.beginTask("Generating runtime for " + l.name, 100)
			if(l.externalRuntimeName != project.name){
				sub.subTask("Creating new project for " + l.name)
				// if gemoc nature exist in the platform,
				var IProject newProject
				if (ResourcesPlugin.getWorkspace().getNatureDescriptor(EclipseProjectHelper.GEMOCNatureID) !== null) {
					newProject = eclipseHelper.createGemocLangEMFRuntimeProject(l.externalRuntimeName, l)
				} else {
					newProject = eclipseHelper.createEMFRuntimeProject(l.externalRuntimeName, l)
				}
				subMonitor.worked(5)
				sub.subTask("Serializing Ecore description for " + l.name)
				l.createExternalEcore
				subMonitor.worked(5)
				sub.subTask("Serializing Genmodel for " + l.name)
				l.createExternalGenmodel
				subMonitor.worked(5)
				sub.subTask("Generating code")
				l.syntax.genmodels.head.generateCode
				subMonitor.worked(40)
				sub.subTask("Copying aspects for " + l.name)
				l.createExternalAspects
				l.addRequireBundleForAspects
				subMonitor.worked(40)
				sub.subTask("Updating dependencies for " + l.name)
				eclipseHelper.addDependencies(project, #[l.externalRuntimeName])
				BuildPropertiesHelper.addEntryInProperty(newProject, "bin.includes","plugin.xml",subMonitor)
				BuildPropertiesHelper.addEntryInProperty(newProject, "bin.includes","plugin.properties",subMonitor)
				BuildPropertiesHelper.addEntryInProperty(newProject, "bin.includes","model/",subMonitor)
				BuildPropertiesHelper.addEntryInProperty(newProject, "bin.includes",l.name+".dsl",subMonitor)
			} else {
				// we will do almost the same work but in the current project 
				sub.subTask("Creating EMFRuntime in current project for " + l.name)
				eclipseHelper.createEMFRuntimeInMelangeProject(project, l, monitor)
				subMonitor.worked(5)
				sub.subTask("Serializing Ecore description for " + l.name)
				l.createExternalEcore
				subMonitor.worked(5)
				sub.subTask("Serializing Genmodel for " + l.name)
				l.createExternalGenmodel
				subMonitor.worked(5)
				sub.subTask("Generating code")
				l.syntax.genmodels.head.generateCode
				subMonitor.worked(40)
				sub.subTask("Copying aspects for " + l.name)
				l.createExternalAspects
				l.addRequireBundleForAspects
				BuildPropertiesHelper.addEntryInProperty(project, "bin.includes",l.name+".dsl",subMonitor)
				subMonitor.worked(45)
			}
			refreshProjects(res, project,  subMonitor)
			waitForAutoBuild
			subMonitor.worked(5)
		]
		
		root.makeAllSemantics
		val sub = subMonitor.split(10*nb)
		sub.beginTask("Rewriting dispatch", 10*nb)
		toGenerate.forEach[l |
			sub.subTask("Rewrite dispatch for " + l.name)
			dispatchWriter.overrideDispatch(l, JavaCore.create(project))
			sub.worked(10)
			
			l.createDsl
		]
		
		refreshProjects(res, project,  subMonitor)
		
	}

	def void generateAdapters(Resource res, IProject project, IProgressMonitor monitor) {
		val SubMonitor subMonitor = SubMonitor.convert(monitor, 100)
		subMonitor.beginTask("Generating adapters", 100)
		
		val rs = rsProvider.get(project)
		val res2 = rs.getResource(res.URI, true) as DerivedStateAwareResource

		val fsa = fileSystemAccessProvider.get => [f |
			f.monitor = subMonitor.split(50)
			f.project = project
		]

		outputProvider.outputConfigurations.forEach [
			fsa.outputConfigurations.put(name, it)
		]

		if (res2 instanceof DerivedStateAwareResource) {
			subMonitor.subTask("Inferring derived state")
			computer.inferFullDerivedState(res2)
			subMonitor.worked(50)
			subMonitor.subTask("Generating code")
			generator.doGenerate(res2, fsa)
			
			val jProject     = JavaCore.create(project)
			val adapterPkgs  = jProject.packageFragments.filter[elementName.contains(".adapters.")].map[elementName]
			val mainPkg      = (res2.contents.head as ModelTypingSpace).fullyQualifiedName
			val exportedPkgs = adapterPkgs.toSet
			
			exportedPkgs.add(mainPkg.toString)
			eclipseHelper.addExportedPackages(project,exportedPkgs)
		}
	}

	def void generatePluginXml(Resource res, IProject project, IProgressMonitor monitor) {
		monitor.beginTask("Generating new plugin.xml", 1)
		monitor.subTask("Generating new plugin.xml")
		try{
			val root = res.contents.head as ModelTypingSpace
			extensionProcessor.preProcess(root, false)
		} catch (Exception e) {
			log.error("Fatal exception", e)
		}
		monitor.worked(1)
	}
	
	/**
	 * performs a IProject refresh for all projects where Melange generate stuff
	 * Ie. the main project and the runtime language projects 
	 */
	def void refreshProjects(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace

		val languages = root.elements.filter(Language).filter[generatedByMelange]
		val SubMonitor subMonitor = SubMonitor.convert(monitor, 1+languages.size)
		
		project.refreshLocal(IResource.DEPTH_INFINITE, subMonitor.split(1))
		languages.forEach[l |
			if(l.externalRuntimeName != project.name) {
				project.workspace.root.getProject(l.externalRuntimeName).refreshLocal(IResource.DEPTH_INFINITE, subMonitor.split(1))			
			}	 
		]
	}

	/**
	 * - Clean the src-gen/ and model-gen/ folders of the current project
	 * - For each language generated by Melange, delete its associated projects
	 * - Remove the dangling dependencies from the current project
	 */
	def void cleanAll(Resource res, IProject project, IProgressMonitor monitor) {
		monitor.beginTask("Cleaning old derived artifacts", 60)
		val SubMonitor subMonitor = SubMonitor.convert(monitor, 60)
		monitor.subTask("Cleaning generated interfaces")
		cleanInterfaces(res, project, subMonitor.split(20))
		monitor.subTask("Cleaning generated adapters")
		cleanAdapters(res, project, subMonitor.split(20))
		monitor.subTask("Cleaning generated projects")		
		cleanLanguages(res, project, subMonitor.split(20))
	}

	def void cleanLanguages(Resource res, IProject project, IProgressMonitor monitor) {
		val root = res.contents.head as ModelTypingSpace
		val danglingBundles = newArrayList

		root.elements
		.filter(Language)
		.filter[generatedByMelange]
		.forEach[l |
			// delete only if the runtime has been generated in a separate project			
			val runtimeName = l.externalRuntimeName
			if(project.name == runtimeName){
				// remove the folder containing the language runtime
				val runtimeFolder = project.getFolder("src-model-gen/"+runtimeName)
				runtimeFolder.delete(true, monitor)
			} else {
				val runtimeProject = project.workspace.root.getProject(runtimeName)
				runtimeProject.delete(true, true, monitor)
				danglingBundles += runtimeName			
			}
		]

		eclipseHelper.removeDependencies(project, danglingBundles)
	}

	def void cleanInterfaces(Resource res, IProject project, IProgressMonitor monitor) {
		val modelGenFolder = project.getFolder("model-gen/")

		if (modelGenFolder.exists)
			modelGenFolder.members.forEach[delete(true, monitor)]
	}

	def void cleanAdapters(Resource res, IProject project, IProgressMonitor monitor) {
		val srcGenFolder = project.getFolder("src-gen/")

		if (srcGenFolder.exists)
			srcGenFolder.members.forEach[delete(true, monitor)]
	}

	private def void waitForAutoBuild() {
		var wasInterrupted = false
		do {
			try {
				Job.jobManager.join(ResourcesPlugin::FAMILY_AUTO_BUILD,	null)
				wasInterrupted = false
			} catch (OperationCanceledException e) {
				log.error(e)
			} catch (InterruptedException e) {
				wasInterrupted = true
			}
		} while (wasInterrupted)
	}
}
