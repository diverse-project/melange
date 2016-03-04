package inheritanceoverriding;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Loads each model conforming to A/B/C/D/X/Y/Z
 * as typed by their exact type AMT/BMT/CMT/DMT/XMY/YMT/ZMT
 * and checks overriding priorities between woven aspects
 */
public class OverridingTest
{
	@Before
	public void setUp() {
		StandaloneSetup.doSetup();
	}

	@Test
	public void testA() {
		inheritanceoverriding.amt.fsm.FSM root = loadModelA();

		assertEquals(0, root.getI1());
		assertEquals("A1::f1", root.f1());
	}

	@Test
	public void testB() {
		inheritanceoverriding.bmt.fsm.FSM root = loadModelB();
		inheritanceoverriding.bmt.fsm.State s = root.getOwnedState().get(0);
		inheritanceoverriding.bmt.fsm.Transition t = s.getOutgoingTransition().get(0);

		assertEquals(0, root.getI1());
		assertEquals("OverrideA1::f1", root.f1());
		assertEquals(0, s.getI5());
		assertEquals("B2::f5", s.f5());
		assertEquals(0, t.getI3());
		assertEquals("C1::f3", t.f3());
	}
	
	@Test
	public void testC() {
		inheritanceoverriding.cmt.fsm.FSM root = loadModelC();
		inheritanceoverriding.cmt.fsm.State s = root.getOwnedState().get(0);
		inheritanceoverriding.cmt.fsm.Transition t = s.getOutgoingTransition().get(0);

		assertEquals(0, root.getI1());
		assertEquals("OverrideA1::f1", root.f1());
		assertEquals(0, s.getI2());
		assertEquals(0, s.getI5());
		assertEquals("B1::f2", s.f2());
		assertEquals("B2::f5", s.f5());
		assertEquals(0, t.getI3());
		assertEquals("OverrideC1::f3", t.f3());
	}
	
	@Test
	public void testD() {
		inheritanceoverriding.dmt.fsm.FSM root = loadModelD();
		inheritanceoverriding.dmt.fsm.State s = root.getOwnedState().get(0);
		inheritanceoverriding.dmt.fsm.Transition t = s.getOutgoingTransition().get(0);

		assertEquals(0, root.getI1());
		assertEquals("OverrideA1::f1", root.f1());
		assertEquals(0, s.getI2());
		assertEquals(0, s.getI5());
		assertEquals("B1::f2", s.f2());
		assertEquals("OverrideB2::f5", s.f5());
		assertEquals(0, t.getI3());
		assertEquals(0, t.getI6());
		assertEquals("OverrideC1::f3", t.f3());
		assertEquals("C2::f6", t.f6());
	}
	
	@Test
	public void testX() {
		inheritanceoverriding.xmt.fsm.FSM root = loadModelX();
		inheritanceoverriding.xmt.fsm.State s = root.getOwnedState().get(0);
		inheritanceoverriding.xmt.fsm.Transition t = s.getOutgoingTransition().get(0);

		assertEquals(0, root.getI1());
		assertEquals("A1::f1", root.f1());
		assertEquals(0, s.getI2());
		assertEquals("B1::f2", s.f2());
		assertEquals(0, t.getI3());
		assertEquals("C1::f3", t.f3());
	}
	
	@Test
	public void testY() {
		inheritanceoverriding.ymt.fsm.FSM root = loadModelY();
		inheritanceoverriding.ymt.fsm.State s = root.getOwnedState().get(0);
		inheritanceoverriding.ymt.fsm.Transition t = s.getOutgoingTransition().get(0);

		assertEquals(0, root.getI1());
		assertEquals("A1::f1", root.f1());
		assertEquals(0, s.getI2());
		assertEquals(0, s.getI5());
		assertEquals("B1::f2", s.f2());
		assertEquals("B2::f5", s.f5());
		assertEquals(0, t.getI3());
		assertEquals("C1::f3", t.f3());
	}
	
	@Test
	public void testZ() {
		inheritanceoverriding.zmt.fsm.FSM root = loadModelZ();

		assertEquals(0, root.getI1());
		assertEquals("A1::f1", root.f1());
	}

	private inheritanceoverriding.amt.fsm.FSM loadModelA() {
		return (inheritanceoverriding.amt.fsm.FSM) loadModel(
			"A.xmi", "inheritanceoverriding.AMT");
	}

	private inheritanceoverriding.bmt.fsm.FSM loadModelB() {
		return (inheritanceoverriding.bmt.fsm.FSM) loadModel(
			"B.xmi", "inheritanceoverriding.BMT");
	}

	private inheritanceoverriding.cmt.fsm.FSM loadModelC() {
		return (inheritanceoverriding.cmt.fsm.FSM) loadModel(
			"C.xmi", "inheritanceoverriding.CMT");
	}
	
	private inheritanceoverriding.dmt.fsm.FSM loadModelD() {
		return (inheritanceoverriding.dmt.fsm.FSM) loadModel(
			"D.xmi", "inheritanceoverriding.DMT");
	}
	
	private inheritanceoverriding.xmt.fsm.FSM loadModelX() {
		return (inheritanceoverriding.xmt.fsm.FSM) loadModel(
			"X.xmi", "inheritanceoverriding.XMT");
	}
	
	private inheritanceoverriding.ymt.fsm.FSM loadModelY() {
		return (inheritanceoverriding.ymt.fsm.FSM) loadModel(
			"Y.xmi", "inheritanceoverriding.YMT");
	}
	
	private inheritanceoverriding.zmt.fsm.FSM loadModelZ() {
		return (inheritanceoverriding.zmt.fsm.FSM) loadModel(
			"Z.xmi", "inheritanceoverriding.ZMT");
	}

	private EObject loadModel(String uri, String mt) {
		ResourceSet rs = new ResourceSetImpl();
		Resource res = rs.getResource(URI.createURI(
			"melange:/file/input/" + uri + "?mt=" + mt), true);
		return res.getContents().get(0);
	}
}
