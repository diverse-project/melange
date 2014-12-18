package fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import fr.inria.diverse.melange.tests.adapters.fsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.fsmmt.Transition;
import fr.inria.diverse.melange.lib.EObjectAdapter;
import fsm.State;
import java.util.List;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements fr.inria.diverse.melange.tests.adapters.fsmmt.State {
  private FsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
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
    adaptee.setOwningFSM(((fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  public List<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getOutgoingTransition(), fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  public List<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getIncomingTransition(), fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
}
