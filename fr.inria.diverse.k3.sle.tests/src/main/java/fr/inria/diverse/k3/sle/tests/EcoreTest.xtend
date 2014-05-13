package fr.inria.diverse.k3.sle.tests

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

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
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/k3sle/EcoreTest.k3sle")
class EcoreTest
{
	@Inject extension K3SLETestHelper
	@Inject IGenerator generator

	@Test
	def testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "ecoretest")
		assertNotNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Metamodel)
		assertTrue(root.elements.get(1) instanceof Transformation)
		assertTrue(root.elements.get(2) instanceof Transformation)
		assertTrue(root.elements.get(3) instanceof Transformation)
		assertTrue(root.elements.get(4) instanceof ModelType)

		assertEquals(ecore.name,           "Ecore")
		assertEquals(ecoreMt.name,         "EcoreMT")
		assertEquals(testClassifiers.name, "testListClassifiersCount")
		assertEquals(loadEcore.name,       "loadEcore")
		assertEquals(test.name,            "test")
	}

	@Test
	def testRelations() {
		assertEquals(ecoreMt.extracted, ecore)
		assertEquals(ecore.exactType, ecoreMt)
	}

	@Test
	def testImplements() {
		assertEquals(ecore.^implements.size, 1)
		assertTrue(ecore.^implements.contains(ecoreMt))
	}

	@Test
	def testInheritance() {
		assertNull(ecore.inheritanceRelation)
	}

	@Test
	def testSubtyping() {
		assertEquals(ecoreMt.subtypingRelations.size, 0)
	}

	@Test
	def testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 46)

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
				initialize("ecoretest.test")

				val m = invokeTransfo("ecoretest.loadEcore")
				assertNotNull(m)

				val int i = invokeTransfo("ecoretest.testListClassifiersCount", #["ecoretest.EcoreMT"], #[m])

				assertEquals(i, 3)
			]
		} catch (Exception e) {
			e.printStackTrace
			fail(e.message)
		}
	}

	def getEcore()           { root.elements.get(0) as Metamodel }
	def getTestClassifiers() { root.elements.get(1) as Transformation }
	def getLoadEcore()       { root.elements.get(2) as Transformation }
	def getTest()            { root.elements.get(3) as Transformation }
	def getEcoreMt()         { root.elements.get(4) as ModelType }
}
