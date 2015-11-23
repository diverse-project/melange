package simplefsm.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.FSM;
import fsm.State;
import fsm.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import simplefsm.fsm.adapters.fsmmt.FSMAdapter;
import simplefsm.fsm.adapters.fsmmt.StateAdapter;
import simplefsm.fsm.adapters.fsmmt.TransitionAdapter;

@SuppressWarnings("all")
public class FsmMTAdaptersFactory implements AdaptersFactory {
  private static FsmMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FsmMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static FsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fsm.FSM){
    	return createFSMAdapter((fsm.FSM) o, res) ;
    }
    if (o instanceof fsm.State){
    	return createStateAdapter((fsm.State) o, res) ;
    }
    if (o instanceof fsm.Transition){
    	return createTransitionAdapter((fsm.Transition) o, res) ;
    }
    
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null) {
    	 return (simplefsm.fsm.adapters.fsmmt.FSMAdapter) adapter;
    }
    else {
    	adapter = new simplefsm.fsm.adapters.fsmmt.FSMAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.fsm.adapters.fsmmt.FSMAdapter) adapter ;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null) {
    	 return (simplefsm.fsm.adapters.fsmmt.StateAdapter) adapter;
    }
    else {
    	adapter = new simplefsm.fsm.adapters.fsmmt.StateAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.fsm.adapters.fsmmt.StateAdapter) adapter ;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null) {
    	 return (simplefsm.fsm.adapters.fsmmt.TransitionAdapter) adapter;
    }
    else {
    	adapter = new simplefsm.fsm.adapters.fsmmt.TransitionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.fsm.adapters.fsmmt.TransitionAdapter) adapter ;
    }
  }
}
