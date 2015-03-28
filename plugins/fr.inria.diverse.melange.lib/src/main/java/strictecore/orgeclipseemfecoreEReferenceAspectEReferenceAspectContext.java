package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EReference;
import strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEReferenceAspectEReferenceAspectContext {
  public final static orgeclipseemfecoreEReferenceAspectEReferenceAspectContext INSTANCE = new orgeclipseemfecoreEReferenceAspectEReferenceAspectContext();
  
  public static orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties getSelf(final EReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EReference, orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EReference, strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties>();
  
  public Map<EReference, orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties> getMap() {
    return map;
  }
}
