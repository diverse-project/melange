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
package fr.inria.diverse.melange.eclipse

import com.google.common.base.Splitter
import com.google.common.collect.Sets
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.metamodel.melange.Language
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.Closeable
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import org.apache.log4j.Logger
import org.eclipse.core.resources.ICommand
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IProjectDescription
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.SubMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.gemoc.commons.eclipse.pde.classpath.BuildPropertiesHelper
import org.eclipse.gemoc.commons.eclipse.pde.classpath.ClasspathHelper
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.xtext.util.MergeableManifest2

/**
 * A collection of utilities around Eclipse's APIs to manage the creation,
 * maintenance, etc. of the Eclipse projects/MANIFEST/plugin.xml generated
 * by Melange.
 */
class EclipseProjectHelper
{
	@Inject extension LanguageExtensions
	static final Logger log = Logger.getLogger(EclipseProjectHelper)
	
	public static final String GEMOCNatureID = "org.eclipse.gemoc.execution.sequential.javaxdsml.ide.ui.GemocSequentialLanguageNature"

	/**
	 * Returns the {@link IProject} containing the Melange file pointed by
	 * the {@link Resource} {@code res}, or null if in a standalone context.
	 */
	def IProject getProject(Resource res) {
		try {
			return
				if (res !== null && res.URI.toPlatformString(true) !== null)
					ResourcesPlugin.workspace.root.getFile(new Path(res.URI.toPlatformString(true))).project
				else null
		} catch (IllegalStateException e) {
			log.info("Couldn't access platform", e)
			return null
		}
	}

	/**
	 * Returns the qualifiers of the bundles the {@link IProject} {@code project}
	 * depends on, extracted from its MANIFEST.MF.
	 */
	def Iterable<String> getDependencies(IProject project) {
		val manifestFile = project.getFile("META-INF/MANIFEST.MF")

		if (manifestFile !== null
			&& manifestFile.exists
			&& manifestFile.accessible
		) {
			var InputStream input = null

			try {
				input = manifestFile.contents
				val manifest = new MergeableManifest2(input)
				val attrs = manifest.mainAttributes
				val bundles = Splitter.on(",").omitEmptyStrings.trimResults.split(attrs.get("Require-Bundle"))
				return bundles.map[it.split(";").head]
			} catch (Exception e) {
				log.error("Couldn't retrieve MANIFEST.MF dependencies", e)
			} finally {
				input.closeQuietly
			}

			return newArrayList
		}
	}

	/**
	 * Updates the MANIFEST.MF of the {@link IProject} {@code project}
	 * with the given list of {@code bundles}.
	 */
	def void addDependencies(IProject project, Iterable<String> bundles) {
		val manifestFile = project.getFile("META-INF/MANIFEST.MF")

		if (manifestFile !== null
			&& manifestFile.exists
			&& manifestFile.accessible
			&& !manifestFile.resourceAttributes.readOnly
		) {
			var OutputStream output = null
			var InputStream input = null

			try {
				if (!manifestFile.isSynchronized(IResource.DEPTH_ZERO))
					manifestFile.refreshLocal(IResource.DEPTH_ZERO, null)
				input = manifestFile.contents
				val manifest = new MergeableManifest2(input)
				manifest.addRequiredBundles(Sets::newHashSet(bundles))
				val out = new ByteArrayOutputStream
				output = new BufferedOutputStream(out)
				manifest.write(output)
				val in = new ByteArrayInputStream(out.toByteArray)
				input = new BufferedInputStream(in)
				manifestFile.setContents(input, true, true, null)
				bundles.forEach[log.debug('''Dependendency «it» added to «project»''')]
			} catch (Exception e) {
				log.error("Couldn't update MANIFEST.MF", e)
			} finally {
				input.closeQuietly
				output.closeQuietly
			}
		}
	}
	
