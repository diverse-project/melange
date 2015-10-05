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
	
	@Test
	def void test4Outline() {
		val treeViewer = helper.getOutline(MELANGE_FILE)
		treeViewer.expandAll
		val topElement = treeViewer.getInput() as IOutlineNode

		val treeRoot = topElement.children.head
		assertEquals("simplefsm", treeRoot.text.toString)
		assertEquals(6, treeRoot.children.size)

		val fsmLang = treeRoot.children.get(0)
		val timedFsmLang = treeRoot.children.get(1)
		val execute = treeRoot.children.get(2)
		val main = treeRoot.children.get(3)
		val fsmMT = treeRoot.children.get(4)
		val tfsmMT = treeRoot.children.get(5)

		//Check top elements
		assertEquals("Fsm \u25C1 FsmMT", fsmLang.text.toString)
		assertEquals("TimedFsm \u25C1 FsmMT, TimedFsmMT", timedFsmLang.text.toString)
		assertEquals("execute", execute.text.toString)
		assertEquals("main", main.text.toString)
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
