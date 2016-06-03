package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.FinalState;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Block;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FinalStateAdapter extends EObjectAdapter<FinalState> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.FinalState {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public FinalStateAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public FSM getFsm() {
    return (FSM) adaptersFactory.createAdapter(adaptee.getFsm(), eResource);
  }
  
  @Override
  public void setFsm(final FSM o) {
    if (o != null)
    	adaptee.setFsm(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.FSMAdapter) o).getAdaptee());
    else adaptee.setFsm(null);
  }
  
  @Override
  public void execute() {
    fr.inria.diverse.melanger.melangedlang.aspects.FinalStateAspect.execute(adaptee);
  }
  
  @Override
  public Block getBlock() {
    return (Block) adaptersFactory.createAdapter(fr.inria.diverse.melanger.melangedlang.aspects.StateGlue.block(adaptee), eResource);
  }
  
  @Override
  public void setBlock(final Block block) {
    fr.inria.diverse.melanger.melangedlang.aspects.StateGlue.block(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BlockAdapter) block).getAdaptee()
    );
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getFinalState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__NAME:
    		return getName();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__FSM:
    		return getFsm();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__BLOCK:
    		return getBlock();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__FSM:
    		return getFsm() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__BLOCK:
    		return getBlock() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__FSM:
    		setFsm(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FINAL_STATE__BLOCK:
    		setBlock(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.Block)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
