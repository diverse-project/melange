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
  
  @Override
  public State getSource() {
    return (State) adaptersFactory.createAdapter(adaptee.getSource(), eResource) ;
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((simplefsm.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setSource(null) ;
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource) ;
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((simplefsm.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setTarget(null) ;
  }
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
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
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource((simplefsm.fsmmt.fsm.State) null);
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget((simplefsm.fsmmt.fsm.State) null);
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput(INPUT_EDEFAULT);
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput(OUTPUT_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource((simplefsm.fsmmt.fsm.State) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget((simplefsm.fsmmt.fsm.State) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput((java.lang.String) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput((java.lang.String) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
