package simplefsm.fsm.adapters.fsmmt;

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
    return (FSM) adaptersFactory.createAdapter(adaptee.getOwningFSM(), eResource) ;
  }
  
  @Override
  public void setOwningFSM(final FSM o) {
    if (o != null)
    	adaptee.setOwningFSM(((simplefsm.fsm.adapters.fsmmt.FSMAdapter) o).getAdaptee()) ;
    else adaptee.setOwningFSM(null) ;
  }
  
  private EList<Transition> outgoingTransition;
  
  @Override
  public EList<Transition> getOutgoingTransition() {
    if (outgoingTransition == null)
    	outgoingTransition = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransition(), adaptersFactory) ;
    return outgoingTransition;
  }
  
  private EList<Transition> incomingTransition;
  
  @Override
  public EList<Transition> getIncomingTransition() {
    if (incomingTransition == null)
    	incomingTransition = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransition(), adaptersFactory) ;
    return incomingTransition;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
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
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		setOwningFSM((simplefsm.fsmmt.fsm.FSM) null);
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__NAME:
    		setName(NAME_EDEFAULT);
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		getOutgoingTransition().clear();
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM() != null;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		return getOutgoingTransition() != null && !getOutgoingTransition().isEmpty();
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		return getIncomingTransition() != null && !getIncomingTransition().isEmpty();
    }
    
    return super.eIsSet(featureID);
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
    		getOutgoingTransition().addAll((Collection) newValue);
    		return;
    	case simplefsm.fsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    		getIncomingTransition().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