	/**
	 * Updates the MANIFEST.MF of the {@link IProject} {@code project}
	 * with the given list of {@code bundles}.
	 */
	def void addExportedPackages(IProject project, Iterable<String> packages) {
		val manifestFile = project.getFile("META-INF/MANIFEST.MF")

		if (manifestFile !== null
			&& manifestFile.exists
			&& manifestFile.accessible
			&& !manifestFile.resourceAttributes.readOnly
		) {
			var OutputStream output = null
			var InputStream input = null

			try {
				if (!manifestFile.isSynchronized(IResource.DEPTH_ZERO))
					manifestFile.refreshLocal(IResource.DEPTH_ZERO, null)
				input = manifestFile.contents
				val manifest = new MergeableManifest2(input)
				manifest.addExportedPackages(Sets::newHashSet(packages))
				val out = new ByteArrayOutputStream
				output = new BufferedOutputStream(out)
				manifest.write(output)
				val in = new ByteArrayInputStream(out.toByteArray)
				input = new BufferedInputStream(in)
				manifestFile.setContents(input, true, true, null)
				packages.forEach[log.debug('''Exported package «it» added to «project»''')]
			} catch (Exception e) {
				log.error("Couldn't update MANIFEST.MF", e)
			} finally {
				input.closeQuietly
				output.closeQuietly
			}
		}
	}

	private def void closeQuietly(Closeable c) {
		if (c === null)
			return;

		try {
			c.close
		} catch (IOException e) {
			log.error("Couldn't close resource", e)
		}
	}

	/**
	 * Removes the set of {@code bundles} from the MANIFEST.MF of the
	 * {@link IProject} {@code project}.
	 */
	def void removeDependencies(IProject project, Iterable<String> bundles) {
		if (bundles.empty)
			return;

		val manifestFile = project.getFile("META-INF/MANIFEST.MF")

		if (manifestFile !== null
			&& manifestFile.exists
			&& manifestFile.accessible
			&& !manifestFile.resourceAttributes.readOnly
		) {
			var OutputStream output = null
			var InputStream input = null

			try {
				if (!manifestFile.isSynchronized(IResource.DEPTH_ZERO))
					manifestFile.refreshLocal(IResource.DEPTH_ZERO, null)
				input = manifestFile.contents
				val manifest = new MergeableManifest2(input)
				// FIXME: Quick & Dirty ;)
				var requiredBundles = manifest.getMainAttributes().get(MergeableManifest2::REQUIRE_BUNDLE) as String
				val regex = '''(?m)^ ?(«bundles.join("|")»).*$(?:\r?\n)?'''
				val result = requiredBundles.replaceAll(regex, "") 
				manifest.getMainAttributes().put(MergeableManifest2::REQUIRE_BUNDLE, result.replaceFirst(",$", ""));
				val out = new ByteArrayOutputStream
				output = new BufferedOutputStream(out)
				manifest.write(output)
				val in = new ByteArrayInputStream(out.toByteArray)
				input = new BufferedInputStream(in)
				manifestFile.setContents(input, true, true, null)
				bundles.forEach[log.debug('''Dependendency «it» removed from «project»''')]
			} catch (Exception e) {
				log.error("Couldn't update MANIFEST.MF dependencies", e)
			} finally {
				input.closeQuietly
				output.closeQuietly
			}
		}
	}

