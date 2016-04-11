package simplefsmtest.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.FSM;
import fsm.State;
import fsm.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.FSMAdapter;
import simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.StateAdapter;
import simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.TransitionAdapter;

@SuppressWarnings("all")
public class TimedFsmMTAdaptersFactory implements AdaptersFactory {
  private static TimedFsmMTAdaptersFactory instance;
  
  public static TimedFsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public TimedFsmMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fsm.FSM){
    	return createFSMAdapter((fsm.FSM) o, res);
    }
    if (o instanceof fsm.State){
    	return createStateAdapter((fsm.State) o, res);
    }
    if (o instanceof fsm.Transition){
    	return createTransitionAdapter((fsm.Transition) o, res);
    }
    
    return null;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.FSMAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.FSMAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.StateAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.TransitionAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.TransitionAdapter) adapter;
    }
  }
}
