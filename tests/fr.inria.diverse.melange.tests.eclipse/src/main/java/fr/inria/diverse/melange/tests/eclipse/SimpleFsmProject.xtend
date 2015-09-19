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
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class SimpleFsmProject extends AbstractXtextTests
{
	IProject melangeFsm
	@Inject WorkspaceTestHelper helper
	static final String PROJECT_NAME = "SimpleFsmProject"
	static final String MELANGE_FILE =
		"SimpleFsmProject/src/simplefsm/SimpleFsm.melange"

	@Before
	override setUp() {
		// We don't want to regenerate everything for each test
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			melangeFsm = helper.deployMelangeProject(PROJECT_NAME,
				"tests-inputs/SimpleFsmProject.zip")
			IResourcesSetupUtil::reallyWaitForAutoBuild
			helper.openEditor(MELANGE_FILE)
		} else {
			melangeFsm = helper.getProject(PROJECT_NAME)
		}
	}

	@After
	override tearDown() {
		// Nope
	}

	@Test
	def void test0NoErrorsInWorkspace() {
		helper.assertNoMarkers
	}

	@Test
	def void test1GeneratedModelTypes() {
		helper.generateInterfaces(MELANGE_FILE)
		helper.assertNoMarkers

		val fsmMT = helper.getMT(melangeFsm, "FsmMT")
		val tfsmMT = helper.getMT(melangeFsm, "TimedFsmMT")

		helper.assertMatch(fsmMT, "tests-inputs/modelTypes/FsmMT.ecore")
		helper.assertMatch(tfsmMT, "tests-inputs/modelTypes/TimedFsmMT.ecore")
	}

	@Test
	def void test2GeneratedAdaptersCompile() {
		helper.generateAdapters(MELANGE_FILE)
		helper.assertNoMarkers
	}

	@Test
	def void test3TransfoProducesExpectedOutput() {
		val expected = '''
			State 1
				Transition a
				Transition b
			State 2
				Transition d
				Transition e
			State 3
				Transition c
			State 4
			State 1
				Transition a
			State 2
		'''

		val mainTransfoOutput = helper.runMainClass(melangeFsm, "simplefsm.main")
		assertEquals(expected, mainTransfoOutput)
	}
}
