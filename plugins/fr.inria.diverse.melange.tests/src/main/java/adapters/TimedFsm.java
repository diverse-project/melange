package adapters;

import fr.inria.diverse.melange.lib.IMetamodel;
import org.eclipse.emf.ecore.resource.Resource;
import adapters.FsmMT;
import adapters.TimedFsmMT;

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
    org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl() ;
    Resource res = rs.getResource(org.eclipse.emf.common.util.URI.createURI(uri), true) ;
    TimedFsm mm = new TimedFsm() ;
    mm.setResource(res) ;
    return mm ;
  }
  
  public FsmMT toFsmMT() {
    adapters.timedfsm.adapters.fsmmt.TimedFsmAdapter adaptee = new adapters.timedfsm.adapters.fsmmt.TimedFsmAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
  
  public TimedFsmMT toTimedFsmMT() {
    adapters.timedfsm.adapters.timedfsmmt.TimedFsmAdapter adaptee = new adapters.timedfsm.adapters.timedfsmmt.TimedFsmAdapter() ;
    adaptee.setAdaptee(resource) ;
    return adaptee ;
  }
}
