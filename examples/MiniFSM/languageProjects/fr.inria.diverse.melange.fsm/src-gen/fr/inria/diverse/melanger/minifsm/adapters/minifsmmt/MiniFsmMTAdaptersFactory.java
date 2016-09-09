package fr.inria.diverse.melanger.minifsm.adapters.minifsmmt;

import fr.inria.diverse.melange.adapters.AdaptersFactory;
import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FSMAdapter;
import fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FinalStateAdapter;
import fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.StateAdapter;
import fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.TransitionAdapter;
import fr.inria.diverse.minifsm.FSM;
import fr.inria.diverse.minifsm.FinalState;
import fr.inria.diverse.minifsm.State;
import fr.inria.diverse.minifsm.Transition;
import java.util.WeakHashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

@SuppressWarnings("all")
public class MiniFsmMTAdaptersFactory implements AdaptersFactory {
  private static MiniFsmMTAdaptersFactory instance;
  
  public static MiniFsmMTAdaptersFactory getInstance() {
    if (instance == null) {
    	instance = new fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmMTAdaptersFactory();
    }
    return instance;
  }
  
  private WeakHashMap<EObject, EObjectAdapter> register;
  
  public MiniFsmMTAdaptersFactory() {
    register = new WeakHashMap();
  }
  
  public EObjectAdapter createAdapter(final EObject o, final Resource res) {
    if (o instanceof fr.inria.diverse.minifsm.FSM){
    	return createFSMAdapter((fr.inria.diverse.minifsm.FSM) o, res);
    }
    if (o instanceof fr.inria.diverse.minifsm.FinalState){
    	return createFinalStateAdapter((fr.inria.diverse.minifsm.FinalState) o, res);
    }
    if (o instanceof fr.inria.diverse.minifsm.State){
    	return createStateAdapter((fr.inria.diverse.minifsm.State) o, res);
    }
    if (o instanceof fr.inria.diverse.minifsm.Transition){
    	return createTransitionAdapter((fr.inria.diverse.minifsm.Transition) o, res);
    }
    
    return null;
  }
  
  public FSMAdapter createFSMAdapter(final FSM adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FSMAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FSMAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FSMAdapter) adapter;
    }
  }
  
  public StateAdapter createStateAdapter(final State adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.StateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.StateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.StateAdapter) adapter;
    }
  }
  
  public FinalStateAdapter createFinalStateAdapter(final FinalState adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FinalStateAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FinalStateAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.FinalStateAdapter) adapter;
    }
  }
  
  public TransitionAdapter createTransitionAdapter(final Transition adaptee, final Resource res) {
    if (adaptee == null)
    	return null;
    EObjectAdapter adapter = register.get(adaptee);
    if(adapter != null)
    	 return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.TransitionAdapter) adapter;
    else {
    	adapter = new fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.TransitionAdapter();
    	adapter.setAdaptee(adaptee);
    	adapter.setResource(res);
    	register.put(adaptee, adapter);
    	return (fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm.TransitionAdapter) adapter;
    }
  }
}
