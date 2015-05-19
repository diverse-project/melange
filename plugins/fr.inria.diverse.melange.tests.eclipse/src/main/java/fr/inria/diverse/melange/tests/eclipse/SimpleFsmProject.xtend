package fr.inria.diverse.melange.tests.eclipse

import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceDeployer
import org.eclipse.core.resources.IMarker
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.jdt.core.JavaCore
import org.eclipse.pde.internal.core.natures.PDE
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.eclipse.xtext.junit4.ui.util.JavaProjectSetupUtil
import org.eclipse.xtext.ui.XtextProjectHelper
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class SimpleFsmProject extends AbstractXtextTests
{
	override void setUp() throws Exception {
		super.setUp
		deployProject("SimpleFsmProject", "tests-inputs/SimpleFsmProject.zip")
		IResourcesSetupUtil::waitForAutoBuild
	}

	@Test
	def void testNoErrorsInWorkspace() {
		ResourcesPlugin::workspace.root.projects.forEach[project |
			project.findMarkers(IMarker::PROBLEM, true, IResource::DEPTH_INFINITE).forEach[
				println('''Found marker «getAttribute(IMarker::MESSAGE)» («getAttribute(IMarker::SEVERITY)»)''')
				assertFalse(
					"Unexpected marker: " + getAttribute(IMarker::MESSAGE),
					getAttribute(IMarker::SEVERITY) == IMarker::SEVERITY_ERROR
				)
			]
		]
	}

	/**
	 * Create a project {@link projectName} with the content of the archive located at {@link zipPath}
	 * and deploy it in the workspace.
	 * 
	 * @param projectName Name of the project
	 * @param zipPath Path to a .zip file containing a Melange project 
	 */
	private def deployProject(String projectName, String zipPath) {
		val newProject = JavaProjectSetupUtil::createJavaProject(projectName)
		JavaProjectSetupUtil::addSourceFolder(newProject, "src")
		JavaProjectSetupUtil::addSourceFolder(newProject, "src-gen")
		IResourcesSetupUtil::addNature(newProject.project, XtextProjectHelper::NATURE_ID)
		IResourcesSetupUtil::addNature(newProject.project, PDE::PLUGIN_NATURE)
		IResourcesSetupUtil::addBuilder(newProject.project, XtextProjectHelper::BUILDER_ID)
		IResourcesSetupUtil::addBuilder(newProject.project, PDE::MANIFEST_BUILDER_ID)
		IResourcesSetupUtil::addBuilder(newProject.project, PDE::SCHEMA_BUILDER_ID)
		JavaProjectSetupUtil::addToClasspath(newProject, JavaCore::newContainerEntry(new Path("org.eclipse.xtend.XTEND_CONTAINER")))
		JavaProjectSetupUtil::addToClasspath(newProject, JavaCore::newContainerEntry(new Path("org.eclipse.pde.core.requiredPlugins")))
		WorkspaceDeployer::deployZipInProject(newProject.project, zipPath)
	}
}
