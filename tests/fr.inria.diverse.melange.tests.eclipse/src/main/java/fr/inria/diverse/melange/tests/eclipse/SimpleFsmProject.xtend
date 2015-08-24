package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
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
	@Inject WorkspaceTestHelper helper
	static final String MELANGE_FILE =
		"SimpleFsmProject/src/simplefsm/SimpleFsm.melange"

	@Before
	override setUp() {
		super.setUp
		helper.init
		IResourcesSetupUtil::cleanWorkspace
		helper.deployMelangeProject("SimpleFsmProject",
			"tests-inputs/SimpleFsmProject.zip")
		IResourcesSetupUtil::waitForBuild
	}

	@Test
	def void testNoErrorsInWorkspace() {
		helper.generateAll(MELANGE_FILE)
		helper.assertNoMarkers
	}
}
