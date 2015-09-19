package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.Language
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Merge
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fr.inria.diverse.melange.validation.MelangeValidationConstants
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/MergeTest.melange", withValidation = false)
class MergeTest
{
	@Inject MatchingHelper helper
	@Inject extension ValidationTestHelper
	@Inject extension ModelingElementExtensions
	
	@Test
	def void testPackagesSelfMatching() {
		val packagesPkg1 = "tests-inputs/metamodels/merge/MM1.ecore".loadEcore
		assertTrue(packagesPkg1.simpleMatch(MM1.exactType.pkgs.head))

		val packagesPkg2 = "tests-inputs/metamodels/merge/MM2.ecore".loadEcore
		assertTrue(packagesPkg2.simpleMatch(MM2.exactType.pkgs.head))
	}
	
	@Test
	def void testSelfMerge() {
		val packagesPkg1 = "tests-inputs/metamodels/merge/MM1.ecore".loadEcore
		assertTrue(packagesPkg1.simpleMatch(autoMerge1a.exactType.pkgs.head))
		assertTrue(packagesPkg1.simpleMatch(autoMerge1b.exactType.pkgs.head))

		val packagesPkg2 = "tests-inputs/metamodels/merge/MM2.ecore".loadEcore
		assertTrue(packagesPkg2.simpleMatch(autoMerge2a.exactType.pkgs.head))
		assertTrue(packagesPkg2.simpleMatch(autoMerge2b.exactType.pkgs.head))
	}
	
	@Test
	def void testImplements() {
		assertTrue(mergeLangA.implements.contains(MM1.exactType))
		assertTrue(mergeLangA.implements.contains(MM2.exactType))
	}
	
	@Test
	def void testStructuralCommutativity() {
		assertTrue(mergeLangA.implements.contains(mergeLangB.exactType))
		assertTrue(mergeLangB.implements.contains(mergeLangA.exactType))
	}
	
	@Test
	def void testEcore(){
		assertTrue(mergeEcore.implements.contains(MM1.exactType))
		assertTrue(mergeEcore.implements.contains(MM2.exactType))
		assertTrue(mergeEcore.implements.contains(mergeLangA.exactType))
		assertTrue(mergeEcore.implements.contains(mergeLangB.exactType))
	}
	
	@Test
	def void testBothMergeEcore() {
		assertTrue(bothLangA.implements.contains(MM1.exactType))
		assertTrue(bothLangA.implements.contains(MM2.exactType))
		assertTrue(bothLangA.implements.contains(mergeLangA.exactType))
		assertTrue(bothLangA.implements.contains(mergeLangB.exactType))
		
		assertTrue(bothLangB.implements.contains(MM1.exactType))
		assertTrue(bothLangB.implements.contains(MM2.exactType))
		assertTrue(bothLangB.implements.contains(mergeLangA.exactType))
		assertTrue(bothLangB.implements.contains(mergeLangB.exactType))
	}
	
	@Test
	def void testIncompatibleAttribute(){
		assertError((incompatibleMerge.operators.get(1) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.language,
					MelangeValidationConstants.MERGE_ATTRIBUTE_OVERRIDING,
					"Language \'Merge1\' has an attribute \'attribute\' typed EChar but in \'Merge2\' it is EFloat"
		)
	}
	
	@Test
	def void testIncompatibleReference(){
		assertError((incompatibleMerge.operators.get(1) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.language,
					MelangeValidationConstants.MERGE_REFERENCE_OVERRIDING,
					"Language \'Merge1\' has a reference \'reference\' typed Clazz but in \'Merge2\' it is EObject"
		)
	}
	
	@Test
	def void testIncompatibleOperation(){
		assertError((incompatibleMerge.operators.get(1) as Merge).targetLanguage,
					MelangePackage.eINSTANCE.language,
					MelangeValidationConstants.MERGE_OPERATION_OVERRIDING,
					"Language \'Merge1\' has an operation \'operation\' typed Clazz but in \'Merge2\' it is EBoolean"
		)
	}
	
	@Test
	def void testIncompatibleOperation2(){
		assertError((incompatibleMerge.operators.get(1) as Merge).targetLanguage,
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
	def Language getAutoMerge1a() { return root.elements.get(2) as Language }
	def Language getAutoMerge1b() { return root.elements.get(3) as Language }
	def Language getAutoMerge2a() { return root.elements.get(4) as Language }
	def Language getAutoMerge2b() { return root.elements.get(5) as Language }
	def Language getMergeLangA()  { return root.elements.get(6) as Language }
	def Language getMergeLangB()  { return root.elements.get(7) as Language }
	def Language getMergeEcore()  { return root.elements.get(8) as Language }
	def Language getBothLangA()   { return root.elements.get(9) as Language }
	def Language getBothLangB()   { return root.elements.get(10) as Language }
	def Language getMerge1()      { return root.elements.get(11) as Language }
	def Language getMerge2()      { return root.elements.get(12) as Language }
	def Language getIncompatibleMerge(){ return root.elements.get(13) as Language }
	
}