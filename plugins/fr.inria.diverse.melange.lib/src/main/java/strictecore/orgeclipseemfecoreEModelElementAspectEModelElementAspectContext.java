package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EModelElement;
import strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEModelElementAspectEModelElementAspectContext {
  public final static orgeclipseemfecoreEModelElementAspectEModelElementAspectContext INSTANCE = new orgeclipseemfecoreEModelElementAspectEModelElementAspectContext();
  
  public static orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties getSelf(final EModelElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EModelElement, orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EModelElement, strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties>();
  
  public Map<EModelElement, orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties> getMap() {
    return map;
  }
}
