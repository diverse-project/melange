package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.EListAdapter
import fr.inria.diverse.melange.adapters.GenericAdapter
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.resource.MelangeRegistry
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import toppkg.TopClass1

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/SubPackagesTest.melange", withValidation = false)
class SubPackagesTest
{
	@Inject extension MelangeTestHelper
	@Inject IGenerator generator

//	@Test
//	def void testGeneration() {
//		val fsa = new InMemoryFileSystemAccess
//		generator.doGenerate(root.eResource, fsa)
//
//		assertEquals(expectedNumberOfFiles, fsa.textFiles.size)
//	}
//	
//	def int expectedNumberOfFiles(){
//		// Main package
//		1 		// StandaloneSetup
//		+ 5 	// Number of transfo
//		+ 1 	// Number of Language
//		+ 1 	// Number of ModelTypes
//		
//		// SubPackagesTest.adapters.SubPackagesTestMT package
//		+ 2		// LanguageAdapter, MTFactory
//		+ 4		// AdapterFactory (one by package)
//		+ 8		// Adapters (for each class in MT) 
//	}

//	@Test
//	def void testRuntime() {
//		try {
//			// Consider moving these runtime dependencies somewhere else
//			setJavaCompilerClassPath(
//				typeof(TopClass1),
//				MelangeRegistry,
//				IModelType,
//				GenericAdapter,
//				EListAdapter,
//				Resource,
//				EList,
//				Exceptions,
//				XMIResourceFactoryImpl
//			)
//			inputSequence.compile[
//				initialize("subpackagestest.test")
//
//				val m1 = invokeTransfo("subpackagestest.loadTopPkg")
//				val m2 = invokeTransfo("subpackagestest.loadSubPkg2")
//				val m3 = invokeTransfo("subpackagestest.loadSubPkg3")
//
//				assertNotNull(m1)
//				assertNotNull(m2)
//				assertNotNull(m3)
//
//				val String a1 = invokeTransfo("subpackagestest.adapterName", #["subpackagestest.SubPackagesTestMT"], #[m1])
//				val String a2 = invokeTransfo("subpackagestest.adapterName", #["subpackagestest.SubPackagesTestMT"], #[m2])
//				val String a3 = invokeTransfo("subpackagestest.adapterName", #["subpackagestest.SubPackagesTestMT"], #[m3])
//
//				assertTrue(a1.contains("TopClass1Adapter"))
//				assertTrue(a2.contains("Subpkg2Class1Adapter"))
//				assertTrue(a3.contains("Subpkg3Class1Adapter"))
//			]
//		} catch (Exception e) {
//			e.printStackTrace
//			fail(e.message)
//		}
//	}
}
