package adapters.fsmmt;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import adapters.fsmmt.FSM;
import adapters.fsmmt.Transition;

@SuppressWarnings("all")
public interface State extends EObject {
  public String getName();
  
  public void setName(final String name);
  
  public FSM getOwningFSM();
  
  public void setOwningFSM(final FSM owningFSM);
  
  public List<Transition> getOutgoingTransition();
  
  public List<Transition> getIncomingTransition();
}
