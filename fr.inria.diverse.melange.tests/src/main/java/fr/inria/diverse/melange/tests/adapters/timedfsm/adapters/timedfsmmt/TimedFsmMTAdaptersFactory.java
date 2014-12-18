package fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.FSMAdapter;
import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter;
import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter;
import timedfsm.FSM;
import timedfsm.State;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TimedFsmMTAdaptersFactory {
  private static TimedFsmMTAdaptersFactory instance;
  
  public static TimedFsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.FSMAdapter adap = new fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter adap = new fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter adap = new fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
