package simplefsm.fsm.adapters.fsmmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fsm.State;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory;
import simplefsm.fsmmt.fsm.FSM;
import simplefsm.fsmmt.fsm.Transition;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements simplefsm.fsmmt.fsm.State {
  private FsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance()) ;
    adaptersFactory = simplefsm.fsm.adapters.fsmmt.FsmMTAdaptersFactory.getInstance() ;
  }
  
  @Override
  public String getName() {
    return adaptee.getName() ;
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o) ;
  }
  
  @Override
  public FSM getOwningFSM() {
    return adaptersFactory.createFSMAdapter(adaptee.getOwningFSM(), eResource) ;
  }
  
  @Override
  public void setOwningFSM(final FSM o) {
    adaptee.setOwningFSM(((simplefsm.fsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Transition> getOutgoingTransition() {
    return EListAdapter.newInstance(adaptee.getOutgoingTransition(), simplefsm.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public EList<Transition> getIncomingTransition() {
    return EListAdapter.newInstance(adaptee.getIncomingTransition(), simplefsm.fsm.adapters.fsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public EClass eClass() {
    return simplefsm.fsmmt.fsm.FsmPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM();
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__NAME:
    		return getName();
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		return getOutgoingTransition();
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		return getIncomingTransition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		setOwningFSM((simplefsm.fsmmt.fsm.FSM) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		getOutgoingTransition().clear();
    		getOutgoingTransition().addAll((Collection<? extends simplefsm.fsmmt.fsm.Transition>) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    		getIncomingTransition().addAll((Collection<? extends simplefsm.fsmmt.fsm.Transition>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		setOwningFSM((simplefsm.fsmmt.fsm.FSM) null);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__NAME:
    		setName((java.lang.String) null);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		getOutgoingTransition().clear();
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
