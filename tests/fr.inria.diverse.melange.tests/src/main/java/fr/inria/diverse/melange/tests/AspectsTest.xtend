/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.adapters.EListAdapter
import fr.inria.diverse.melange.adapters.GenericAdapter
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.XbaseTransformation
import fr.inria.diverse.melange.resource.MelangeRegistry
import fr.inria.diverse.melange.tests.aspects.fsm.StateAspect1
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fsm.FSM
import fsm.FsmPackage
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith
import timedfsm.fsm.TimedfsmPackage

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/AspectsTest.melange", withValidation = false)
class AspectsTest
{
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension MelangeTestHelper
	@Inject IGenerator generator

	@Test
	def void testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "aspectstest")
		assertNotNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Language)
		assertTrue(root.elements.get(1) instanceof Language)
		assertTrue(root.elements.get(2) instanceof Language)
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
		val fsmAspect = fsm.semantics.head

		assertNotNull(fsmAspect)
		assertEquals(fsm.semantics.size, 1)
		assertEquals(fsmAspect.aspectedClass.name, FsmPackage.eINSTANCE.getState.name)
		assertNotNull(fsmAspect.aspectTypeRef)
		assertEquals(fsmAspect.aspectTypeRef.type.simpleName, "StateAspect1")
	}

	@Test
	def void testAspectsImportTfsm() {
		val tfsmAspect = tfsm.semantics.head

		assertNotNull(tfsmAspect)
		assertEquals(tfsm.semantics.size, 1)
		assertEquals(tfsmAspect.aspectedClass.name, TimedfsmPackage.eINSTANCE.getState.name)
		assertNotNull(tfsmAspect.aspectTypeRef)
		assertEquals(tfsmAspect.aspectTypeRef.type.simpleName, "StateAspect2")
	}
	
	@Test
	def void testTfsmAspectStructure() {
		val tfsmAspect = tfsm.semantics.head
		
		assertNotNull(tfsmAspect.ecoreFragment)
		assertEquals("fsm",tfsmAspect.ecoreFragment.name)
		assertEquals(0,tfsmAspect.ecoreFragment.ESubpackages.size)
		assertEquals(1,tfsmAspect.ecoreFragment.EClassifiers.size)
		assertTrue(tfsmAspect.ecoreFragment.EClassifiers.head instanceof EClass)
		
		val state = tfsmAspect.ecoreFragment.EClassifiers.head as EClass
		assertEquals("State",state.name)
		assertEquals(1,state.EAttributes.size)
		assertEquals("foo",state.EAllAttributes.head.name)
		assertEquals(0,state.EAllReferences.size)
		assertEquals(2,state.EAllOperations.size)
		assertNotNull(state.EAllOperations.findFirst[name == "bar"])
		assertNotNull(state.EAllOperations.findFirst[name == "barbar"])
	}

	@Test
	def void testAspectsImportIfsm() {
		val ifsmAspect = ifsm.semantics.head

		assertNotNull(ifsmAspect)
		assertEquals(ifsm.semantics.size, 1)
		assertEquals(ifsmAspect.aspectedClass.name, FsmPackage.eINSTANCE.getState.name)
		assertNotNull(ifsmAspect.aspectTypeRef)
		assertEquals(ifsmAspect.aspectTypeRef.type.simpleName, "StateAspect3")
	}

	@Test
	def void testEmfWeavingFsm() {
		val fsmPkg = fsm.syntax.pkgs.head
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
		val tfsmPkg = tfsm.syntax.pkgs.head
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
		val ifsmPkg = ifsm.syntax.pkgs.head
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
		assertEquals(fsm.superLanguages.size, 0)
	}

	@Test
	def void testInheritanceTfsm() {
		assertEquals(tfsm.superLanguages.size, 0)
	}

	@Test
	def void testInheritanceIfsm() {
		assertEquals(ifsm.superLanguages.size, 0)
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

//	@Test
//	def void testGeneration() {
//		val fsa = new InMemoryFileSystemAccess
//		generator.doGenerate(root.eResource, fsa)
//
//		assertEquals(fsa.textFiles.size, 48)
//	}

//	@Test
//	def void testDynamicBinding() {
//		try {
//			// Consider moving these runtime dependencies somewhere else
//			setJavaCompilerClassPath(
//				typeof(FSM),
//				typeof(timedfsm.fsm.FSM),
//				StateAspect1,
//				MelangeRegistry,
//				IModelType,
//				GenericAdapter,
//				EListAdapter,
//				Resource,
//				EObject,
//				EList,
//				Exceptions,
//				XMIResourceFactoryImpl
//			)
//			inputSequence.compile[
//				initialize("aspectstest.test")
//
//				val fsm = invokeTransfo("aspectstest.loadFsm")
//				val tfsm = invokeTransfo("aspectstest.loadTfsm")
//				assertNotNull(fsm)
//				assertNotNull(tfsm)
//
//				assertEquals(invokeTransfo("aspectstest.callFoo", #["aspectstest.FsmMT"], #[fsm]),  "foo1")
//				assertEquals(invokeTransfo("aspectstest.callFoo", #["aspectstest.FsmMT"], #[tfsm]), "foo2")
//				assertEquals(invokeTransfo("aspectstest.callBar", #["aspectstest.FsmMT"], #[fsm]),  "bar1")
//				assertEquals(invokeTransfo("aspectstest.callBar", #["aspectstest.FsmMT"], #[tfsm]), "bar2")
//			]
//		} catch (Exception e) {
//			e.printStackTrace
//			fail(e.message)
//		}
//	}

	def Language getFsm()                { return root.elements.get(0) as Language }
	def Language getTfsm()               { return root.elements.get(1) as Language }
	def Language getIfsm()               { return root.elements.get(2) as Language }
	def XbaseTransformation getCallFoo()  { return root.elements.get(3) as XbaseTransformation }
	def XbaseTransformation getCallBar()  { return root.elements.get(4) as XbaseTransformation }
	def XbaseTransformation getLoadFsm()  { return root.elements.get(5) as XbaseTransformation }
	def XbaseTransformation getLoadTfsm() { return root.elements.get(6) as XbaseTransformation }
	def XbaseTransformation getTest()     { return root.elements.get(7) as XbaseTransformation }
	def ModelType getFsmMt()              { return root.elements.get(8) as ModelType }
	def ModelType getTfsmMt()             { return root.elements.get(9) as ModelType }
	def ModelType getIfsmMt()             { return root.elements.get(10) as ModelType }
}
