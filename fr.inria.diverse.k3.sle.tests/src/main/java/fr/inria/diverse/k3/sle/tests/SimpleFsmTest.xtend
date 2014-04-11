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
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/k3sle/SimpleFsmTest.k3sle")
class SimpleFsmTest
{
	@Inject extension K3SLETestHelper
	@Inject IGenerator generator

	@Test
	def testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "simplefsmtest")
		assertNotNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Metamodel)
		assertTrue(root.elements.get(1) instanceof Metamodel)
		assertTrue(root.elements.get(2) instanceof Transformation)
		assertTrue(root.elements.get(3) instanceof Transformation)
		assertTrue(root.elements.get(4) instanceof Transformation)
		assertTrue(root.elements.get(5) instanceof Transformation)
		assertTrue(root.elements.get(6) instanceof ModelType)
		assertTrue(root.elements.get(7) instanceof ModelType)

		assertEquals(fsm.name,      "Fsm")
		assertEquals(tfsm.name,     "TimedFsm")
		assertEquals(fsmmt.name,    "FsmMT")
		assertEquals(tfsmmt.name,   "TimedFsmMT")
		assertEquals(getRoot.name,  "getRoot")
		assertEquals(loadFsm.name,  "loadFsm")
		assertEquals(loadTfsm.name, "loadTFsm")
		assertEquals(test.name,     "test")
	}

	@Test
	def testRelations() {
		assertEquals(fsmmt.extracted, fsm)
		assertEquals(tfsmmt.extracted, tfsm)
		assertEquals(fsm.exactType, fsmmt)
		assertEquals(tfsm.exactType, tfsmmt)
	}

	@Test
	def testImplements() {
		assertEquals(fsm.^implements.size, 1)
		assertEquals(tfsm.^implements.size, 2)

		assertTrue(fsm.^implements.contains(fsmmt))
		assertTrue(tfsm.^implements.contains(fsmmt))
		assertTrue(tfsm.^implements.contains(tfsmmt))
	}

	@Test
	def testInheritance() {
		assertNull(fsm.inheritanceRelation)
		assertNull(tfsm.inheritanceRelation)
	}

	@Test
	def testSubtyping() {
		assertEquals(fsmmt.subtypingRelations.size, 0)
		assertEquals(tfsmmt.subtypingRelations.size, 1)

		assertEquals(tfsmmt.subtypingRelations.head.subType, tfsmmt)
		assertEquals(tfsmmt.subtypingRelations.head.superType, fsmmt)
	}

	@Test
	def testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 31)

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
				typeof(fsm.FSM),
				typeof(fsm.State),
				typeof(fsm.Transition),
				timedfsm.FSM,
				timedfsm.State,
				timedfsm.Transition,
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
				initialize("simplefsmtest.test")

				assertNotNull(invokeTransfo("simplefsmtest.loadFsm"))
				assertNotNull(invokeTransfo("simplefsmtest.loadTFsm"))
			]
		} catch (Exception e) {
			e.printStackTrace
			fail(e.message)
		}
	}

	def getFsm()      { root.elements.get(0) as Metamodel }
	def getTfsm()     { root.elements.get(1) as Metamodel }
	def getGetRoot()  { root.elements.get(2) as Transformation }
	def getLoadFsm()  { root.elements.get(3) as Transformation }
	def getLoadTfsm() { root.elements.get(4) as Transformation }
	def getTest()     { root.elements.get(5) as Transformation }
	def getFsmmt()    { root.elements.get(6) as ModelType }
	def getTfsmmt()   { root.elements.get(7) as ModelType }
}
