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
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import java.util.Collections
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/OperatorMappingTest.melange", withValidation = false)
class OperatorMappingTest
{
	@Inject MatchingHelper helper
	@Inject extension ModelingElementExtensions
	
	
	@Test
	def void testStructure4ecore(){
		assertEquals(1, renameEcoreMM1.syntax.pkgs.size)
		assertEquals("newpackage", renameEcoreMM1.syntax.pkgs.get(0).name)
		
		assertEquals(7, renameEcoreMM1.syntax.pkgs.get(0).EClassifiers.size)
		assertEquals("AAAAA", renamedEcoreClasses.get(0).name)
		assertEquals("Z", renamedEcoreClasses.get(1).name)
		assertEquals("C", renamedEcoreClasses.get(2).name)
		assertEquals("AA", renamedEcoreClasses.get(3).name)
		assertEquals("AAA", renamedEcoreClasses.get(4).name)
		assertEquals("SuperA", renamedEcoreClasses.get(5).name)
		assertEquals("SubB", renamedEcoreClasses.get(6).name)
		
		assertNotNull(renamedEcoreClasses.get(0).EAllReferences.findFirst[name == "toZ"])
		assertEquals(renamedEcoreClasses.get(1) , renamedEcoreClasses.get(0).EAllReferences.findFirst[name == "toZ"].EType)
		assertEquals(renamedEcoreClasses.get(5), renamedEcoreClasses.get(0).ESuperTypes.get(0))
		
		assertEquals("getA", renamedEcoreClasses.get(1).EOperations.get(0).name)
		assertEquals(renamedEcoreClasses.get(0), renamedEcoreClasses.get(1).EOperations.get(0).EType)
		assertEquals(renamedEcoreClasses.get(1), renamedEcoreClasses.get(1).EOperations.get(0).EParameters.get(0).EType)
		assertEquals("toA", renamedEcoreClasses.get(1).EReferences.get(0).name)
		assertEquals(renamedEcoreClasses.get(0), renamedEcoreClasses.get(1).EReferences.get(0).EType)
		
		assertEquals(renamedEcoreClasses.get(0), renamedEcoreClasses.get(3).ESuperTypes.get(0))
		
		assertEquals(renamedEcoreClasses.get(3), renamedEcoreClasses.get(4).ESuperTypes.get(0))
		assertEquals("toC", renamedEcoreClasses.get(4).EReferences.get(0).name)
		assertEquals(renamedEcoreClasses.get(2), renamedEcoreClasses.get(4).EReferences.get(0).EType)
		
		assertEquals(renamedEcoreClasses.get(1), renamedEcoreClasses.get(6).ESuperTypes.get(0))
	}	
	
	@Test
	def void testStructure4merge(){
		assertEquals(1, renameMergeMM1.syntax.pkgs.size)
		assertEquals("newpackage", renameMergeMM1.syntax.pkgs.get(0).name)
		
		assertEquals(7, renameMergeMM1.syntax.pkgs.get(0).EClassifiers.size)
		assertEquals("AAAAA", renamedMergeClasses.get(0).name)
		assertEquals("Z", renamedMergeClasses.get(1).name)
		assertEquals("C", renamedMergeClasses.get(2).name)
		assertEquals("AA", renamedMergeClasses.get(3).name)
		assertEquals("AAA", renamedMergeClasses.get(4).name)
		assertEquals("SuperA", renamedMergeClasses.get(5).name)
		assertEquals("SubB", renamedMergeClasses.get(6).name)
		
		assertNotNull(renamedMergeClasses.get(0).EAllReferences.findFirst[name == "toZ"])
		assertEquals(renamedMergeClasses.get(1) , renamedMergeClasses.get(0).EAllReferences.findFirst[name == "toZ"].EType)
		assertEquals(renamedMergeClasses.get(5), renamedMergeClasses.get(0).ESuperTypes.get(0))
		
		assertEquals("getA", renamedMergeClasses.get(1).EOperations.get(0).name)
		assertEquals(renamedMergeClasses.get(0), renamedMergeClasses.get(1).EOperations.get(0).EType)
		assertEquals(renamedMergeClasses.get(1), renamedMergeClasses.get(1).EOperations.get(0).EParameters.get(0).EType)
		assertEquals("toA", renamedMergeClasses.get(1).EReferences.get(0).name)
		assertEquals(renamedMergeClasses.get(0), renamedMergeClasses.get(1).EReferences.get(0).EType)
		assertEquals("aZebra", renamedMergeClasses.get(1).EAttributes.get(0).name)
		assertEquals("ELong", renamedMergeClasses.get(1).EAttributes.get(0).EType.name)
		
		assertEquals(renamedMergeClasses.get(0), renamedMergeClasses.get(3).ESuperTypes.get(0))
		
		assertEquals(renamedMergeClasses.get(3), renamedMergeClasses.get(4).ESuperTypes.get(0))
		assertEquals("toC", renamedMergeClasses.get(4).EReferences.get(0).name)
		assertEquals(renamedMergeClasses.get(2), renamedMergeClasses.get(4).EReferences.get(0).EType)
		
		assertEquals(renamedMergeClasses.get(1), renamedMergeClasses.get(6).ESuperTypes.get(0))
	}
	
