package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.FSM;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.State;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Transition;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.FSM {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  private EList<State> states_;
  
  @Override
  public EList<State> getStates() {
    if (states_ == null)
    	states_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getStates(), adaptersFactory, eResource);
    return states_;
  }
  
  private EList<Transition> transitions_;
  
  @Override
  public EList<Transition> getTransitions() {
    if (transitions_ == null)
    	transitions_ = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getTransitions(), adaptersFactory, eResource);
    return transitions_;
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  @Override
  public Context getContext() {
    return (Context) adaptersFactory.createAdapter(fr.inria.diverse.melanger.melangedlang.aspects.FSMGlue.context(adaptee), eResource);
  }
  
  @Override
  public void setContext(final Context context) {
    fr.inria.diverse.melanger.melangedlang.aspects.FSMGlue.context(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) context).getAdaptee()
    );
  }
  
  @Override
  public void execute() {
    fr.inria.diverse.melanger.melangedlang.aspects.FSMGlue.execute(adaptee);
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(fr.inria.diverse.melanger.melangedlang.aspects.FSMAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    fr.inria.diverse.melanger.melangedlang.aspects.FSMAspect.currentState(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.StateAdapter) currentState).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getFSM();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__STATES:
    		return getStates();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__TRANSITIONS:
    		return getTransitions();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__INITIAL_STATE:
    		return getInitialState();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__CURRENT_STATE:
    		return getCurrentState();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__CONTEXT:
    		return getContext();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__STATES:
    		return getStates() != null && !getStates().isEmpty();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__INITIAL_STATE:
    		return getInitialState() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__CURRENT_STATE:
    		return getCurrentState() != null;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__CONTEXT:
    		return getContext() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__INITIAL_STATE:
    		setInitialState(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__CURRENT_STATE:
    		setCurrentState(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.FSM__CONTEXT:
    		setContext(
    		(fr.inria.diverse.melanger.melangedlangmt.minifsm.Context)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
