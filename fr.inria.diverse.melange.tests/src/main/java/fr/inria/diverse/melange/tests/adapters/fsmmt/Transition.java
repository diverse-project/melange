package fr.inria.diverse.melange.tests.adapters.fsmmt;

import fr.inria.diverse.melange.tests.adapters.fsmmt.State;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Transition extends EObject {
  public String getInput();
  
  public void setInput(final String input);
  
  public String getOutput();
  
  public void setOutput(final String output);
  
  public State getSource();
  
  public void setSource(final State source);
  
  public State getTarget();
  
  public void setTarget(final State target);
}
