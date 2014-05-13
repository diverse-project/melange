package fr.inria.diverse.k3.sle.tests

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace

import fr.inria.diverse.k3.sle.tests.common.K3SLETestHelper
import fr.inria.diverse.k3.sle.tests.common.K3SLETestsInjectorProvider

import fr.inria.diverse.k3.tools.xtext.testing.XtextTest

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Test
import org.junit.runner.RunWith

import com.google.inject.Inject

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(K3SLETestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/k3sle/SubPackagesTest.k3sle")
class SubPackagesTest
{
	@Inject extension K3SLETestHelper
	@Inject IGenerator generator

	@Test
	def testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 26)

		// Check for generation bug that
		// replaces (valid) generic types with Objects
		fsa.textFiles.forEach[filename, content |
			assertFalse(content.toString.contains('''*/'''))
		]
	}

	@Test
	def testRuntime() {
		try {
			// Consider moving these runtime dependencies somewhere else
			setJavaCompilerClassPath(
				typeof(toppkg.TopClass1),
				typeof(toppkg.TopClass2),
				typeof(toppkg.subpkg1.Subpkg1Class1),
				typeof(toppkg.subpkg1.Subpkg1Class2),
				typeof(toppkg.subpkg2.Subpkg2Class1),
				typeof(toppkg.subpkg2.Subpkg2Class2),
				typeof(toppkg.subpkg2.subpkg3.Subpkg3Class1),
				typeof(toppkg.subpkg2.subpkg3.Subpkg3Class2),
				fr.inria.diverse.k3.sle.lib.IModelType,
				fr.inria.diverse.k3.sle.lib.GenericAdapter,
				fr.inria.diverse.k3.sle.lib.ListAdapter,
				org.eclipse.emf.ecore.resource.Resource,
				org.eclipse.emf.ecore.EObject,
				org.eclipse.emf.common.util.EList,
				org.eclipse.xtext.xbase.lib.Exceptions,
				org.eclipse.xtext.xbase.lib.IterableExtensions,
				org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
			)
			inputSequence.compile[
				initialize("subpackagestest.test")

				val m1 = invokeTransfo("subpackagestest.loadTopPkg")
				val m2 = invokeTransfo("subpackagestest.loadSubPkg2")
				val m3 = invokeTransfo("subpackagestest.loadSubPkg3")

				assertNotNull(m1)
				assertNotNull(m2)
				assertNotNull(m3)

				val String a1 = invokeTransfo("subpackagestest.adapterName", #["subpackagestest.SubPackagesTestMT"], #[m1])
				val String a2 = invokeTransfo("subpackagestest.adapterName", #["subpackagestest.SubPackagesTestMT"], #[m2])
				val String a3 = invokeTransfo("subpackagestest.adapterName", #["subpackagestest.SubPackagesTestMT"], #[m3])

				assertTrue(a1.contains("TopClass1Adapter"))
				assertTrue(a2.contains("Subpkg2Class1Adapter"))
				assertTrue(a3.contains("Subpkg3Class1Adapter"))
			]
		} catch (Exception e) {
			e.printStackTrace
			fail(e.message)
		}
	}
}
