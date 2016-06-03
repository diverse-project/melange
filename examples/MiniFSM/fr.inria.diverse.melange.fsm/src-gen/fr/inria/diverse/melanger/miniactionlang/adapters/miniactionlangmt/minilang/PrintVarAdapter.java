package fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory;
import fr.inria.diverse.melanger.miniactionlang.minilang.PrintVar;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Context;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class PrintVarAdapter extends EObjectAdapter<PrintVar> implements fr.inria.diverse.melanger.miniactionlangmt.minilang.PrintVar {
  private MiniActionLangMTAdaptersFactory adaptersFactory;
  
  public PrintVarAdapter() {
    super(fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public VariableRef getValue() {
    return (VariableRef) adaptersFactory.createAdapter(adaptee.getValue(), eResource);
  }
  
  @Override
  public void setValue(final VariableRef o) {
    if (o != null)
    	adaptee.setValue(((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.VariableRefAdapter) o).getAdaptee());
    else adaptee.setValue(null);
  }
  
  @Override
  public void execute(final Context ctx) {
    fr.inria.diverse.melanger.miniactionlang.aspects.PrintVarAspect.execute(adaptee, ((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.eINSTANCE.getPrintVar();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.PRINT_VAR__VALUE:
    		return getValue();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.PRINT_VAR__VALUE:
    		return getValue() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.PRINT_VAR__VALUE:
    		setValue(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.VariableRef)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
