package simplefsm.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import simplefsm.fsmmt.fsm.State;
import simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements simplefsm.fsmmt.fsm.FSM {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
    adaptersFactory = simplefsm.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance() ;
  }
  
  private EList<State> ownedState;
  
  @Override
  public EList<State> getOwnedState() {
    if (ownedState == null)
    	ownedState = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedState(), adaptersFactory) ;
    return ownedState;
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((simplefsm.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setInitialState(null) ;
  }
  
  private EList<State> finalState;
  
  @Override
  public EList<State> getFinalState() {
    if (finalState == null)
    	finalState = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFinalState(), adaptersFactory) ;
    return finalState;
  }
  
  @Override
  public EClass eClass() {
    return simplefsm.fsmmt.fsm.FsmPackage.eINSTANCE.getFSM();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		return getOwnedState();
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		return getInitialState();
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		return getFinalState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		getOwnedState().clear();
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		setInitialState((simplefsm.fsmmt.fsm.State) null);
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		getFinalState().clear();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		return getOwnedState() != null && !getOwnedState().isEmpty();
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		return getInitialState() != null;
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		return getFinalState() != null && !getFinalState().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		getOwnedState().clear();
    		getOwnedState().addAll((Collection) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		setInitialState((simplefsm.fsmmt.fsm.State) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		getFinalState().clear();
    		getFinalState().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
