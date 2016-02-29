package simpleaspects;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.Log;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

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

	public static void runQVTo(EList<EObject> inObjects) {
		URI transformationURI = URI.createFileURI(
			"/home/dig/git/melange/examples/SimpleFsmQVTo/transforms/DummyInvert.qvto");
		TransformationExecutor executor = new TransformationExecutor(transformationURI);
		ExecutionContextImpl context = new ExecutionContextImpl();
		ModelExtent input = new BasicModelExtent(inObjects);
		ModelExtent output = new BasicModelExtent();
		OutputStreamWriter outStream = new OutputStreamWriter(System.out);
		Log log = new WriterLog(outStream);
		context.setLog(log);

		ExecutionDiagnostic result = executor.execute(context, input, output);

		if(result.getSeverity() == Diagnostic.OK) {
			System.out.println("QVTo successfully invoked!");
			List<EObject> outObjects = output.getContents();
			ResourceSet rs = new ResourceSetImpl();
			URI outUri = URI.createURI("/home/dig/git/melange/examples/SimpleAspectsProject/output/out.fsm");
			Resource res = rs.createResource(outUri);
			res.getContents().addAll(outObjects);
			try {
				res.save(Collections.emptyMap());
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			IStatus status = BasicDiagnostic.toIStatus(result);
			System.err.println("Error status " + status);
		}
	}

	public static void main(String[] args) {
		EPackage.Registry.INSTANCE.put(simpleaspects.fsmmt.fsm.FsmPackage.eNS_URI,
				simpleaspects.fsmmt.fsm.FsmPackage.eINSTANCE);
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
		System.out.println();
		runQVTo(fsmRes.getContents());
	}
}
