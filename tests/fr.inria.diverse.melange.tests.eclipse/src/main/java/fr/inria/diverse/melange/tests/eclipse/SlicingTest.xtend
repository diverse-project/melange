package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.rules.Timeout
import org.junit.Rule

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class SlicingTest extends AbstractXtextTests
{
	@Rule
    public Timeout globalTimeout = Timeout.seconds(120);
	
	@Inject WorkspaceTestHelper helper
	static final String MELANGE_FILE =
		"fr.inria.diverse.melange.test.slicing.main/src/fr/inria/diverse/melange/test/slicing/main/main.melange"
		
	static final String PROJECT_1 = "fr.inria.diverse.test.slicing.main.slicebaselang"
	
	override void setUp() throws Exception {
		helper.setTargetPlatform
		if (!helper.projectExists("fr.inria.diverse.melange.test.slicing.main")) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			helper.deployMelangeProject("fr.inria.diverse.melange.test.slicing.aspects", "tests-inputs/fr.inria.diverse.melange.test.slicing.aspects.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.test.slicing.model", "tests-inputs/fr.inria.diverse.melange.test.slicing.model.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.test.slicing.main", "tests-inputs/fr.inria.diverse.melange.test.slicing.main.zip")
			
			IResourcesSetupUtil::waitForAutoBuild
			helper.openEditor(MELANGE_FILE)
		}
	}

	@Test
	def void testNoErrorsInWorkspace() {
		helper.generateLanguages(MELANGE_FILE)
		IResourcesSetupUtil::waitForAutoBuild
		helper.assertNoMarkers
		
		helper.assertProjectExists(PROJECT_1)
		
		helper.assertK3AspectsExists(
			#[
				"AAspect" -> "A",
				"SuperAAspect" -> "SuperA",
				"BAspect" -> "B"
			],
			PROJECT_1)
			
		helper.assertK3AspectsDontExists(
			#[
				"SubAAspect" -> "SubA"
			],
			PROJECT_1)
	}
}
