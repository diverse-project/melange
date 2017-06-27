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
import exhaustive.AbstractTest
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
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/ExhaustiveEcoreTest.melange")
class ExhaustiveEcoreTest
{
	@Inject extension LanguageExtensions
	@Inject extension MelangeTestHelper
	@Inject IGenerator generator

	@Test
	def void testStructure() {
		assertNotNull(root)
		assertEquals(root.name, "exhaustiveecoretest")
		assertNull(root.imports)

		assertTrue(root.elements.get(0) instanceof Language)
		assertTrue(root.elements.get(1) instanceof Language)
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
	def void testRelations() {
		assertEquals(exhaustive.exactType,    exhaustiveMt)
		assertEquals(exhaustive2.exactType,   exhaustive2Mt)
		assertEquals(exhaustiveMt.extracted,  exhaustive)
		assertEquals(exhaustive2Mt.extracted, exhaustive2)
	}

	@Test
	def void testImplements() {
		assertEquals(exhaustive.^implements.size, 2)
		assertTrue(exhaustive.^implements.contains(exhaustiveMt))
		assertTrue(exhaustive.^implements.contains(exhaustive2Mt))

		assertEquals(exhaustive2.^implements.size, 2)
		assertTrue(exhaustive2.^implements.contains(exhaustiveMt))
		assertTrue(exhaustive2.^implements.contains(exhaustive2Mt))
	}

	@Test
	def void testInheritance() {
		assertEquals(exhaustive.superLanguages.size, 0)
		assertEquals(exhaustive2.superLanguages.size, 0)
	}

	@Test
	def void testSubtyping() {
		assertEquals(exhaustiveMt.subtypingRelations.size, 1)
		assertTrue(exhaustiveMt.subtypingRelations.map[superType].contains(exhaustive2Mt))

		assertEquals(exhaustive2Mt.subtypingRelations.size, 1)
		assertTrue(exhaustive2Mt.subtypingRelations.map[superType].contains(exhaustiveMt))
	}

	@Ignore("Won't pass until generics can be fully abstracted")
	@Test
	def void testGeneration() {
		val fsa = new InMemoryFileSystemAccess
		generator.doGenerate(root.eResource, fsa)

		assertEquals(fsa.textFiles.size, 67)
	}

	@Ignore("Won't pass until generics can be fully abstracted")
	@Test
	def void testRuntime() {
		try {
			// Consider moving these runtime dependencies somewhere else
			setJavaCompilerClassPath(
				typeof(AbstractTest),
				IModelType,
				GenericAdapter,
				MelangeRegistry,
				EListAdapter,
				Resource,
				EObject,
				EList,
				Exceptions,
				XMIResourceFactoryImpl
			)
			inputSequence.compile[
				initialize("exhaustiveecoretest.test")
			]
		} catch (Exception e) {
			e.printStackTrace
			fail(e.message)
		}
	}

	def Language getExhaustive()    { return root.elements.get(0) as Language }
	def Language getExhaustive2()   { return root.elements.get(1) as Language }
	def Transformation getTest()     { return root.elements.get(2) as Transformation }
	def ModelType getExhaustiveMt()  { return root.elements.get(3) as ModelType }
	def ModelType getExhaustive2Mt() { return root.elements.get(4) as ModelType }
}
