package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsm.timedfsmmt.timedfsm.State;
import timedfsm.FSM;

@SuppressWarnings("all")
public class FSMAdapter extends EObjectAdapter<FSM> implements simplefsm.timedfsmmt.timedfsm.FSM {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public FSMAdapter() {
    super(simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
    adaptersFactory = simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance() ;
  }
  
  private EList<State> ownedState;
  
  @Override
  public EList<State> getOwnedState() {
    if (ownedState == null)
    	ownedState = EListAdapter.newInstance(adaptee.getOwnedState(), adaptersFactory) ;
    return ownedState;
  }
  
  private State initialState;
  
  @Override
  public State getInitialState() {
    return adaptersFactory.createStateAdapter(adaptee.getInitialState(), eResource) ;
  }
  
  @Override
  public void setInitialState(final State o) {
    if (o != null)
    	adaptee.setInitialState(((simplefsm.timedfsm.adapters.timedfsmmt.StateAdapter) o).getAdaptee()) ;
    else adaptee.setInitialState(null) ;
  }
  
  private EList<State> finalState;
  
  @Override
  public EList<State> getFinalState() {
    if (finalState == null)
    	finalState = EListAdapter.newInstance(adaptee.getFinalState(), adaptersFactory) ;
    return finalState;
  }
  
  @Override
  public EClass eClass() {
    return simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.eINSTANCE.getFSM();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__OWNED_STATE:
    		return getOwnedState();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__INITIAL_STATE:
    		return getInitialState();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__FINAL_STATE:
    		return getFinalState();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__OWNED_STATE:
    		getOwnedState().clear();
    		getOwnedState().addAll((Collection<? extends State>) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__INITIAL_STATE:
    		setInitialState((State) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__FINAL_STATE:
    		getFinalState().clear();
    		getFinalState().addAll((Collection<? extends State>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__OWNED_STATE:
    		getOwnedState().clear();
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__INITIAL_STATE:
    		setInitialState((State) null);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.FSM__FINAL_STATE:
    		getFinalState().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