	/**
	 * add the {@link Language} {@code l} in the given Melange project. 
	 * It will update it instead of creating a new one as does {@link #createEMFRuntimeProject}
	 * 
	 * In order to be able to clean the project, the ecore is generated in model-gen
	 * and the java code for the ecore is generated in src-model-gen
	 * 
	 * Additions to the usual Melange:
	 * <ul>
	 *   <li>Source folders: src-model-gen</li>
	 *   <li>Nature: GEMOC Nature</li>
	 * </ul>
	 */
	def void createEMFRuntimeInMelangeProject(IProject project, Language l, IProgressMonitor monitor){
		val SubMonitor subMonitor = SubMonitor.convert(monitor, 100);
		val srcModelGenFolder = project.getFolder("src-model-gen");
		if(srcModelGenFolder.exists){
			// remove previous version of this folder
			srcModelGenFolder.delete(true, true, subMonitor.split(10))
		}
		srcModelGenFolder.create(false, true, subMonitor.split(50))
		
		ClasspathHelper.addSourceEntry(project,"src-model-gen", subMonitor.split(10))
		BuildPropertiesHelper.addMainJarSourceEntry(project,"src-model-gen", subMonitor.split(10))
		
		// add Gemoc nature to project because it will also contain the generated dsl file
		if (ResourcesPlugin.getWorkspace().getNatureDescriptor(GEMOCNatureID) !== null && 
			!project.hasNature(GEMOCNatureID)
		) {
			val IProjectDescription description = project.getDescription()
			val String[] natures = description.getNatureIds()
			val String[] newNatures = newArrayOfSize(natures.length + 1)
			System.arraycopy(natures, 0, newNatures, 1, natures.length)
			newNatures.set(0, GEMOCNatureID)
			description.setNatureIds(newNatures)
			project.setDescription(description, null)
		}
	}

