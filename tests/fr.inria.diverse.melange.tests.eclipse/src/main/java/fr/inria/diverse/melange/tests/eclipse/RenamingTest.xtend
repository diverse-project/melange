package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceDeployer
import fr.inria.diverse.melange.ui.builder.MelangeBuilder
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
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider
import org.eclipse.xtext.resource.DerivedStateAwareResource
import org.eclipse.emf.common.util.URI
import org.eclipse.core.runtime.NullProgressMonitor

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class RenamingTest extends AbstractXtextTests
{
	@Inject MelangeBuilder builder
	@Inject XtextResourceSetProvider rsProvider
	
	override void setUp() throws Exception {
		super.setUp
		deployProject("fr.inria.diverse.melange.test.renaming.aspects", "tests-inputs/fr.inria.diverse.melange.test.renaming.aspects.zip")
		deployProject("fr.inria.diverse.melange.test.renaming.model", "tests-inputs/fr.inria.diverse.melange.test.renaming.model.zip")
		deployProject("fr.inria.diverse.melange.test.renaming.main", "tests-inputs/fr.inria.diverse.melange.test.renaming.main.zip")
		
		val workspace = ResourcesPlugin.workspace
		val project = workspace.root.getProject("fr.inria.diverse.melange.test.renaming.main")
		var melangeFile = project.findMember("src/fr/inria/diverse/melange/test/renaming/main/Main.melange")
		
		val rs = rsProvider.get(project)
		val res = rs.getResource(URI::createPlatformResourceURI(melangeFile.fullPath.toString, true), true) as DerivedStateAwareResource
		builder.generateLanguages(res, project, new NullProgressMonitor())
		
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
