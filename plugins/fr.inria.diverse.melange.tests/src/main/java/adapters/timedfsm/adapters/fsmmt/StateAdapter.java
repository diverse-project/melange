package adapters.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.List;
import adapters.fsmmt.FSM;
import adapters.fsmmt.Transition;
import adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements adapters.fsmmt.State {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(adapters.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
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
    adaptee.setOwningFSM(((adapters.timedfsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public List<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getOutgoingTransition(), adapters.timedfsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public List<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getIncomingTransition(), adapters.timedfsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
}
