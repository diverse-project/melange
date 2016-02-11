package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsm.timedfsmmt.timedfsm.State;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements simplefsm.timedfsmmt.timedfsm.Transition {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
    adaptersFactory = simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance() ;
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
  public int getTime() {
    return adaptee.getTime() ;
  }
  
  @Override
  public void setTime(final int o) {
    adaptee.setTime(o) ;
  }
  
  @Override
  public State getSource() {
    return (State) adaptersFactory.createAdapter(adaptee.getSource(), eResource) ;
  }
  
  @Override
  public void setSource(final State o) {
    if (o != null)
    	adaptee.setSource(((simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setSource(null) ;
  }
  
  @Override
  public State getTarget() {
    return (State) adaptersFactory.createAdapter(adaptee.getTarget(), eResource) ;
  }
  
  @Override
  public void setTarget(final State o) {
    if (o != null)
    	adaptee.setTarget(((simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setTarget(null) ;
  }
  
  protected final static String INPUT_EDEFAULT = null;
  
  protected final static String OUTPUT_EDEFAULT = null;
  
  protected final static int TIME_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__SOURCE:
    		return getSource();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TARGET:
    		return getTarget();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TIME:
    		return new java.lang.Integer(getTime());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__SOURCE:
    		setSource((simplefsm.timedfsmmt.timedfsm.State) null);
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TARGET:
    		setTarget((simplefsm.timedfsmmt.timedfsm.State) null);
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__INPUT:
    		setInput(INPUT_EDEFAULT);
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__OUTPUT:
    		setOutput(OUTPUT_EDEFAULT);
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TIME:
    		setTime(TIME_EDEFAULT);
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__SOURCE:
    		return getSource() != null;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TARGET:
    		return getTarget() != null;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__INPUT:
    		return getInput() != INPUT_EDEFAULT;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != OUTPUT_EDEFAULT;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TIME:
    		return getTime() != TIME_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__SOURCE:
    		setSource((simplefsm.timedfsmmt.timedfsm.State) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TARGET:
    		setTarget((simplefsm.timedfsmmt.timedfsm.State) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__INPUT:
    		setInput((java.lang.String) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__OUTPUT:
    		setOutput((java.lang.String) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.TRANSITION__TIME:
    		setTime(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
