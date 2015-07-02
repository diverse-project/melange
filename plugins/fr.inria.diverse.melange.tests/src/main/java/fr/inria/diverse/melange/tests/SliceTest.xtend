package fr.inria.diverse.melange.tests

import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.InjectWith
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import org.junit.Test
import fr.inria.diverse.melange.metamodel.melange.Metamodel
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import fr.inria.diverse.melange.lib.MatchingHelper
import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import java.util.Collections
import static org.junit.Assert.*
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.impl.EcorePackageImpl
import org.eclipse.emf.ecore.EcorePackage

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/SliceTest.melange")
class SliceTest
{
	@Inject MatchingHelper helper
	@Inject extension ModelingElementExtensions
	
	@Test
	def void testSubTyping() {
		assertTrue(MM1.implements.contains(sliceMM1.exactType))
		assertTrue(MM2.implements.contains(sliceMM2.exactType))
	}
	
	@Test
	def void testStrucureSliceMM1(){
		assertEquals(1, getSliceMM1.pkgs.size)
		assertEquals("testmerge", getSliceMM1.pkgs.get(0).name)
		assertEquals(3, getSliceMM1.pkgs.get(0).EClassifiers.size)
		
		assertNotNull(getA)
		assertNotNull(getSuperA)
		assertNotNull(getB)
		
		assertEquals(1, getA.EAllReferences.size)
		assertEquals(1, getB.EAllReferences.size)
		
		assertEquals("toB", getA.EReferences.get(0).name)
		assertEquals("toA", getB.EReferences.get(0).name)
		assertEquals(getB.EReferences.get(0), getA.EReferences.get(0).EOpposite)
		assertEquals(getA.EReferences.get(0), getB.EReferences.get(0).EOpposite)
		
		assertEquals(0, getA.EReferences.get(0).lowerBound)
		assertEquals(1, getA.EReferences.get(0).upperBound)
		assertEquals(0, getB.EReferences.get(0).lowerBound)
		assertEquals(1, getB.EReferences.get(0).upperBound)
		
		assertEquals(getB, getA.EReferences.get(0).EType)
		assertEquals(getA, getB.EReferences.get(0).EType)
	}
	
	@Test
	def void testStrucureSliceMM2(){
		assertEquals(1, getSliceMM2.pkgs.size)
		assertEquals("testmerge", getSliceMM2.pkgs.get(0).name)
		assertEquals(5, getSliceMM2.pkgs.get(0).EClassifiers.size)
		
		assertNotNull(getC)
		assertNotNull(getD)
		assertNotNull(getE)
		assertNotNull(getF)
		assertNotNull(getCustomDataType)
		
		assertEquals(3, getC.EAllReferences.size)
		assertEquals(1, getC.EAllAttributes.size)
		assertEquals("toD", getC.EReferences.get(0).name)
		assertEquals("toE", getC.EReferences.get(1).name)
		assertEquals("toF", getC.EReferences.get(2).name)
		assertEquals("dataType", getC.EAttributes.get(0).name)
		
		assertEquals(getD, getC.EReferences.get(0).EType)
		assertEquals(getE, getC.EReferences.get(1).EType)
		assertEquals(getF, getC.EReferences.get(2).EType)
		assertEquals(getCustomDataType, getC.EAttributes.get(0).EType)
		
		assertEquals(getD.EReferences.get(0), getC.EReferences.get(0).EOpposite)
		assertEquals(getC.EReferences.get(0), getD.EReferences.get(0).EOpposite)
		
		assertTrue(getC.EReferences.get(1).isContainment)
		
		assertEquals(0, getC.EReferences.get(0).lowerBound)
		assertEquals(1, getC.EReferences.get(0).upperBound)
		assertEquals(1, getC.EReferences.get(1).lowerBound)
		assertEquals(42, getC.EReferences.get(1).upperBound)
		assertEquals(0, getC.EReferences.get(2).lowerBound)
		assertEquals(-1, getC.EReferences.get(2).upperBound)
		
		assertEquals(1, getD.EAllReferences.size)
		assertEquals(1, getD.EAllAttributes.size)
		
		assertEquals("toC", getD.EReferences.get(0).name)
		assertEquals("emfDataType", getD.EAttributes.get(0).name)
		
		assertEquals(getC, getD.EReferences.get(0).EType)
		assertEquals(EcorePackage.eINSTANCE.EString, getD.EAttributes.get(0).EType)
		
		assertEquals(0, getD.EReferences.get(0).lowerBound)
		assertEquals(1, getD.EReferences.get(0).upperBound)
		
		assertEquals(1, getD.EAttributes.get(0).lowerBound)
		assertEquals(-1, getD.EAttributes.get(0).upperBound)
	}
	
	@Test
	def void testMergeSlice(){
		assertTrue(MM2.implements.contains(mergeSlice.exactType))
		assertTrue(mergeSlice.implements.contains(sliceMM2.exactType))
		assertTrue(sliceMM2.implements.contains(mergeSlice.exactType))
	}
	
	@Test
	def void testExactSlice(){
		assertTrue(MM1.implements.contains(exactSlice.exactType))
		assertTrue(exactSlice.implements.contains(MM1.exactType))
	}
	
	@Test
	def void testSliceMerge(){
		assertTrue(sliceMerge.implements.contains(mergeSlice.exactType))
		assertTrue(mergeSlice.implements.contains(sliceMerge.exactType))
	}
	
	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}
	
	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
	
	def Metamodel getMM1()         { return root.elements.get(0) as Metamodel }
	def Metamodel getMM2()         { return root.elements.get(1) as Metamodel }
	def Metamodel getSliceMM1()    { return root.elements.get(2) as Metamodel }
	def Metamodel getSliceMM2()    { return root.elements.get(3) as Metamodel }
	def Metamodel getMergeLang()   { return root.elements.get(4) as Metamodel }
	def Metamodel getMergeSlice()  { return root.elements.get(5) as Metamodel }
	def Metamodel getExactSlice()  { return root.elements.get(6) as Metamodel }
	def Metamodel getSliceMerge()  { return root.elements.get(7) as Metamodel }
	
	def EClass getA()  { return getSliceMM1.pkgs.get(0).EClassifiers.findFirst[name == "A"] as EClass}
	def EClass getSuperA()  { return getSliceMM1.pkgs.get(0).EClassifiers.findFirst[name == "SuperA"] as EClass}
	def EClass getB()  { return getSliceMM1.pkgs.get(0).EClassifiers.findFirst[name == "B"] as EClass}
	
	def EClass getC()  { return getSliceMM2.pkgs.get(0).EClassifiers.findFirst[name == "C"] as EClass}
	def EClass getD()  { return getSliceMM2.pkgs.get(0).EClassifiers.findFirst[name == "D"] as EClass}
	def EClass getE()  { return getSliceMM2.pkgs.get(0).EClassifiers.findFirst[name == "E"] as EClass}
	def EClass getF()  { return getSliceMM2.pkgs.get(0).EClassifiers.findFirst[name == "F"] as EClass}
	def EDataType getCustomDataType()  { return getSliceMM2.pkgs.get(0).EClassifiers.findFirst[name == "CustomDataType"] as EDataType}
	
	
}