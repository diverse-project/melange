package fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FSMAdapter;
import fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.StateAdapter;
import fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.TransitionAdapter;
import fsm.FSM;
import fsm.State;
import fsm.Transition;

@SuppressWarnings("all")
public class FsmMTAdaptersFactory {
  private static FsmMTAdaptersFactory instance;
  
  public static FsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FSMAdapter adap = new fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.StateAdapter adap = new fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.TransitionAdapter adap = new fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
