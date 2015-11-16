package simplefsm;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import simplefsm.FsmMT;

@SuppressWarnings("all")
public class Fsm implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static Fsm load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    Fsm mm = new Fsm() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public FsmMT toFsmMT() {
    simplefsm.fsm.adapters.fsmmt.FsmAdapter adaptee = new simplefsm.fsm.adapters.fsmmt.FsmAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}
