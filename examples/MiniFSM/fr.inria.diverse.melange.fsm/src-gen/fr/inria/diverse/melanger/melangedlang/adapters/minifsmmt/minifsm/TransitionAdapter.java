package fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.Transition;
import fr.inria.diverse.melanger.minifsmmt.minifsm.FSM;
import fr.inria.diverse.melanger.minifsmmt.minifsm.State;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements fr.inria.diverse.melanger.minifsmmt.minifsm.Transition {
  private MiniFsmMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getEvent() {
    return adaptee.getEvent();
  }
  
  @Override
  public void setEvent(final String o) {
    adaptee.setEvent(o);
  }
  
  @Override
  public State getInput() {
    return (State) adaptersFactory.createAdapter(adaptee.getInput(), eResource);
  }
  
  @Override
  public void setInput(final State o) {
    if (o != null)
    	adaptee.setInput(((fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.minifsm.StateAdapter) o).getAdaptee());
    else adaptee.setInput(null);
  }
  
  @Override
  public State getOutput() {
    return (State) adaptersFactory.createAdapter(adaptee.getOutput(), eResource);
  }
  
  @Override
  public void setOutput(final State o) {
    if (o != null)
    	adaptee.setOutput(((fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.minifsm.StateAdapter) o).getAdaptee());
    else adaptee.setOutput(null);
  }
  
  @Override
  public FSM getFsm() {
    return (FSM) adaptersFactory.createAdapter(adaptee.getFsm(), eResource);
  }
  
  @Override
  public void setFsm(final FSM o) {
    if (o != null)
    	adaptee.setFsm(((fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.minifsm.FSMAdapter) o).getAdaptee());
    else adaptee.setFsm(null);
  }
  
  @Override
  public boolean isActivated() {
    return fr.inria.diverse.melanger.melangedlang.aspects.TransitionGlue.isActivated(adaptee);
  }
  
  protected final static String EVENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__FSM:
    		return getFsm();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__EVENT:
    		return getEvent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__INPUT:
    		return getInput() != null;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != null;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__FSM:
    		return getFsm() != null;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__EVENT:
    		return getEvent() != EVENT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__INPUT:
    		setInput(
    		(fr.inria.diverse.melanger.minifsmmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(fr.inria.diverse.melanger.minifsmmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__FSM:
    		setFsm(
    		(fr.inria.diverse.melanger.minifsmmt.minifsm.FSM)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.TRANSITION__EVENT:
    		setEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
