package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.junit.Test
import java.nio.file.Files
import java.nio.file.Paths

/**
 * Test for bug #82
 * Also verifies the ability of Melange to generate the language runtime in the current project (ie. bug #80)
 */
@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class AspectCopyInMelangeProjectMiniFsmTest1 extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	IProject melangeProject
	static final String PROJECT_NAME = "org.gemoc.sample.minifsm"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/org/gemoc/sample/MiniFSM.melange"
	
	@Before
	override setUp() {
		helper.setTargetPlatform
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			helper.deployMelangeProject("org.gemoc.sample.minifsm.model","tests-inputs/aspectcopyinmelangeprojectminifsm1/org.gemoc.sample.minifsm.model.zip")					
			helper.deployMelangeProject("org.gemoc.sample.minifsm.k3dsa","tests-inputs/aspectcopyinmelangeprojectminifsm1/org.gemoc.sample.minifsm.k3dsa.zip")
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/aspectcopyinmelangeprojectminifsm1/org.gemoc.sample.minifsm.zip")
			
			IResourcesSetupUtil::reallyWaitForAutoBuild
			helper.cleanAll(MELANGE_FILE)
			IResourcesSetupUtil::reallyWaitForAutoBuild
			helper.openEditor(MELANGE_FILE)
		} else {
			melangeProject = helper.getProject(PROJECT_NAME)
		}
	}

	@After
	override tearDown() {
		// Nope
	}
	
	@Test
	def void test0NoErrorsInWorkspace() {
		helper.generateAll(MELANGE_FILE)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		helper.assertNoMarkers
		
		helper.assertProjectExists(PROJECT_NAME)
		helper.assertProjectExists("org.gemoc.sample.minifsm")
		helper.assertProjectExists("org.gemoc.sample.minifsm.k3dsa")
		helper.assertProjectExists("org.gemoc.sample.minifsm.model")
		helper.assertFileExists("/org.gemoc.sample.minifsm/src-model-gen/org/gemoc/sample/minifsm/minifsm/MiniStateMachine.java")
	}
	
}