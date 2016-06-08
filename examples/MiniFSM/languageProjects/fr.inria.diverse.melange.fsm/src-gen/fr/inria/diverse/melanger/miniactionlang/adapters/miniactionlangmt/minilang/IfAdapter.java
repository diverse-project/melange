package fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.MiniActionLangMTAdaptersFactory;
import fr.inria.diverse.melanger.miniactionlang.minilang.If;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.Block;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IfAdapter extends EObjectAdapter<If> implements fr.inria.diverse.melanger.miniactionlangmt.minilang.If {
  private MiniActionLangMTAdaptersFactory adaptersFactory;
  
  public IfAdapter() {
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
  public Block getThen() {
    return (Block) adaptersFactory.createAdapter(adaptee.getThen(), eResource);
  }
  
  @Override
  public void setThen(final Block o) {
    if (o != null)
    	adaptee.setThen(((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BlockAdapter) o).getAdaptee());
    else adaptee.setThen(null);
  }
  
  @Override
  public Block getElse() {
    return (Block) adaptersFactory.createAdapter(adaptee.getElse(), eResource);
  }
  
  @Override
  public void setElse(final Block o) {
    if (o != null)
    	adaptee.setElse(((fr.inria.diverse.melanger.miniactionlang.adapters.miniactionlangmt.minilang.BlockAdapter) o).getAdaptee());
    else adaptee.setElse(null);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.eINSTANCE.getIf();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__CONDITION:
    		return getCondition();
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__THEN:
    		return getThen();
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__ELSE:
    		return getElse();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__CONDITION:
    		return getCondition() != null;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__THEN:
    		return getThen() != null;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__ELSE:
    		return getElse() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__CONDITION:
    		setCondition(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.BooleanExpression)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__THEN:
    		setThen(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.Block)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangPackage.IF__ELSE:
    		setElse(
    		(fr.inria.diverse.melanger.miniactionlangmt.minilang.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
