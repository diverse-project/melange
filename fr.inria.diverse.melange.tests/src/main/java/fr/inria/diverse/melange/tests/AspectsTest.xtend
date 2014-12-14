package fr.inria.diverse.melange.tests

import com.google.inject.Inject

import fr.inria.diverse.melange.lib.GenericAdapter
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.lib.ListAdapter

import fr.inria.diverse.melange.metamodel.melange.Metamodel
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation

import fr.inria.diverse.melange.tests.aspects.fsm.StateAspect1
import fr.inria.diverse.melange.tests.aspects.fsm.StateAspect2

import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider

import fr.inria.diverse.k3.tools.xtext.testing.XtextTest

import fsm.FSM
import fsm.FsmPackage
import fsm.State
import fsm.Transition

import org.eclipse.emf.common.util.EList

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Test

import org.junit.runner.RunWith

import timedfsm.TimedfsmPackage

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/AspectsTest.melange", withValidation = true)
class AspectsTest
{
	@Inject extension MelangeTestHelper
	@Inject IGenerator generator

	@Test
	def void testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "aspectstest")
		assertNotNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Metamodel)
		assertTrue(root.elements.get(1) instanceof Metamodel)
		assertTrue(root.elements.get(2) instanceof Metamodel)
		assertTrue(root.elements.get(3) instanceof XbaseTransformation)
		assertTrue(root.elements.get(4) instanceof XbaseTransformation)
		assertTrue(root.elements.get(5) instanceof XbaseTransformation)
		assertTrue(root.elements.get(6) instanceof XbaseTransformation)
		assertTrue(root.elements.get(7) instanceof XbaseTransformation)
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
	def void testAspectsImportFsm() {
		val fsmAspect = fsm.aspects.head

		assertNotNull(fsmAspect)
		assertEquals(fsm.aspects.size, 1)
		assertEquals(fsmAspect.aspectedClass.name, FsmPackage.eINSTANCE.getState.name)
		assertNotNull(fsmAspect.aspectTypeRef)
		assertEquals(fsmAspect.aspectTypeRef.type.simpleName, "StateAspect1")
	}

	@Test
	def void testAspectsImportTfsm() {
		val tfsmAspect = tfsm.aspects.head

		assertNotNull(tfsmAspect)
		assertEquals(tfsm.aspects.size, 1)
		assertEquals(tfsmAspect.aspectedClass.name, TimedfsmPackage.eINSTANCE.getState.name)
		assertNotNull(tfsmAspect.aspectTypeRef)
		assertEquals(tfsmAspect.aspectTypeRef.type.simpleName, "StateAspect2")
	}

	@Test
	def void testAspectsImportIfsm() {
		val ifsmAspect = ifsm.aspects.head

		assertNotNull(ifsmAspect)
		assertEquals(ifsm.aspects.size, 1)
		assertEquals(ifsmAspect.aspectedClass.name, FsmPackage.eINSTANCE.getState.name)
		assertNotNull(ifsmAspect.aspectTypeRef)
		assertEquals(ifsmAspect.aspectTypeRef.type.simpleName, "StateAspect3")
	}

	@Test
	def void testEmfWeavingFsm() {
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
	def void testEmfWeavingTfsm() {
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
	def void testEmfWeavingIfsm() {
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
	def void testRelationsFsm() {
		assertEquals(fsmMt.extracted, fsm)
		assertEquals(fsm.exactType, fsmMt)
	}

	@Test
	def void testRelationsTfsm() {
		assertEquals(tfsmMt.extracted, tfsm)
		assertEquals(tfsm.exactType, tfsmMt)
	}

	@Test
	def void testRelationsIFsm() {
		assertEquals(ifsmMt.extracted, ifsm)
		assertEquals(ifsm.exactType, ifsmMt)
	}

	@Test
	def void testImplementsFsm() {
		assertEquals(fsm.^implements.size, 1)
		assertTrue(fsm.^implements.contains(fsmMt))
	}

	@Test
	def void testImplementsTfsm() {
		assertEquals(tfsm.^implements.size, 2)
		assertTrue(tfsm.^implements.contains(fsmMt))
		assertTrue(tfsm.^implements.contains(tfsmMt))
	}

	@Test
	def void testImplementsIfsm() {
		assertEquals(ifsm.^implements.size, 1)
		assertTrue(ifsm.^implements.contains(ifsmMt))
	}

	@Test
	def void testInheritanceFsm() {
		assertNull(fsm.inheritanceRelation)
	}

	@Test
	def void testInheritanceTfsm() {
		assertNull(tfsm.inheritanceRelation)
	}

	@Test
	def void testInheritanceIfsm() {
		assertNull(ifsm.inheritanceRelation)
	}

	@Test
	def void testSubtypingFsmMT() {
		assertEquals(fsmMt.subtypingRelations.size, 0)
	}

	@Test
	def void testSubtypingTfsmMT() {
		assertEquals(tfsmMt.subtypingRelations.size, 1)
		assertEquals(tfsmMt.subtypingRelations.head.superType, fsmMt)
	}

	@Test
	def void testSubtypingIfsm() {
		assertEquals(ifsmMt.subtypingRelations.size, 0)
	}

	@Test
	def void testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 47)
	}

	@Test
	def void testDynamicBinding() {
		try {
			// Consider moving these runtime dependencies somewhere else
			setJavaCompilerClassPath(
				typeof(FSM),
				typeof(State),
				typeof(Transition),
				typeof(timedfsm.FSM),
				typeof(timedfsm.State),
				typeof(timedfsm.Transition),
				StateAspect1,
				StateAspect2,
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

	def Metamodel getFsm()                { return root.elements.get(0) as Metamodel }
	def Metamodel getTfsm()               { return root.elements.get(1) as Metamodel }
	def Metamodel getIfsm()               { return root.elements.get(2) as Metamodel }
	def XbaseTransformation getCallFoo()  { return root.elements.get(3) as XbaseTransformation }
	def XbaseTransformation getCallBar()  { return root.elements.get(4) as XbaseTransformation }
	def XbaseTransformation getLoadFsm()  { return root.elements.get(5) as XbaseTransformation }
	def XbaseTransformation getLoadTfsm() { return root.elements.get(6) as XbaseTransformation }
	def XbaseTransformation getTest()     { return root.elements.get(7) as XbaseTransformation }
	def ModelType getFsmMt()              { return root.elements.get(8) as ModelType }
	def ModelType getTfsmMt()             { return root.elements.get(9) as ModelType }
	def ModelType getIfsmMt()             { return root.elements.get(10) as ModelType }
}
