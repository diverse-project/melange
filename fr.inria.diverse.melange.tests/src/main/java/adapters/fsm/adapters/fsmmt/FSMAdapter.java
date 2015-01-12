package adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.lib.EObjectAdapter;
import fsm.FSM;

import java.util.List;

import adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import adapters.fsmmt.State;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements adapters.fsmmt.FSM {
  private FsmMTAdaptersFactory adaptersFactory = adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  public List<State> getOwnedState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getOwnedState(), adapters.fsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  public void setInitialState(final State o) {
    adaptee.setInitialState(((adapters.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  public List<State> getFinalState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getFinalState(), adapters.fsm.adapters.fsmmt.StateAdapter.class) ;
  }
}
