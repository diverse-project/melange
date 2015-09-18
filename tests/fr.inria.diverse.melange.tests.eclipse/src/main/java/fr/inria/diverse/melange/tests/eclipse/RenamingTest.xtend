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
	}
}
