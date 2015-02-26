package adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.List;
import adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import adapters.timedfsmmt.State;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements adapters.timedfsmmt.FSM {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public List<State> getOwnedState() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getOwnedState(), adapters.timedfsm.adapters.timedfsmmt.StateAdapter.class) ;
  }
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    adaptee.setInitialState(((adapters.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public List<State> getFinalState() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getFinalState(), adapters.timedfsm.adapters.timedfsmmt.StateAdapter.class) ;
  }
}
