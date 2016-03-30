package simplefsmtest.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsmtest.timedfsmmt.fsm.State;
import timedfsm.fsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements simplefsmtest.timedfsmmt.fsm.Transition {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance());
    adaptersFactory = simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
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
  public int getTime() {
    return adaptee.getTime();
  }
  
  @Override
  public void setTime(final int o) {
    adaptee.setTime(o);
  }
  
  @Override
  public State getSource() {
    return (State) adaptersFactory.createAdapter(adaptee.getSource(), eResource);
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((simplefsmtest.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee());
    else adaptee.setSource(null);
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource);
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((simplefsmtest.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee());
    else adaptee.setTarget(null);
  }
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  protected final static int TIME_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return simplefsmtest.timedfsmmt.fsm.FsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__TIME:
    		return new java.lang.Integer(getTime());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__TIME:
    		return getTime() != TIME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__SOURCE:
    		setSource(
    		(simplefsmtest.timedfsmmt.fsm.State)
    		 newValue);
    		return;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__TARGET:
    		setTarget(
    		(simplefsmtest.timedfsmmt.fsm.State)
    		 newValue);
    		return;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__INPUT:
    		setInput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(java.lang.String)
    		 newValue);
    		return;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.TRANSITION__TIME:
    		setTime(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
