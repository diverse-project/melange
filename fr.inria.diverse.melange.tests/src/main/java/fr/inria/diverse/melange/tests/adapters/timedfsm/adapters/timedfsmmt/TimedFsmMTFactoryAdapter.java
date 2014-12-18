package fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.State;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.TimedFsmMTFactory;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.Transition;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class TimedFsmMTFactoryAdapter implements TimedFsmMTFactory {
  private TimedFsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
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
