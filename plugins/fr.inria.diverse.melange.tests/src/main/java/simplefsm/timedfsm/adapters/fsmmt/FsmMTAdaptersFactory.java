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
    EObjectAdapter res = register.get(o);
    if(res != null){
    	 return res;
    }
    else{
    	if (o instanceof timedfsm.FSM){
    		res = createFSMAdapter((timedfsm.FSM) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof timedfsm.State){
    		res = createStateAdapter((timedfsm.State) o) ;
    		register.put(o,res);
    		return res;
    	}
    	if (o instanceof timedfsm.Transition){
    		res = createTransitionAdapter((timedfsm.Transition) o) ;
    		register.put(o,res);
    		return res;
    	}
    }
    					
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    simplefsm.timedfsm.adapters.fsmmt.FSMAdapter adap = new simplefsm.timedfsm.adapters.fsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    simplefsm.timedfsm.adapters.fsmmt.StateAdapter adap = new simplefsm.timedfsm.adapters.fsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter adap = new simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
