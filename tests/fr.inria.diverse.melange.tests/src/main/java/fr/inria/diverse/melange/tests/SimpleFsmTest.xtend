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
import fr.inria.diverse.melange.lib.IModelType
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelType
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Transformation
import fr.inria.diverse.melange.resource.MelangeRegistry
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fsm.FSM
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/SimpleFsmTest.melange", withValidation = false)
class SimpleFsmTest
{
	@Inject extension MelangeTestHelper
	@Inject extension LanguageExtensions
	@Inject IGenerator generator

	@Test
	def void testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "simplefsmtest")
		assertNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Language)
		assertTrue(root.elements.get(1) instanceof Language)
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
	def void testRelations() {
		assertEquals(fsmmt.extracted, fsm)
		assertEquals(tfsmmt.extracted, tfsm)
		assertEquals(fsm.exactType, fsmmt)
		assertEquals(tfsm.exactType, tfsmmt)
	}

	@Test
	def void testImplements() {
		assertEquals(fsm.^implements.size, 1)
		assertEquals(tfsm.^implements.size, 2)

		assertTrue(fsm.^implements.contains(fsmmt))
		assertTrue(tfsm.^implements.contains(fsmmt))
		assertTrue(tfsm.^implements.contains(tfsmmt))
	}

	@Test
	def void testInheritance() {
		assertEquals(fsm.superLanguages.size, 0)
		assertEquals(tfsm.superLanguages.size, 0)
	}

	@Test
	def void testSubtyping() {
		assertEquals(fsmmt.subtypingRelations.size, 0)
		assertEquals(tfsmmt.subtypingRelations.size, 1)

		assertEquals(tfsmmt.subtypingRelations.head.subType, tfsmmt)
		assertEquals(tfsmmt.subtypingRelations.head.superType, fsmmt)
	}

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
//		+ 4 	// Number of transfo
//		+ 2 	// Number of Language
//		+ 2 	// Number of ModelTypes
//		
//		//Fsm.adapters.FsmMT
//		+ 3		// LanguageAdapter, MTFactory & AdapterFactory
//		+ 3		// Adapters (for each class in MT) 
//		
//		//TimedFsm.adapters.TimedFsmMT
//		+ 3		// LanguageAdapter, MTFactory & AdapterFactory
//		+ 3		// Adapters (for each class in MT) 
//		
//		//TimedFsm.adapters.FsmMT
//		+ 3		// LanguageAdapter, MTFactory & AdapterFactory
//		+ 3		// Adapters (for each class in MT) 
//	}

//	@Test
//	def void testRuntime() {
//		try {
//			// Consider moving these runtime dependencies somewhere else
//			setJavaCompilerClassPath(
//				typeof(FSM),
//				timedfsm.fsm.FSM,
//				IModelType,
//				GenericAdapter,
//				EListAdapter,
//				MelangeRegistry,
//				Resource,
//				EObject,
//				EList,
//				Exceptions,
//				XMIResourceFactoryImpl
//			)
//			inputSequence.compile[
//				initialize("simplefsmtest.test")
//
//				assertNotNull(invokeTransfo("simplefsmtest.loadFsm"))
//				assertNotNull(invokeTransfo("simplefsmtest.loadTFsm"))
//			]
//		} catch (Exception e) {
//			e.printStackTrace
//			fail(e.message)
//		}
//	}

	def Language getFsm()           { return root.elements.get(0) as Language }
	def Language getTfsm()          { return root.elements.get(1) as Language }
	def Transformation getGetRoot()  { return root.elements.get(2) as Transformation }
	def Transformation getLoadFsm()  { return root.elements.get(3) as Transformation }
	def Transformation getLoadTfsm() { return root.elements.get(4) as Transformation }
	def Transformation getTest()     { return root.elements.get(5) as Transformation }
	def ModelType getFsmmt()         { return root.elements.get(6) as ModelType }
	def ModelType getTfsmmt()        { return root.elements.get(7) as ModelType }
}
