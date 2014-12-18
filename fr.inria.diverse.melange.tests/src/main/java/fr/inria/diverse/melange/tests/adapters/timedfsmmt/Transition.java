package fr.inria.diverse.melange.tests.adapters.timedfsmmt;

import fr.inria.diverse.melange.tests.adapters.timedfsmmt.State;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface Transition extends EObject {
  public String getInput();
  
  public void setInput(final String input);
  
  public String getOutput();
  
  public void setOutput(final String output);
  
  public int getTime();
  
  public void setTime(final int time);
  
  public State getSource();
  
  public void setSource(final State source);
  
  public State getTarget();
  
  public void setTarget(final State target);
}
