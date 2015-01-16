package adapters.fsm.adapters.fsmmt;

import adapters.fsm.adapters.fsmmt.FSMAdapter;
import adapters.fsm.adapters.fsmmt.StateAdapter;
import adapters.fsm.adapters.fsmmt.TransitionAdapter;
import fsm.FSM;
import fsm.State;
import fsm.Transition;

@SuppressWarnings("all")
public class FsmMTAdaptersFactory {
  private static FsmMTAdaptersFactory instance;
  
  public static FsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory() ;
    }
    return instance ;
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
