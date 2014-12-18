package fr.inria.diverse.melange.tests.adapters;

import fr.inria.diverse.melange.tests.adapters.fsmmt.FsmMTFactory;
import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface FsmMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract FsmMTFactory getFactory();
  
  public void save(final String uri) throws IOException;
}
