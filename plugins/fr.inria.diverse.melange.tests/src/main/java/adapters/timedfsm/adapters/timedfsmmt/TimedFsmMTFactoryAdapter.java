package adapters.timedfsm.adapters.timedfsmmt;

import adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import adapters.timedfsmmt.FSM;
import adapters.timedfsmmt.State;
import adapters.timedfsmmt.TimedFsmMTFactory;
import adapters.timedfsmmt.Transition;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class TimedFsmMTFactoryAdapter implements TimedFsmMTFactory {
  private TimedFsmMTAdaptersFactory adaptersFactory = adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
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
