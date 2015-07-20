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
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/OperatorMappingTest.melange")
class OperatorMappingTest
{
	@Inject MatchingHelper helper
	@Inject extension ModelingElementExtensions
	
	
	@Test
	def void testStructure4ecore(){
		assertEquals(1, renameEcoreMM1.syntax.pkgs.size)
		assertEquals("newpackage", renameEcoreMM1.syntax.pkgs.get(0).name)
		
		assertEquals(7, renameEcoreMM1.syntax.pkgs.get(0).EClassifiers.size
		)
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
		
		assertEquals(7, renameMergeMM1.syntax.pkgs.get(0).EClassifiers.size
		)
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
		
		assertEquals(4, renameSliceMM1.syntax.pkgs.get(0).EClassifiers.size
		)
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
	
	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}
	
	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB), null)
	}
	
	def Language getMM1()              { return root.elements.get(0) as Language }
	def Language getRenameEcoreMM1()   { return root.elements.get(1) as Language }
	def Language getRenameMergeMM1()   { return root.elements.get(2) as Language }
	def Language getRenameSliceMM1()   { return root.elements.get(3) as Language }
	
	def List<EClass> getRenamedEcoreClasses() {return getRenameEcoreMM1.syntax.pkgs.get(0).EClassifiers.filter(EClass).toList}
	def List<EClass> getRenamedMergeClasses() {return getRenameMergeMM1.syntax.pkgs.get(0).EClassifiers.filter(EClass).toList}
	def List<EClass> getRenamedSliceClasses() {return getRenameSliceMM1.syntax.pkgs.get(0).EClassifiers.filter(EClass).toList}	
	
}