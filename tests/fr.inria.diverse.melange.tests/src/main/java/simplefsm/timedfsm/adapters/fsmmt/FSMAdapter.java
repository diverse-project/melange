package simplefsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import simplefsm.fsmmt.State;
import simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements simplefsm.fsmmt.FSM {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public EList<State> getOwnedState() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedState(), simplefsm.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    adaptee.setInitialState(((simplefsm.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<State> getFinalState() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFinalState(), simplefsm.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
}
