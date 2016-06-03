package fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.Condition;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class ConditionAdapter extends EObjectAdapter<Condition> implements fr.inria.diverse.melanger.minifsmmt.minifsm.Condition {
  private MiniFsmMTAdaptersFactory adaptersFactory;
  
  public ConditionAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getExpression() {
    return adaptee.getExpression();
  }
  
  @Override
  public void setExpression(final String o) {
    adaptee.setExpression(o);
  }
  
  @Override
  public String getLanguage() {
    return adaptee.getLanguage();
  }
  
  @Override
  public void setLanguage(final String o) {
    adaptee.setLanguage(o);
  }
  
  protected final static String EXPRESSION_EDEFAULT = null;
  
  protected final static String LANGUAGE_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.eINSTANCE.getCondition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.CONDITION__EXPRESSION:
    		return getExpression();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.CONDITION__LANGUAGE:
    		return getLanguage();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.CONDITION__EXPRESSION:
    		return getExpression() != EXPRESSION_EDEFAULT;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.CONDITION__LANGUAGE:
    		return getLanguage() != LANGUAGE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.CONDITION__EXPRESSION:
    		setExpression(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.CONDITION__LANGUAGE:
    		setLanguage(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
