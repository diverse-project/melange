package adapters.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EObject;
import adapters.timedfsm.adapters.fsmmt.FSMAdapter;
import adapters.timedfsm.adapters.fsmmt.StateAdapter;
import adapters.timedfsm.adapters.fsmmt.TransitionAdapter;
import timedfsm.FSM;
import timedfsm.State;
import timedfsm.Transition;

@SuppressWarnings("all")
public class FsmMTAdaptersFactory implements AdaptersFactory {
  private static FsmMTAdaptersFactory instance;
  
  public static FsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o) {
    if (o instanceof timedfsm.FSM)
    	return createFSMAdapter((timedfsm.FSM) o) ;
    if (o instanceof timedfsm.State)
    	return createStateAdapter((timedfsm.State) o) ;
    if (o instanceof timedfsm.Transition)
    	return createTransitionAdapter((timedfsm.Transition) o) ;
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    adapters.timedfsm.adapters.fsmmt.FSMAdapter adap = new adapters.timedfsm.adapters.fsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    adapters.timedfsm.adapters.fsmmt.StateAdapter adap = new adapters.timedfsm.adapters.fsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    adapters.timedfsm.adapters.fsmmt.TransitionAdapter adap = new adapters.timedfsm.adapters.fsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
