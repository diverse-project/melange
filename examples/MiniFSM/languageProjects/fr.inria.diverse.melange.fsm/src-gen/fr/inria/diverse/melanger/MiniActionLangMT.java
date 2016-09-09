package fr.inria.diverse.melanger;

import fr.inria.diverse.melange.lib.IModelType;
import fr.inria.diverse.melanger.miniactionlangmt.minilang.MinilangFactory;
import java.io.IOException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public interface MiniActionLangMT extends IModelType {
  public abstract EList<EObject> getContents();
  
  public abstract MinilangFactory getMinilangFactory();
  
  public abstract void save(final String uri) throws IOException;
}
