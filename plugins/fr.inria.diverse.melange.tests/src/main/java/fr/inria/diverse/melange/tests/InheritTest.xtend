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
class InheritTest
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
	def void testSimpleInherit() {
		assertTrue(MM1.implements.contains(subMM1.exactType))
		assertTrue(subMM1.implements.contains(MM1.exactType))
		assertTrue(subMM1.inheritanceRelation.map[superMetamodel].contains(MM1))
		
		assertTrue(MM2.implements.contains(subMM2.exactType))
		assertTrue(subMM2.implements.contains(MM2.exactType))
		assertTrue(subMM2.inheritanceRelation.map[superMetamodel].contains(MM2))
	}
	
	@Test
	def void testMultiInherit(){
		assertTrue(subMM1MM2.implements.contains(MM1.exactType))
		assertTrue(subMM1MM2.implements.contains(MM2.exactType))
		
		assertTrue(subMM1MM2.inheritanceRelation.map[superMetamodel].contains(MM1))
		assertTrue(subMM1MM2.inheritanceRelation.map[superMetamodel].contains(MM2))
	}
	
	@Test
	def void testInheritSlices(){
		assertTrue(sliceInherit.implements.contains(sliceMM1.exactType))
		assertTrue(sliceInherit.implements.contains(sliceMM2.exactType))
		assertTrue(sliceInherit.inheritanceRelation.map[superMetamodel].contains(sliceMM1))
		assertTrue(sliceInherit.inheritanceRelation.map[superMetamodel].contains(sliceMM2))
		
		assertTrue(sliceInherit.implements.contains(sliceMerge.exactType))
		assertTrue(sliceMerge.implements.contains(sliceInherit.exactType))
	}
	
	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}
	
	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
	
	def Metamodel getMM1()       { return root.elements.get(0) as Metamodel }
	def Metamodel getMM2()       { return root.elements.get(1) as Metamodel }
	def Metamodel getSubMM1()    { return root.elements.get(2) as Metamodel }
	def Metamodel getSubMM2()    { return root.elements.get(3) as Metamodel }
	def Metamodel getSubMM1MM2() { return root.elements.get(4) as Metamodel }
	def Metamodel getMergeLang() { return root.elements.get(5) as Metamodel }
	def Metamodel getSliceMM1()  { return root.elements.get(6) as Metamodel }
	def Metamodel getSliceMM2()  { return root.elements.get(7) as Metamodel }
	def Metamodel getSliceInherit(){ return root.elements.get(8) as Metamodel }
	def Metamodel getSliceMerge(){ return root.elements.get(9) as Metamodel }
	
}