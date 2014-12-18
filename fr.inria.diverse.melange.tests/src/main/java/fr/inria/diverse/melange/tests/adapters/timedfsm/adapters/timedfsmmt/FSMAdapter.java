package fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.State;
import fr.inria.diverse.melange.lib.EObjectAdapter;
import java.util.List;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements fr.inria.diverse.melange.tests.adapters.timedfsmmt.FSM {
  private TimedFsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
  public List<State> getOwnedState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getOwnedState(), fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter.class) ;
  }
  
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  public void setInitialState(final State o) {
    adaptee.setInitialState(((fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  public List<State> getFinalState() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getFinalState(), fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter.class) ;
  }
}
