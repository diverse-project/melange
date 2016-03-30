package simplefsmtest;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import simplefsmtest.fsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public interface FsmMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract FsmFactory getFactory();
  
  public abstract void save(final String uri) throws IOException;
}
