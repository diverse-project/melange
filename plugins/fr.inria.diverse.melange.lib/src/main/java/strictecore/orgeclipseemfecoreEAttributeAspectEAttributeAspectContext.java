package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import strictecore.orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEAttributeAspectEAttributeAspectContext {
  public final static orgeclipseemfecoreEAttributeAspectEAttributeAspectContext INSTANCE = new orgeclipseemfecoreEAttributeAspectEAttributeAspectContext();
  
  public static orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties getSelf(final EAttribute _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EAttribute, orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EAttribute, strictecore.orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties>();
  
  public Map<EAttribute, orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties> getMap() {
    return map;
  }
}
