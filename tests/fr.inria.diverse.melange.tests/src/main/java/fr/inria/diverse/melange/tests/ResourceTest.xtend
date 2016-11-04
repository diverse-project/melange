package fr.inria.diverse.melange.tests

import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.resource.MelangeRegistry
import fr.inria.diverse.melange.resource.MelangeResourceException
import fr.inria.diverse.melange.resource.MelangeResourceImpl
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.common.notify.impl.AdapterImpl
import org.eclipse.emf.common.util.Diagnostic
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.Diagnostician
import org.eclipse.emf.ecore.util.EContentAdapter
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.XMIResource
import org.junit.Before
import org.junit.Test
import simplefsmtest.StandaloneSetup
import simplefsmtest.fsm.adapters.fsmmt.fsm.FSMAdapter
import simplefsmtest.fsm.adapters.fsmmt.fsm.StateAdapter
import simplefsmtest.fsm.adapters.fsmmt.fsm.TransitionAdapter
import simplefsmtest.fsmmt.fsm.FSM
import simplefsmtest.fsmmt.fsm.FsmPackage

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
			"melange:/file/tests-inputs/models/Simple.fsm?mt=simplefsmtest.FsmMT")
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
		val res = loadResource("melange:/file/tests-inputs/models/Simple.fsm?mt=simplefsmtest.FsmMT")
		assertIsValid(res)
		assertIsFsmMT(res)
	}

	@Test
	def void testExactTypeLoad2() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.timedfsm?mt=simplefsmtest.TimedFsmMT")
		assertIsValid(res)
		assertIsTimedFsmMT(res)
	}

	@Test
	def void testUpcastLoad() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.timedfsm?mt=simplefsmtest.FsmMT")
		assertIsValid(res)
		assertIsFsmMT(res)
	}

	@Test(expected = MelangeResourceException)
	def void testForbiddenCastLoad() {
		loadResource("melange:/file/tests-inputs/models/Simple.fsm?mt=simplefsmtest.TimedFsmMT").contents
	}

	@Test
	def void testDownTranstypingLoad() {
		val res = loadResource("melange:/file/tests-inputs/models/Simple.fsm?lang=simplefsmtest.TimedFsm")
		assertIsValid(res)
		assertIsTimedFsm(res)
	}
	
	@Test
	def void testDowncast() {
		val res = loadResource("melange:/file/tests-inputs/models/Sample.fsm?lang=simplefsmtest.TimedFsm")
		assertIsValid(res)
		assertIsTimedFsm(res)
		assertTrue(res instanceof MelangeResourceImpl)
		
		val realResource = res.contents.head.eResource
		val wrappedResource = (res as MelangeResourceImpl).wrappedResource
		
		assertEquals(realResource.allContents.size,wrappedResource.allContents.size)
		
		// Compare same fragmentURIs in the two resources
		wrappedResource.allContents.forEach[srcElem |
			val fragmentURI = wrappedResource.getURIFragment(srcElem)
			val destElem = realResource.getEObject(fragmentURI)
			assertNotNull(destElem)
			
			// Try to compare names
			val nameAttr = srcElem.eClass.EAllAttributes.findFirst[it.name == "name"]
			if(nameAttr !== null){
				val srcName = srcElem.eGet(nameAttr);
				val nameAttr2 = destElem.eClass.EAllAttributes.findFirst[it.name == "name"]
				val destName = destElem.eGet(nameAttr2);
				assertEquals(srcName,destName)
			}
		]
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
	def void testNotifyEObject1() {
		val notifiers = newArrayList
		val adap = new AdapterImpl {
			override notifyChanged(Notification notif) {
				notifiers += notif.notifier
			}
		}
		root.eAdapters += adap
		root.ownedState.clear

		assertEquals(1, notifiers.size)
		assertTrue(notifiers.head instanceof fsm.FSM)
	}

	@Test
	def void testNotifyEObject2() {
		val notifiers = newArrayList
		val adap = new EContentAdapter {
			override notifyChanged(Notification notif) {
				notifiers += notif.notifier
			}
		}
		root.eAdapters += adap
		root.ownedState.clear

		assertEquals(5, notifiers.size)
	}

	@Test
	def void testNotifyResource1() {
		val notifiers = newArrayList
		val adap = new AdapterImpl {
			override notifyChanged(Notification notif) {
				notifiers += notif.notifier
			}
		}
		root.eResource.eAdapters += adap
		root.eResource.URI = URI.createURI("changed")

		assertEquals(1, notifiers.size)
		assertTrue(notifiers.head instanceof XMIResource)
	}

	@Test
	def void testNotifyResource2() {
		val notifiers = newArrayList
		val adap = new EContentAdapter {
			override notifyChanged(Notification notif) {
				notifiers += notif.notifier
			}
		}
		root.eResource.eAdapters += adap
		root.eResource.URI = URI.createURI("changed")

		assertEquals(1, notifiers.size)
		assertTrue(notifiers.head instanceof XMIResource)
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
	def void testURIFragments() {
		assertEquals("/",
			res.getURIFragment(root))
		assertEquals("//@ownedState.0",
			res.getURIFragment(root.ownedState.head))
		assertEquals("//@ownedState.0/@outgoingTransition.0",
			res.getURIFragment(root.ownedState.head.outgoingTransition.head))
	}

	@Test
	def void testGetEObject() {
		val wObj1 = wRes.getEObject("/") 
		val obj1 = res.getEObject("/")
		val wObj2 = wRes.getEObject("//@ownedState.0") 
		val obj2 = res.getEObject("//@ownedState.0")
		val wObj3 = wRes.getEObject("//@ownedState.0/@outgoingTransition.0") 
		val obj3 = res.getEObject("//@ownedState.0/@outgoingTransition.0")

		assertEquals(wObj1, (obj1 as FSMAdapter).adaptee)
		assertEquals(wObj2, (obj2 as StateAdapter).adaptee)
		assertEquals(wObj3, (obj3 as TransitionAdapter).adaptee)
	}

	@Test
	def void testStupidReflexiveURIGetEObject() {
		root.eAllContents.forEach[o |
			assertEquals(o, res.getEObject(res.getURIFragment(o)))
		]
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
	def void testSimpleSave() {
		val transition = root.ownedState.head.outgoingTransition.head
		transition.target.incomingTransition.remove(transition)
		EcoreUtil::delete(transition)
		res.URI = URI::createURI("output/Simple.fsm")
		res.save(null)
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
			res.allContents.forall[class.interfaces.exists[package.name == "simplefsmtest.fsmmt.fsm"]]
		)
	}

	private def assertIsTimedFsm(Resource res) {
		assertTrue(
			'''«res» content isn't typed by TimedFsm types''',
			res.allContents.forall[class.interfaces.exists[package.name == "timedfsm.fsm"]]
		)
	}

	private def assertIsTimedFsmMT(Resource res) {
		assertTrue(
			'''«res» content isn't typed by TimedFsmMT types''',
			res.allContents.forall[class.interfaces.exists[package.name == "simplefsmtest.timedfsmmt.fsm"]]
		)
	}
}
