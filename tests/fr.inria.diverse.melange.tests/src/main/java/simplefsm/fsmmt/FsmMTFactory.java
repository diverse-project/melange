package simplefsm.fsmmt;

import fr.inria.diverse.melange.lib.IFactory;
import simplefsm.fsmmt.FSM;
import simplefsm.fsmmt.State;
import simplefsm.fsmmt.Transition;

@SuppressWarnings("all")
public interface FsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
