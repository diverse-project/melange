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
import org.eclipse.jdt.core.JavaCore

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
	
	@Test
	def void test2Parsing() {
		helper.assertNoMarkers(MELANGE_FILE)
	}
	
	@Test
	def void test3Runtime() {
		val javaProject = JavaCore.create(melangeProject)
		val classLoader = helper.createClassLoader(javaProject)
		
		//Load classes
		val StandaloneSetup = classLoader.loadClass("fr.inria.diverse.melange.test.subpackages.StandaloneSetup")
		val loadTopPkg = classLoader.loadClass("fr.inria.diverse.melange.test.subpackages.loadTopPkg")
		val loadSubPkg2 = classLoader.loadClass("fr.inria.diverse.melange.test.subpackages.loadSubPkg2")
		val loadSubPkg3 = classLoader.loadClass("fr.inria.diverse.melange.test.subpackages.loadSubPkg3")
		val adapterName = classLoader.loadClass("fr.inria.diverse.melange.test.subpackages.adapterName")
		val SubPackagesTestMT = classLoader.loadClass("fr.inria.diverse.melange.test.subpackages.SubPackagesTestMT")
		
		
		//Call methods
		StandaloneSetup.getMethod("doSetup", null)?.invoke(null, null)
		
		val m1 = loadTopPkg.getMethod("call", null)?.invoke(null, null)
		val m2 = loadSubPkg2.getMethod("call", null)?.invoke(null, null)
		val m3 = loadSubPkg3.getMethod("call", null)?.invoke(null, null)
		
		val call1 = adapterName.getMethod("call", #[SubPackagesTestMT])?.invoke(null, #[m1]) as String
		val call2 = adapterName.getMethod("call", #[SubPackagesTestMT])?.invoke(null, #[m2]) as String
		val call3 = adapterName.getMethod("call", #[SubPackagesTestMT])?.invoke(null, #[m3]) as String 
		
		assertTrue(call1.contains("TopClass1Adapter"))
		assertTrue(call2.contains("Subpkg2Class1Adapter"))
		assertTrue(call3.contains("Subpkg3Class1Adapter"))
	}
}