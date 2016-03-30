package fr.inria.diverse.melange.tests

import fr.inria.diverse.melange.resource.loader.DozerLoader
import fr.inria.diverse.melange.resource.loader.ExtensionsAwareLoader
import fr.inria.diverse.melange.resource.loader.PackageCompatibilityException

import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource

import static org.junit.Assert.*

import org.junit.Before
import org.junit.Test

class DozerLoaderTest
{
	ExtensionsAwareLoader loader
	static final String FSM_INPUT  = "tests-inputs/models/Simple.fsm"
	static final String TFSM_INPUT = "tests-inputs/models/Simple.timedfsm"

	@Before
	def void setUp() {
		loader = new DozerLoader
		loader.initialize(fsm.FsmPackage.eINSTANCE, timedfsm.fsm.TimedfsmPackage.eINSTANCE)
	}

	@Test
	def void testRegistration() {
		assertTrue(EPackage$Registry.INSTANCE.containsKey(fsm.FsmPackage.eNS_URI))
		assertTrue(EPackage$Registry.INSTANCE.containsKey(timedfsm.fsm.TimedfsmPackage.eNS_URI))
		assertTrue(Resource$Factory$Registry.INSTANCE.extensionToFactoryMap.containsKey(fsm.FsmPackage.eNS_PREFIX))
		assertTrue(Resource$Factory$Registry.INSTANCE.extensionToFactoryMap.containsKey(timedfsm.fsm.TimedfsmPackage.eNS_PREFIX))
	}

	@Test
	def void testLoadExtendedAsBase() {
		val res = loader.loadExtendedAsBase(TFSM_INPUT, true)
		assertNotNull(res)

		// We loaded a Tfsm-conforming model and now we expect a fsm-conforming one
		assertTrue(res.contents.head instanceof fsm.FSM)
		val root = res.contents.head as fsm.FSM

		// Checking type correctness
		assertEquals(2, root.ownedState.size)
		assertEquals(1, root.ownedState.map[outgoingTransition].flatten.size)
		assertEquals(2, root.ownedState.filter(fsm.State).size)
		assertEquals(1, root.ownedState.map[outgoingTransition].flatten.filter(fsm.Transition).size)

		val s1 = root.ownedState.findFirst[name == "1"]
		val s2 = root.ownedState.findFirst[name == "2"]
		val t1 = s1.outgoingTransition.get(0)

		assertEquals("1", s1.name)
		assertEquals("2", s2.name)
		assertEquals("a", t1.input)
		assertEquals("1", t1.output)
		assertEquals(s1, t1.source)
		assertEquals(s2, t1.target)
	}

	@Test(expected = PackageCompatibilityException)
	def void testLoadIncorrectExtendedAsBase() {
		// Trying to use Fsm as extended metamodel should raise an exception
		loader.loadExtendedAsBase(FSM_INPUT, true)
	}

	@Test
	def void testLoadBaseAsExtended() {
		val res = loader.loadBaseAsExtended(FSM_INPUT, true)
		assertNotNull(res)

		// We loaded a Fsm-conforming model and now we expect a Tfsm-conforming one
		assertTrue(res.contents.head instanceof timedfsm.fsm.FSM)
		val root = res.contents.head as timedfsm.fsm.FSM

		// Checking type correctness
		assertEquals(4, root.ownedState.size)
		assertEquals(5, root.ownedState.map[outgoingTransition].flatten.size)
		assertEquals(4, root.ownedState.filter(timedfsm.fsm.State).size)
		assertEquals(5, root.ownedState.map[outgoingTransition].flatten.filter(timedfsm.fsm.Transition).size)

		val s1 = root.ownedState.findFirst[name == "1"]
		val s2 = root.ownedState.findFirst[name == "2"]
		val s3 = root.ownedState.findFirst[name == "3"]
		val s4 = root.ownedState.findFirst[name == "4"]
		val t1 = s1.outgoingTransition.get(0)
		val t2 = s1.outgoingTransition.get(1)
		val t3 = s2.outgoingTransition.get(0)
		val t4 = s2.outgoingTransition.get(1)
		val t5 = s3.outgoingTransition.get(0)

		assertEquals("1", s1.name)
		assertEquals("2", s2.name)
		assertEquals("3", s3.name)
		assertEquals("4", s4.name)
		assertEquals("a", t1.input)
		assertEquals("1", t1.output)
		assertEquals(s1,  t1.source)
		assertEquals(s2,  t1.target)
		assertEquals("b", t2.input)
		assertEquals("2", t2.output)
		assertEquals(s1,  t2.source)
		assertEquals(s3,  t2.target)
		assertEquals("d", t3.input)
		assertEquals("4", t3.output)
		assertEquals(s2,  t3.source)
		assertEquals(s3,  t3.target)
		assertEquals("e", t4.input)
		assertEquals("5", t4.output)
		assertEquals(s2,  t4.source)
		assertEquals(s4,  t4.target)
		assertEquals("c", t5.input)
		assertEquals("3", t5.output)
		assertEquals(s3,  t5.source)
		assertEquals(s2,  t5.target)

		// Features added by the extension should be "null"
		assertTrue(root.ownedState.map[outgoingTransition].flatten.forall[time == 0])
	}

	@Test(expected = PackageCompatibilityException)
	def void testLoadIncorrectBaseAsExtended() {
		// Trying to use Tfsm as base metamodel should raise an exception
		loader.loadBaseAsExtended(TFSM_INPUT, true)
	}
}
