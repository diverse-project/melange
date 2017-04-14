package fr.inria.diverse.melange.tests

import fr.inria.diverse.melange.adapters.EObjectAdapter
import fr.inria.diverse.melange.resource.MelangeRegistry
import fr.inria.diverse.melange.resource.MelangeResourceImpl
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.*
import simplefsmtest.StandaloneSetup
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI
import fr.inria.diverse.melange.tests.common.MelangeTestHelper
import simplefsmtest.fsmmt.fsm.FSM
import java.io.File
import org.eclipse.emf.ecore.plugin.EcorePlugin
import org.eclipse.emf.ecore.util.EcoreUtil

class MultipleResourceTest
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
////		res = rs.getResource(
////			URI::createURI(
////			"melange:/file/tests-inputs/models/splitedFSM.xmi?mt=simplefsmtest.FsmMT")
////			, true)
//		wRes = (res as MelangeResourceImpl).wrappedResource
//		wRs = wRes.resourceSet
//		root = res.contents.head as FSM
//		wRoot = (root as EObjectAdapter<fsm.FSM>).adaptee
	}
	
	@Test
	def void testDowncast() {
		
		val file = new File("..")
		val path = URI.createFileURI(file.absolutePath)
		EcorePlugin.getPlatformResourceMap().put("fr.inria.diverse.melange.tests",path)
		
		val res = loadResource("melange:/resource/fr.inria.diverse.melange.tests/tests-inputs/models/Simple3.fsm?lang=simplefsmtest.TimedFsm")
		assertTrue(res instanceof MelangeResourceImpl)
		assertIsValid(res)
		assertIsTimedFsm(res)
		
		val realResource = res.contents.head.eResource
		val wrappedResource = (res as MelangeResourceImpl).wrappedResource
		assertEquals(realResource.allContents.size,wrappedResource.allContents.size)
		
		val crossRefState1 = res.contents.head.eCrossReferences.head
		val doubleCrossRefState1 = crossRefState1.eContainer.eCrossReferences.head
		
		assertNotNull(realResource)
		assertNotNull(crossRefState1.eResource)
		assertNotNull(doubleCrossRefState1.eResource)
		assertEquals("http://fsm//as/http://timedfsm//platform:/resource/fr.inria.diverse.melange.tests/tests-inputs/models/Simple3.fsm",realResource.URI.toString)
		assertEquals("http://fsm//as/http://timedfsm//platform:/resource/fr.inria.diverse.melange.tests/tests-inputs/models/Simple2.fsm",crossRefState1.eResource.URI.toString)
		assertEquals("http://fsm//as/http://timedfsm//platform:/resource/fr.inria.diverse.melange.tests/tests-inputs/models/Simple.fsm",doubleCrossRefState1.eResource.URI.toString)
		assertIsTimedFsm(realResource)
		assertIsTimedFsm(crossRefState1.eResource)
		assertIsTimedFsm(doubleCrossRefState1.eResource)
		
		compareFragments(wrappedResource, realResource)
		compareFragments(wrappedResource, crossRefState1.eResource)
		compareFragments(wrappedResource, doubleCrossRefState1.eResource)
	}
	
	@Test
	def void testDowncastAndModelType() {
		val file = new File("..")
		val path = URI.createFileURI(file.absolutePath)
		EcorePlugin.getPlatformResourceMap().put("fr.inria.diverse.melange.tests",path)
		
		val res = loadResource("melange:/resource/fr.inria.diverse.melange.tests/tests-inputs/models/Simple3.fsm?lang=simplefsmtest.TimedFsm&mt=simplefsmtest.FsmMT")
		assertTrue(res instanceof MelangeResourceImpl)
		assertIsValid(res)
		assertIsFsmMT(res)
		
		val fsm3 = res.contents.head as FSM
		val fsm3Init = fsm3.initialState
		val fsm2 = fsm3Init.owningFSM
		val fsm2Init = fsm2.initialState
		val fsm = fsm2Init.owningFSM
		
//		val r = fsm.eResource
//		val r2 = fsm2.eResource
//		val r3 = fsm3.eResource
		
		assertNotNull(fsm)
		assertNotNull(fsm2)
		assertNotNull(fsm3)
		assertNotEquals(fsm3,fsm2)
		assertNotEquals(fsm2,fsm)
		assertNotEquals(fsm3,fsm)
	}
	
	/*
	 * Compare same fragmentURIs in the two resources
	 */
	private def void compareFragments(Resource res1, Resource res2) {
		res1.allContents.forEach[srcElem |
			val fragmentURI = res1.getURIFragment(srcElem)
			val destElem = res2.getEObject(fragmentURI)
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
	
	private def Resource loadResource(String uri) {
		return rs.getResource(URI::createURI(uri), true)
	}
	
	private def assertIsTimedFsm(Resource res) {
		assertTrue(
			'''«res» content isn't typed by TimedFsm types''',
			res.allContents.forall[class.interfaces.exists[package.name == "timedfsm.fsm"]]
		)
	}
	
		private def assertIsFsmMT(Resource res) {
		assertTrue(
			'''«res.URI» content isn't typed by FsmMT types''',
			res.allContents.forall[class.interfaces.exists[package.name == "simplefsmtest.fsmmt.fsm"]]
		)
	}
}
