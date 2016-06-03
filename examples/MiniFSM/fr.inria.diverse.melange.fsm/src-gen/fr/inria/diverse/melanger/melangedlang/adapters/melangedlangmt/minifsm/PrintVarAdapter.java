package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.PrintVar;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PrintVarAdapter extends EObjectAdapter<PrintVar> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.PrintVar {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public PrintVarAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public VariableRef getValue() {
    return (VariableRef) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final VariableRef o) {
    if (o != null)
    	adaptee.setValue(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.VariableRefAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void execute(final Context ctx) {
    fr.inria.diverse.melanger.melangedlang.aspects.PrintVarAspect.execute(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getPrintVar();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.PRINT_VAR__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.PRINT_VAR__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.PRINT_VAR__VALUE:
    		setValue(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.VariableRef)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
