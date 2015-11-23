package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter;
import simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter;
import simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter;
import timedfsm.FSM;
import timedfsm.State;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TimedFsmMTAdaptersFactory implements AdaptersFactory {
  private static TimedFsmMTAdaptersFactory instance;
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public TimedFsmMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public static TimedFsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory() ;
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
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null) {
    	 return (simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter) adapter;
    }
    else {
    	adapter = new simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter) adapter ;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null) {
    	 return (simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) adapter;
    }
    else {
    	adapter = new simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) adapter ;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null) {
    	 return (simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter) adapter;
    }
    else {
    	adapter = new simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter() ;
    	adapter.setAdaptee(adaptee) ;
    	adapter.setResource(res) ;
    	register.put(adaptee, adapter);
    	return (simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter) adapter ;
    }
  }
}
