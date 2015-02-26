package adapters.timedfsmmt;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import adapters.timedfsmmt.State;

@SuppressWarnings("all")
public interface FSM extends EObject {
  public List<State> getOwnedState();
  
  public State getInitialState();
  
  public void setInitialState(final State initialState);
  
  public List<State> getFinalState();
}
