package simplefsm.fsm.adapters.fsmmt;

import org.eclipse.emf.ecore.impl.EFactoryImpl;
import simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import simplefsm.fsmmt.fsm.FSM;
import simplefsm.fsmmt.fsm.FsmFactory;
import simplefsm.fsmmt.fsm.FsmPackage;
import simplefsm.fsmmt.fsm.State;
import simplefsm.fsmmt.fsm.Transition;

@SuppressWarnings("all")
public class FsmMTFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private FsmMTAdaptersFactory adaptersFactory = simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  private fsm.FsmFactory fsmAdaptee = fsm.FsmFactory.eINSTANCE;
  
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
  
  public FsmPackage getFsmPackage() {
    return simplefsm.fsmmt.fsm.FsmPackage.eINSTANCE;
  }
}