	@Test
	def void testStructure4slice(){
		assertEquals(1, renameSliceMM1.syntax.pkgs.size)
		assertEquals("newpackage", renameSliceMM1.syntax.pkgs.get(0).name)
		
		assertEquals(4, renameSliceMM1.syntax.pkgs.get(0).EClassifiers.size)
		assertEquals("AAAAA", renamedSliceClasses.get(0).name)
		assertEquals("SuperA", renamedSliceClasses.get(1).name)
		assertEquals("Z", renamedSliceClasses.get(2).name)
		assertEquals("SubB", renamedSliceClasses.get(3).name)
		
		assertNotNull(renamedSliceClasses.get(0).EAllReferences.findFirst[name == "toZ"])
		assertEquals(renamedSliceClasses.get(2) , renamedSliceClasses.get(0).EAllReferences.findFirst[name == "toZ"].EType)
		assertEquals(renamedSliceClasses.get(1), renamedSliceClasses.get(0).ESuperTypes.get(0))
		
		assertEquals("getA", renamedSliceClasses.get(2).EOperations.get(0).name)
		assertEquals(renamedSliceClasses.get(0), renamedSliceClasses.get(2).EOperations.get(0).EType)
		assertEquals(renamedSliceClasses.get(2), renamedSliceClasses.get(2).EOperations.get(0).EParameters.get(0).EType)
		assertEquals("toA", renamedSliceClasses.get(2).EReferences.get(0).name)
		assertEquals(renamedSliceClasses.get(0), renamedSliceClasses.get(2).EReferences.get(0).EType)
		
		assertEquals(renamedSliceClasses.get(2), renamedSliceClasses.get(3).ESuperTypes.get(0))
	}
	
