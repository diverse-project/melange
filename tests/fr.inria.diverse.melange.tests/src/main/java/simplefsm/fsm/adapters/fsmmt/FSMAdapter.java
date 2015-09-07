package simplefsm.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.FSM;
import org.eclipse.emf.common.util.EList;
import simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import simplefsm.fsmmt.State;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements simplefsm.fsmmt.FSM {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public EList<State> getOwnedState() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedState(), simplefsm.fsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    adaptee.setInitialState(((simplefsm.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<State> getFinalState() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFinalState(), simplefsm.fsm.adapters.fsmmt.StateAdapter.class) ;
  }
}
