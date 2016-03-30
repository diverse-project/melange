package simplefsmtest;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup();
    setup.doEMFRegistration();
    setup.doAdaptersRegistration();
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	fsm.FsmPackage.eNS_URI,
    	fsm.FsmPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	timedfsm.fsm.TimedfsmPackage.eNS_URI,
    	timedfsm.fsm.TimedfsmPackage.eINSTANCE
    );
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    );
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    );
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor fsm = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"simplefsmtest.Fsm", "", "http://fsm/", "simplefsmtest.FsmMT"
    );
    fsm.addAdapter("simplefsmtest.FsmMT", simplefsmtest.fsm.adapters.fsmmt.FsmAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"simplefsmtest.Fsm",
    	fsm
    );
    MelangeRegistry.LanguageDescriptor timedFsm = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"simplefsmtest.TimedFsm", "", "http://timedfsm/", "simplefsmtest.TimedFsmMT"
    );
    timedFsm.addAdapter("simplefsmtest.FsmMT", simplefsmtest.timedfsm.adapters.fsmmt.TimedFsmAdapter.class);
    timedFsm.addAdapter("simplefsmtest.TimedFsmMT", simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"simplefsmtest.TimedFsm",
    	timedFsm
    );
    MelangeRegistry.ModelTypeDescriptor fsmMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"simplefsmtest.FsmMT", "", "http://fsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"simplefsmtest.FsmMT",
    	fsmMT
    );
    MelangeRegistry.ModelTypeDescriptor timedFsmMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"simplefsmtest.TimedFsmMT", "", "http://timedfsmmt/"
    );
    timedFsmMT.addSuperType("simplefsmtest.FsmMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"simplefsmtest.TimedFsmMT",
    	timedFsmMT
    );
  }
}