	/**
	 * Creates a new Eclipse project named {@code projectName} for the
	 * {@link Language} {@code l}. Acting as a GEMOC Language
	 * <ul>
	 *   <li>Natures: GEMOCSequentialLanguage, JAVA, PLUGIN, XText</li>
	 *   <li>Builders: GEMOCSequentialBuilder, JAVA, MANIFEST, SCHEMA</li>
	 *   <li>Source folders: src/src-gen</li>
	 *   <li>Dependencies: Ecore, K3, Xbase</li>
	 * </ul>
	 */
	def IProject createGemocLangEMFRuntimeProject(String projectName, Language l) {
		try {
			// FIXME: Everything's hardcoded...
			val project = createEclipseProject(
				projectName,
				#[ GEMOCNatureID, 
					JavaCore::NATURE_ID, PDE::PLUGIN_NATURE, "org.eclipse.xtext.ui.shared.xtextNature"
				],
				#[ GEMOCNatureID,
					JavaCore::BUILDER_ID, PDE::MANIFEST_BUILDER_ID, PDE::SCHEMA_BUILDER_ID
				],
				#["src", "src-gen"],
				#[],
				#["org.eclipse.emf.ecore",
				  "fr.inria.diverse.k3.al.annotationprocessor.plugin",
				  "fr.inria.diverse.melange",
				  "org.eclipse.xtext.xbase.lib"],
//				#[basePkg, basePkg + ".impl", basePkg + ".util"],
				if (l.hasCopiedAspects) #[l.aspectsNamespace] else #[],
				#[],
				new NullProgressMonitor
			)

			val modelFolder = project.getFolder("model")
			modelFolder.create(false, true, null)

			log.debug('''Runtime EMF project «project» created.''')

			return project
		} catch (Exception e) {
			log.error("Unexpected exception while creating new runtime project", e)
		}

		return null
	}
	
	/**
	 * Creates a new Eclipse project named {@code projectName} for the
	 * {@link Language} {@code l}.
	 * <ul>
	 *   <li>Natures: JAVA, PLUGIN, XText</li>
	 *   <li>Builders: JAVA, MANIFEST, SCHEMA</li>
	 *   <li>Source folders: src/src-gen</li>
	 *   <li>Dependencies: Ecore, K3, Xbase</li>
	 * </ul>
	 */
	def IProject createEMFRuntimeProject(String projectName, Language l) {
		try {
			// FIXME: Everything's hardcoded...
			val project = createEclipseProject(
				projectName,
				#[JavaCore::NATURE_ID, PDE::PLUGIN_NATURE, "org.eclipse.xtext.ui.shared.xtextNature"],
				#[JavaCore::BUILDER_ID,	PDE::MANIFEST_BUILDER_ID, PDE::SCHEMA_BUILDER_ID],
				#["src", "src-gen"],
				#[],
				#["org.eclipse.emf.ecore",
				  "fr.inria.diverse.k3.al.annotationprocessor.plugin",
				  "fr.inria.diverse.melange",
				  "org.eclipse.xtext.xbase.lib"],
//				#[basePkg, basePkg + ".impl", basePkg + ".util"],
				if (l.hasCopiedAspects) #[l.aspectsNamespace] else #[],
				#[],
				new NullProgressMonitor
			)

			val modelFolder = project.getFolder("model")
			modelFolder.create(false, true, null)

			log.debug('''Runtime EMF project «project» created.''')

			return project
		} catch (Exception e) {
			log.error("Unexpected exception while creating new runtime project", e)
		}

		return null
	}

	/**
	 * Wololo, wololo wololo.
	 */
	private def IProject createEclipseProject(
		String name,
		Iterable<String> natures,
		Iterable<String> builders,
		Iterable<String> srcFolders,
		Iterable<IProject> referencedProjects,
		Iterable<String> requiredBundles,
		Iterable<String> exportedPackages,
		Iterable<String> extensions,
		IProgressMonitor monitor
	) {
		try {
			monitor.beginTask("", 10)
			monitor.subTask("Creating project " + name)

			val workspace = ResourcesPlugin.workspace
			val project = workspace.root.getProject(name)

			var IPath previousProjectLocation = null
			if (project.exists){
				previousProjectLocation = project.location
				project.delete(true, true, SubMonitor.convert(monitor, 1))				
			}

			val javaProject = JavaCore::create(project)
			val description = workspace.newProjectDescription(name)

			description.location = previousProjectLocation
			project.create(description, SubMonitor.convert(monitor, 1))

			val classpathEntries = newArrayList

			if (!referencedProjects.empty) {
				description.referencedProjects = referencedProjects
				classpathEntries += referencedProjects.map[
					JavaCore::newProjectEntry(fullPath)
				]
			}

			description.natureIds = natures
			description.buildSpec = builders.map[buildName |
				description.newCommand => [builderName = buildName]
			]

			project.open(SubMonitor.convert(monitor, 1))
			createManifest(name, requiredBundles, exportedPackages, monitor, project)
			createPluginXml(project, extensions, monitor)
			createBuildProperties(project, srcFolders, monitor)
			project.setDescription(description, SubMonitor.convert(monitor, 1))

			srcFolders.forEach[src |
				val container = project.getFolder(src)

				try {
					if (!container.exists)
						container.create(false, true, SubMonitor.convert(monitor, 1))

					classpathEntries.add(0, JavaCore::newSourceEntry(container.fullPath))
				} catch (CoreException e) {
					log.error("Couldn't update project classpath", e)
				}
			]
		
			classpathEntries += JavaCore::newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER"))
			classpathEntries += JavaCore::newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"))

			val binFolder = project.getFolder("bin")
			binFolder.create(false, true, SubMonitor.convert(monitor, 1))
			javaProject.setRawClasspath(classpathEntries, SubMonitor.convert(monitor, 1))
			javaProject.setOutputLocation(binFolder.fullPath, SubMonitor.convert(monitor, 1))



			return project
		} catch (Exception e) {
			log.error("Unexpected exception while generating new project", e)
		}

		return null
	}

	def private void createManifest(
		String name,
		Iterable<String> requiredBundles,
		Iterable<String> exportedPackages,
		IProgressMonitor monitor,
		IProject project
	) throws CoreException {
		val content = '''
			Manifest-Version: 1.0
			Bundle-ManifestVersion: 2
			Bundle-Name: «name»
			Bundle-SymbolicName: «name»;singleton:=true
			Bundle-Version: 0.1.0
			«IF !requiredBundles.empty»
			Require-Bundle: «FOR b : requiredBundles SEPARATOR ",\n  "»«b»«ENDFOR»
			«ENDIF»
			«IF !exportedPackages.empty»
			Export-Package: «FOR p : exportedPackages SEPARATOR ",\n  "»«p»«ENDFOR»
			«ENDIF»
			Bundle-RequiredExecutionEnvironment: JavaSE-1.7

		'''

		val metaInf = project.getFolder("META-INF")
		metaInf.create(false, true, SubMonitor.convert(monitor, 1))
		createFile("MANIFEST.MF", metaInf, content, monitor)
	}

	def private void createPluginXml(
		IProject project,
		Iterable<String> extensions,
		IProgressMonitor monitor
	) {
		val content = '''
			<?xml version="1.0" encoding="UTF-8"?>
			<?eclipse version="3.0"?>

			<plugin>

			«FOR e : extensions»«e»
			«ENDFOR»

			</plugin>
		'''
		createFile("plugin.xml", project, content, monitor)
	}

	def private void createBuildProperties(
		IProject project,
		Iterable<String> srcFolders,
		IProgressMonitor monitor
	) {
		val content = '''
			source.. = «FOR f : srcFolders SEPARATOR ",\\n  "»«f»«ENDFOR»
			bin.includes = META-INF/,\
			  .
		'''

		createFile("build.properties", project, content, monitor)
	}

	def private IFile createFile(
		String name,
		IContainer container,
		String content,
		IProgressMonitor monitor
	) {
		val f = container.getFile(new Path(name))
		var InputStream stream = null

		try {
			stream = new ByteArrayInputStream(content.getBytes(f.getCharset))
			if (f.exists)
				f.setContents(stream, true, true, monitor)
			else
				f.create(stream, true, monitor)
		} catch (Exception e) {
			log.error("Error while creating new IFile", e)
		} finally {
			stream.closeQuietly
		}

		monitor.worked(1)
		return f
	}

	/**
	 * @deprecated Use {@link #createEMFRuntimeProject} instead.
	 */
	def IProject createAspectsRuntimeProject(
		IProject original,
		String projectName,
		String generatedPackage,
		String emfRuntimeBundle
	) {
		val dependencies = Sets::newHashSet(original.dependencies)
		dependencies += "org.eclipse.emf.ecore"
		dependencies += "fr.inria.diverse.k3.al.annotationprocessor.plugin"
		dependencies += emfRuntimeBundle

		val project = createEclipseProject(
			projectName,
			#[JavaCore::NATURE_ID, PDE::PLUGIN_NATURE],
			#[JavaCore::BUILDER_ID,	PDE::MANIFEST_BUILDER_ID, PDE::SCHEMA_BUILDER_ID],
			#["src-gen"],
			#[],
			dependencies, // + copy dependency from originating project
			#[generatedPackage],
			#[],
			new NullProgressMonitor
		)

		log.debug('''Runtime aspects project «project» created.''')

		return project
	}
	
	def void addNature(IProject project, String natureID) {
		try {
			val IProjectDescription desc = project.getDescription();
			val natures = desc.getNatureIds();
			val newNatures = newArrayList(natureID)
			newNatures.addAll(natures)
			desc.setNatureIds(newNatures);
			project.setDescription(desc, new NullProgressMonitor());
		} catch (CoreException e) {
		    e.printStackTrace();
		}
	}
	
	def void addBuilder(IProject project, String builderID) {
		try {
			val IProjectDescription projectDescription = project.getDescription();
			val ICommand[] buildSpec = projectDescription.getBuildSpec();
			val ICommand command = projectDescription.newCommand();
			command.setBuilderName(builderID);
			val newBuildSpect = newArrayList(command)
			newBuildSpect.addAll(buildSpec)
			projectDescription.setBuildSpec(newBuildSpect);
			project.setDescription( projectDescription, new NullProgressMonitor() );
		} catch (CoreException e) {
		    e.printStackTrace();
		}
	}
}
