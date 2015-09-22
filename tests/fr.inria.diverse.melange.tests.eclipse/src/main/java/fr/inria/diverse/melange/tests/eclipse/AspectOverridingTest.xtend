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
public class AspectOverridingTest extends AbstractXtextTests
{
	IProject melangeProject
	@Inject WorkspaceTestHelper helper
	static final String PROJECT_NAME = "fr.iniria.diverse.melange.test.overriding.main"
	static final String MELANGE_FILE =
		"fr.iniria.diverse.melange.test.overriding.main/src/fr/iniria/diverse/melange/test/renaming/Main.melange"

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
		helper.assertNoMarkers
	}

	@Test
	def void test1GeneratedModelTypes() {
		helper.generateInterfaces(MELANGE_FILE)
		helper.assertNoMarkers
	}

	@Test
	def void test2GeneratedAdaptersCompile() {
		helper.generateAdapters(MELANGE_FILE)
		helper.assertNoMarkers
	}

	@Test
	def void test3TransfoProducesExpectedOutput() {
		val expected = '''
			Asp0
			Asp1a
			Asp2
			Asp0
			Asp3
			Asp4
			Asp4
		'''

		val mainTransfoOutput = helper.runMainClass(melangeProject, "main")
		assertEquals(expected, mainTransfoOutput)
	}
}
