package fr.inria.diverse.k3.sle.tests

import fr.inria.diverse.k3.sle.K3SLEInjectorProvider

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

import com.google.inject.Inject

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(K3SLEInjectorProvider)
class SimpleFsmTest
{
	@Inject extension ParseHelper<ModelTypingSpace>
	@Inject extension ValidationTestHelper
	@Inject IGenerator generator

	ModelTypingSpace root

	@Before
	def void setUp() {
		root = '''
		package simplefsmtest

		import static extension fr.inria.diverse.k3.sle.lib.MetamodelExtensions.*

		metamodel Fsm {
			ecore "tests-inputs/metamodels/FSM.ecore" withGenmodel "tests-inputs/metamodels/FSM.genmodel"
			exactType FsmMT
		}

		metamodel TimedFsm {
			ecore "tests-inputs/metamodels/TimedFSM.ecore" withGenmodel "tests-inputs/metamodels/TimedFSM.genmodel"
			exactType TimedFsmMT
		}

		transformation bar(FsmMT m) {

		}

		transformation baz(TimedFsmMT m) {

		}

		@Main
		transformation main() {
			val fsm   =      Fsm.load("Simple.fsm",      FsmMT)
			val tfsm  = TimedFsm.load("Simple.timedfsm", FsmMT)
			val tfsm2 = TimedFsm.load("Simple.timedfsm", TimedFsmMT)

			bar.call(fsm)
			bar.call(tfsm)
			baz.call(tfsm2)
		}
		'''.parse
	}

	@Test
	def testParsing() {
		root.assertNoErrors
	}

	@Test
	def testStructure() {
		assertEquals(root.name, "simplefsmtest")
		assertNotNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Metamodel)
		assertTrue(root.elements.get(1) instanceof Metamodel)
		assertTrue(root.elements.get(2) instanceof Transformation)
		assertTrue(root.elements.get(3) instanceof Transformation)
		assertTrue(root.elements.get(4) instanceof Transformation)
		assertTrue(root.elements.get(5) instanceof ModelType)
		assertTrue(root.elements.get(6) instanceof ModelType)

		assertEquals(fsm.name,    "Fsm")
		assertEquals(tfsm.name,   "TimedFsm")
		assertEquals(fsmmt.name,  "FsmMT")
		assertEquals(tfsmmt.name, "TimedFsmMT")
		assertEquals(bar.name,    "bar")
		assertEquals(baz.name,    "baz")
		assertEquals(main.name,   "main")
	}

	@Test
	def testRelations() {
		// No exact type ATM
		assertEquals(fsmmt.extracted,  fsm)
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

		assertEquals(fsa.textFiles.size, 30)

		// Check for generation bug that
		// replaces (valid) generic types with objects
		fsa.textFiles.forEach[filename, content |
			assertFalse(content.toString.contains('''*/Object'''))
		]
	}

	def getFsm()    { root.elements.get(0) as Metamodel }
	def getTfsm()   { root.elements.get(1) as Metamodel }
	def getBar()    { root.elements.get(2) as Transformation }
	def getBaz()    { root.elements.get(3) as Transformation }
	def getMain()   { root.elements.get(4) as Transformation }
	def getFsmmt()  { root.elements.get(5) as ModelType }
	def getTfsmmt() { root.elements.get(6) as ModelType }
}
