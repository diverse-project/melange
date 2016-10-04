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
public class DispatchTest extends AbstractXtextTests
{
	IProject melangeProject
	@Inject WorkspaceTestHelper helper
	static final String PROJECT_NAME = "fr.inria.diverse.melange.tests.dispatch.main"
	static final String MELANGE_FILE =
		"fr.inria.diverse.melange.tests.dispatch.main/src/fr/inria/diverse/melange/tests/dispatch/main/Main.melange"

	@Before
	override setUp() {
		helper.setTargetPlatform
		// We don't want to regenerate everything for each test
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.dispatch.model","tests-inputs/fr.inria.diverse.melange.tests.dispatch.model.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.dispatch.aspects","tests-inputs/fr.inria.diverse.melange.tests.dispatch.aspects.zip")
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.tests.dispatch.main.zip")
			IResourcesSetupUtil::waitForAutoBuild
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
		IResourcesSetupUtil::waitForAutoBuild
		helper.assertNoMarkers
		
		helper.assertProjectExists(PROJECT_NAME)
		helper.assertProjectExists("fr.inria.diverse.melange.tests.dispatch.main.l1")
		helper.assertProjectExists("fr.inria.diverse.melange.tests.dispatch.main.l2")
		helper.assertProjectExists("fr.inria.diverse.melange.tests.dispatch.main.l3")
		helper.assertProjectExists("fr.inria.diverse.melange.tests.dispatch.main.l4")
	}

	@Test
	def void test2TransfoProducesExpectedOutput() {
		helper.assertNoMarkers

		val expected = '''
			Test L1:
			L1 - A.foo()
			L1 - B.foo()
			L1 - C.bar() calling : L1 - A.foo()
			L1 - C.bar() calling : L1 - B.foo()
			Test L2:
			L2 - A.foo()
			L1 - B.foo()
			L1 - C.bar() calling : L2 - A.foo()
			L1 - C.bar() calling : L1 - B.foo()
			Test L3:
			L1 - A.foo()
			L3 - B.foo()
			L3 - C.bar() calling : L1 - A.foo()
			L3 - A2.bar()
			L3 - C.bar() calling : L3 - B.foo()
			L3 - A2.bar()
			Test L4:
			L1 - A.foo()
			L4 - SubB.foo()
			L1 - C.bar() calling : L1 - A.foo()
			L1 - C.bar() calling : L4 - SubB.foo()
		'''

		val mainTransfoOutput = helper.runMainClass(melangeProject, "fr.inria.diverse.melange.tests.dispatch.main.Main")
		assertEquals(expected, mainTransfoOutput)
	}
	
}
