package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.ETypedElement;
import strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreETypedElementAspectETypedElementAspectContext {
  public final static orgeclipseemfecoreETypedElementAspectETypedElementAspectContext INSTANCE = new orgeclipseemfecoreETypedElementAspectETypedElementAspectContext();
  
  public static orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties getSelf(final ETypedElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ETypedElement, orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.ETypedElement, strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties>();
  
  public Map<ETypedElement, orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties> getMap() {
    return map;
  }
}
