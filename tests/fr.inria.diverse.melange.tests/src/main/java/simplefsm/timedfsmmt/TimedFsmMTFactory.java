package simplefsm.timedfsmmt;

import fr.inria.diverse.melange.lib.IFactory;
import simplefsm.timedfsmmt.FSM;
import simplefsm.timedfsmmt.State;
import simplefsm.timedfsmmt.Transition;

@SuppressWarnings("all")
public interface TimedFsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
