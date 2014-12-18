package fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import fr.inria.diverse.melange.tests.adapters.fsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.fsmmt.FsmMTFactory;
import fr.inria.diverse.melange.tests.adapters.fsmmt.State;
import fr.inria.diverse.melange.tests.adapters.fsmmt.Transition;
import fsm.FsmFactory;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter implements FsmMTFactory {
  private FsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  private FsmFactory fsmAdaptee = fsm.FsmFactory.eINSTANCE;
  
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(fsmAdaptee.createFSM()) ;
  }
  
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState()) ;
  }
  
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition()) ;
  }
}
