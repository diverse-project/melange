package simplefsmtest.timedfsm.adapters.fsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import simplefsmtest.fsmmt.fsm.State;
import simplefsmtest.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.fsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements simplefsmtest.fsmmt.fsm.Transition {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(simplefsmtest.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance());
    adaptersFactory = simplefsmtest.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getInput() {
    return adaptee.getInput();
  }
  
  @Override
  public void setInput(final String o) {
    adaptee.setInput(o);
  }
  
  @Override
  public String getOutput() {
    return adaptee.getOutput();
  }
  
  @Override
  public void setOutput(final String o) {
    adaptee.setOutput(o);
  }
  
  @Override
  public State getSource() {
    return (State) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((simplefsmtest.timedfsm.adapters.fsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((simplefsmtest.timedfsm.adapters.fsmmt.fsm.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return simplefsmtest.fsmmt.fsm.FsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource();
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource(
    		(simplefsmtest.fsmmt.fsm.State)
    		 newValue);
    		return;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget(
    		(simplefsmtest.fsmmt.fsm.State)
    		 newValue);
    		return;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
