package adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.FSM;
import fsm.State;
import fsm.Transition;
import org.eclipse.emf.ecore.EObject;
import adapters.fsm.adapters.fsmmt.FSMAdapter;
import adapters.fsm.adapters.fsmmt.StateAdapter;
import adapters.fsm.adapters.fsmmt.TransitionAdapter;

@SuppressWarnings("all")
public class FsmMTAdaptersFactory implements AdaptersFactory {
  private static FsmMTAdaptersFactory instance;
  
  public static FsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o) {
    if (o instanceof fsm.FSM)
    	return createFSMAdapter((fsm.FSM) o) ;
    if (o instanceof fsm.State)
    	return createStateAdapter((fsm.State) o) ;
    if (o instanceof fsm.Transition)
    	return createTransitionAdapter((fsm.Transition) o) ;
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    adapters.fsm.adapters.fsmmt.FSMAdapter adap = new adapters.fsm.adapters.fsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    adapters.fsm.adapters.fsmmt.StateAdapter adap = new adapters.fsm.adapters.fsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    adapters.fsm.adapters.fsmmt.TransitionAdapter adap = new adapters.fsm.adapters.fsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
