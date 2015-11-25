package simplefsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import simplefsm.timedfsm.adapters.fsmmt.FSMAdapter;
import simplefsm.timedfsm.adapters.fsmmt.StateAdapter;
import simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter;
import timedfsm.FSM;
import timedfsm.State;
import timedfsm.Transition;

@SuppressWarnings("all")
public class FsmMTAdaptersFactory implements AdaptersFactory {
  private static FsmMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FsmMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static FsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof timedfsm.FSM){
    	return createFSMAdapter((timedfsm.FSM) o, res) ;
    }
    if (o instanceof timedfsm.State){
    	return createStateAdapter((timedfsm.State) o, res) ;
    }
    if (o instanceof timedfsm.Transition){
    	return createTransitionAdapter((timedfsm.Transition) o, res) ;
    }
    
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsm.timedfsm.adapters.fsmmt.FSMAdapter) adapter;
    else {
    	adapter = new simplefsm.timedfsm.adapters.fsmmt.FSMAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.timedfsm.adapters.fsmmt.FSMAdapter) adapter ;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsm.timedfsm.adapters.fsmmt.StateAdapter) adapter;
    else {
    	adapter = new simplefsm.timedfsm.adapters.fsmmt.StateAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.timedfsm.adapters.fsmmt.StateAdapter) adapter ;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter) adapter;
    else {
    	adapter = new simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter) adapter ;
    }
  }
}
