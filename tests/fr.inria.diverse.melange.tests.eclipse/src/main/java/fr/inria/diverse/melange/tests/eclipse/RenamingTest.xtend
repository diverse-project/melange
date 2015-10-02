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

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class RenamingTest extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	static final String MELANGE_FILE =
		"fr.inria.diverse.melange.test.renaming.main/src/fr/inria/diverse/melange/test/renaming/main/Main.melange"
		
	static final String PROJECT_1 = "fr.inria.diverse.melange.test.renaming.main.testlanguagerenamed"
	static final String PROJECT_2 = "fr.inria.diverse.melange.test.renaming.main.testreverserenamed"
	
	override void setUp() throws Exception {
		super.setUp
		helper.init
		IResourcesSetupUtil::cleanWorkspace
		
		helper.deployMelangeProject("fr.inria.diverse.melange.test.renaming.aspects", "tests-inputs/fr.inria.diverse.melange.test.renaming.aspects.zip")
		helper.deployMelangeProject("fr.inria.diverse.melange.test.renaming.model", "tests-inputs/fr.inria.diverse.melange.test.renaming.model.zip")
		helper.deployMelangeProject("fr.inria.diverse.melange.test.renaming.main", "tests-inputs/fr.inria.diverse.melange.test.renaming.main.zip")
		
		IResourcesSetupUtil::reallyWaitForAutoBuild
	}

	@Test
	def void testNoErrorsInWorkspace() {
		helper.generateLanguages(MELANGE_FILE)
		helper.assertNoMarkers
		
		helper.assertProjectExists(PROJECT_1)
		helper.assertProjectExists(PROJECT_2)
		
		helper.assertK3AspectsExists(
			#[
				"ClassAAspect" -> "ClassA2",
				"ClassBAspect" -> "ClassB2",
				"SuperBAspect" -> "SuperB2"
			],
			PROJECT_1)
			
		helper.assertK3AspectsExists(
			#[
				"ClassAAspect" -> "ClassA",
				"ClassBAspect" -> "ClassB",
				"SuperBAspect" -> "SuperB"
			],
			PROJECT_2
		)
	}
}
