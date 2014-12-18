package fr.inria.diverse.melange.tests.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.fsmmt.State;
import fr.inria.diverse.melange.tests.adapters.fsmmt.Transition;
import fr.inria.diverse.melange.lib.IFactory;

@SuppressWarnings("all")
public interface FsmMTFactory extends IFactory {
  public abstract FSM createFSM();
  
  public abstract State createState();
  
  public abstract Transition createTransition();
}
