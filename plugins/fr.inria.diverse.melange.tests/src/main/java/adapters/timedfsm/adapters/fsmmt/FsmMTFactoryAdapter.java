package adapters.timedfsm.adapters.fsmmt;

import adapters.fsmmt.FSM;
import adapters.fsmmt.FsmMTFactory;
import adapters.fsmmt.State;
import adapters.fsmmt.Transition;
import adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter implements FsmMTFactory {
  private FsmMTAdaptersFactory adaptersFactory = adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
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
