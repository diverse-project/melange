package simplefsmtest.timedfsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import simplefsmtest.fsmmt.fsm.State;
import simplefsmtest.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory;
import timedfsm.fsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements simplefsmtest.fsmmt.fsm.FSM {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(simplefsmtest.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance());
    adaptersFactory = simplefsmtest.timedfsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance();
  }
  
  private EList<State> ownedState;
  
  @Override
  public EList<State> getOwnedState() {
    if (ownedState == null)
    	ownedState = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOwnedState(), adaptersFactory);
    return ownedState;
  }
  
  @Override
  public State getInitialState() {
    return (State) adaptersFactory.createAdapter(adaptee.getInitialState(), eResource);
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((simplefsmtest.timedfsm.adapters.fsmmt.StateAdapter) o).getAdaptee());
    else adaptee.setInitialState(null);
  }
  
  private EList<State> finalState;
  
  @Override
  public EList<State> getFinalState() {
    if (finalState == null)
    	finalState = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getFinalState(), adaptersFactory);
    return finalState;
  }
  
  @Override
  public EClass eClass() {
    return simplefsmtest.fsmmt.fsm.FsmPackage.eINSTANCE.getFSM();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		return getOwnedState();
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		return getInitialState();
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		return getFinalState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		return getOwnedState() != null && !getOwnedState().isEmpty();
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		return getInitialState() != null;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		return getFinalState() != null && !getFinalState().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		getOwnedState().clear();
    		getOwnedState().addAll((Collection) newValue);
    		return;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		setInitialState(
    		(simplefsmtest.fsmmt.fsm.State)
    		 newValue);
    		return;
    	case simplefsmtest.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		getFinalState().clear();
    		getFinalState().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
