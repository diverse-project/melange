package fr.inria.diverse.melange.tests.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsmmt.State;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface FSM extends EObject {
  public List<State> getOwnedState();
  
  public State getInitialState();
  
  public void setInitialState(final State initialState);
  
  public List<State> getFinalState();
}
