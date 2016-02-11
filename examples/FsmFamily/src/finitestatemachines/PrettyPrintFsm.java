package finitestatemachines;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import family.StandaloneSetup;
import family.flatfsmmt.fsm.StateMachine;

public class PrettyPrintFsm {
	public static void prettyPrint(StateMachine fsm) {
		System.out.println("Printing " + fsm.getName());

		fsm.getStates().forEach(s -> {
			System.out.println("State " + s.getName());

			s.getIncoming().forEach(t ->
				System.out.println(
					"\tIncoming "+ t.getName()
					+ " from " + t.getSource().getName()));
			s.getOutgoing().forEach(t ->
				System.out.println("\tOutgoing " + t.getName()
				+ " to " + t.getTarget().getName()));
		});

		System.out.println();
	}

	public static void main(String[] args) {
		StandaloneSetup.doSetup();
		ResourceSet rs = new ResourceSetImpl();

		List<String> models = new ArrayList<>();
		models.add("melange:/file/input/dummie.xmi?mt=family.FlatFsmMT");
		models.add("melange:/file/input/timeddummie.xmi?mt=family.FlatFsmMT");
		models.add("melange:/file/input/compositedummie.xmi?mt=family.FlatFsmMT");
		models.add("melange:/file/input/timedcompositedummie.xmi?mt=family.FlatFsmMT");

		for (String uri : models) {
			Resource res = rs.getResource(URI.createURI(uri), true);
			StateMachine root = (StateMachine) res.getContents().get(0);
			// Polymorphic invokation of prettyPrint()
			prettyPrint(root);
		}
	}
}
