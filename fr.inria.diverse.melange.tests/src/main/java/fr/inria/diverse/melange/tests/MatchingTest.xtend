package fr.inria.diverse.melange.tests

import com.google.inject.Inject

import fr.inria.diverse.melange.lib.MatchingHelper

import fr.inria.diverse.melange.tests.common.MelangeTestsInjectorProvider

import java.util.Collections

import org.eclipse.emf.common.util.URI

import org.eclipse.emf.ecore.EPackage

import org.eclipse.emf.ecore.resource.Resource

import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl

import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner

import org.junit.Before
import org.junit.Test

import org.junit.runner.RunWith

import static org.junit.Assert.*

@RunWith(XtextRunner)
@InjectWith(MelangeTestsInjectorProvider)
class MatchingTest
{
	@Inject MatchingHelper helper

	@Before
	def void setUp() {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put(
			"ecore", new EcoreResourceFactoryImpl
		)
	}

	@Test
	def void testEcoreSelfMatching() {
		val ecorePkg = "tests-inputs/metamodels/Ecore.ecore".loadEcore

		assertTrue(ecorePkg.simpleMatch(ecorePkg))
	}

	@Test
	def void testPackagesSelfMatching() {
		val packagesPkg = "tests-inputs/metamodels/PackagesTest.ecore".loadEcore

		assertTrue(packagesPkg.simpleMatch(packagesPkg))
	}

	@Test
	def void testValidMatching1() {
		val fsmPkg =  "tests-inputs/metamodels/FSM.ecore".loadEcore
		val tfsmPkg = "tests-inputs/metamodels/TimedFSM.ecore".loadEcore

		assertFalse(fsmPkg.simpleMatch(tfsmPkg))
		assertTrue(tfsmPkg.simpleMatch(fsmPkg))
	}

	@Test
	def void testSelfCycleMatching() {
		val cyclePkg = "tests-inputs/metamodels/matching/Cycle.ecore".loadEcore

		assertTrue(cyclePkg.simpleMatch(cyclePkg))
	}

	@Test
	def void testSubCycleMatching() {
		val cyclePkg = "tests-inputs/metamodels/matching/Cycle.ecore".loadEcore
		val subcyclePkg = "tests-inputs/metamodels/matching/SubCycle.ecore".loadEcore

		assertTrue(subcyclePkg.simpleMatch(cyclePkg))
		assertFalse(cyclePkg.simpleMatch(subcyclePkg))
	}

	@Test
	def void testInvalidFsmRef() {
		val fsmPkg = "tests-inputs/metamodels/FSM.ecore".loadEcore
		val fsmRefPkg = "tests-inputs/metamodels/matching/FSMBadRef.ecore".loadEcore

		assertFalse(fsmPkg.simpleMatch(fsmRefPkg))
		assertFalse(fsmRefPkg.simpleMatch(fsmPkg))
	}

	private def EPackage loadEcore(String uri) {
		val rs = new ResourceSetImpl
		val res = rs.getResource(URI.createURI(uri), true)

		return res.contents.head as EPackage
	}

	private def boolean simpleMatch(EPackage pkgA, EPackage pkgB) {
		return helper.match(Collections.singletonList(pkgA), Collections.singletonList(pkgB))
	}
}
