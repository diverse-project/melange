package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.ENamedElement;
import strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreENamedElementAspectENamedElementAspectContext {
  public final static orgeclipseemfecoreENamedElementAspectENamedElementAspectContext INSTANCE = new orgeclipseemfecoreENamedElementAspectENamedElementAspectContext();
  
  public static orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties getSelf(final ENamedElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ENamedElement, orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.ENamedElement, strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties>();
  
  public Map<ENamedElement, orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties> getMap() {
    return map;
  }
}
