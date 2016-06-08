package fr.inria.diverse.melanger;

import fr.inria.diverse.melange.lib.IMetamodel;
import fr.inria.diverse.melanger.MiniFsmMT;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

@SuppressWarnings("all")
public class MiniFsm implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static MiniFsm load(final String uri) {
    ResourceSet rs = new ResourceSetImpl();
    Resource res = rs.getResource(URI.createURI(uri), true);
    MiniFsm mm = new MiniFsm();
    mm.setResource(res);
    return mm ;
  }
  
  public MiniFsmMT toMiniFsmMT() {
    fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmAdapter adaptee = new fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmAdapter() ;
    adaptee.setAdaptee(resource);
    return adaptee;
  }
}
