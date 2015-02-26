package adapters.timedfsm.adapters.timedfsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EObject;
import adapters.timedfsm.adapters.timedfsmmt.FSMAdapter;
import adapters.timedfsm.adapters.timedfsmmt.StateAdapter;
import adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter;
import timedfsm.FSM;
import timedfsm.State;
import timedfsm.Transition;

@SuppressWarnings("all")
public class TimedFsmMTAdaptersFactory implements AdaptersFactory {
  private static TimedFsmMTAdaptersFactory instance;
  
  public static TimedFsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new adapters.timedfsm.adapters.timedfsmmt.TimedFsmMTAdaptersFactory() ;
    }
    return instance ;
  }
  
  public EObjectAdapter createAdapter(final EObject o) {
    if (o instanceof timedfsm.FSM)
    	return createFSMAdapter((timedfsm.FSM) o) ;
    if (o instanceof timedfsm.State)
    	return createStateAdapter((timedfsm.State) o) ;
    if (o instanceof timedfsm.Transition)
    	return createTransitionAdapter((timedfsm.Transition) o) ;
    return null ;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee) {
    adapters.timedfsm.adapters.timedfsmmt.FSMAdapter adap = new adapters.timedfsm.adapters.timedfsmmt.FSMAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public StateAdapter createStateAdapter(final State adaptee) {
    adapters.timedfsm.adapters.timedfsmmt.StateAdapter adap = new adapters.timedfsm.adapters.timedfsmmt.StateAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee) {
    adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter adap = new adapters.timedfsm.adapters.timedfsmmt.TransitionAdapter() ;
    adap.setAdaptee(adaptee) ;
    return adap ;
  }
}
