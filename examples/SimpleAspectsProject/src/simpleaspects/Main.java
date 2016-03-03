package simpleaspects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
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

	public static void prettyPrint(FSM fsm) {
		fsm.getOwnedState().forEach(s -> {
			System.out.println("State" + s.getName());
			s.getIncomingTransition().forEach(t -> {
				System.out.println("\tIncoming " + t.getInput() + "(" + t.getOutput() + ")");
			});
			s.getOutgoingTransition().forEach(t -> {
				System.out.println("\tOutgoing " + t.getInput() + "(" + t.getOutput() + ")");
			});
		});
	}

	public static void reflexivePrettyPrint(EObject o) {
		o.eClass().getEStructuralFeatures().forEach(f -> {
			System.out.println(f.getName() + " = " + o.eGet(f));
			o.eContents().forEach(c -> reflexivePrettyPrint(c));
		});
	}

	public static void runQVTo(String inputURI, String outputURI) {
		ResourceSet rs = new ResourceSetImpl();
		Resource inRes = rs.getResource(URI.createURI(inputURI), true);
		EList<EObject> inObjects = inRes.getContents();
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
			List<EObject> outObjects = output.getContents();
			URI outUri = URI.createURI("output/" + outputURI);
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

	public static void runATL(String inputURI, String outputURI) {
		try {
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();

			IReferenceModel fsmmt = modelFactory.newReferenceModel();
			injector.inject(fsmmt, "http://fsmmt/");
			IReferenceModel fsm = modelFactory.newReferenceModel();
			injector.inject(fsm, "http://fsm/");

			IModel inModel = modelFactory.newModel(fsmmt);
			injector.inject(inModel, inputURI);

			IModel outModel = modelFactory.newModel(fsm);
			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(inModel, "IN", "FsmMT");
			transformationLauncher.addOutModel(outModel, "OUT", "Fsm");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
				new FileInputStream("../SimpleFsmATL/DummyInvert.asm"));

			extractor.extract(outModel, "output/" + outputURI);

			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) inModel);
			emfModelFactory.unload((EMFModel) outModel);
			emfModelFactory.unload((EMFReferenceModel) fsmmt);
			emfModelFactory.unload((EMFReferenceModel) fsm);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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

		// Polymorphic execution
		System.out.println("execute:\n");
		execute((FSM) fsmRes.getContents().get(0));
		execute((FSM) tfsmRes.getContents().get(0));

		// Polymorphic prettyPrint
		System.out.println("prettyPrint:\n");
		prettyPrint((FSM) fsmRes.getContents().get(0));
		prettyPrint((FSM) tfsmRes.getContents().get(0));

		// Polymorphic reflexive prettyPrint
		System.out.println("reflexivePrettyPrint:\n");
		reflexivePrettyPrint(fsmRes.getContents().get(0));
		reflexivePrettyPrint(tfsmRes.getContents().get(0));

		// Polymorphic QVTo invocation
		System.out.println("runQVTo:\n");
		runQVTo("melange:/file/input/Simple.fsm?mt=simpleaspects.FsmMT",
				"OutputQVToFsm.fsm");
		runQVTo("melange:/file/input/Simple.timedfsm?mt=simpleaspects.FsmMT",
				"OutputQVToTimedFsm.fsm");

		// Polymorphic ATL invocation
		System.out.println("runATL:\n");
		runATL("melange:/file/input/Simple.fsm?mt=simpleaspects.FsmMT",
				"OutputATLFsm.fsm");
		runATL("melange:/file/input/Simple.timedfsm?mt=simpleaspects.FsmMT",
				"OutputATLTimedFsm.fsm");
	}
}
