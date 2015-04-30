package simplefsm;

@SuppressWarnings("all")
public class StandaloneSetup {
  public static void doSetup() {
    StandaloneSetup setup = new StandaloneSetup() ;
    setup.doEMFRegistration() ;
    setup.doAdaptersRegistration() ;
  }
  
  public void doEMFRegistration() {
    org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
    	fsm.FsmPackage.eNS_URI,
    	fsm.FsmPackage.eINSTANCE
    ) ;
    org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.put(
    	timedfsm.TimedfsmPackage.eNS_URI,
    	timedfsm.TimedfsmPackage.eINSTANCE
    ) ;
    
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
    	"*",
    	new org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl()
    ) ;
    org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getProtocolToFactoryMap().put(
    	"melange",
    	new fr.inria.diverse.melange.resource.MelangeResourceFactoryImpl()
    ) ;
  }
  
  public void doAdaptersRegistration() {
    fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl fsm = new fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl(
    	"simplefsm.Fsm", "", "http://fsm/", "simplefsm.FsmMT"
    ) ;
    fsm.addAdapter("simplefsm.FsmMT", simplefsm.fsm.adapters.fsmmt.FsmAdapter.class) ;
    fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"simplefsm.Fsm",
    	fsm
    ) ;
    fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl timedFsm = new fr.inria.diverse.melange.resource.MelangeRegistryImpl.LanguageDescriptorImpl(
    	"simplefsm.TimedFsm", "", "http://timedfsm/", "simplefsm.TimedFsmMT"
    ) ;
    timedFsm.addAdapter("simplefsm.FsmMT", simplefsm.timedfsm.adapters.fsmmt.TimedFsmAdapter.class) ;
    timedFsm.addAdapter("simplefsm.TimedFsmMT", simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmAdapter.class) ;
    fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"simplefsm.TimedFsm",
    	timedFsm
    ) ;
    fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl fsmMT = new fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"simplefsm.FsmMT", "", "http://fsmmt/"
    ) ;
    fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"simplefsm.FsmMT",
    	fsmMT
    ) ;
    fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl timedFsmMT = new fr.inria.diverse.melange.resource.MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"simplefsm.TimedFsmMT", "", "http://timedfsmmt/"
    ) ;
    timedFsmMT.addSuperType("simplefsm.FsmMT") ;
    fr.inria.diverse.melange.resource.MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"simplefsm.TimedFsmMT",
    	timedFsmMT
    ) ;
  }
}
