package adapters.fsm.adapters.fsmmt;

import adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import adapters.fsmmt.FSM;
import adapters.fsmmt.FsmMTFactory;
import adapters.fsmmt.State;
import adapters.fsmmt.Transition;
import fsm.FsmFactory;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter implements FsmMTFactory {
  private FsmMTAdaptersFactory adaptersFactory = adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
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
