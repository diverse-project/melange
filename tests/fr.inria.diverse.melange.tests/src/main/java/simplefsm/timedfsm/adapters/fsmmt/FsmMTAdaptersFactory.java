package simplefsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
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
    	 return (simplefsm.timedfsm.adapters.fsmmt.FSMAdapter) res;
    }
    else{
    	res = new simplefsm.timedfsm.adapters.fsmmt.FSMAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.timedfsm.adapters.fsmmt.FSMAdapter) res ;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.timedfsm.adapters.fsmmt.StateAdapter) res;
    }
    else{
    	res = new simplefsm.timedfsm.adapters.fsmmt.StateAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.timedfsm.adapters.fsmmt.StateAdapter) res ;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter) res;
    }
    else{
    	res = new simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter) res ;
    }
  }
}
