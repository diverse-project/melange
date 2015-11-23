package simplefsm.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.FSM;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import simplefsm.fsmmt.fsm.State;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements simplefsm.fsmmt.fsm.FSM {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
    adaptersFactory = simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public EList<State> getOwnedState() {
    return EListAdapter.newInstance(adaptee.getOwnedState(), simplefsm.fsm.adapters.fsmmt.StateAdapter.class) ;
  }
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState(), eResource) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    adaptee.setInitialState(((simplefsm.fsm.adapters.fsmmt.StateAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<State> getFinalState() {
    return EListAdapter.newInstance(adaptee.getFinalState(), simplefsm.fsm.adapters.fsmmt.StateAdapter.class) ;
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
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		getOwnedState().clear();
    		getOwnedState().addAll((Collection<? extends simplefsm.fsmmt.fsm.State>) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		setInitialState((simplefsm.fsmmt.fsm.State) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		getFinalState().clear();
    		getFinalState().addAll((Collection<? extends simplefsm.fsmmt.fsm.State>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__OWNED_STATE:
    		getOwnedState().clear();
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__INITIAL_STATE:
    		setInitialState((simplefsm.fsmmt.fsm.State) null);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.FSM__FINAL_STATE:
    		getFinalState().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
