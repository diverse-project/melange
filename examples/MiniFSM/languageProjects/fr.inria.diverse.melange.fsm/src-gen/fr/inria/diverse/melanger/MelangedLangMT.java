package fr.inria.diverse.melanger;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.melanger.melangedlangmt.minifsm.MinifsmFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface MelangedLangMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract MinifsmFactory getMinifsmFactory();
  
  public abstract void save(final String uri) throws IOException;
}
