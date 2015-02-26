package adapters.timedfsmmt;

import fr.inria.diverse.melange.lib.IFactory;
import adapters.timedfsmmt.FSM;
import adapters.timedfsmmt.State;
import adapters.timedfsmmt.Transition;

@SuppressWarnings("all")
public interface TimedFsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
