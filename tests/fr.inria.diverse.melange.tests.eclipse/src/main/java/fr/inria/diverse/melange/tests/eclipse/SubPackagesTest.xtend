package fr.inria.diverse.melange.tests.eclipse

import org.eclipse.xtext.junit4.AbstractXtextTests
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import fr.inria.diverse.melange.MelangeUiInjectorProvider
import org.junit.FixMethodOrder
import org.junit.runners.MethodSorters
import com.google.inject.Inject
import fr.inria.diverse.melange.tests.eclipse.shared.WorkspaceTestHelper
import org.junit.Before
import org.junit.After
import org.eclipse.xtext.junit4.ui.util.IResourcesSetupUtil
import org.eclipse.core.resources.IProject
import org.junit.Test

@RunWith(XtextRunner)
@InjectWith(MelangeUiInjectorProvider)
@FixMethodOrder(MethodSorters::NAME_ASCENDING)
public class SubPackagesTest extends AbstractXtextTests
{
	@Inject WorkspaceTestHelper helper
	IProject melangeProject
	static final String PROJECT_NAME = "fr.inria.diverse.melange.test.subpackages.main"
	static final String MELANGE_FILE = PROJECT_NAME+"/src/fr/inria/diverse/melange/test/subpackages/main.melange"
	
	@Before
	override setUp() {
		helper.setTargetPlatform
		if (!helper.projectExists(PROJECT_NAME)) {
			super.setUp
			helper.init
			IResourcesSetupUtil::cleanWorkspace
			
			melangeProject = helper.deployMelangeProject(PROJECT_NAME,"tests-inputs/fr.inria.diverse.melange.test.subpackages.main.zip")
			
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
		helper.assertProjectExists("fr.inria.diverse.melange.test.subpackages.subpackagestest")
	}
	
	@Test
	def void test1Generation() {
		
		val SRC_GEN = "src-gen"
		val MELANGE_PKG = "fr/inria/diverse/melange/test/subpackages"
		val BASE_PKG ='''«PROJECT_NAME»/«SRC_GEN»/«MELANGE_PKG»'''
		val ADAPTER_PKG = "subpackagestest/adapters/subpackagestestmt"
		
	// Main package
		// StandaloneSetup
		helper.assertFileExists('''«BASE_PKG»/StandaloneSetup.java''')
		//Transfo
		helper.assertFileExists('''«BASE_PKG»/adapterName.java''')
		helper.assertFileExists('''«BASE_PKG»/loadTopPkg.java''')
		helper.assertFileExists('''«BASE_PKG»/loadSubPkg2.java''')
		helper.assertFileExists('''«BASE_PKG»/loadSubPkg3.java''')
		helper.assertFileExists('''«BASE_PKG»/test.java''')
		//Languages
		helper.assertFileExists('''«BASE_PKG»/SubPackagesTest.java''')
		//ModelTypes
		helper.assertFileExists('''«BASE_PKG»/SubPackagesTestMT.java''')
		
	// SubPackagesTest.adapters.SubPackagesTestMT package
		// LanguageAdapter, MTFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/SubPackagesTestAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/SubPackagesTestMTAdaptersFactory.java''')
		// AdapterFactory
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/ToppkgFactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg1/Subpkg1FactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg2/Subpkg2FactoryAdapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg2/subpkg3/Subpkg3FactoryAdapter.java''')
		// Adapters
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/TopClass1Adapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/TopClass2Adapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg1/Subpkg1Class1Adapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg1/Subpkg1Class2Adapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg2/Subpkg2Class1Adapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg2/Subpkg2Class2Adapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg2/subpkg3/Subpkg3Class1Adapter.java''')
		helper.assertFileExists('''«BASE_PKG»/«ADAPTER_PKG»/toppkg/subpkg2/subpkg3/Subpkg3Class2Adapter.java''')
	}
}