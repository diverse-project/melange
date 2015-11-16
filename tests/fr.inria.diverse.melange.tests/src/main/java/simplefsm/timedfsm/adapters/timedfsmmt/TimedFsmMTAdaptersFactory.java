package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
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
  
  public EObjectAdapter createAdapter(final EObject o) {
    if (o instanceof timedfsm.FSM){
    	return createFSMAdapter((timedfsm.FSM) o) ;
    }
    if (o instanceof timedfsm.State){
    	return createStateAdapter((timedfsm.State) o) ;
    }
    if (o instanceof timedfsm.Transition){
    	return createTransitionAdapter((timedfsm.Transition) o) ;
    }
    
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter) res;
    }
    else{
    	res = new simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter) res ;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) res;
    }
    else{
    	res = new simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) res ;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter) res;
    }
    else{
    	res = new simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter) res ;
    }
  }
}
