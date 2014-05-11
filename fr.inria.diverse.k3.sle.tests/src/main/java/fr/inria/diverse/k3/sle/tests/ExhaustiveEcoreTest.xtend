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
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/k3sle/ExhaustiveEcoreTest.k3sle")
class ExhaustiveEcoreTest
{
	@Inject extension K3SLETestHelper
	@Inject IGenerator generator

	@Test
	def testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "exhaustiveecoretest")
		assertNotNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Metamodel)
		assertTrue(root.elements.get(1) instanceof Metamodel)
		assertTrue(root.elements.get(2) instanceof Transformation)
		assertTrue(root.elements.get(3) instanceof ModelType)
		assertTrue(root.elements.get(4) instanceof ModelType)

		assertEquals(exhaustive.name,    "Exhaustive")
		assertEquals(exhaustive2.name,   "Exhaustive2")
		assertEquals(test.name,          "test")
		assertEquals(exhaustiveMt.name,  "ExhaustiveMT")
		assertEquals(exhaustive2Mt.name, "Exhaustive2MT")
	}

	@Test
	def testRelations() {
		assertEquals(exhaustive.exactType,    exhaustiveMt)
		assertEquals(exhaustive2.exactType,   exhaustive2Mt)
		assertEquals(exhaustiveMt.extracted,  exhaustive)
		assertEquals(exhaustive2Mt.extracted, exhaustive2)
	}

	@Test
	def testImplements() {
		assertEquals(exhaustive.^implements.size, 2)
		assertTrue(exhaustive.^implements.contains(exhaustiveMt))
		assertTrue(exhaustive.^implements.contains(exhaustive2Mt))

		assertEquals(exhaustive2.^implements.size, 2)
		assertTrue(exhaustive2.^implements.contains(exhaustiveMt))
		assertTrue(exhaustive2.^implements.contains(exhaustive2Mt))
	}

	@Test
	def testInheritance() {
		assertNull(exhaustive.inheritanceRelation)
		assertNull(exhaustive2.inheritanceRelation)
	}

	@Test
	def testSubtyping() {
		assertEquals(exhaustiveMt.subtypingRelations.size, 1)
		assertTrue(exhaustiveMt.subtypingRelations.map[superType].contains(exhaustive2Mt))

		assertEquals(exhaustive2Mt.subtypingRelations.size, 1)
		assertTrue(exhaustive2Mt.subtypingRelations.map[superType].contains(exhaustiveMt))
	}

	@Test
	def testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 63)

		// Check for generation bug that
		// replaces (valid) generic types with Objects
		fsa.textFiles.forEach[filename, content |
			assertFalse(content.toString.contains('''*/'''))
		]
	}

	// Won't compile until generics are implented
	@Test
	def testRuntime() {
		try {
			// Consider moving these runtime dependencies somewhere else
			setJavaCompilerClassPath(
				typeof(exhaustive.AbstractTest),
				typeof(exhaustive.AttributesTest),
				typeof(exhaustive.GenericChildTest),
				typeof(exhaustive.GenericTest),
				typeof(exhaustive.InterfaceTest),
				typeof(exhaustive.MultipleSuperTest),
				typeof(exhaustive.OperationsTest),
				typeof(exhaustive.ReferencesTest),
				typeof(exhaustive.SerializableEnumTest),
				typeof(exhaustive.UnserializableEnumTest),
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
				initialize("exhaustiveecoretest.test")
			]
		} catch (Exception e) {
			e.printStackTrace
			fail(e.message)
		}
	}

	def getExhaustive()    { root.elements.get(0) as Metamodel }
	def getExhaustive2()   { root.elements.get(1) as Metamodel }
	def getTest()          { root.elements.get(2) as Transformation }
	def getExhaustiveMt()  { root.elements.get(3) as ModelType }
	def getExhaustive2Mt() { root.elements.get(4) as ModelType }
}
