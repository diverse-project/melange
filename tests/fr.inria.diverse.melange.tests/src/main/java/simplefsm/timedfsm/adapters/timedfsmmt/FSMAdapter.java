package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsm.timedfsmmt.State;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements simplefsm.timedfsmmt.FSM {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public EList<State> getOwnedState() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedState(), simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter.class) ;
  }
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState()) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    adaptee.setInitialState(((simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<State> getFinalState() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFinalState(), simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter.class) ;
  }
}
