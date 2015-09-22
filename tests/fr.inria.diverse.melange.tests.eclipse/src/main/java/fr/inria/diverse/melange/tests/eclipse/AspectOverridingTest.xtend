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
			Asp1a
			Asp2
			Asp0
			Asp3
			Asp4
			Asp4
		'''

		val mainTransfoOutput = helper.runMainClass(melangeProject, "fr.inria.diverse.melange.test.overridding.main")
		assertEquals(expected, mainTransfoOutput)
	}
}
