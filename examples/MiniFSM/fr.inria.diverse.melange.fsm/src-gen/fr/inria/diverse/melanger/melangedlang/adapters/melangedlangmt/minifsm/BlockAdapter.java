package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.Block;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Statement;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class BlockAdapter extends EObjectAdapter<Block> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.Block {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public BlockAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  private EList<Statement> statement_;
  
  @Override
  public EList<Statement> getStatement() {
    if (statement_ == null)
    	statement_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStatement(), adaptersFactory, eResource);
    return statement_;
  }
  
  @Override
  public void execute(final Context ctx) {
    fr.inria.diverse.melanger.melangedlang.aspects.BlockAspect.execute(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getBlock();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BLOCK__STATEMENT:
    		return getStatement();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BLOCK__STATEMENT:
    		return getStatement() != null && !getStatement().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.BLOCK__STATEMENT:
    		getStatement().clear();
    		getStatement().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
