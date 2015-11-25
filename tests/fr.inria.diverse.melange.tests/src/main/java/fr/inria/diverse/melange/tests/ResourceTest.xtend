package fr.inria.diverse.melange.tests

import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.resource.MelangeRegistry
import fr.inria.diverse.melange.resource.MelangeResourceException
import fr.inria.diverse.melange.resource.MelangeResourceImpl
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EcoreUtil.ExternalCrossReferencer
import org.junit.Before
import org.junit.Test
import simplefsm.StandaloneSetup
import simplefsm.fsm.adapters.fsmmt.FSMAdapter
import simplefsm.fsm.adapters.fsmmt.StateAdapter
import simplefsm.fsm.adapters.fsmmt.TransitionAdapter
import simplefsm.fsmmt.fsm.FSM
import simplefsm.fsmmt.fsm.FsmPackage

import static org.junit.Assert.*

class ResourceTest
{
	extension MelangeTestHelper = new MelangeTestHelper
	ResourceSet rs
	Resource res
	Resource wRes
	ResourceSet wRs
	FSM root
	fsm.FSM wRoot

	@Before
	def void setUp() {
		rs = new ResourceSetImpl
		MelangeRegistry.INSTANCE.languageMap.clear
		MelangeRegistry.INSTANCE.modelTypeMap.clear
		StandaloneSetup::doSetup
		res = rs.getResource(
			URI::createURI(
			"melange:/file/tests-inputs/models/Simple.fsm?mt=simplefsm.FsmMT")
			, true)
		wRes = (res as MelangeResourceImpl).wrappedResource
		wRs = wRes.resourceSet
		root = res.contents.head as FSM
		wRoot = (root as EObjectAdapter<fsm.FSM>).adaptee
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

	@Test
	def void testValidation() {
		val d = Diagnostician::INSTANCE

		assertEquals(Diagnostic::OK, d.validate(wRoot).severity)
		assertEquals(Diagnostic::OK, d.validate(root).severity)
	}

	@Test
	def void testEListEquality() {
		assertEquals(wRoot.ownedState, wRoot.ownedState)
		assertEquals(root.ownedState, root.ownedState)
	}

	@Test
	def void testEObjectEquality() {
		assertEquals(root.ownedState.head, root.ownedState.head)
	}

	@Test
	def void testDifferentReferencesContainingSameObjectsEquality() {
		assertEquals(root.ownedState.get(2), root.finalState.head)
		assertEquals(root.ownedState.get(3), root.finalState.get(1))
	}

	@Test
	def void testEListContainsEObject() {
		assertTrue(root.ownedState.contains(root.ownedState.head))
	}

	@Test
	def void testEListContainsAllEObject() {
		assertTrue(root.ownedState.containsAll(root.ownedState))
	}

	@Test
	def void testEListIndexOfEObject() {
		assertEquals(0,  root.ownedState.indexOf(root.ownedState.head))
		assertEquals(-1, root.ownedState.indexOf(root))
	}

	@Test
	def void testEListIterator() {
		val i = root.ownedState.iterator

		assertEquals(4, i.size)
		assertTrue(i.forall[it instanceof StateAdapter])
	}

	@Test
	def void testEListListIterator() {
		val i1 = root.ownedState.listIterator
		val i2 = root.ownedState.listIterator(2)

		assertEquals(4, i1.size)
		assertTrue(i1.forall[it instanceof StateAdapter])
		assertEquals(2, i2.size)
		assertTrue(i2.forall[it instanceof StateAdapter])
	}

	@Test
	def void testEListRemove() {
		val own = root.ownedState
		val out = root.ownedState.head.outgoingTransition

		own.remove(0)
		assertEquals(3, own.size)

		own.remove(own.head)
		assertEquals(2, own.size)

		out.removeAll(out)
		assertEquals(0, out.size)
	}

	@Test
	def void testEListRetainAll() {
		root.ownedState.retainAll(#[root.ownedState.get(2)])

		assertEquals(1, root.ownedState.size)
		assertTrue(root.ownedState.head instanceof StateAdapter)
		assertEquals("3", root.ownedState.head.name)
	}

	@Test
	def void testEListSet() {
		val t = root.ownedState.head.outgoingTransition.head
		val out = root.ownedState.get(1).outgoingTransition
		val old = out.get(1)

		assertEquals(2, out.size)
		assertTrue(out.forall[it instanceof TransitionAdapter])
		val ret = out.set(1, t)
		assertEquals(old.input, ret.input)
		assertEquals(2, out.size)
		assertTrue(out.forall[it instanceof TransitionAdapter])
		assertEquals("a", out.get(1).input)
	}

	@Test
	def void testEListToArray() {
		assertEquals(4, root.ownedState.toArray.size)
		assertTrue(root.ownedState.toArray.forall[it instanceof StateAdapter])
	}

	@Test
	def void testSave() {
		val newRes = rs.createResource(URI::createURI("output.fsm"))
		newRes.contents += root

		try {
			newRes.save(null)
		} catch (Exception e) {
			e.printStackTrace
		}
	}

	@Test
	def void testEClass() {
		assertEquals(FsmPackage::eINSTANCE.FSM, root.eClass)
	}

	@Test
	def void testEResource() {
		val r = root.eResource

		assertTrue(r instanceof MelangeResourceImpl)
		assertEquals(res, r)
	}

	@Test
	def void testEContainer() {
		val s1 = root.ownedState.head
		val container = s1.eContainer

		assertTrue(container instanceof FSM)
		assertTrue(container instanceof FSMAdapter)
		assertEquals(FsmPackage::eINSTANCE.FSM, container.eClass)
		assertEquals(FsmPackage::eINSTANCE.state, s1.eClass)
		assertNull(container.eContainer)
	}

	@Test
	def void testEContainingFeature() {
		val s1 = root.ownedState.head
		val container = s1.eContainer
		val containingFeature = s1.eContainingFeature

		assertEquals(FsmPackage::eINSTANCE.FSM_OwnedState, containingFeature)
		assertEquals(container, s1.eGet(containingFeature))
		assertNull(container.eContainingFeature)
	}

	@Test
	def void testEContainmentFeature() {
		val s1 = root.ownedState.head
		val container = s1.eContainer
		val containmentFeature = s1.eContainmentFeature

		assertEquals(FsmPackage::eINSTANCE.FSM_OwnedState, containmentFeature)
		assertEquals(container, s1.eGet(containmentFeature))
		assertNull(container.eContainmentFeature)
	}

	@Test
	def void testECrossReferences() {
		val refs = root.eCrossReferences
		val wRefs = wRoot.eCrossReferences

		assertEquals(wRefs.size, refs.size)
	}

	@Test
	def void testResourceOfObjectXContainsObjectX() {
		assertTrue(root.eResource.contents.contains(root))
	}

	@Test
	def void testResourceOfWrappedObjectXContainsWrappedObjectX() {
		assertTrue(wRoot.eResource.contents.contains(wRoot))
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
			res.allContents.forall[class.interfaces.exists[package.name == "simplefsm.fsmmt.fsm"]]
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
			res.allContents.forall[class.interfaces.exists[package.name == "simplefsm.timedfsmmt.timedfsm"]]
		)
	}
}
