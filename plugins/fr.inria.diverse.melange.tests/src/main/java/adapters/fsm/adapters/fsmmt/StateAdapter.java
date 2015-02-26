package adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.State;
import java.util.List;
import adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import adapters.fsmmt.FSM;
import adapters.fsmmt.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements adapters.fsmmt.State {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
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
    adaptee.setOwningFSM(((adapters.fsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public List<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getOutgoingTransition(), adapters.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public List<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getIncomingTransition(), adapters.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
}
