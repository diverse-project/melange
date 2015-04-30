package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.common.util.EList;
import simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsm.timedfsmmt.FSM;
import simplefsm.timedfsmmt.Transition;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements simplefsm.timedfsmmt.State {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
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
    adaptee.setOwningFSM(((simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Transition> getOutgoingTransition() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransition(), simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public EList<Transition> getIncomingTransition() {
    return fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransition(), simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
}
