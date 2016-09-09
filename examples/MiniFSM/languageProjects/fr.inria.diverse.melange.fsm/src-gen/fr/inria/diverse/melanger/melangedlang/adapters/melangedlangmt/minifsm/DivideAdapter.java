package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.Divide;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class DivideAdapter extends EObjectAdapter<Divide> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.Divide {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public DivideAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public IntExpression getRight() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getRight(), eResource);
  }
  
  @Override
  public void setRight(final IntExpression o) {
    if (o != null)
    	adaptee.setRight(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setRight(null);
  }
  
  @Override
  public IntExpression getLeft() {
    return (IntExpression) adaptersFactory.createAdapter(adaptee.getLeft(), eResource);
  }
  
  @Override
  public void setLeft(final IntExpression o) {
    if (o != null)
    	adaptee.setLeft(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.IntExpressionAdapter) o).getAdaptee());
    else adaptee.setLeft(null);
  }
  
  @Override
  public int eval(final Context ctx) {
    return fr.inria.diverse.melanger.melangedlang.aspects.DivideAspect.eval(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getDivide();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.DIVIDE__RIGHT:
    		return getRight();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.DIVIDE__LEFT:
    		return getLeft();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.DIVIDE__RIGHT:
    		return getRight() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.DIVIDE__LEFT:
    		return getLeft() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.DIVIDE__RIGHT:
    		setRight(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.DIVIDE__LEFT:
    		setLeft(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
