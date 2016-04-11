package simplefsmtest.timedfsm.adapters.timedfsmmt.fsm;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsmtest.timedfsmmt.fsm.FSM;
import simplefsmtest.timedfsmmt.fsm.FsmFactory;
import simplefsmtest.timedfsmmt.fsm.FsmPackage;
import simplefsmtest.timedfsmmt.fsm.State;
import simplefsmtest.timedfsmmt.fsm.Transition;

@SuppressWarnings("all")
public class FsmFactoryAdapter extends EFactoryImpl implements FsmFactory {
  private TimedFsmMTAdaptersFactory adaptersFactory = simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
  private fsm.FsmFactory fsmAdaptee = fsm.FsmFactory.eINSTANCE;
  
  @Override
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(fsmAdaptee.createFSM(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(fsmAdaptee.createState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(fsmAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getFsmPackage();
  }
  
  public FsmPackage getFsmPackage() {
    return simplefsmtest.timedfsmmt.fsm.FsmPackage.eINSTANCE;
  }
}
