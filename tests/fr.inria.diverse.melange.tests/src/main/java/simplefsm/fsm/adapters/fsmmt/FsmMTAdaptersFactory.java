package simplefsm.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.FSM;
import fsm.State;
import fsm.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
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
  
  public EObjectAdapter createAdapter(final EObject o) {
    if (o instanceof fsm.FSM){
    	return createFSMAdapter((fsm.FSM) o) ;
    }
    if (o instanceof fsm.State){
    	return createStateAdapter((fsm.State) o) ;
    }
    if (o instanceof fsm.Transition){
    	return createTransitionAdapter((fsm.Transition) o) ;
    }
    
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.fsm.adapters.fsmmt.FSMAdapter) res;
    }
    else{
    	res = new simplefsm.fsm.adapters.fsmmt.FSMAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.fsm.adapters.fsmmt.FSMAdapter) res ;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.fsm.adapters.fsmmt.StateAdapter) res;
    }
    else{
    	res = new simplefsm.fsm.adapters.fsmmt.StateAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.fsm.adapters.fsmmt.StateAdapter) res ;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    EObjectAdapter res = register.get(adaptee);
    if(res != null){
    	 return (simplefsm.fsm.adapters.fsmmt.TransitionAdapter) res;
    }
    else{
    	res = new simplefsm.fsm.adapters.fsmmt.TransitionAdapter() ;
    	res.setAdaptee(adaptee) ;
    	register.put(adaptee,res);
    	return (simplefsm.fsm.adapters.fsmmt.TransitionAdapter) res ;
    }
  }
}
