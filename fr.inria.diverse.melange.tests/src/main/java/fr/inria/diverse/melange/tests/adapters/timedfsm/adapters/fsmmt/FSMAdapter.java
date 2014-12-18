package fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsmmt.State;
import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import fr.inria.diverse.melange.lib.EObjectAdapter;
import java.util.List;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements fr.inria.diverse.melange.tests.adapters.fsmmt.FSM {
  private FsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  public List<State> getOwnedState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getOwnedState(), fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  public void setInitialState(final State o) {
    adaptee.setInitialState(((fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  public List<State> getFinalState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getFinalState(), fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.fsmmt.StateAdapter.class) ;
  }
}
