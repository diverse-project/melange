package simpleaspects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import simpleaspects.fsmmt.fsm.FSM;

public class Main {
	public static void execute(FSM fsm) {
		System.out.print("Output: ");
		fsm.execute("adcdce");
		System.out.println();
	}

	public static void reflexivePrettyPrint(EObject o) {
		o.eClass().getEStructuralFeatures().forEach(f -> {
			System.out.println(f.getName() + " = " + o.eGet(f));
			o.eContents().forEach(c -> reflexivePrettyPrint(c));
		});
	}

	public static void main(String[] args) {
		StandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();
		Resource fsmRes  = rs.getResource(
			URI.createURI("melange:/file/input/Simple.fsm?mt=simpleaspects.FsmMT"), true);
		Resource tfsmRes  = rs.getResource(
			URI.createURI("melange:/file/input/Simple.timedfsm?mt=simpleaspects.FsmMT"), true);

		execute((FSM) fsmRes.getContents().get(0));
		execute((FSM) tfsmRes.getContents().get(0));
		System.out.println();
		reflexivePrettyPrint(fsmRes.getContents().get(0));
		reflexivePrettyPrint(tfsmRes.getContents().get(0));
	}
}
