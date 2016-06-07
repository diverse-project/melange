package fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.minifsm;

import fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmMTAdaptersFactory;
import fr.inria.diverse.melanger.minifsmmt.minifsm.FSM;
import fr.inria.diverse.melanger.minifsmmt.minifsm.FinalState;
import fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmFactory;
import fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage;
import fr.inria.diverse.melanger.minifsmmt.minifsm.State;
import fr.inria.diverse.melanger.minifsmmt.minifsm.Transition;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

@SuppressWarnings("all")
public class MinifsmFactoryAdapter extends EFactoryImpl implements MinifsmFactory {
  private MiniFsmMTAdaptersFactory adaptersFactory = fr.inria.diverse.melanger.minifsm.adapters.minifsmmt.MiniFsmMTAdaptersFactory.getInstance();
  
  private fr.inria.diverse.minifsm.MinifsmFactory minifsmAdaptee = fr.inria.diverse.minifsm.MinifsmFactory.eINSTANCE;
  
  @Override
  public FSM createFSM() {
    return adaptersFactory.createFSMAdapter(minifsmAdaptee.createFSM(), null);
  }
  
  @Override
  public State createState() {
    return adaptersFactory.createStateAdapter(minifsmAdaptee.createState(), null);
  }
  
  @Override
  public FinalState createFinalState() {
    return adaptersFactory.createFinalStateAdapter(minifsmAdaptee.createFinalState(), null);
  }
  
  @Override
  public Transition createTransition() {
    return adaptersFactory.createTransitionAdapter(minifsmAdaptee.createTransition(), null);
  }
  
  @Override
  public EPackage getEPackage() {
    return getMinifsmPackage();
  }
  
  public MinifsmPackage getMinifsmPackage() {
    return fr.inria.diverse.melanger.minifsmmt.minifsm.MinifsmPackage.eINSTANCE;
  }
}
