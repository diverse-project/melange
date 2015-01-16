package adapters.fsmmt;

import org.eclipse.emf.ecore.EObject;

import adapters.fsmmt.State;

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
