package fr.inria.diverse.melange.ui

import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.SubProgressMonitor
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.launching.JavaRuntime
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.swt.widgets.Shell
import org.eclipse.ui.PlatformUI
import java.util.jar.Manifest

class EclipseProjectHelper
{
	def static IProject createEMFRuntimeProject(String name) {
		try {
			val project = createEclipseProject(
				name,
				#[JavaCore::NATURE_ID, PDE::PLUGIN_NATURE],
				#[JavaCore::BUILDER_ID,	PDE::MANIFEST_BUILDER_ID, PDE::SCHEMA_BUILDER_ID],
				#["src"],
				#[],
				#["org.eclipse.emf.ecore"],
				#[],
				new NullProgressMonitor, // FIXME
				PlatformUI.getWorkbench.activeWorkbenchWindow.shell
			)

			val modelFolder = project.getFolder("model")
			modelFolder.create(false, true, null)

			return project
		} catch (Exception e) {
			e.printStackTrace
		}

		return null
	}

	def static IProject createEclipseProject(
		String name,
		Iterable<String> natures,
		Iterable<String> builders,
		Iterable<String> srcFolders,
		Iterable<IProject> referencedProjects,
		Iterable<String> requiredBundles,
		Iterable<String> exportedPackages,
		IProgressMonitor monitor,
		Shell shell
	) {
		try {
			monitor.beginTask("", 10)
			monitor.subTask("Creating project " + name)

			val workspace = ResourcesPlugin.workspace
			val project = workspace.root.getProject(name)

			if (project.exists)
				project.delete(true, true, new SubProgressMonitor(monitor, 1))

			val javaProject = JavaCore::create(project)
			val description = workspace.newProjectDescription(name)

			description.location = null
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

			classpathEntries +=
				JavaRuntime::getLibraryLocations(JavaRuntime::defaultVMInstall)
				.map[JavaCore::newLibraryEntry(systemLibraryPath, null, null)]

			classpathEntries += JavaCore::newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins"))

			val binFolder = project.getFolder("bin")
			binFolder.create(false, true, new SubProgressMonitor(monitor, 1))
			javaProject.setRawClasspath(classpathEntries, new SubProgressMonitor(monitor, 1))
			javaProject.setOutputLocation(binFolder.fullPath, new SubProgressMonitor(monitor, 1))

			createManifest(name, requiredBundles, exportedPackages, monitor, project)
			createBuildProperties(monitor, project, srcFolders)

			return project
		} catch (Exception e) {
			e.printStackTrace
		}

		return null
	}

	def static private void createManifest(
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

	def static private void createBuildProperties(
		IProgressMonitor monitor,
		IProject project,
		Iterable<String> srcFolders
	) {
		val content = '''
			source.. = «FOR f : srcFolders SEPARATOR ",\\n  "»«f»«ENDFOR»
			bin.includes = META-INF/,\
			  .
		'''

		createFile("build.properties", project, content, monitor)
	}

	def private static IFile createFile(
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
}
