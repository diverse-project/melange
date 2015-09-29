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
public class AspectOverridingTest extends AbstractXtextTests
{
	IProject melangeProject
	@Inject WorkspaceTestHelper helper
	static final String PROJECT_NAME = "fr.inria.diverse.melange.test.overriding.main"
	static final String MELANGE_FILE =
		"fr.inria.diverse.melange.test.overriding.main/src/fr/inria/diverse/melange/test/renaming/main/Main.melange"

	@Before
	override setUp() {
		// We don't want to regenerate everything for each test
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.test.overriding.main.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.test.overriding.aspects","tests-inputs/fr.inria.diverse.melange.test.overriding.aspects.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.test.overriding.model","tests-inputs/fr.inria.diverse.melange.test.overriding.model.zip")
//			helper.generateAll(MELANGE_FILE)
			IResourcesSetupUtil::reallyWaitForAutoBuild
		} else {
			melangeProject = helper.getProject(PROJECT_NAME)
		}
	}

	@After
	override tearDown() {
		// Nope
	}

	@Test
	def void test1GeneratedLanguages() {
		helper.generateLanguages(MELANGE_FILE)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		helper.assertNoMarkers
	}

	@Test
	def void test2GeneratedModelTypes() {
		helper.generateInterfaces(MELANGE_FILE)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		helper.assertNoMarkers
	}

	@Test
	def void test3GeneratedAdaptersCompile() {
		helper.generateAdapters(MELANGE_FILE)
		IResourcesSetupUtil::reallyWaitForAutoBuild
		helper.assertNoMarkers
	}

	@Test
	def void test4TransfoProducesExpectedOutput() {
		val expected = '''
			Asp0
			Asp1b
			Asp2
			Asp1b
			Asp3
			Asp4
			Asp4
		'''

		val mainTransfoOutput = helper.runMainClass(melangeProject, "fr.inria.diverse.melange.test.overridding.main")
		assertEquals(expected, mainTransfoOutput)
	}
	
	@Test
	def void test5Outline() {
		val treeViewer = helper.getOutline(MELANGE_FILE)
		treeViewer.expandAll
		val topElement = treeViewer.getInput() as IOutlineNode

		val treeRoot = topElement.children.head
		assertEquals("fr.inria.diverse.melange.test.overridding", treeRoot.text.toString)
		assertEquals(17, treeRoot.children.size)

		val L0Lang = treeRoot.children.get(0)
		val L1Lang = treeRoot.children.get(1)
		val L2Lang = treeRoot.children.get(2)
		val L2bLang = treeRoot.children.get(3)
		val L3Lang = treeRoot.children.get(4)
		val L3bLang = treeRoot.children.get(5)
		val L4Lang = treeRoot.children.get(6)
		val execute = treeRoot.children.get(7)
		val main = treeRoot.children.get(8)
		val L0mt = treeRoot.children.get(9)
		val L1mt = treeRoot.children.get(10)
		val L2mt = treeRoot.children.get(11)
		val L2bmt = treeRoot.children.get(12)
		val L3mt = treeRoot.children.get(13)
		val L3bmt = treeRoot.children.get(14)
		val L4mt = treeRoot.children.get(15)
		val imports = treeRoot.children.get(16)	

		//Check top elements
		assertEquals("L0 \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L0Lang.text.toString)
		assertEquals("L1 \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L1Lang.text.toString)
		assertEquals("L2\u25C0L0, L1 \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L2Lang.text.toString)
		assertEquals("L2b\u25C0L0, L1 \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L2bLang.text.toString)
		assertEquals("L3\u25C0L2 \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L3Lang.text.toString)
		assertEquals("L3b\u25C0L2 \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L3bLang.text.toString)
		assertEquals("L4 \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L4Lang.text.toString)
		assertEquals("execute", execute.text.toString)
		assertEquals("main", main.text.toString)
		assertEquals("L0mt \u25C1 L1mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L0mt.text.toString)
		assertEquals("L1mt \u25C1 L0mt, L2mt, L2bmt, L3mt, L3bmt, L4mt", L1mt.text.toString)
		assertEquals("L2mt \u25C1 L0mt, L1mt, L2bmt, L3mt, L3bmt, L4mt", L2mt.text.toString)
		assertEquals("L2bmt \u25C1 L0mt, L1mt, L2mt, L3mt, L3bmt, L4mt", L2bmt.text.toString)
		assertEquals("L3mt \u25C1 L0mt, L1mt, L2mt, L2bmt, L3bmt, L4mt", L3mt.text.toString)
		assertEquals("L3bmt \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L4mt", L3bmt.text.toString)
		assertEquals("L4mt \u25C1 L0mt, L1mt, L2mt, L2bmt, L3mt, L3bmt", L4mt.text.toString)

		//Check packages for Languages & ModelTypes
		val L0Syntax = L0Lang.children.head
		val L1Syntax = L1Lang.children.head
		val L2Syntax = L2Lang.children.head
		val L2bSyntax = L2bLang.children.head
		val L3Syntax = L3Lang.children.head
		val L3bSyntax = L3bLang.children.head
		val L4Syntax = L4Lang.children.head
		val L0mtSyntax = L0mt.children.head
		val L1mtSyntax = L1mt.children.head
		val L2mtSyntax = L2mt.children.head
		val L2bmtSyntax = L2bmt.children.head
		val L3mtSyntax = L3mt.children.head
		val L3bmtSyntax = L3bmt.children.head
		val L4mtSyntax = L4mt.children.head
		
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L0Syntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L1Syntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L2Syntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L2bSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L3Syntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L3bSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L4Syntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L0mtSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L1mtSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L2mtSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L2bmtSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L3mtSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L3bmtSyntax)
		helper.assertMatch("tests-inputs/modelTypes/L0mt.ecore", L4mtSyntax)
		
		//Check aspects
		val L0_Asp0 = L0Lang.children.get(1)
		val L1_Asp1a = L1Lang.children.get(1)
		val L1_Asp1b = L1Lang.children.get(2)
		val L2_Asp2 = L2Lang.children.get(1)
		val L3_Asp3 = L3Lang.children.get(1)
		val L4_Asp4 = L4Lang.children.get(1)
		
		assertEquals("Asp0 @ A", L0_Asp0.text.toString)
		assertEquals("Asp1a @ A", L1_Asp1a.text.toString)
		assertEquals("Asp1b @ A", L1_Asp1b.text.toString)
		assertEquals("Asp2 @ A", L2_Asp2.text.toString)
		assertEquals("Asp3 @ A", L3_Asp3.text.toString)
		assertEquals("Asp4 @ A", L4_Asp4.text.toString)
		
	}
}
