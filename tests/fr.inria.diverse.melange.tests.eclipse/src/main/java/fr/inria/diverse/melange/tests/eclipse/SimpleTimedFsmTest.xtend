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
public class SimpleTimedFsmTest extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	IProject melangeProject
	static final String PROJECT_NAME = "fr.inria.diverse.melange.tests.simplefsm.main"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/fr/inria/diverse/melange/tests/simplefsm/main.melange"
	
	@Before
	override setUp() {
		helper.setTargetPlatform
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			helper.deployMelangeProject("fr.inria.diverse.melange.tests.aspects.model","tests-inputs/fr.inria.diverse.melange.tests.aspects.model.zip")
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.tests.simplefsm.main.zip")
			
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
		helper.assertProjectExists("fr.inria.diverse.melange.tests.simplefsm.fsm")
		helper.assertProjectExists("fr.inria.diverse.melange.tests.simplefsm.timedfsm")
	}
	
	@Test
	def void test1Generation() {
		
		val SRC_GEN = "src-gen"
		val MELANGE_PKG = "fr/inria/diverse/melange/tests/simplefsm"
		val BASE_PKG ='''«PROJECT_NAME»/«SRC_GEN»/«MELANGE_PKG»'''
		val ADAPTER_PKG1 = "fsm/adapters/fsmmt"
		val ADAPTER_PKG2 = "timedfsm/adapters/fsmmt"
		val ADAPTER_PKG3 = "timedfsm/adapters/timedfsmmt"
		
	// Main package
		// StandaloneSetup
		helper.assertFileExists('''«BASE_PKG»/StandaloneSetup.java''')
		//Transfo
		helper.assertFileExists('''«BASE_PKG»/getRoot.java''')
		helper.assertFileExists('''«BASE_PKG»/loadFsm.java''')
		helper.assertFileExists('''«BASE_PKG»/loadTFsm.java''')
		helper.assertFileExists('''«BASE_PKG»/test.java''')
		//Languages
		helper.assertFileExists('''«BASE_PKG»/Fsm.java''')
		helper.assertFileExists('''«BASE_PKG»/TimedFsm.java''')
		//ModelTypes
		helper.assertFileExists('''«BASE_PKG»/FsmMT.java''')
		helper.assertFileExists('''«BASE_PKG»/TimedFsmMT.java''')
		
	// SubPackagesTest.adapters.SubPackagesTestMT package
		// LanguageAdapter, MTFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG1»/FsmAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG1»/FsmMTAdaptersFactory.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/TimedFsmAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/FsmMTAdaptersFactory.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/TimedFsmAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/TimedFsmMTAdaptersFactory.java''')
		// AdapterFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG1»/fsm/FsmFactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/FsmFactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/FsmFactoryAdapter.java''')
		// Adapters
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG1»/fsm/FSMAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG1»/fsm/StateAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG1»/fsm/TransitionAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/FSMAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/StateAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG2»/fsm/TransitionAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/FSMAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/StateAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG3»/fsm/TransitionAdapter.java''')
	}
	
	@Test
	def void test2Parsing() {
		helper.assertNoMarkers(MELANGE_FILE)
	}
}