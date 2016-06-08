package fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmMTAdaptersFactory;
import fr.inria.diverse.melanger.minifsmmt.minifsm.State;
import fr.inria.diverse.melanger.minifsmmt.minifsm.Transition;
import fr.inria.diverse.minifsm.FSM;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements fr.inria.diverse.melanger.minifsmmt.minifsm.FSM {
  private MiniFsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance();
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
    	adaptee.setInitialState(((fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  @Override
  public void execute(final org.eclipse.emf.common.util.EList<java.lang.String> events) {
    minifsm.aspects.FSMAspect.execute(adaptee, events
    );
  }
  
  @Override
  public State getCurrentState() {
    return (State) adaptersFactory.createAdapter(minifsm.aspects.FSMAspect.currentState(adaptee), eResource);
  }
  
  @Override
  public void setCurrentState(final State currentState) {
    minifsm.aspects.FSMAspect.currentState(adaptee, ((fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.StateAdapter) currentState).getAdaptee()
    );
  }
  
  @Override
  public String getCurrentEvent() {
    return minifsm.aspects.FSMAspect.currentEvent(adaptee);
  }
  
  @Override
  public void setCurrentEvent(final String currentEvent) {
    minifsm.aspects.FSMAspect.currentEvent(adaptee, currentEvent
    );
  }
  
  protected final static String CURRENT_EVENT_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.eINSTANCE.getFSM();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__STATES:
    		return getStates();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__TRANSITIONS:
    		return getTransitions();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__INITIAL_STATE:
    		return getInitialState();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__CURRENT_STATE:
    		return getCurrentState();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__CURRENT_EVENT:
    		return getCurrentEvent();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__STATES:
    		return getStates() != null && !getStates().isEmpty();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__TRANSITIONS:
    		return getTransitions() != null && !getTransitions().isEmpty();
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__INITIAL_STATE:
    		return getInitialState() != null;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__CURRENT_STATE:
    		return getCurrentState() != null;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__CURRENT_EVENT:
    		return getCurrentEvent() != CURRENT_EVENT_EDEFAULT;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__STATES:
    		getStates().clear();
    		getStates().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__TRANSITIONS:
    		getTransitions().clear();
    		getTransitions().addAll((Collection) newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__INITIAL_STATE:
    		setInitialState(
    		(fr.inria.diverse.melanger.minifsmmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__CURRENT_STATE:
    		setCurrentState(
    		(fr.inria.diverse.melanger.minifsmmt.minifsm.State)
    		 newValue);
    		return;
    	case fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.FSM__CURRENT_EVENT:
    		setCurrentEvent(
    		(java.lang.String)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
