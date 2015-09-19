package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class SimpleFsmProject extends AbstractXtextTests
{
	IProject melangeFsm
	@Inject WorkspaceTestHelper helper
	static final String MELANGE_FILE =
		"SimpleFsmProject/src/simplefsm/SimpleFsm.melange"

	@Before
	override setUp() {
		super.setUp
		helper.init
		IResourcesSetupUtil::cleanWorkspace
		melangeFsm = helper.deployMelangeProject("SimpleFsmProject",
			"tests-inputs/SimpleFsmProject.zip")
		IResourcesSetupUtil::reallyWaitForAutoBuild
	}

	@Test
	def void testNoErrorsInWorkspace() {
		helper.generateInterfaces(MELANGE_FILE)
		helper.generateAdapters(MELANGE_FILE)
		helper.assertNoMarkers

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
