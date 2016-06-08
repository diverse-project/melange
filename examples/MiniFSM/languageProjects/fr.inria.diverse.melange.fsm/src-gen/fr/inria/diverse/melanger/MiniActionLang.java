package fr.inria.diverse.melanger;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.inria.diverse.melanger.MiniActionLangMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class MiniActionLang implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static MiniActionLang load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    MiniActionLang mm = new MiniActionLang();
    mm.setResource(res);
    return mm ;
  }
  
  public MiniActionLangMT toMiniActionLangMT() {
    fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangAdapter adaptee = new fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
