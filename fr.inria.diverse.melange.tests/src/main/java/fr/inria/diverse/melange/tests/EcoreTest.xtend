package fr.inria.diverse.melange.tests

import com.google.inject.Inject

import fr.inria.diverse.melange.lib.GenericAdapter
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.lib.ListAdapter

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Transformation

import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider

import fr.inria.diverse.k3.tools.xtext.testing.XtextTest

import org.eclipse.emf.common.util.EList

import org.eclipse.emf.ecore.EObject

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Test

import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/EcoreTest.melange")
class EcoreTest
{
	@Inject extension MelangeTestHelper
	@Inject IGenerator generator

	@Test
	def void testStructure() {
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
	def void testRelations() {
		assertEquals(ecoreMt.extracted, ecore)
		assertEquals(ecore.exactType, ecoreMt)
	}

	@Test
	def void testImplements() {
		assertEquals(ecore.^implements.size, 1)
		assertTrue(ecore.^implements.contains(ecoreMt))
	}

	@Test
	def void testInheritance() {
		assertNull(ecore.inheritanceRelation)
	}

	@Test
	def void testSubtyping() {
		assertEquals(ecoreMt.subtypingRelations.size, 0)
	}

	@Test
	def void testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 42)
	}

	@Test
	def void testRuntime() {
		try {
			// Consider moving these runtime dependencies somewhere else
			setJavaCompilerClassPath(
				IModelType,
				GenericAdapter,
				ListAdapter,
				Resource,
				EObject,
				EList,
				Exceptions,
				IterableExtensions,
				XMIResourceFactoryImpl
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

	def Metamodel getEcore()                { return root.elements.get(0) as Metamodel }
	def Transformation getTestClassifiers() { return root.elements.get(1) as Transformation }
	def Transformation getLoadEcore()       { return root.elements.get(2) as Transformation }
	def Transformation getTest()            { return root.elements.get(3) as Transformation }
	def ModelType getEcoreMt()              { return root.elements.get(4) as ModelType }
}
