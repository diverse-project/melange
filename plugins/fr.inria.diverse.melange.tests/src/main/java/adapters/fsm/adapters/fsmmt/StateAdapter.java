package adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.State;

import java.util.List;

import adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import adapters.fsmmt.FSM;
import adapters.fsmmt.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements adapters.fsmmt.State {
  private FsmMTAdaptersFactory adaptersFactory = adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  public String getName() {
    return adaptee.getName() ;
  }
  
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  public FSM getOwningFSM() {
    return adaptersFactory.createFSMAdapter(adaptee.getOwningFSM()) ;
  }
  
  public void setOwningFSM(final FSM o) {
    adaptee.setOwningFSM(((adapters.fsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  public List<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getOutgoingTransition(), adapters.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  public List<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.adapters.ListAdapter.newInstance(adaptee.getIncomingTransition(), adapters.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
}
