package simplefsmtest.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import simplefsmtest.timedfsm.adapters.fsmmt.fsm.FSMAdapter;
import simplefsmtest.timedfsm.adapters.fsmmt.fsm.StateAdapter;
import simplefsmtest.timedfsm.adapters.fsmmt.fsm.TransitionAdapter;
import timedfsm.fsm.FSM;
import timedfsm.fsm.State;
import timedfsm.fsm.Transition;

@SuppressWarnings("all")
public class FsmMTAdaptersFactory implements AdaptersFactory {
  private static FsmMTAdaptersFactory instance;
  
  public static FsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new simplefsmtest.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public FsmMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof timedfsm.fsm.FSM){
    	return createFSMAdapter((timedfsm.fsm.FSM) o, res);
    }
    if (o instanceof timedfsm.fsm.State){
    	return createStateAdapter((timedfsm.fsm.State) o, res);
    }
    if (o instanceof timedfsm.fsm.Transition){
    	return createTransitionAdapter((timedfsm.fsm.Transition) o, res);
    }
    
    return null;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.fsmmt.fsm.FSMAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.fsmmt.fsm.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.fsmmt.fsm.FSMAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.fsmmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.fsmmt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.fsmmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.fsmmt.fsm.TransitionAdapter) adapter;
    }
  }
}
