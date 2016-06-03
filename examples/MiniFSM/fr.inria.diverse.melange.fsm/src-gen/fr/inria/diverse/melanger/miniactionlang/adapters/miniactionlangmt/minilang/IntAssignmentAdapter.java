package fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory;
import fr.inria.diverse.melanger.miniactionlang.minilang.IntAssignment;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Context;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntExpression;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.IntVariableRef;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntAssignmentAdapter extends EObjectAdapter<IntAssignment> implements fr.inria.diverse.melanger.miniactionlangmt.minilang.IntAssignment {
  private MiniActionLangMTAdaptersFactory adaptersFactory;
  
  public IntAssignmentAdapter() {
    super(fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntVariableRef getVariable() {
    return (IntVariableRef) adaptersFactory.createAdapter(adaptee.getVariable(), eResource);
  }
  
  @Override
  public void setVariable(final IntVariableRef o) {
    if (o != null)
    	adaptee.setVariable(((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntVariableRefAdapter) o).getAdaptee());
    else adaptee.setVariable(null);
  }
  
  @Override
  public IntExpression getValue() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final IntExpression o) {
    if (o != null)
    	adaptee.setValue(((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void execute(final Context ctx) {
    fr.inria.diverse.melanger.miniactionlang.aspects.IntAssignmentAspect.execute(adaptee, ((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.eINSTANCE.getIntAssignment();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INT_ASSIGNMENT__VARIABLE:
    		return getVariable();
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INT_ASSIGNMENT__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INT_ASSIGNMENT__VARIABLE:
    		return getVariable() != null;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INT_ASSIGNMENT__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INT_ASSIGNMENT__VARIABLE:
    		setVariable(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.IntVariableRef)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INT_ASSIGNMENT__VALUE:
    		setValue(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
