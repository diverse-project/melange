package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.junit.Test

import static org.junit.Assert.*
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import org.eclipse.emf.ecore.EClass

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/SubPackagesAspectTest.melange")
class SubPackagesAspectTest
{
	@Inject extension ModelingElementExtensions
	
	@Test
	def void testStructure(){
		assertEquals(2, root.elements.size)
		
		val toppkg = lang.syntax.pkgs.head
		assertNotNull(toppkg)
		assertEquals(2, toppkg.EClassifiers.size)
		assertEquals(2, toppkg.ESubpackages.size)
		assertEquals("toppkg", toppkg.name)
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass1"])
		assertTrue(toppkg.EClassifiers.exists[name == "TopClass2"])
		
		val subpkg1 = toppkg.ESubpackages.findFirst[name == "subpkg1"]
		assertNotNull(subpkg1)
		assertEquals(2, subpkg1.EClassifiers.size)
		assertEquals(0, subpkg1.ESubpackages.size)
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class1"])
		assertTrue(subpkg1.EClassifiers.exists[name == "Subpkg1Class2"])
		val subpkg1Class1 = subpkg1.EClassifiers.findFirst[name == "Subpkg1Class1"] as EClass
		assertEquals(1,subpkg1Class1.EAllAttributes.size)
		assertEquals("changeableYes",subpkg1Class1.EAllAttributes.head.name)
		assertEquals(2,subpkg1Class1.EAllReferences.size)
		assertTrue(subpkg1Class1.EAllReferences.exists[name == "toTopClass1"])
		assertTrue(subpkg1Class1.EAllReferences.exists[name == "mySubpkg1Class2"])
		assertEquals(toppkg.EClassifiers.findFirst[name == "TopClass1"],subpkg1Class1.EAllReferences.findFirst[name == "toTopClass1"].EType)
		
		val subpkg2 = toppkg.ESubpackages.findFirst[name == "subpkg2"]
		assertNotNull(subpkg2)
		assertEquals(2, subpkg2.EClassifiers.size)
		assertEquals(1, subpkg2.ESubpackages.size)
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class1"])
		assertTrue(subpkg2.EClassifiers.exists[name == "Subpkg2Class2"])
		
		val subpkg3 = subpkg2.ESubpackages.head
		assertEquals(2, subpkg3.EClassifiers.size)
		assertEquals("subpkg3", subpkg3.name)
		assertEquals(0, subpkg3.ESubpackages.size)
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class1"])
		assertTrue(subpkg3.EClassifiers.exists[name == "Subpkg3Class2"])
	}

	def Language getLang()         { return root.elements.get(0) as Language }
}
