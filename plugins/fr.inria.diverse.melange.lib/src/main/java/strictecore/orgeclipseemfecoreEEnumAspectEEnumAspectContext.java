package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EEnum;
import strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEEnumAspectEEnumAspectContext {
  public final static orgeclipseemfecoreEEnumAspectEEnumAspectContext INSTANCE = new orgeclipseemfecoreEEnumAspectEEnumAspectContext();
  
  public static orgeclipseemfecoreEEnumAspectEEnumAspectProperties getSelf(final EEnum _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EEnum, orgeclipseemfecoreEEnumAspectEEnumAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EEnum, strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties>();
  
  public Map<EEnum, orgeclipseemfecoreEEnumAspectEEnumAspectProperties> getMap() {
    return map;
  }
}
