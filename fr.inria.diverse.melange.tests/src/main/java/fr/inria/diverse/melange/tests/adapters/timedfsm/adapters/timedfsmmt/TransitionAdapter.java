package fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.State;
import fr.inria.diverse.melange.lib.EObjectAdapter;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements fr.inria.diverse.melange.tests.adapters.timedfsmmt.Transition {
  private TimedFsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  
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
  
  public int getTime() {
    return adaptee.getTime() ;
  }
  
  public void setTime(final int o) {
    adaptee.setTime(o) ;
  }
  
  public State getSource() {
    return adaptersFactory.createStateAdapter(adaptee.getSource()) ;
  }
  
  public void setSource(final State o) {
    adaptee.setSource(((fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  public State getTarget() {
    return adaptersFactory.createStateAdapter(adaptee.getTarget()) ;
  }
  
  public void setTarget(final State o) {
    adaptee.setTarget(((fr.inria.diverse.melange.tests.adapters.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
  }
}