	@Test
	def void testStructurePackage(){
		
		//Get packages
		val toppkg = packagesLang.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg1 = toppkg.ESubpackages.get(0)
		val subpkg2 = toppkg.ESubpackages.get(1)
		val subpkg3 = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(2, toppkg.ESubpackages.size)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(0, subpkg1.ESubpackages.size)
		assertEquals(2, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		
		//Check classes names
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	@Test
	def void testMergePackage1(){
		
		//Get packages
		val toppkg = subPackTest0.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg1 = toppkg.ESubpackages.get(0)
		val subpkg2 = subpkg1.ESubpackages.get(0)
		val subpkg3 = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(1, toppkg.ESubpackages.size)
		assertEquals(0, toppkg.EClassifiers.size)
		assertEquals(1, subpkg1.ESubpackages.size)
		assertEquals(4, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		
		//Check classes names
		assertTrue(subpkg1.EClassifiers.exists[name == "TopClass1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	@Test
	def void testMergePackage2(){
		
		//Get packages
		val toppkg = subPackTest1.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg2 = toppkg.ESubpackages.get(0)
		val subpkg3 = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(1, toppkg.ESubpackages.size)
		assertEquals(4, toppkg.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		
		//Check classes names
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(toppkg.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(toppkg.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	@Test
	def void testMergePackage3(){
		
		//Get packages
		val toppkg = subPackTest2.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg1 = toppkg.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(1, toppkg.ESubpackages.size)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(0, subpkg1.ESubpackages.size)
		assertEquals(6, subpkg1.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		
		//Check classes names
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	
	@Test
	def void testOwnPackage1(){
		
		//Get packages
		val toppkg    = subPackTest3.syntax.pkgs.findFirst[name == "toppkg"]
		val newsubpkg = toppkg.ESubpackages.get(0)
		val subpkg1   = newsubpkg.ESubpackages.findFirst[name == "subpkg1"]
		val subpkg2   = newsubpkg.ESubpackages.findFirst[name == "subpkg2"]
		val subpkg3   = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(1, toppkg.ESubpackages.size)
		assertEquals(0, toppkg.EClassifiers.size)
		assertEquals(2, newsubpkg.ESubpackages.size)
		assertEquals(2, newsubpkg.EClassifiers.size)
		assertEquals(0, subpkg1.ESubpackages.size)
		assertEquals(2, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		assertEquals("newsubpkg", newsubpkg.name)
		
		//Check classes names
		assertTrue(newsubpkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(newsubpkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	@Test
	def void testOwnPackage2(){
		
		//Get packages
		val toppkg    = subPackTest4.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg1   = toppkg.ESubpackages.findFirst[name == "subpkg1"]
		val subpkg2   = toppkg.ESubpackages.findFirst[name == "subpkg2"]
		val subpkg3   = subpkg2.ESubpackages.get(0)
		val newsubpkg = subpkg1.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(2, toppkg.ESubpackages.size)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(1, subpkg1.ESubpackages.size)
		assertEquals(0, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		assertEquals(0, newsubpkg.ESubpackages.size)
		assertEquals(2, newsubpkg.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		assertEquals("newsubpkg", newsubpkg.name)
		
		//Check classes names
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(newsubpkg.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(newsubpkg.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	@Test
	def void testOwnPackage3(){
		
		//Get packages
		val toppkg    = subPackTest4b.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg1   = toppkg.ESubpackages.findFirst[name == "subpkg1"]
		val subpkg2   = toppkg.ESubpackages.findFirst[name == "subpkg2"]
		val newsubpkg = subpkg2.ESubpackages.get(0)
		val subpkg3   = newsubpkg.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(2, toppkg.ESubpackages.size)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(0, subpkg1.ESubpackages.size)
		assertEquals(2, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(0, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		assertEquals(1, newsubpkg.ESubpackages.size)
		assertEquals(2, newsubpkg.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		assertEquals("newsubpkg", newsubpkg.name)
		
		//Check classes names
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(newsubpkg.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(newsubpkg.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	
	@Test
	def void testSwitchPackage1(){
		
		//Get packages
		val toppkg = subPackTest5.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg1 = toppkg.ESubpackages.get(0)
		val subpkg2 = subpkg1.ESubpackages.get(0)
		val subpkg3 = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(1, toppkg.ESubpackages.size)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(1, subpkg1.ESubpackages.size)
		assertEquals(2, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		
		//Check classes names
		assertTrue(subpkg1.EClassifiers.exists[name == "TopClass1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "TopClass2"])
		assertTrue(toppkg.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(toppkg.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	@Test
	def void testSwitchPackage2(){
		
		//Get packages
		val toppkg = subPackTest6.syntax.pkgs.findFirst[name == "toppkg"]
		val subpkg1 = toppkg.ESubpackages.findFirst[name == "subpkg1"]
		val subpkg2 = toppkg.ESubpackages.findFirst[name == "subpkg2"]
		val subpkg3 = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(2, toppkg.ESubpackages.size)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(0, subpkg1.ESubpackages.size)
		assertEquals(2, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		
		//Check classes names
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	
	@Test
	def void testNewPackage1(){
		
		//Get packages
		val toppkg     = subPackTest7.syntax.pkgs.findFirst[name == "toppkg"]
		val newsubpack = toppkg.ESubpackages.findFirst[name == "newsubpack"]
		val subpkg1    = newsubpack.ESubpackages.get(0)
		val subpkg2    = toppkg.ESubpackages.findFirst[name == "subpkg2"]
		val subpkg3    = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(2, toppkg.ESubpackages.size)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(0, subpkg1.ESubpackages.size)
		assertEquals(2, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		assertEquals(1, newsubpack.ESubpackages.size)
		assertEquals(0, newsubpack.EClassifiers.size)
		
		//Check package name
		assertEquals("toppkg", toppkg.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		assertEquals("newsubpack", newsubpack.name)
		
		//Check classes names
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	
	@Test
	def void testNewPackage2(){
		
		//Get packages
		val newroot = subPackTest8.syntax.pkgs.findFirst[name == "newroot"]
		val subpkg1 = newroot.ESubpackages.get(0)
		val subpkg2 = subpkg1.ESubpackages.get(0)
		val subpkg3 = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(1, newroot.ESubpackages.size)
		assertEquals(0, newroot.EClassifiers.size)
		assertEquals(1, subpkg1.ESubpackages.size)
		assertEquals(4, subpkg1.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		
		//Check package name
		assertEquals("newroot", newroot.name)
		assertEquals("subpkg1", subpkg1.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		
		//Check classes names
		assertTrue(subpkg1.EClassifiers.exists[name == "TopClass1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "TopClass2"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	
	@Test
	def void testNewPackage3(){
		
		//Get packages
		val newroot     = subPackTest9.syntax.pkgs.findFirst[name == "newroot"]
		val newsubpack  = newroot.ESubpackages.get(0)
		val newsubpack2 = newsubpack.ESubpackages.findFirst[name == "newsubpack2"]
		val subpkg2     = newsubpack.ESubpackages.findFirst[name == "subpkg2"]
		val subpkg3     = subpkg2.ESubpackages.get(0)
		
		//Check numbers of elements
		assertEquals(1, newroot.ESubpackages.size)
		assertEquals(0, newroot.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertEquals(2, subpkg3.EClassifiers.size)
		assertEquals(2, newsubpack.ESubpackages.size)
		assertEquals(2, newsubpack.EClassifiers.size)
		assertEquals(0, newsubpack2.ESubpackages.size)
		assertEquals(2, newsubpack2.EClassifiers.size)
		
		//Check package name
		assertEquals("newroot", newroot.name)
		assertEquals("subpkg2", subpkg2.name)
		assertEquals("subpkg3", subpkg3.name)
		assertEquals("newsubpack", newsubpack.name)
		assertEquals("newsubpack2", newsubpack2.name)
		
		//Check classes names
		assertTrue(newsubpack.EClassifiers.exists[name == "TopClass1"])
		assertTrue(newsubpack.EClassifiers.exists[name == "TopClass2"])
		assertTrue(newsubpack2.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(newsubpack2.EClassifiers.exists[name == "Subpkg1Class2"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}
	
	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}
	
	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
	
	def Language findLang(String langName)  {
		return root.elements.filter(Language).findFirst[name == langName]
	}
	
	def Language getMM1()              { return findLang("MM1") }
	def Language getPackagesLang()     { return findLang("PackageLang") }
	def Language getRenameEcoreMM1()   { return findLang("RenameEcoreMM1") }
	def Language getRenameMergeMM1()   { return findLang("RenameMergeMM1") }
	def Language getRenameSliceMM1()   { return findLang("RenameSliceMM1") }
	def Language getSubPackTest0()     { return findLang("SubPackTest0") }
	def Language getSubPackTest1()     { return findLang("SubPackTest1") }
	def Language getSubPackTest2()     { return findLang("SubPackTest2") }
	def Language getSubPackTest3()     { return findLang("SubPackTest3") }
	def Language getSubPackTest4()     { return findLang("SubPackTest4") }
	def Language getSubPackTest4b()    { return findLang("SubPackTest4b") }
	def Language getSubPackTest5()     { return findLang("SubPackTest5") }
	def Language getSubPackTest6()     { return findLang("SubPackTest6") }
	def Language getSubPackTest7()     { return findLang("SubPackTest7") }
	def Language getSubPackTest8()     { return findLang("SubPackTest8") }
	def Language getSubPackTest9()     { return findLang("SubPackTest9") }
	
	def List<EClass> getRenamedEcoreClasses() {return getRenameEcoreMM1.syntax.pkgs.get(0).EClassifiers.filter(EClass).toList}
	def List<EClass> getRenamedMergeClasses() {return getRenameMergeMM1.syntax.pkgs.get(0).EClassifiers.filter(EClass).toList}
	def List<EClass> getRenamedSliceClasses() {return getRenameSliceMM1.syntax.pkgs.get(0).EClassifiers.filter(EClass).toList}	
	
}