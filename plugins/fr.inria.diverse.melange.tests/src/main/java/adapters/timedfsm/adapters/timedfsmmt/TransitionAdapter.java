package adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import adapters.timedfsmmt.State;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements adapters.timedfsmmt.Transition {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
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
  public int getTime() {
    return adaptee.getTime() ;
  }
  
  @Override
  public void setTime(final int o) {
    adaptee.setTime(o) ;
  }
  
  @Override
  public State getSource() {
    return adaptersFactory.createStateAdapter(adaptee.getSource()) ;
  }
  
  @Override
  public void setSource(final State o) {
    adaptee.setSource(((adapters.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public State getTarget() {
    return adaptersFactory.createStateAdapter(adaptee.getTarget()) ;
  }
  
  @Override
  public void setTarget(final State o) {
    adaptee.setTarget(((adapters.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
  }
}
