package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EGenericType;
import strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext {
  public final static orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext INSTANCE = new orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext();
  
  public static orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties getSelf(final EGenericType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EGenericType, orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EGenericType, strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties>();
  
  public Map<EGenericType, orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties> getMap() {
    return map;
  }
}
