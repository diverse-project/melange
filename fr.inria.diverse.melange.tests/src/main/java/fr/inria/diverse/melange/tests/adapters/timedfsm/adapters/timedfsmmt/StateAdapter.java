package fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.Transition;
import fr.inria.diverse.melange.lib.EObjectAdapter;
import java.util.List;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements fr.inria.diverse.melange.tests.adapters.timedfsmmt.State {
  private TimedFsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
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
    adaptee.setOwningFSM(((fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  public List<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getOutgoingTransition(), fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
  
  public List<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.lib.ListAdapter.newInstance(adaptee.getIncomingTransition(), fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
}
