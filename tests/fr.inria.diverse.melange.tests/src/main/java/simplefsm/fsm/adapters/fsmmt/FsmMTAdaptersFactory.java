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
    EObjectAdapter res = register.get(o);
    if(res != null){
    	 return res;
    }
    else{
    	if (o instanceof fsm.FSM){
    		res = createFSMAdapter((fsm.FSM) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fsm.State){
    		res = createStateAdapter((fsm.State) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof fsm.Transition){
    		res = createTransitionAdapter((fsm.Transition) o) ;
    		register.put(o,res);
    		return res;
    	}
    }
    					
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    simplefsm.fsm.adapters.fsmmt.FSMAdapter adap = new simplefsm.fsm.adapters.fsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    simplefsm.fsm.adapters.fsmmt.StateAdapter adap = new simplefsm.fsm.adapters.fsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    simplefsm.fsm.adapters.fsmmt.TransitionAdapter adap = new simplefsm.fsm.adapters.fsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
