package finitestatemachines;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EPackage;
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

public class FlattenFsmATL {
	public static void runATL(String inputURI, String outputURI) {
		try {
			ILauncher transformationLauncher = new EMFVMLauncher();
			ModelFactory modelFactory = new EMFModelFactory();
			IInjector injector = new EMFInjector();
			IExtractor extractor = new EMFExtractor();

			IReferenceModel cfsmmt = modelFactory.newReferenceModel();
			injector.inject(cfsmmt, "http://compositefsmmt/");
			IReferenceModel ffsm = modelFactory.newReferenceModel();
			injector.inject(ffsm, "http://fsm/");

			IModel inModel = modelFactory.newModel(cfsmmt);
			injector.inject(inModel, inputURI);

			IModel outModel = modelFactory.newModel(ffsm);
			transformationLauncher.initialize(new HashMap<String,Object>());
			transformationLauncher.addInModel(inModel, "IN", "CompositeFsmMT");
			transformationLauncher.addOutModel(outModel, "OUT", "FlatFsm");
			transformationLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(), new HashMap<String,Object>(),
				new FileInputStream("../FsmFamily/src/finitestatemachines/FlattenFsm.asm"));

			extractor.extract(outModel, "output/" + outputURI);

			EMFModelFactory emfModelFactory = (EMFModelFactory) modelFactory;
			emfModelFactory.unload((EMFModel) inModel);
			emfModelFactory.unload((EMFModel) outModel);
			emfModelFactory.unload((EMFReferenceModel) cfsmmt);
			emfModelFactory.unload((EMFReferenceModel) ffsm);
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		EPackage.Registry.INSTANCE.put(family.compositefsmmt.fsm.FsmPackage.eNS_URI,
				family.compositefsmmt.fsm.FsmPackage.eINSTANCE);
		family.StandaloneSetup.doSetup();

		// Polymorphic ATL invocation
		System.out.println("runATL:\n");
		runATL("melange:/file/input/compositedummie.xmi?mt=family.CompositeFsmMT",
				"OutputATLFsm.fsm");
	}
}
