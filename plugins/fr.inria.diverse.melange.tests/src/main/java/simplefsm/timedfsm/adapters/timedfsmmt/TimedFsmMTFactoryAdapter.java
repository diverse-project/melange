package simplefsm.timedfsm.adapters.timedfsmmt;

import simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsm.timedfsmmt.FSM;
import simplefsm.timedfsmmt.State;
import simplefsm.timedfsmmt.TimedFsmMTFactory;
import simplefsm.timedfsmmt.Transition;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class TimedFsmMTFactoryAdapter implements TimedFsmMTFactory {
  private TimedFsmMTAdaptersFactory adaptersFactory = simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
  private TimedfsmFactory timedfsmAdaptee = timedfsm.TimedfsmFactory.eINSTANCE;
  
  @Override
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(timedfsmAdaptee.createFSM()) ;
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(timedfsmAdaptee.createState()) ;
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(timedfsmAdaptee.createTransition()) ;
  }
}
