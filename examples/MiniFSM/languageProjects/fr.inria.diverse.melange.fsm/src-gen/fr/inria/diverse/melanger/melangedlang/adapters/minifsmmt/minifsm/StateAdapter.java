package fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.State;
import fr.inria.diverse.melanger.minifsmmt.minifsm.FSM;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements fr.inria.diverse.melanger.minifsmmt.minifsm.State {
  private MiniFsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
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
  public void execute() {
    fr.inria.diverse.melanger.melangedlang.aspects.StateGlue.execute(adaptee);
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.STATE__NAME:
    		return getName();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.STATE__FSM:
    		return getFsm();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.STATE__FSM:
    		return getFsm() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.STATE__FSM:
    		setFsm(
    		(fr.inria.diverse.melanger.minifsmmt.minifsm.FSM)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
