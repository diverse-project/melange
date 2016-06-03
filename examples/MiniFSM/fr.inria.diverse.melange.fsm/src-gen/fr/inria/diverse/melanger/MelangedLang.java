package fr.inria.diverse.melanger;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.inria.diverse.melanger.MelangedLangMT;
import fr.inria.diverse.melanger.MiniFsmMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class MelangedLang implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static MelangedLang load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    MelangedLang mm = new MelangedLang();
    mm.setResource(res);
    return mm ;
  }
  
  public MiniFsmMT toMiniFsmMT() {
    fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MelangedLangAdapter adaptee = new fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MelangedLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
  
  public MelangedLangMT toMelangedLangMT() {
    fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangAdapter adaptee = new fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
