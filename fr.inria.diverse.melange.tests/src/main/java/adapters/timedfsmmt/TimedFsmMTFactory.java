package adapters.timedfsmmt;

import adapters.timedfsmmt.FSM;
import adapters.timedfsmmt.State;
import adapters.timedfsmmt.Transition;
import fr.inria.diverse.melange.lib.IFactory;

@SuppressWarnings("all")
public interface TimedFsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
