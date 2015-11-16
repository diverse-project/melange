package simplefsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import simplefsm.fsmmt.fsm.FSM;
import simplefsm.fsmmt.fsm.Transition;
import simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements simplefsm.fsmmt.fsm.State {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public FSM getOwningFSM() {
    return adaptersFactory.createFSMAdapter(adaptee.getOwningFSM()) ;
  }
  
  @Override
  public void setOwningFSM(final FSM o) {
    adaptee.setOwningFSM(((simplefsm.timedfsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Transition> getOutgoingTransition() {
    return EListAdapter.newInstance(adaptee.getOutgoingTransition(), simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public EList<Transition> getIncomingTransition() {
    return EListAdapter.newInstance(adaptee.getIncomingTransition(), simplefsm.timedfsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
}
