package adapters.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.lib.ResourceAdapter;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import adapters.FsmMT;
import adapters.fsmmt.FsmMTFactory;
import adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;

@SuppressWarnings("all")
public class TimedFsmAdapter extends ResourceAdapter implements FsmMT {
  private FsmMTAdaptersFactory adaptersFactory = adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  public EList<EObject> getContents() {
    org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> ret = new org.eclipse.emf.ecore.util.BasicInternalEList<org.eclipse.emf.ecore.EObject>(org.eclipse.emf.ecore.EObject.class) ;
    
    for (org.eclipse.emf.ecore.EObject o : adaptee.getContents()) {
    if (o instanceof timedfsm.FSM) {
    	ret.add(adaptersFactory.createFSMAdapter((timedfsm.FSM) o)) ;
    } else
    						if (o instanceof timedfsm.State) {
    	ret.add(adaptersFactory.createStateAdapter((timedfsm.State) o)) ;
    } else
    						if (o instanceof timedfsm.Transition) {
    	ret.add(adaptersFactory.createTransitionAdapter((timedfsm.Transition) o)) ;
    } else
    						 ret.add(o) ;
    }
    
    return ret ;
  }
  
  public FsmMTFactory getFactory() {
    return new adapters.timedfsm.adapters.fsmmt.FsmMTFactoryAdapter() ;
  }
  
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(org.eclipse.emf.common.util.URI.createURI(uri));
    this.adaptee.save(null);
  }
}
