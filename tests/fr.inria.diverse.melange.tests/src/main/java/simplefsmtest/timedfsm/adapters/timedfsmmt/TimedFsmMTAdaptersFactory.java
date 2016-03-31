package simplefsmtest.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import simplefsmtest.timedfsm.adapters.timedfsmmt.FSMAdapter;
import simplefsmtest.timedfsm.adapters.timedfsmmt.StateAdapter;
import simplefsmtest.timedfsm.adapters.timedfsmmt.TransitionAdapter;
import timedfsm.fsm.FSM;
import timedfsm.fsm.State;
import timedfsm.fsm.Transition;

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
    	 return (simplefsmtest.timedfsm.adapters.timedfsmmt.FSMAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.timedfsmmt.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.timedfsmmt.FSMAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.timedfsmmt.StateAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.timedfsmmt.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.timedfsmmt.StateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (simplefsmtest.timedfsm.adapters.timedfsmmt.TransitionAdapter) adapter;
    else {
    	adapter = new simplefsmtest.timedfsm.adapters.timedfsmmt.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (simplefsmtest.timedfsm.adapters.timedfsmmt.TransitionAdapter) adapter;
    }
  }
}
