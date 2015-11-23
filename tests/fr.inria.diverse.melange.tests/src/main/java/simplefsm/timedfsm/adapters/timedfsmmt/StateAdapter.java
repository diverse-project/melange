package simplefsm.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.EListAdapter;
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
    return adaptersFactory.createFSMAdapter(adaptee.getOwningFSM(), eResource) ;
  }
  
  @Override
  public void setOwningFSM(final FSM o) {
    adaptee.setOwningFSM(((simplefsm.timedfsm.adapters.timedfsmmt.FSMAdapter) o).getAdaptee()) ;
  }
  
  @Override
  public EList<Transition> getOutgoingTransition() {
    return EListAdapter.newInstance(adaptee.getOutgoingTransition(), simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
  
  @Override
  public EList<Transition> getIncomingTransition() {
    return EListAdapter.newInstance(adaptee.getIncomingTransition(), simplefsm.timedfsm.adapters.timedfsmmt.TransitionAdapter.class) ;
  }
  
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
    		getOutgoingTransition().addAll((Collection<? extends simplefsm.timedfsmmt.timedfsm.Transition>) newValue);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    		getIncomingTransition().addAll((Collection<? extends simplefsm.timedfsmmt.timedfsm.Transition>) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
  
  @Override
  public void eUnset(final int featureID) {
    switch (featureID) {
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OWNING_FSM:
    		setOwningFSM((simplefsm.timedfsmmt.timedfsm.FSM) null);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__NAME:
    		setName((java.lang.String) null);
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__OUTGOING_TRANSITION:
    		getOutgoingTransition().clear();
    		return;
    	case simplefsm.timedfsmmt.timedfsm.TimedfsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    		return;
    }
    
    super.eUnset(featureID);
  }
}
