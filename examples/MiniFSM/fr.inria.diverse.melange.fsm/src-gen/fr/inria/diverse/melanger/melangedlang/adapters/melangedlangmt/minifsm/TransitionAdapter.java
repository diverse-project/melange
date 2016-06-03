package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.Transition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.State;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class TransitionAdapter extends EObjectAdapter<Transition> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public TransitionAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public State getInput() {
    return (State) adaptersFactory.createAdapter(adaptee.getInput(), eResource);
  }
  
  @Override
  public void setInput(final State o) {
    if (o != null)
    	adaptee.setInput(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter) o).getAdaptee());
    else adaptee.setInput(null);
  }
  
  @Override
  public State getOutput() {
    return (State) adaptersFactory.createAdapter(adaptee.getOutput(), eResource);
  }
  
  @Override
  public void setOutput(final State o) {
    if (o != null)
    	adaptee.setOutput(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter) o).getAdaptee());
    else adaptee.setOutput(null);
  }
  
  @Override
  public Condition getCondition() {
    return (Condition) adaptersFactory.createAdapter(adaptee.getCondition(), eResource);
  }
  
  @Override
  public void setCondition(final Condition o) {
    if (o != null)
    	adaptee.setCondition(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ConditionAdapter) o).getAdaptee());
    else adaptee.setCondition(null);
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
  public BooleanExpression getExpression() {
    return (BooleanExpression) adaptersFactory.createAdapter(fr.inria.diverse.melanger.melangedlang.aspects.TransitionGlue.expression(adaptee), eResource);
  }
  
  @Override
  public void setExpression(final BooleanExpression expression) {
    fr.inria.diverse.melanger.melangedlang.aspects.TransitionGlue.expression(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.BooleanExpressionAdapter) expression).getAdaptee()
    );
  }
  
  @Override
  public boolean isActivated() {
    return fr.inria.diverse.melanger.melangedlang.aspects.TransitionGlue.isActivated(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getTransition();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__INPUT:
    		return getInput();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__OUTPUT:
    		return getOutput();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__CONDITION:
    		return getCondition();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__FSM:
    		return getFsm();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__EXPRESSION:
    		return getExpression();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__INPUT:
    		return getInput() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__OUTPUT:
    		return getOutput() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__CONDITION:
    		return getCondition() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__FSM:
    		return getFsm() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__EXPRESSION:
    		return getExpression() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__INPUT:
    		setInput(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__OUTPUT:
    		setOutput(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__CONDITION:
    		setCondition(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.Condition)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__FSM:
    		setFsm(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.TRANSITION__EXPRESSION:
    		setExpression(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.BooleanExpression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
