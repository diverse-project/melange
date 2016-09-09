package fr.inria.diverse.melanger;

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
    	fr.inria.diverse.minifsm.MinifsmPackage.eNS_URI,
    	fr.inria.diverse.minifsm.MinifsmPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.melanger.miniactionlang.minilang.MinilangPackage.eNS_URI,
    	fr.inria.diverse.melanger.miniactionlang.minilang.MinilangPackage.eINSTANCE
    );
    EPackage.Registry.INSTANCE.put(
    	fr.inria.diverse.melanger.melangedlang.minifsm.MinifsmPackage.eNS_URI,
    	fr.inria.diverse.melanger.melangedlang.minifsm.MinifsmPackage.eINSTANCE
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
    MelangeRegistry.LanguageDescriptor miniFsm = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.melanger.MiniFsm", "", "http://minifsm/", "fr.inria.diverse.melanger.MiniFsmMT"
    );
    miniFsm.addAdapter("fr.inria.diverse.melanger.MiniFsmMT", fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.melanger.MiniFsm",
    	miniFsm
    );
    MelangeRegistry.LanguageDescriptor miniActionLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.melanger.MiniActionLang", "", "http://miniactionlang/minilang/", "fr.inria.diverse.melanger.MiniActionLangMT"
    );
    miniActionLang.addAdapter("fr.inria.diverse.melanger.MiniActionLangMT", fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.melanger.MiniActionLang",
    	miniActionLang
    );
    MelangeRegistry.LanguageDescriptor melangedLang = new MelangeRegistryImpl.LanguageDescriptorImpl(
    	"fr.inria.diverse.melanger.MelangedLang", "", "http://melangedlang/minifsm/", "fr.inria.diverse.melanger.MelangedLangMT"
    );
    melangedLang.addAdapter("fr.inria.diverse.melanger.MiniFsmMT", fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MelangedLangAdapter.class);
    melangedLang.addAdapter("fr.inria.diverse.melanger.MelangedLangMT", fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangAdapter.class);
    MelangeRegistry.INSTANCE.getLanguageMap().put(
    	"fr.inria.diverse.melanger.MelangedLang",
    	melangedLang
    );
    MelangeRegistry.ModelTypeDescriptor miniFsmMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.melanger.MiniFsmMT", "", "http://minifsmmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.melanger.MiniFsmMT",
    	miniFsmMT
    );
    MelangeRegistry.ModelTypeDescriptor miniActionLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.melanger.MiniActionLangMT", "", "http://miniactionlangmt/"
    );
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.melanger.MiniActionLangMT",
    	miniActionLangMT
    );
    MelangeRegistry.ModelTypeDescriptor melangedLangMT = new MelangeRegistryImpl.ModelTypeDescriptorImpl(
    	"fr.inria.diverse.melanger.MelangedLangMT", "", "http://melangedlangmt/"
    );
    melangedLangMT.addSuperType("fr.inria.diverse.melanger.MiniFsmMT");
    MelangeRegistry.INSTANCE.getModelTypeMap().put(
    	"fr.inria.diverse.melanger.MelangedLangMT",
    	melangedLangMT
    );
  }
}
