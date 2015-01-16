package adapters.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.lib.EObjectAdapter;

import java.util.List;

import adapters.fsmmt.State;
import adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements adapters.fsmmt.FSM {
  private FsmMTAdaptersFactory adaptersFactory = adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  public List<State> getOwnedState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getOwnedState(), adapters.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  public void setInitialState(final State o) {
    adaptee.setInitialState(((adapters.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  public List<State> getFinalState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getFinalState(), adapters.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
}
