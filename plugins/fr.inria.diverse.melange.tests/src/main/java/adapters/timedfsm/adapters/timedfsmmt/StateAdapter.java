package adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.List;
import adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import adapters.timedfsmmt.FSM;
import adapters.timedfsmmt.Transition;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements adapters.timedfsmmt.State {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public FSM getOwningFSM() {
    return adaptersFactory.createFSMAdapter(adaptee.getOwningFSM()) ;
  }
  
  @Override
  public void setOwningFSM(final FSM o) {
    adaptee.setOwningFSM(((adapters.timedfsm.adapters.timedfsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public List<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getOutgoingTransition(), adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public List<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getIncomingTransition(), adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
}
