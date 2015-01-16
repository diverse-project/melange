package adapters;

import fr.inria.diverse.melange.lib.IModelType;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import adapters.timedfsmmt.TimedFsmMTFactory;

@SuppressWarnings("all")
public interface TimedFsmMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract TimedFsmMTFactory getFactory();
  
  public void save(final String uri) throws IOException;
}
