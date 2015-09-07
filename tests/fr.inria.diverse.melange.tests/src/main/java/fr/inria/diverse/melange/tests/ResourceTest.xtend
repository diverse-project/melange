package fr.inria.diverse.melange.tests

import fr.inria.diverse.melange.resource.MelangeResourceException
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Before
import org.junit.Test
import simplefsm.StandaloneSetup

import static org.junit.Assert.*

class ResourceTest
{
	extension MelangeTestHelper = new MelangeTestHelper
	ResourceSet rs

	@Before
	def void setUp() {
		rs = new ResourceSetImpl
		fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.languageMap.clear
		fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.modelTypeMap.clear
		StandaloneSetup::doSetup
	}

	@Test
	def void testFallbackLoad1() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.fsm")
		assertIsValid(res)
		assertIsFsm(res)
	}

	@Test
	def void testFallbackLoad2() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.timedfsm")
		assertIsValid(res)
		assertIsTimedFsm(res)
	}

	@Test
	def void testExactTypeLoad1() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.fsm?mt=simplefsm.FsmMT")
		assertIsValid(res)
		assertIsFsmMT(res)
	}

	@Test
	def void testExactTypeLoad2() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.timedfsm?mt=simplefsm.TimedFsmMT")
		assertIsValid(res)
		assertIsTimedFsmMT(res)
	}

	@Test
	def void testUpcastLoad() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.timedfsm?mt=simplefsm.FsmMT")
		assertIsValid(res)
		assertIsFsmMT(res)
	}

	@Test(expected = MelangeResourceException)
	def void testForbiddenCastLoad() {
		loadResource("melange:/file/tests-inputs/models/Simple.fsm?mt=simplefsm.TimedFsmMT").contents
	}

	@Test
	def void testDownTranstypingLoad() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.fsm?lang=simplefsm.TimedFsm")
		assertIsValid(res)
		assertIsTimedFsm(res)
	}

	private def Resource loadResource(String uri) {
		return rs.getResource(URI::createURI(uri), true)
	}

	private def assertIsFsm(Resource res) {
		assertTrue(
			'''«res» content isn't typed by Fsm types''',
			res.allContents.forall[class.interfaces.exists[package.name == "fsm"]]
		)
	}

	private def assertIsFsmMT(Resource res) {
		assertTrue(
			'''«res.URI» content isn't typed by FsmMT types''',
			res.allContents.forall[class.interfaces.exists[package.name == "simplefsm.fsmmt"]]
		)
	}

	private def assertIsTimedFsm(Resource res) {
		assertTrue(
			'''«res» content isn't typed by TimedFsm types''',
			res.allContents.forall[class.interfaces.exists[package.name == "timedfsm"]]
		)
	}

	private def assertIsTimedFsmMT(Resource res) {
		assertTrue(
			'''«res» content isn't typed by TimedFsmMT types''',
			res.allContents.forall[class.interfaces.exists[package.name == "simplefsm.timedfsmmt"]]
		)
	}
}
