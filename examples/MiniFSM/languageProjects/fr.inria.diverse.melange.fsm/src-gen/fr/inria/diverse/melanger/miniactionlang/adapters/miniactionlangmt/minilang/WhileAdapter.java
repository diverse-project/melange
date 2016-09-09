package fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory;
import fr.inria.diverse.melanger.miniactionlang.minilang.While;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Block;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class WhileAdapter extends EObjectAdapter<While> implements fr.inria.diverse.melanger.miniactionlangmt.minilang.While {
  private MiniActionLangMTAdaptersFactory adaptersFactory;
  
  public WhileAdapter() {
    super(fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public BooleanExpression getCondition() {
    return (BooleanExpression) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final BooleanExpression o) {
    if (o != null)
    	adaptee.setCondition(((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BooleanExpressionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
  }
  
  @Override
  public Block getBody() {
    return (Block) adaptersFactory.createAdapter(adaptee.getBody(), eResource);
  }
  
  @Override
  public void setBody(final Block o) {
    if (o != null)
    	adaptee.setBody(((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BlockAdapter) o).getAdaptee());
    else adaptee.setBody(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.eINSTANCE.getWhile();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.WHILE__CONDITION:
    		return getCondition();
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.WHILE__BODY:
    		return getBody();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.WHILE__CONDITION:
    		return getCondition() != null;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.WHILE__BODY:
    		return getBody() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.WHILE__CONDITION:
    		setCondition(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.WHILE__BODY:
    		setBody(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
