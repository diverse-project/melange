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
    simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter adap = new simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter adap = new simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter adap = new simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
