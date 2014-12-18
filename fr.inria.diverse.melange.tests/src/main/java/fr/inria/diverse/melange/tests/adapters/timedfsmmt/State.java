package fr.inria.diverse.melange.tests.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsmmt.FSM;
import fr.inria.diverse.melange.tests.adapters.timedfsmmt.Transition;
import java.util.List;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface State extends EObject {
  public String getName();
  
  public void setName(final String name);
  
  public FSM getOwningFSM();
  
  public void setOwningFSM(final FSM owningFSM);
  
  public List<Transition> getOutgoingTransition();
  
  public List<Transition> getIncomingTransition();
}
