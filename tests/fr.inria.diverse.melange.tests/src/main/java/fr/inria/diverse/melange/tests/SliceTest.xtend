package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.metamodel.melange.Slice
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fr.inria.diverse.melange.validation.MelangeValidationConstants
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/SliceTest.melange")
class SliceTest
{
	@Inject MatchingHelper helper
	@Inject extension ModelingElementExtensions
	
	@Test
	def void testPackagesSelfMatching() {
		val packagesPkg1 = "tests-inputs/metamodels/merge/MM1.ecore".loadEcore
		assertTrue(packagesPkg1.simpleMatch(MM1.exactType.pkgs.head))

		val packagesPkg2 = "tests-inputs/metamodels/merge/MM2.ecore".loadEcore
		assertTrue(packagesPkg2.simpleMatch(MM2.exactType.pkgs.head))
	}
	
	@Test
	def void testSubTyping() {
		assertTrue(MM1.implements.contains(sliceMM1.exactType))
		assertTrue(MM2.implements.contains(sliceMM2.exactType))
	}
	
	@Test
	def void testStrucureSliceMM1(){
		assertEquals(1, getSliceMM1.syntax.pkgs.size)
		assertEquals("testmerge", getSliceMM1.syntax.pkgs.get(0).name)
		assertEquals(3, getSliceMM1.syntax.pkgs.get(0).EClassifiers.size)
		
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
		assertEquals(1, getSliceMM2.syntax.pkgs.size)
		assertEquals("testmerge", getSliceMM2.syntax.pkgs.get(0).name)
		assertEquals(5, getSliceMM2.syntax.pkgs.get(0).EClassifiers.size)
		
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
	
	@Test
	def void testIncompatibleReference(){
		assertError((incompatibleSlice.operators.get(1) as Slice).slicedLanguage,
					MelangePackage.eINSTANCE.language,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Language \'Merge1\' has a reference \'reference\' typed Clazz but in \'Merge2\' it is EObject"
		)
	}
	
	@Test
	def void testIncompatibleOperation(){
		assertError((incompatibleSlice.operators.get(1) as Slice).slicedLanguage,
					MelangePackage.eINSTANCE.language,
					MelangeValidationConstants.MERGE_OPERATION_OVERRIDING,
					"Language \'Merge1\' has an operation \'operation\' typed Clazz but in \'Merge2\' it is EBoolean"
		)
	}
	
	@Test
	def void testIncompatibleOperation2(){
		assertError((incompatibleSlice.operators.get(1) as Slice).slicedLanguage,
					MelangePackage.eINSTANCE.language,
					MelangeValidationConstants.MERGE_OPERATION_OVERRIDING,
					"Language \'Merge1\' has an operation \'operation2\' typed Void but in \'Merge2\' it is EBoolean"
		)
	}
	
	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}
	
	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
	
	def Language getMM1()         { return root.elements.get(0) as Language }
	def Language getMM2()         { return root.elements.get(1) as Language }
	def Language getSliceMM1()    { return root.elements.get(2) as Language }
	def Language getSliceMM2()    { return root.elements.get(3) as Language }
	def Language getMergeLang()   { return root.elements.get(4) as Language }
	def Language getMergeSlice()  { return root.elements.get(5) as Language }
	def Language getExactSlice()  { return root.elements.get(6) as Language }
	def Language getSliceMerge()  { return root.elements.get(7) as Language }
	def Language getMerge1()      { return root.elements.get(8) as Language }
	def Language getMerge2()      { return root.elements.get(9) as Language }
	def Language getIncompatibleSlice(){ return root.elements.get(10) as Language }
	
	def EClass getA()  { return getSliceMM1.syntax.pkgs.get(0).EClassifiers.findFirst[name == "A"] as EClass}
	def EClass getSuperA()  { return getSliceMM1.syntax.pkgs.get(0).EClassifiers.findFirst[name == "SuperA"] as EClass}
	def EClass getB()  { return getSliceMM1.syntax.pkgs.get(0).EClassifiers.findFirst[name == "B"] as EClass}
	
	def EClass getC()  { return getSliceMM2.syntax.pkgs.get(0).EClassifiers.findFirst[name == "C"] as EClass}
	def EClass getD()  { return getSliceMM2.syntax.pkgs.get(0).EClassifiers.findFirst[name == "D"] as EClass}
	def EClass getE()  { return getSliceMM2.syntax.pkgs.get(0).EClassifiers.findFirst[name == "E"] as EClass}
	def EClass getF()  { return getSliceMM2.syntax.pkgs.get(0).EClassifiers.findFirst[name == "F"] as EClass}
	def EDataType getCustomDataType()  { return getSliceMM2.syntax.pkgs.get(0).EClassifiers.findFirst[name == "CustomDataType"] as EDataType}
	
	
}