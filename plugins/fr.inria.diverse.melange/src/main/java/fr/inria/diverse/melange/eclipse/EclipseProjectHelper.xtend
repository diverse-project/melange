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
import java.io.IOException
import java.io.InputStream
import java.io.OutputStream
import org.apache.log4j.Logger
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.SubProgressMonitor
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.xtext.util.MergeableManifest

/**
 * A collection of utilities around Eclipse's APIs to manage the creation,
 * maintenance, etc. of the Eclipse projects/MANIFEST/plugin.xml generated
 * by Melange.
 */
class EclipseProjectHelper
{
	@Inject extension LanguageExtensions
	Logger log = Logger.getLogger(EclipseProjectHelper)

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
				val manifest = new MergeableManifest(input)
				val attrs = manifest.mainAttributes
				val bundles = Splitter.on(",").omitEmptyStrings.trimResults.split(attrs.getValue("Require-Bundle"))
				return bundles.map[it.split(";").head]
			} finally {
				if (input !== null)
					input.close
			}
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
			if (!manifestFile.isSynchronized(IResource.DEPTH_ZERO))
				manifestFile.refreshLocal(IResource.DEPTH_ZERO, null)
			var OutputStream output = null
			var InputStream input = null
			try {
				input = manifestFile.contents
				val manifest = new MergeableManifest(input)
				manifest.addRequiredBundles(Sets::newHashSet(bundles))
				val out = new ByteArrayOutputStream
				output = new BufferedOutputStream(out)
				manifest.write(output)
				val in = new ByteArrayInputStream(out.toByteArray)
				input = new BufferedInputStream(in)
				manifestFile.setContents(input, true, true, null)
				bundles.forEach[log.debug('''Dependendency «it» added to «project»''')]
			} finally {
				if (output !== null)
					output.close
				if (input !== null)
					input.close
			}
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
			if (!manifestFile.isSynchronized(IResource.DEPTH_ZERO))
				manifestFile.refreshLocal(IResource.DEPTH_ZERO, null)
			var OutputStream output = null
			var InputStream input = null
			try {
				input = manifestFile.contents
				val manifest = new MergeableManifest(input)
				// FIXME: Quick & Dirty ;)
				var requiredBundles = manifest.getMainAttributes().get(MergeableManifest::REQUIRE_BUNDLE) as String
				val regex = '''(?m)^ ?(«bundles.join("|")»).*$(?:\r?\n)?'''
				val result = requiredBundles.replaceAll(regex, "") 
				manifest.getMainAttributes().put(MergeableManifest::REQUIRE_BUNDLE, result.replaceFirst(",$", ""));
				val out = new ByteArrayOutputStream
				output = new BufferedOutputStream(out)
				manifest.write(output)
				val in = new ByteArrayInputStream(out.toByteArray)
				input = new BufferedInputStream(in)
				manifestFile.setContents(input, true, true, null)
				bundles.forEach[log.debug('''Dependendency «it» removed from «project»''')]
			} finally {
				if (output !== null)
					output.close
				if (input !== null)
					input.close
			}
		}
	}

	/**
	 * Creates a new Eclipse project named {@code projectName} for the
	 * {@link Language} {@code l}.
	 * <ul>
	 *   <li>Natures: JAVA, PLUGIN</li>
	 *   <li>Builders: JAVA, MANIFEST, SCHEMA</li>
	 *   <li>Source folders: src/src-gen</li>
	 *   <li>Dependencies: Ecore, K3, Xbase</li>
	 * </ul>
	 */
	def IProject createEMFRuntimeProject(String projectName, Language l) {
		try {
			// FIXME: Everything's hardcoded...
			val basePkg = l.name.toLowerCase
			val project = createEclipseProject(
				projectName,
				#[JavaCore::NATURE_ID, PDE::PLUGIN_NATURE],
				#[JavaCore::BUILDER_ID,	PDE::MANIFEST_BUILDER_ID, PDE::SCHEMA_BUILDER_ID],
				#["src", "src-gen"],
				#[],
				#["org.eclipse.emf.ecore",
				  "fr.inria.diverse.k3.al.annotationprocessor.plugin",
				  "org.eclipse.xtext.xbase.lib"],
//				#[basePkg, basePkg + ".impl", basePkg + ".util"],
				if (l.hasExternalAspects) #[l.aspectsNamespace] else #[],
				#[],
				new NullProgressMonitor
			)

			val modelFolder = project.getFolder("model")
			modelFolder.create(false, true, null)

			log.debug('''Runtime EMF project «project» created.''')

			return project
		} catch (Exception e) {
			e.printStackTrace
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
				project.delete(true, true, new SubProgressMonitor(monitor, 1))				
			}

			val javaProject = JavaCore::create(project)
			val description = workspace.newProjectDescription(name)

			description.location = previousProjectLocation
			project.create(description, new SubProgressMonitor(monitor, 1))

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

			project.open(new SubProgressMonitor(monitor, 1))
			project.setDescription(description, new SubProgressMonitor(monitor, 1))

			srcFolders.forEach[src |
				val container = project.getFolder(src)

				if (!container.exists)
					container.create(false, true, new SubProgressMonitor(monitor, 1))

				classpathEntries.add(0, JavaCore::newSourceEntry(container.fullPath))
			]
		
			classpathEntries += JavaCore::newContainerEntry(new Path("org.eclipse.jdt.launching.JRE_CONTAINER"))
			classpathEntries += JavaCore::newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"))

			val binFolder = project.getFolder("bin")
			binFolder.create(false, true, new SubProgressMonitor(monitor, 1))
			javaProject.setRawClasspath(classpathEntries, new SubProgressMonitor(monitor, 1))
			javaProject.setOutputLocation(binFolder.fullPath, new SubProgressMonitor(monitor, 1))

			createManifest(name, requiredBundles, exportedPackages, monitor, project)
			createPluginXml(project, extensions, monitor)
			createBuildProperties(project, srcFolders, monitor)

			return project
		} catch (Exception e) {
			e.printStackTrace
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
		metaInf.create(false, true, new SubProgressMonitor(monitor, 1))
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
			e.printStackTrace
		} finally {
			try {
				if (stream !== null)
					stream.close
			} catch (IOException e) {
				e.printStackTrace
			}
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
}
