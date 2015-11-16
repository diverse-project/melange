package simplefsm.timedfsm.adapters.timedfsmmt;

import org.eclipse.emf.ecore.impl.EFactoryImpl;
import simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsm.timedfsmmt.timedfsm.FSM;
import simplefsm.timedfsmmt.timedfsm.State;
import simplefsm.timedfsmmt.timedfsm.TimedfsmFactory;
import simplefsm.timedfsmmt.timedfsm.TimedfsmPackage;
import simplefsm.timedfsmmt.timedfsm.Transition;

@SuppressWarnings("all")
public class TimedFsmMTFactoryAdapter extends EFactoryImpl implements TimedfsmFactory {
  private TimedFsmMTAdaptersFactory adaptersFactory = simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
  private timedfsm.TimedfsmFactory timedfsmAdaptee = timedfsm.TimedfsmFactory.eINSTANCE;
  
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
  
  public TimedfsmPackage getTimedfsmPackage() {
    return simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.eINSTANCE;
  }
}
