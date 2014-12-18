package fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import fr.inria.diverse.melange.tests.adapters.fsmmt.State;
import fr.inria.diverse.melange.lib.EObjectAdapter;
import fsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements fr.inria.diverse.melange.tests.adapters.fsmmt.Transition {
  private FsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  
  public String getInput() {
    return adaptee.getInput() ;
  }
  
  public void setInput(final String o) {
    adaptee.setInput(o) ;
  }
  
  public String getOutput() {
    return adaptee.getOutput() ;
  }
  
  public void setOutput(final String o) {
    adaptee.setOutput(o) ;
  }
  
  public State getSource() {
    return adaptersFactory.createStateAdapter(adaptee.getSource()) ;
  }
  
  public void setSource(final State o) {
    adaptee.setSource(((fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  public State getTarget() {
    return adaptersFactory.createStateAdapter(adaptee.getTarget()) ;
  }
  
  public void setTarget(final State o) {
    adaptee.setTarget(((fr.inria.diverse.melange.tests.adapters.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
}
