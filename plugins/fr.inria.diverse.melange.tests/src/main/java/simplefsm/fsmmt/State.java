package simplefsm.fsmmt;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import simplefsm.fsmmt.FSM;
import simplefsm.fsmmt.Transition;

@SuppressWarnings("all")
public interface State extends EObject {
  public abstract String getName();
  
  public abstract void setName(final String newName);
  
  public abstract FSM getOwningFSM();
  
  public abstract void setOwningFSM(final FSM newOwningFSM);
  
  public abstract EList<Transition> getOutgoingTransition();
  
  public abstract EList<Transition> getIncomingTransition();
}
