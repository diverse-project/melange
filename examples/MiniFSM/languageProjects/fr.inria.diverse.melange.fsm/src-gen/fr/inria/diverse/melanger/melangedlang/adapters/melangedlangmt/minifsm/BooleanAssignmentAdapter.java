package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.BooleanAssignment;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BooleanAssignmentAdapter extends EObjectAdapter<BooleanAssignment> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanAssignment {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public BooleanAssignmentAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanVariableRef getVariable() {
    return (BooleanVariableRef) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final BooleanVariableRef o) {
    if (o != null)
    	adaptee.setVariable(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanVariableRefAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public BooleanExpression getValue() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final BooleanExpression o) {
    if (o != null)
    	adaptee.setValue(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void execute(final Context ctx) {
    fr.inria.diverse.melanger.melangedlang.aspects.BooleanAssignmentAspect.execute(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getBooleanAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BOOLEAN_ASSIGNMENT__VARIABLE:
    		return getVariable();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BOOLEAN_ASSIGNMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BOOLEAN_ASSIGNMENT__VARIABLE:
    		return getVariable() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BOOLEAN_ASSIGNMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BOOLEAN_ASSIGNMENT__VARIABLE:
    		setVariable(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanVariableRef)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BOOLEAN_ASSIGNMENT__VALUE:
    		setValue(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
