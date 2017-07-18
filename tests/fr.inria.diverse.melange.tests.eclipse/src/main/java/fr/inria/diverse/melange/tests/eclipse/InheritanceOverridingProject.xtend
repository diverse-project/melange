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
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.eclipse.core.resources.IResource
import org.eclipse.core.resources.IncrementalProjectBuilder
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
public class InheritanceOverridingProject extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	static final String MELANGE_FILE =
		"InheritanceOverridingProject/src/inheritanceoverriding/InheritanceOverridingTest.melange"

	@Before
	override setUp() {
		super.setUp
		helper.init
		val project = helper.deployMelangeProject("InheritanceOverridingProject",
			"tests-inputs/InheritanceOverridingProject.zip")
		IResourcesSetupUtil::waitForAutoBuild
		ResourcesPlugin::workspace.root.refreshLocal(IResource::DEPTH_INFINITE, null)
		project.build(IncrementalProjectBuilder::CLEAN_BUILD, null)
		IResourcesSetupUtil::waitForAutoBuild
		helper.openEditor(MELANGE_FILE)
	}

	@Test
	def void testNoErrorsInWorkspace() {
		println("testNoErrorsInWorkspace")
		helper.assertFileExists(MELANGE_FILE)
		helper.generateAll(MELANGE_FILE)
		IResourcesSetupUtil::waitForAutoBuild
		ResourcesPlugin::workspace.root.refreshLocal(IResource::DEPTH_INFINITE, null)
		helper.generateAdapters(MELANGE_FILE)
		IResourcesSetupUtil::waitForAutoBuild
		ResourcesPlugin::workspace.root.refreshLocal(IResource::DEPTH_INFINITE, null)
		helper.assertNoMarkers
		println("testNoErrorsInWorkspace : DONE")
	}

//	@Test
//	def void testAdaterAdaptersGeneration() {
//		println("testAdaterAdaptersGeneration")
//		helper.assertFileExists(MELANGE_FILE)
//		helper.generateAdapters(MELANGE_FILE)
//		helper.assertNoMarkers
//		helper.assertFileExists("InheritanceOverridingProject/src-gen/inheritanceoverriding/AMT.java")
//		println("testAdaterAdaptersGeneration : DONE")
//	}
}
