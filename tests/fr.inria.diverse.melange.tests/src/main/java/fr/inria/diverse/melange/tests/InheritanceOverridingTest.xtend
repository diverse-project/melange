package fr.inria.diverse.melange.tests

import com.google.inject.Inject
import fr.inria.diverse.melange.ast.LanguageExtensions
import fr.inria.diverse.melange.ast.ModelTypeExtensions
import fr.inria.diverse.melange.ast.ModelingElementExtensions
import fr.inria.diverse.melange.lib.MatchingHelper
import fr.inria.diverse.melange.metamodel.melange.ModelTypingSpace
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider
import fr.inria.diverse.melange.tools.xtext.testing.XtextTest
import fsm.FsmPackage
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
@XtextTest(rootType = ModelTypingSpace, inputFile = "tests-inputs/melange/InheritanceOverridingTest.melange")
class InheritanceOverridingTest
{
	@Inject MatchingHelper helper
	@Inject extension MelangeTestHelper
	@Inject extension ModelingElementExtensions
	@Inject extension LanguageExtensions
	@Inject extension ModelTypeExtensions

	@Test
	def void testLangA() {
		val a = root.l("A")
		val amt = root.mt("AMT")
		val zmt = root.mt("ZMT")

		assertNotNull(a)
		assertEquals("A", a.name)
		assertNotNull(a.syntax)
		assertEquals("platform:/resource/inheritanceoverriding.a/model/A.ecore", a.syntax.ecoreUri)
		assertEquals(1, a.syntax.genmodelUris.size)
		assertEquals("platform:/resource/inheritanceoverriding.a/model/A.genmodel", a.syntax.genmodelUris.head)
		assertTrue(a.generatedByMelange)
		assertEquals(2, a.implements.size)
		assertImplements(a, amt)
		assertImplements(a, zmt)
		assertEquals(0, a.superLanguages.size)
		assertTrue(a.superLanguages.empty)
		assertEquals(2, a.operators.size)
	}

	@Test
	def void testAspectsA() {
		val a = root.l("A")
		assertEquals(1, a.allAspects.size)
		val a1 = a.allAspects.head
		assertEquals("inheritanceoverriding.A1", a1.identifier)
	}

	@Test
	def void testFindAspectsOnA() {
		val a = root.l("A")
		val aspOnFsm = a.findAspectsOn(FsmPackage.Literals.FSM) 

		assertEquals(1, aspOnFsm.size)
		assertEquals("inheritanceoverriding.A1", aspOnFsm.head.aspectTypeRef.identifier)
	}

	@Test
	def void testAMT() {
		val amt = root.mt("AMT")

		assertNotNull(amt)
		assertEquals("AMT", amt.name)
		assertEquals("http://inheritanceoverriding.amt/", amt.uri)
		assertEquals(1, amt.pkgs.size)
		assertEquals(3, amt.pkgs.head.EClassifiers.size)
		assertEObjectExists(amt, "fsm/FSM/#i1[EInt]")
		assertEObjectExists(amt, "fsm/FSM/@f1[void]")
	}
	
}
