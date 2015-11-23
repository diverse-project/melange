package simplefsm;

import fr.inria.diverse.melange.resource.MelangeRegistry;
import fr.inria.diverse.melange.resource.MelangeRegistryImpl;
import fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup() ;
    setup.doEMFRegistration() ;
    setup.doAdaptersRegistration() ;
  }
  
  public void doEMFRegistration() {
    EPackage.Registry.INSTANCE.put(
    	fsm.FsmPackage.eNS_URI,
    	fsm.FsmPackage.eINSTANCE
    ) ;
    EPackage.Registry.INSTANCE.put(
    	timedfsm.TimedfsmPackage.eNS_URI,
    	timedfsm.TimedfsmPackage.eINSTANCE
    ) ;
    
    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new XMIResourceFactoryImpl()
    ) ;
    Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new MelangeResourceFactoryImpl()
    ) ;
  }
  
  public void doAdaptersRegistration() {
    MelangeRegistry.LanguageDescriptor fsm = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"simplefsm.Fsm", "", "http://fsm/", "simplefsm.FsmMT"
    ) ;
    fsm.addAdapter("simplefsm.FsmMT", simplefsm.fsm.adapters.fsmmt.FsmAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"simplefsm.Fsm",
    	fsm
    ) ;
    MelangeRegistry.LanguageDescriptor timedFsm = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"simplefsm.TimedFsm", "", "http://timedfsm/", "simplefsm.TimedFsmMT"
    ) ;
    timedFsm.addAdapter("simplefsm.FsmMT", simplefsm.timedfsm.adapters.fsmmt.TimedFsmAdapter.class) ;
    timedFsm.addAdapter("simplefsm.TimedFsmMT", simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmAdapter.class) ;
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"simplefsm.TimedFsm",
    	timedFsm
    ) ;
    MelangeRegistry.ModelTypeDescriptor fsmMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"simplefsm.FsmMT", "", "http://fsmmt/"
    ) ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"simplefsm.FsmMT",
    	fsmMT
    ) ;
    MelangeRegistry.ModelTypeDescriptor timedFsmMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"simplefsm.TimedFsmMT", "", "http://timedfsmmt/"
    ) ;
    timedFsmMT.addSuperType("simplefsm.FsmMT") ;
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"simplefsm.TimedFsmMT",
    	timedFsmMT
    ) ;
  }
}
