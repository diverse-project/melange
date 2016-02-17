package simplefsm;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import simplefsm.fsmmt.fsm.FSM;

public class Main {
	public static void prettyPrint(FSM fsm) {
		fsm.getOwnedState().forEach(s -> {
			System.out.println("State " + s.getName());
			s.getIncomingTransition().forEach(t ->
				System.out.println("\tIn " + t.getInput() + "/" + t.getOutput()));
			s.getOutgoingTransition().forEach(t ->
				System.out.println("\tOut " + t.getInput() + "/" + t.getOutput()));
		});
		System.out.println();
	}

	public static void main(String[] args) {
		StandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();
		Resource fsmRes  = rs.getResource(
			URI.createURI("melange:/file/input/Simple.fsm?mt=simplefsm.FsmMT"), true);
		Resource tfsmRes  = rs.getResource(
			URI.createURI("melange:/file/input/Simple.timedfsm?mt=simplefsm.FsmMT"), true);

		prettyPrint((FSM) fsmRes.getContents().get(0));
		prettyPrint((FSM) tfsmRes.getContents().get(0));
	}
}
