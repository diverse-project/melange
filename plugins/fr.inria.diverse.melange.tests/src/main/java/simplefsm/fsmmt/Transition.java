package simplefsm.fsmmt;

import org.eclipse.emf.ecore.EObject;
import simplefsm.fsmmt.State;

@SuppressWarnings("all")
public interface Transition extends EObject {
  public abstract String getInput();
  
  public abstract void setInput(final String newInput);
  
  public abstract String getOutput();
  
  public abstract void setOutput(final String newOutput);
  
  public abstract State getSource();
  
  public abstract void setSource(final State newSource);
  
  public abstract State getTarget();
  
  public abstract void setTarget(final State newTarget);
}
