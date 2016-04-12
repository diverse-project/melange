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
import org.eclipse.xtext.ui.editor.outline.IOutlineNode

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
			IResourcesSetupUtil::waitForAutoBuild
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
		helper.assertNoMarkers

		val expected = '''
			State 1
				Out a/1
				Out b/2
			State 2
				In a/1
				In c/3
				Out d/4
				Out e/5
			State 3
				In b/2
				In d/4
				Out c/3
			State 4
				In e/5
			
			State 1
				Out a/1
			State 2
				In a/1

		'''

		val mainTransfoOutput = helper.runMainClass(melangeFsm, "simplefsm.Main")
		assertEquals(expected, mainTransfoOutput)
	}
	
	@Test
	def void test4Outline() {
		val treeViewer = helper.getOutline(MELANGE_FILE)
		treeViewer.expandAll
		val topElement = treeViewer.getInput() as IOutlineNode

		val treeRoot = topElement.children.head
		assertEquals("simplefsm", treeRoot.text.toString)
		assertEquals(4, treeRoot.children.size)

		val fsmLang = treeRoot.children.get(0)
		val timedFsmLang = treeRoot.children.get(1)
		val fsmMT = treeRoot.children.get(2)
		val tfsmMT = treeRoot.children.get(3)

		//Check top elements
		assertEquals("Fsm \u25C1 FsmMT", fsmLang.text.toString)
		assertEquals("TimedFsm \u25C1 FsmMT, TimedFsmMT", timedFsmLang.text.toString)
		assertEquals("FsmMT", fsmMT.text.toString)
		assertEquals("TimedFsmMT \u25C1 FsmMT", tfsmMT.text.toString)

		//Check packages for Languages & ModelTypes
		val fsmSyntax = fsmLang.children.head
		val tfsmSyntax = timedFsmLang.children.head
		val fsmMTSyntax = fsmMT.children.head
		val tfsmMTSyntax = tfsmMT.children.head
		
		helper.assertMatch("tests-inputs/modelTypes/FsmMT.ecore", fsmSyntax)
		helper.assertMatch("tests-inputs/modelTypes/FsmMT.ecore", fsmMTSyntax)
		helper.assertMatch("tests-inputs/modelTypes/TimedFsmMT.ecore", tfsmSyntax)
		helper.assertMatch("tests-inputs/modelTypes/TimedFsmMT.ecore", tfsmMTSyntax)
	}
	
}
