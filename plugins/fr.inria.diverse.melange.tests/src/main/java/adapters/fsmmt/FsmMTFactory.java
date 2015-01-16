package adapters.fsmmt;

import adapters.fsmmt.FSM;
import adapters.fsmmt.State;
import adapters.fsmmt.Transition;
import fr.inria.diverse.melange.lib.IFactory;

@SuppressWarnings("all")
public interface FsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
