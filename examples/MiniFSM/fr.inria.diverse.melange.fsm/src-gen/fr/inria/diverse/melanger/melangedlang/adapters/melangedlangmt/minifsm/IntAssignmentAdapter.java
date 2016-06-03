package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntAssignment;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntAssignmentAdapter extends EObjectAdapter<IntAssignment> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.IntAssignment {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public IntAssignmentAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntVariableRef getVariable() {
    return (IntVariableRef) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final IntVariableRef o) {
    if (o != null)
    	adaptee.setVariable(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntVariableRefAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public IntExpression getValue() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final IntExpression o) {
    if (o != null)
    	adaptee.setValue(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void execute(final Context ctx) {
    fr.inria.diverse.melanger.melangedlang.aspects.IntAssignmentAspect.execute(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getIntAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.INT_ASSIGNMENT__VARIABLE:
    		return getVariable();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.INT_ASSIGNMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.INT_ASSIGNMENT__VARIABLE:
    		return getVariable() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.INT_ASSIGNMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.INT_ASSIGNMENT__VARIABLE:
    		setVariable(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.IntVariableRef)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.INT_ASSIGNMENT__VALUE:
    		setValue(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
