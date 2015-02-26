package adapters.fsmmt;

import fr.inria.diverse.melange.lib.IFactory;
import adapters.fsmmt.FSM;
import adapters.fsmmt.State;
import adapters.fsmmt.Transition;

@SuppressWarnings("all")
public interface FsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
