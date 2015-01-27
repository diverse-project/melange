package adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.lib.ResourceAdapter;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import adapters.FsmMT;
import adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import adapters.fsmmt.FsmMTFactory;

@SuppressWarnings("all")
public class FsmAdapter extends ResourceAdapter implements FsmMT {
  private FsmMTAdaptersFactory adaptersFactory = adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  public EList<EObject> getContents() {
    org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> ret = new org.eclipse.emf.ecore.util.BasicInternalEList<org.eclipse.emf.ecore.EObject>(org.eclipse.emf.ecore.EObject.class) ;
    
    for (org.eclipse.emf.ecore.EObject o : adaptee.getContents()) {
    if (o instanceof fsm.FSM) {
    	ret.add(adaptersFactory.createFSMAdapter((fsm.FSM) o)) ;
    } else
    						if (o instanceof fsm.State) {
    	ret.add(adaptersFactory.createStateAdapter((fsm.State) o)) ;
    } else
    						if (o instanceof fsm.Transition) {
    	ret.add(adaptersFactory.createTransitionAdapter((fsm.Transition) o)) ;
    } else
    						 ret.add(o) ;
    }
    
    return ret ;
  }
  
  public FsmMTFactory getFactory() {
    return new adapters.fsm.adapters.fsmmt.FsmMTFactoryAdapter() ;
  }
  
  public void save(final String uri) throws IOException {
    this.adaptee.setURI(org.eclipse.emf.common.util.URI.createURI(uri));
    this.adaptee.save(null);
  }
}
