package simplefsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import simplefsm.fsmmt.State;
import simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements simplefsm.fsmmt.Transition {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
  }
  
  @Override
  public String getInput() {
    return adaptee.getInput() ;
  }
  
  @Override
  public void setInput(final String o) {
    adaptee.setInput(o) ;
  }
  
  @Override
  public String getOutput() {
    return adaptee.getOutput() ;
  }
  
  @Override
  public void setOutput(final String o) {
    adaptee.setOutput(o) ;
  }
  
  @Override
  public State getSource() {
    return adaptersFactory.createStateAdapter(adaptee.getSource()) ;
  }
  
  @Override
  public void setSource(final State o) {
    adaptee.setSource(((simplefsm.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public State getTarget() {
    return adaptersFactory.createStateAdapter(adaptee.getTarget()) ;
  }
  
  @Override
  public void setTarget(final State o) {
    adaptee.setTarget(((simplefsm.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
}
