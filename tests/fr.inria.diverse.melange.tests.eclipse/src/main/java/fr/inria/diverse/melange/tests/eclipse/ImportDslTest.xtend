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
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class ImportDslTest extends AbstractXtextTests
{
	
	@Inject WorkspaceTestHelper helper
	IProject melangeProject
	static final String PROJECT_NAME = "fr.inria.diverse.melange.tests.importdsl.main"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/fr/inria/diverse/melange/tests/importdsl/main/Main.melange"


	@Before
	override setUp() {
		helper.setTargetPlatform
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.aspects.model","tests-inputs/fr.inria.diverse.melange.tests.aspects.model.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.aspects.aspect","tests-inputs/fr.inria.diverse.melange.tests.aspects.aspect.zip")
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.tests.importdsl.main.zip")
			
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
	}
	
	@Test
	def void test1Generation() {
		val SRC_GEN = "src-gen"
		val MELANGE_PKG = "fr/inria/diverse/melange/tests/importdsl/main"
		val BASE_PKG ='''«PROJECT_NAME»/«SRC_GEN»/«MELANGE_PKG»'''
		val FSM_PKG = '''«PROJECT_NAME»/«SRC_GEN»/fr/inria/diverse/melange/tests'''
		val ADAPTER_PKG1 = "fsm/adapters/fsmmt"
		
	// Main package
		// StandaloneSetup
		helper.assertFileExists('''«BASE_PKG»/StandaloneSetup.java''')
		//Languages
		helper.assertFileExists('''«FSM_PKG»/FSM.java''')
		//ModelTypes
		helper.assertFileExists('''«FSM_PKG»/FSMMT.java''')
		
	// FSM.adapters.FSMMT package
		// LanguageAdapter, MTFactory
		helper.assertFileExists('''«FSM_PKG»/«ADAPTER_PKG1»/FSMAdapter.java''')
		helper.assertFileExists('''«FSM_PKG»/«ADAPTER_PKG1»/FSMMTAdaptersFactory.java''')
		// AdapterFactory
		helper.assertFileExists('''«FSM_PKG»/«ADAPTER_PKG1»/fsm/FsmFactoryAdapter.java''')
		// Adapters
		helper.assertFileExists('''«FSM_PKG»/«ADAPTER_PKG1»/fsm/FSMAdapter.java''')
		helper.assertFileExists('''«FSM_PKG»/«ADAPTER_PKG1»/fsm/StateAdapter.java''')
		helper.assertFileExists('''«FSM_PKG»/«ADAPTER_PKG1»/fsm/TransitionAdapter.java''')
	}
	
	@Test
	def void test2Parsing() {
		helper.assertNoMarkers(MELANGE_FILE)
	}
	
}