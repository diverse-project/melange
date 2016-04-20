package simplefsmtest.timedfsm.adapters.timedfsmmt.fsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory;
import simplefsmtest.timedfsmmt.fsm.FSM;
import simplefsmtest.timedfsmmt.fsm.Transition;
import timedfsm.fsm.State;

@SuppressWarnings("all")
public class StateAdapter extends EObjectAdapter<State> implements simplefsmtest.timedfsmmt.fsm.State {
  private TimedFsmMTAdaptersFactory adaptersFactory;
  
  public StateAdapter() {
    super(simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance());
    adaptersFactory = simplefsmtest.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory.getInstance();
  }
  
  @Override
  public String getName() {
    return adaptee.getName();
  }
  
  @Override
  public void setName(final String o) {
    adaptee.setName(o);
  }
  
  @Override
  public FSM getOwningFSM() {
    return (FSM) adaptersFactory.createAdapter(adaptee.getOwningFSM(), eResource);
  }
  
  @Override
  public void setOwningFSM(final FSM o) {
    if (o != null)
    	adaptee.setOwningFSM(((simplefsmtest.timedfsm.adapters.timedfsmmt.fsm.FSMAdapter) o).getAdaptee());
    else adaptee.setOwningFSM(null);
  }
  
  private EList<Transition> outgoingTransition;
  
  @Override
  public EList<Transition> getOutgoingTransition() {
    if (outgoingTransition == null)
    	outgoingTransition = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getOutgoingTransition(), adaptersFactory, eResource);
    return outgoingTransition;
  }
  
  private EList<Transition> incomingTransition;
  
  @Override
  public EList<Transition> getIncomingTransition() {
    if (incomingTransition == null)
    	incomingTransition = fr.inria.diverse.melange.adapters.EListAdapter.newInstance(adaptee.getIncomingTransition(), adaptersFactory, eResource);
    return incomingTransition;
  }
  
  protected final static String NAME_EDEFAULT = null;
  
  @Override
  public EClass eClass() {
    return simplefsmtest.timedfsmmt.fsm.FsmPackage.eINSTANCE.getState();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__NAME:
    		return getName();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		return getOutgoingTransition();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		return getIncomingTransition();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		return getOwningFSM() != null;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__NAME:
    		return getName() != NAME_EDEFAULT;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		return getOutgoingTransition() != null && !getOutgoingTransition().isEmpty();
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		return getIncomingTransition() != null && !getIncomingTransition().isEmpty();
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__OWNING_FSM:
    		setOwningFSM(
    		(simplefsmtest.timedfsmmt.fsm.FSM)
    		 newValue);
    		return;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__NAME:
    		setName(
    		(java.lang.String)
    		 newValue);
    		return;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__OUTGOING_TRANSITION:
    		getOutgoingTransition().clear();
    		getOutgoingTransition().addAll((Collection) newValue);
    		return;
    	case simplefsmtest.timedfsmmt.fsm.FsmPackage.STATE__INCOMING_TRANSITION:
    		getIncomingTransition().clear();
    		getIncomingTransition().addAll((Collection) newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
