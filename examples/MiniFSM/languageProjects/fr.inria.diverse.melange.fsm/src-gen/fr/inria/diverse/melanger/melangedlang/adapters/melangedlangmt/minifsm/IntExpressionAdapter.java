package fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory;
import fr.inria.diverse.melanger.melangedlang.minifsm.IntExpression;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.Context;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class IntExpressionAdapter extends EObjectAdapter<IntExpression> implements fr.inria.diverse.melanger.melangedlangmt.minifsm.IntExpression {
  private MelangedLangMTAdaptersFactory adaptersFactory;
  
  public IntExpressionAdapter() {
    super(fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance());
    adaptersFactory = fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.MelangedLangMTAdaptersFactory.getInstance();
  }
  
  @Override
  public int eval(final Context ctx) {
    return fr.inria.diverse.melanger.melangedlang.aspects.IntExpressionAspect.eval(adaptee, ((fr.inria.diverse.melanger.melangedlang.adapters.melangedlangmt.minifsm.ContextAdapter) ctx).getAdaptee()
    );
  }
  
  @Override
  public EClass eClass() {
    return fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmPackage.eINSTANCE.getIntExpression();
  }
}
