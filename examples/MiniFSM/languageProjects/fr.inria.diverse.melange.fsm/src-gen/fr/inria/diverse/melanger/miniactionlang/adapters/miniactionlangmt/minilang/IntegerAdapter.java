package fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Context;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntegerAdapter extends EObjectAdapter<fr.inria.diverse.melanger.miniactionlang.minilang.Integer> implements fr.inria.diverse.melanger.miniactionlangmt.minilang.Integer {
  private MiniActionLangMTAdaptersFactory adaptersFactory;
  
  public IntegerAdapter() {
    super(fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int getValue() {
    return adaptee.getValue();
  }
  
  @Override
  public void setValue(final int o) {
    adaptee.setValue(o);
  }
  
  @Override
  public int eval(final Context ctx) {
    return fr.inria.diverse.melanger.miniactionlang.aspects.IntegerAspect.eval(adaptee, ((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  protected final static int VALUE_EDEFAULT = 0;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.eINSTANCE.getInteger();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INTEGER__VALUE:
    		return new java.lang.Integer(getValue());
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INTEGER__VALUE:
    		return getValue() != VALUE_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.INTEGER__VALUE:
    		setValue(((java.lang.Integer) newValue).intValue());
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
