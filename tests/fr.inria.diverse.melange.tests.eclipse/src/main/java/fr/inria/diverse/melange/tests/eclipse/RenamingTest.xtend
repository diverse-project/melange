/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.tests.eclipse

import com.google.inject.Inject
import fr.inria.diverse.melange.ui.tests.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class RenamingTest extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	static final String MELANGE_FILE =
		"fr.inria.diverse.melange.test.renaming.main/src/fr/inria/diverse/melange/testrenaming/main/Main.melange"
		
	static final String PROJECT_1 = "fr.inria.diverse.melange.testrenaming.main.testlanguagerenamed"
	static final String PROJECT_2 = "fr.inria.diverse.melange.testrenaming.main.testreverserenamed"
	
	override void setUp() throws Exception {
		helper.setTargetPlatform
		if (!helper.projectExists("fr.inria.diverse.melange.test.renaming.main")) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			helper.deployMelangeProject("fr.inria.diverse.melange.test.renaming.aspects", "tests-inputs/fr.inria.diverse.melange.test.renaming.aspects.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.test.renaming.model", "tests-inputs/fr.inria.diverse.melange.test.renaming.model.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.test.renaming.main", "tests-inputs/fr.inria.diverse.melange.test.renaming.main.zip")
	
			IResourcesSetupUtil::reallyWaitForAutoBuild
			helper.openEditor(MELANGE_FILE)
		}
	}

	@Test
	def void testNoErrorsInWorkspace() {
		helper.generateLanguages(MELANGE_FILE)
		IResourcesSetupUtil::reallyWaitForAutoBuild
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
