package simplefsm.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.Transition;
import org.eclipse.emf.ecore.EClass;
import simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import simplefsm.fsmmt.fsm.State;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements simplefsm.fsmmt.fsm.Transition {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
    adaptersFactory = simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getInput() {
    return adaptee.getInput() ;
  }
  
  @Override
  public void setInput(final String o) {
    adaptee.setInput(o) ;
  }
  
  @Override
  public String getOutput() {
    return adaptee.getOutput() ;
  }
  
  @Override
  public void setOutput(final String o) {
    adaptee.setOutput(o) ;
  }
  
  private State source;
  
  @Override
  public State getSource() {
    return adaptersFactory.createStateAdapter(adaptee.getSource(), eResource) ;
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((simplefsm.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setSource(null) ;
  }
  
  private State target;
  
  @Override
  public State getTarget() {
    return adaptersFactory.createStateAdapter(adaptee.getTarget(), eResource) ;
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((simplefsm.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setTarget(null) ;
  }
  
  @Override
  public EClass eClass() {
    return simplefsm.fsmmt.fsm.FsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource();
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource((State) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget((State) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput((String) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput((String) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource((State) null);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget((State) null);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput((String) null);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput((String) null);
    		return;
    }
    
    super.eUnset(featureID);
  }
}
