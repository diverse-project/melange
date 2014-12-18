package fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.fsmmt.FsmMTFactory;
import fr.inria.diverse.melange.tests.adapters.fsmmt.State;
import fr.inria.diverse.melange.tests.adapters.fsmmt.Transition;
import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter implements FsmMTFactory {
  private FsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  private TimedfsmFactory timedfsmAdaptee = timedfsm.TimedfsmFactory.eINSTANCE;
  
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(timedfsmAdaptee.createFSM()) ;
  }
  
  public State createState() {
    return adaptersFactory.createStateAdapter(timedfsmAdaptee.createState()) ;
  }
  
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(timedfsmAdaptee.createTransition()) ;
  }
}
