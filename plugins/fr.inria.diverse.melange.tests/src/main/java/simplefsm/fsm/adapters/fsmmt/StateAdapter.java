package simplefsm.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.State;
import org.eclipse.emf.common.util.EList;
import simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import simplefsm.fsmmt.FSM;
import simplefsm.fsmmt.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements simplefsm.fsmmt.State {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
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
    adaptee.setOwningFSM(((simplefsm.fsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransition(), simplefsm.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public EList<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransition(), simplefsm.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
}
