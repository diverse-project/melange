package fr.inria.diverse.melange.tests.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.State;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.Transition;
import fr.inria.diverse.melange.lib.IFactory;

@SuppressWarnings("all")
public interface TimedFsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
