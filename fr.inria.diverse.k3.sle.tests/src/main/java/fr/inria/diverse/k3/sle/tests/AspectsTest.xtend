package fr.inria.diverse.k3.sle.tests

import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelTypingSpace
import fr.inria.diverse.k3.sle.metamodel.k3sle.Metamodel
import fr.inria.diverse.k3.sle.metamodel.k3sle.ModelType
import fr.inria.diverse.k3.sle.metamodel.k3sle.Transformation

import fr.inria.diverse.k3.sle.tests.common.K3SLETestHelper
import fr.inria.diverse.k3.sle.tests.common.K3SLETestsInjectorProvider

import fr.inria.diverse.k3.tools.xtext.testing.XtextTest

import org.eclipse.emf.ecore.EClass

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Test
import org.junit.runner.RunWith

import com.google.inject.Inject

import static org.junit.Assert.*

import fsm.FsmPackage
import timedfsm.TimedfsmPackage

@RunWith(XtextRunner)
@InjectWith(K3SLETestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/k3sle/AspectsTest.k3sle", withValidation = true)
class AspectsTest
{
	@Inject extension K3SLETestHelper
	@Inject IGenerator generator

	@Test
	def testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "aspectstest")
		assertNotNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Metamodel)
		assertTrue(root.elements.get(1) instanceof Metamodel)
		assertTrue(root.elements.get(2) instanceof Metamodel)
		assertTrue(root.elements.get(3) instanceof Transformation)
		assertTrue(root.elements.get(4) instanceof Transformation)
		assertTrue(root.elements.get(5) instanceof Transformation)
		assertTrue(root.elements.get(6) instanceof Transformation)
		assertTrue(root.elements.get(7) instanceof Transformation)
		assertTrue(root.elements.get(8) instanceof ModelType)
		assertTrue(root.elements.get(9) instanceof ModelType)

		assertEquals(fsm.name,      "Fsm")
		assertEquals(fsmMt.name,    "FsmMT")
		assertEquals(tfsm.name,     "TimedFsm")
		assertEquals(tfsmMt.name,   "TimedFsmMT")
		assertEquals(ifsm.name,     "IncompatibleFsm")
		assertEquals(ifsmMt.name,   "IncompatibleFsmMT")
		assertEquals(callFoo.name,  "callFoo")
		assertEquals(callBar.name,  "callBar")
		assertEquals(loadFsm.name,  "loadFsm")
		assertEquals(loadTfsm.name, "loadTfsm")
		assertEquals(test.name,     "test")
		assertTrue(test.main)
	}

	@Test
	def testAspectsImportFsm() {
		val fsmAspect = fsm.aspects.head

		assertNotNull(fsmAspect)
		assertEquals(fsm.aspects.size, 1)
		assertEquals(fsmAspect.aspectedClass.name, FsmPackage.eINSTANCE.getState.name)
		assertNotNull(fsmAspect.aspectRef)
		assertEquals(fsmAspect.aspectRef.type.simpleName, "StateAspect1")
	}

	@Test
	def testAspectsImportTfsm() {
		val tfsmAspect = tfsm.aspects.head

		assertNotNull(tfsmAspect)
		assertEquals(tfsm.aspects.size, 1)
		assertEquals(tfsmAspect.aspectedClass.name, TimedfsmPackage.eINSTANCE.getState.name)
		assertNotNull(tfsmAspect.aspectRef)
		assertEquals(tfsmAspect.aspectRef.type.simpleName, "StateAspect2")
	}

	@Test
	def testAspectsImportIfsm() {
		val ifsmAspect = ifsm.aspects.head

		assertNotNull(ifsmAspect)
		assertEquals(ifsm.aspects.size, 1)
		assertEquals(ifsmAspect.aspectedClass.name, FsmPackage.eINSTANCE.getState.name)
		assertNotNull(ifsmAspect.aspectRef)
		assertEquals(ifsmAspect.aspectRef.type.simpleName, "StateAspect3")
	}

	@Test
	def testEmfWeavingFsm() {
		val fsmPkg = root.mm("Fsm").pkgs.head
		val stateCls = fsmPkg.EClassifiers.findFirst[name == "State"] as EClass

		assertNotNull(stateCls)
		assertTrue(stateCls.EAttributes.exists[
			   name == "foo"
			&& EAttributeType.name == "EString"
		])
		assertTrue(stateCls.EOperations.exists[
			   name == "bar"
			&& EParameters.size == 0
			&& EType.name == "EString"
		])
	}

	@Test
	def testEmfWeavingTfsm() {
		val tfsmPkg = root.mm("TimedFsm").pkgs.head
		val stateCls = tfsmPkg.EClassifiers.findFirst[name == "State"] as EClass

		assertNotNull(stateCls)
		assertTrue(stateCls.EAttributes.exists[
			   name == "foo"
			&& EAttributeType.name == "EString"
		])
		assertTrue(stateCls.EOperations.exists[
			   name == "bar"
			&& EParameters.size == 0
			&& EType.name == "EString"
		])
	}

	@Test
	def testEmfWeavingIfsm() {
		val ifsmPkg = root.mm("IncompatibleFsm").pkgs.head
		val stateCls = ifsmPkg.EClassifiers.findFirst[name == "State"] as EClass

		assertNotNull(stateCls)
		assertFalse(stateCls.EAttributes.exists[
			   name == "foo"
			&& EAttributeType.name == "EString"
		])
		assertFalse(stateCls.EOperations.exists[
			   name == "bar"
			&& EParameters.size == 0
			&& EType.name == "EString"
		])
		assertTrue(stateCls.EOperations.exists[
			   name == "baz"
			&& EParameters.size == 1
			&& EParameters.head.EType.name == "EString"
			&& EType.name == "EInt"
		])
	}

	@Test
	def testRelationsFsm() {
		assertEquals(fsmMt.extracted, fsm)
		assertEquals(fsm.exactType, fsmMt)
	}

	@Test
	def testRelationsTfsm() {
		assertEquals(tfsmMt.extracted, tfsm)
		assertEquals(tfsm.exactType, tfsmMt)
	}

	@Test
	def testRelationsIFsm() {
		assertEquals(ifsmMt.extracted, ifsm)
		assertEquals(ifsm.exactType, ifsmMt)
	}

	@Test
	def testImplementsFsm() {
		assertEquals(fsm.^implements.size, 1)
		assertTrue(fsm.^implements.contains(fsmMt))
	}

	@Test
	def testImplementsTfsm() {
		assertEquals(tfsm.^implements.size, 2)
		assertTrue(tfsm.^implements.contains(fsmMt))
		assertTrue(tfsm.^implements.contains(tfsmMt))
	}

	@Test
	def testImplementsIfsm() {
		assertEquals(ifsm.^implements.size, 1)
		assertTrue(ifsm.^implements.contains(ifsmMt))
	}

	@Test
	def testInheritanceFsm() {
		assertNull(fsm.inheritanceRelation)
	}

	@Test
	def testInheritanceTfsm() {
		assertNull(tfsm.inheritanceRelation)
	}

	@Test
	def testInheritanceIfsm() {
		assertNull(ifsm.inheritanceRelation)
	}

	@Test
	def testSubtypingFsmMT() {
		assertEquals(fsmMt.subtypingRelations.size, 0)
	}

	@Test
	def testSubtypingTfsmMT() {
		assertEquals(tfsmMt.subtypingRelations.size, 1)
		assertEquals(tfsmMt.subtypingRelations.head.superType, fsmMt)
	}

	@Test
	def testSubtypingIfsm() {
		assertEquals(ifsmMt.subtypingRelations.size, 0)
	}

	@Test
	def testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 43)

		// Check for generation bug that
		// replaces (valid) generic types with Objects
		fsa.textFiles.forEach[filename, content |
			assertFalse(content.toString.contains('''*/'''))
		]
	}

	@Test
	def testDynamicBinding() {
		try {
			// Consider moving these runtime dependencies somewhere else
			setJavaCompilerClassPath(
				typeof(fsm.FSM),
				typeof(fsm.State),
				typeof(fsm.Transition),
				typeof(timedfsm.FSM),
				typeof(timedfsm.State),
				typeof(timedfsm.Transition),
				fr.inria.diverse.k3.sle.tests.aspects.fsm.StateAspect1,
				fr.inria.diverse.k3.sle.tests.aspects.fsm.StateAspect2,
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
				initialize("aspectstest.test")

				val fsm = invokeTransfo("aspectstest.loadFsm")
				val tfsm = invokeTransfo("aspectstest.loadTfsm")
				assertNotNull(fsm)
				assertNotNull(tfsm)

				assertEquals(invokeTransfo("aspectstest.callFoo", #["aspectstest.FsmMT"], #[fsm]),  "foo1")
				assertEquals(invokeTransfo("aspectstest.callFoo", #["aspectstest.FsmMT"], #[tfsm]), "foo2")
				assertEquals(invokeTransfo("aspectstest.callBar", #["aspectstest.FsmMT"], #[fsm]),  "bar1")
				assertEquals(invokeTransfo("aspectstest.callBar", #["aspectstest.FsmMT"], #[tfsm]), "bar2")
			]
		} catch (Exception e) {
			e.printStackTrace
			fail(e.message)
		}
	}

	def getFsm()      { root.elements.get(0) as Metamodel }
	def getTfsm()     { root.elements.get(1) as Metamodel }
	def getIfsm()     { root.elements.get(2) as Metamodel }
	def getCallFoo()  { root.elements.get(3) as Transformation }
	def getCallBar()  { root.elements.get(4) as Transformation }
	def getLoadFsm()  { root.elements.get(5) as Transformation }
	def getLoadTfsm() { root.elements.get(6) as Transformation }
	def getTest()     { root.elements.get(7) as Transformation }
	def getFsmMt()    { root.elements.get(8) as ModelType }
	def getTfsmMt()   { root.elements.get(9) as ModelType }
	def getIfsmMt()   { root.elements.get(10) as ModelType }
}
