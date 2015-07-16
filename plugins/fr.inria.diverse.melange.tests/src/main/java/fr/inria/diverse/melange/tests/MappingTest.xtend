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
import fr.inria.diverse.melange.metamodel.melange.Mapping
import fr.inria.diverse.melange.metamodel.melange.ClassBinding
import fr.inria.diverse.melange.metamodel.melange.PropertyBinding
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/MappingTest.melange")
class MappingTest
{
	@Inject MatchingHelper helper
	@Inject extension ModelingElementExtensions
	
	@Test
	def void testPackagesSelfMatching() {
		val packagesPkg1 = "tests-inputs/metamodels/merge/MM1.ecore".loadEcore
		assertTrue(packagesPkg1.simpleMatch(MM1.exactType.pkgs.head))

		val packagesPkg3 = "tests-inputs/metamodels/merge/MM3.ecore".loadEcore
		assertTrue(packagesPkg3.simpleMatch(MM3.exactType.pkgs.head))
	}
	
	@Test
	def void testImplements() {
		assertTrue(MM3.implements.contains(MM1.exactType))
	}
	
	@Test
	def void testStructureMapping(){
		assertEquals("MyMapping", mapping.name)
		
		assertEquals(MM3, mapping.from)
		assertEquals(MM1.exactType, mapping.to)
		
		assertEquals("SuperA3", superABinding.from)
		assertEquals("SuperA", superABinding.to)
		
		assertEquals("A3", ABinding.from)
		assertEquals("A", ABinding.to)
		
		assertEquals("B3", BBinding.from)
		assertEquals("B", BBinding.to)
		
		assertEquals("toA3", toABinding.from)
		assertEquals("toA", toABinding.to)
		
		assertEquals("toB3", toBBinding.from)
		assertEquals("toB", toBBinding.to)
	}
	
	@Test
	def void testMergeMapping(){
		assertTrue(MM1.implements.contains(mergeLang.exactType))
		assertTrue(mergeLang.implements.contains(MM1.exactType))
	}
	
	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}
	
	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
	
	def Metamodel getMM1()              { return root.elements.get(0) as Metamodel }
	def Metamodel getMM3()              { return root.elements.get(1) as Metamodel }
	def Mapping   getMapping()          { return root.elements.get(2) as Mapping }
	def Metamodel getMergeLang()       { return root.elements.get(3) as Metamodel }
	
	def ClassBinding getSuperABinding() { return mapping.rules.get(0) as ClassBinding}
	def ClassBinding getABinding()      { return mapping.rules.get(1) as ClassBinding}
	def ClassBinding getBBinding()      { return mapping.rules.get(2) as ClassBinding}
	def PropertyBinding getToABinding() { return BBinding.properties.get(0) as PropertyBinding}
	def PropertyBinding getToBBinding() { return ABinding.properties.get(0) as PropertyBinding}
	
}