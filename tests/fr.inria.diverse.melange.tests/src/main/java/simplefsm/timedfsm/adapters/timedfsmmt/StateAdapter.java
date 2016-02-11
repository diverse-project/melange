package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsm.timedfsmmt.timedfsm.FSM;
import simplefsm.timedfsmmt.timedfsm.Transition;
import timedfsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements simplefsm.timedfsmmt.timedfsm.State {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance()) ;
    adaptersFactory = simplefsm.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance() ;
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
    	adaptee.setOwningFSM(((simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter) o).getAdaptee()) ;
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
    return simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__NAME:
    		return getName();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OUTGOING_TRANSITION:
    		return getOutgoingTransition();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__INCOMING_TRANSITION:
    		return getIncomingTransition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OWNING_FSM:
    		setOwningFSM((simplefsm.timedfsmmt.timedfsm.FSM) null);
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__NAME:
    		setName(NAME_EDEFAULT);
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OUTGOING_TRANSITION:
    		getOutgoingTransition().clear();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    	return;
    }
    
    super.eUnset(featureID);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM() != null;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OUTGOING_TRANSITION:
    		return getOutgoingTransition() != null && !getOutgoingTransition().isEmpty();
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__INCOMING_TRANSITION:
    		return getIncomingTransition() != null && !getIncomingTransition().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OWNING_FSM:
    		setOwningFSM((simplefsm.timedfsmmt.timedfsm.FSM) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__NAME:
    		setName((java.lang.String) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OUTGOING_TRANSITION:
    		getOutgoingTransition().clear();
    		getOutgoingTransition().addAll((Collection) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    		getIncomingTransition().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
