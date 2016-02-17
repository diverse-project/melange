package simplefsm.timedfsm.adapters.fsmmt;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import simplefsm.fsmmt.fsm.FSM;
import simplefsm.fsmmt.fsm.FsmFactory;
import simplefsm.fsmmt.fsm.FsmPackage;
import simplefsm.fsmmt.fsm.State;
import simplefsm.fsmmt.fsm.Transition;
import simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.TimedfsmFactory;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private FsmMTAdaptersFactory adaptersFactory = simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  private TimedfsmFactory timedfsmAdaptee = timedfsm.TimedfsmFactory.eINSTANCE;
  
  @Override
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(timedfsmAdaptee.createFSM(), null) ;
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(timedfsmAdaptee.createState(), null) ;
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(timedfsmAdaptee.createTransition(), null) ;
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return simplefsm.fsmmt.fsm.FsmPackage.eINSTANCE;
  }
}
