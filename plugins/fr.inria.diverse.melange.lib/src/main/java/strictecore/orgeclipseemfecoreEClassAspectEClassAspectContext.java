package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import strictecore.orgeclipseemfecoreEClassAspectEClassAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEClassAspectEClassAspectContext {
  public final static orgeclipseemfecoreEClassAspectEClassAspectContext INSTANCE = new orgeclipseemfecoreEClassAspectEClassAspectContext();
  
  public static orgeclipseemfecoreEClassAspectEClassAspectProperties getSelf(final EClass _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEClassAspectEClassAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EClass, orgeclipseemfecoreEClassAspectEClassAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EClass, strictecore.orgeclipseemfecoreEClassAspectEClassAspectProperties>();
  
  public Map<EClass, orgeclipseemfecoreEClassAspectEClassAspectProperties> getMap() {
    return map;
  }
}
