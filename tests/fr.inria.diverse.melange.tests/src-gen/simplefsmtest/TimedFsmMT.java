package simplefsmtest;

import fr.inria.diverse.melange.lib.IModelType;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import simplefsmtest.timedfsmmt.fsm.FsmFactory;

@SuppressWarnings("all")
public interface TimedFsmMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract FsmFactory getFactory();
  
  public abstract void save(final String uri) throws IOException;
}
