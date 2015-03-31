package fr.inria.diverse.melange.tests

import adapters.fsm.adapters.fsmmt.FsmAdapter
import adapters.fsmmt.FSM
import adapters.timedfsm.adapters.fsmmt.TimedFsmAdapter
import fr.inria.diverse.melange.resource.MelangeResourceException
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl
import fr.inria.diverse.melange.resource.MelangeResourceImpl
import fr.inria.diverse.melange.resource.ModelTypeAdapter
import fsm.FsmPackage
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.XMIResource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.junit.Before
import org.junit.Test
import timedfsm.TimedfsmPackage

import static org.junit.Assert.*

class ResourceTest
{
/*	ResourceSet rs

	@Test
	def void testExactLoad1() {
		val uri = "melange:/../fr.inria.diverse.melange.tests/tests-inputs/models/Simple.fsm?mt=FsmMT"
		val res = uri.getResource

		val roots = res.contents
		assertEquals(1, roots.size)

		val root = roots.head
		assertTrue(root instanceof FSM)
		val fsm = root as FSM
		assertEquals(4, fsm.ownedState.size)
	}

	@Test
	def void testExactLoad2() {
		val uri = "melange:/../fr.inria.diverse.melange.tests/tests-inputs/models/Simple.timedfsm?mt=TimedFsmMT"
		val res = uri.getResource

		val roots = res.contents
		assertEquals(1, roots.size)

		val root = roots.head
		assertTrue(root instanceof adapters.timedfsmmt.FSM)
		val fsm = root as adapters.timedfsmmt.FSM
		assertEquals(2, fsm.ownedState.size)
	}

	@Test
	def void testUpcastLoad() {
		val uri = "melange:/../fr.inria.diverse.melange.tests/tests-inputs/models/Simple.timedfsm?mt=FsmMT"
		val res = uri.getResource

		val roots = res.contents
		assertEquals(1, roots.size)

		val root = roots.head
		assertTrue(root instanceof FSM)
		val fsm = root as FSM
		assertEquals(2, fsm.ownedState.size)
	}

	@Test
	def void testFallbackLoading() {
		val uri = "melange:/../fr.inria.diverse.melange.tests/tests-inputs/models/Simple.fsm"
		val res = uri.getResource

		assertTrue(res instanceof XMIResource)
		assertFalse(res instanceof MelangeResourceImpl)
	}

	@Test(expected = MelangeResourceException)
	def void testNoAdapter() {
		val uri = "melange:/../fr.inria.diverse.melange.tests/tests-inputs/models/Simple.fsm?mt=Invalid"
		val res = uri.getResource

		res.contents.head
	}

	@Before
	def void setUp() {
		rs = new ResourceSetImpl

		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("fsm", new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("timedfsm", new XMIResourceFactoryImpl)
		Resource.Factory.Registry.INSTANCE.protocolToFactoryMap.put("melange", new MelangeResourceFactoryImpl)
		EPackage.Registry.INSTANCE.put(FsmPackage.eNS_URI, FsmPackage.eINSTANCE)
		EPackage.Registry.INSTANCE.put(TimedfsmPackage.eNS_URI, TimedfsmPackage.eINSTANCE)
		ModelTypeAdapter.Registry.INSTANCE.registerAdapter(
			FsmPackage.eNS_URI,
			"FsmMT",
			FsmAdapter
		)
		ModelTypeAdapter.Registry.INSTANCE.registerAdapter(
			TimedfsmPackage.eNS_URI,
			"FsmMT",
			TimedFsmAdapter
		)
		ModelTypeAdapter.Registry.INSTANCE.registerAdapter(
			TimedfsmPackage.eNS_URI,
			"TimedFsmMT",
			adapters.timedfsm.adapters.timedfsmmt.TimedFsmAdapter
		)
	}

	private def getResource(String uri) {
		return rs.getResource(URI::createURI(uri), true)
	}
*/
}
