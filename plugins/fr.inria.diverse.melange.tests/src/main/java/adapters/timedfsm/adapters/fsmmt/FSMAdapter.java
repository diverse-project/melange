package adapters.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.List;
import adapters.fsmmt.State;
import adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements adapters.fsmmt.FSM {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public List<State> getOwnedState() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getOwnedState(), adapters.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    adaptee.setInitialState(((adapters.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public List<State> getFinalState() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getFinalState(), adapters.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
}
