package simplefsm.fsm.adapters.fsmmt;

import fsm.FsmFactory;
import simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import simplefsm.fsmmt.FSM;
import simplefsm.fsmmt.FsmMTFactory;
import simplefsm.fsmmt.State;
import simplefsm.fsmmt.Transition;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter implements FsmMTFactory {
  private FsmMTAdaptersFactory adaptersFactory = simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  private FsmFactory fsmAdaptee = fsm.FsmFactory.eINSTANCE;
  
  @Override
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(fsmAdaptee.createFSM()) ;
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState()) ;
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition()) ;
  }
}
