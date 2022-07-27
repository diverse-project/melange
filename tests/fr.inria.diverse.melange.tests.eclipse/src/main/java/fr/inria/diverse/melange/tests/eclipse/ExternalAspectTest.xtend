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
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.junit4.AbstractXtextTests
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.ui.testing.util.IResourcesSetupUtil
import org.junit.After
import org.junit.Before
import org.junit.FixMethodOrder
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class ExternalAspectTest extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	IProject melangeProject
	static final String PROJECT_NAME = "fr.inria.diverse.melange.tests.extern.aspects.main"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/fr/inria/diverse/melange/tests/extern/aspects/main/Main.melange"
	
	@Before
	override setUp() {
		helper.setTargetPlatform
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.extern.aspects.model","tests-inputs/fr.inria.diverse.melange.tests.extern.aspects.model.zip")
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.extern.aspects.aspect","tests-inputs/fr.inria.diverse.melange.tests.extern.aspects.aspect.zip")
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.tests.extern.aspects.main.zip")
			
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
		helper.assertProjectExists("fr.inria.diverse.melange.tests.extern.aspects.main.xfsm")
		helper.assertProjectDoesntExists("fr.inria.diverse.melange.tests.extern.aspects.main.fsm")
	}
	
	@Test
	def void test1Generation() {
		
		val SRC_GEN = "src-gen"
		val MODEL_GEN = "model-gen"
		val MELANGE_PKG = "fr/inria/diverse/melange/tests/extern/aspects/main"
		val BASE_PKG ='''«PROJECT_NAME»/«SRC_GEN»/«MELANGE_PKG»'''
		val ADAPTER_PKG1 = "fsm/adapters/fsmmt"
		val ADAPTER_PKG2 = "xfsm/adapters/fsmmt"
		val ADAPTER_PKG3 = "xfsm/adapters/xfsmmt"
		
	// Main package
		// StandaloneSetup
		helper.assertFileExists('''«BASE_PKG»/StandaloneSetup.java''')
		//Languages
		helper.assertFileExists('''«BASE_PKG»/Fsm.java''')
		helper.assertFileExists('''«BASE_PKG»/Xfsm.java''')
		//ModelTypes
		helper.assertFileExists('''«BASE_PKG»/FsmMT.java''')
		helper.assertFileExists('''«BASE_PKG»/XfsmMT.java''')
		
	// adapters
		helper.assertFileDontExists('''«BASE_PKG»/«ADAPTER_PKG1»''')
		// LanguageAdapter, MTFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/XfsmAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/FsmMTAdaptersFactory.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/XfsmAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/XfsmMTAdaptersFactory.java''')
		// AdapterFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/FsmFactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/FsmFactoryAdapter.java''')
		// Adapters
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/FSMAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/StateAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/TransitionAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/FSMAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/StateAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/TransitionAdapter.java''')
		
	// model-gen
		helper.assertFileDontExists('''«PROJECT_NAME»/«MODEL_GEN»/FsmMT.ecore''')
		helper.assertFileDontExists('''«PROJECT_NAME»/«MODEL_GEN»/FsmMT.genmodel''')
		helper.assertFileExists('''«PROJECT_NAME»/«MODEL_GEN»/XfsmMT.ecore''')
		helper.assertFileExists('''«PROJECT_NAME»/«MODEL_GEN»/XfsmMT.genmodel''')
	}
	
	@Test
	def void test2Parsing() {
		helper.assertNoMarkers(MELANGE_FILE)
	}
}