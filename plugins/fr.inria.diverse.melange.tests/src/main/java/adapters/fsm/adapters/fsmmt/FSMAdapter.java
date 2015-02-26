package adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.FSM;
import java.util.List;
import adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import adapters.fsmmt.State;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements adapters.fsmmt.FSM {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public List<State> getOwnedState() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getOwnedState(), adapters.fsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    adaptee.setInitialState(((adapters.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public List<State> getFinalState() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getFinalState(), adapters.fsm.adapters.fsmmt.StateAdapter.class) ;
  }
}
