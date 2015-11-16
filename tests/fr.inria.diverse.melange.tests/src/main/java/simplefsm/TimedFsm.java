package simplefsm;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import simplefsm.FsmMT;
import simplefsm.TimedFsmMT;

@SuppressWarnings("all")
public class TimedFsm implements IMetamodel {
  private Resource resource;
  
  public Resource getResource() {
    return this.resource;
  }
  
  public void setResource(final Resource resource) {
    this.resource = resource;
  }
  
  public static TimedFsm load(final String uri) {
    ResourceSet rs = new ResourceSetImpl() ;
    Resource res = rs.getResource(URI.createURI(uri), true) ;
    TimedFsm mm = new TimedFsm() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public FsmMT toFsmMT() {
    simplefsm.timedfsm.adapters.fsmmt.TimedFsmAdapter adaptee = new simplefsm.timedfsm.adapters.fsmmt.TimedFsmAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
  
  public TimedFsmMT toTimedFsmMT() {
    simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmAdapter adaptee = new simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}
