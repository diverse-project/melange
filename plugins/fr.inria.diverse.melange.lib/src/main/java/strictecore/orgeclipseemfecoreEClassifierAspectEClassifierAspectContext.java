package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EClassifier;
import strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEClassifierAspectEClassifierAspectContext {
  public final static orgeclipseemfecoreEClassifierAspectEClassifierAspectContext INSTANCE = new orgeclipseemfecoreEClassifierAspectEClassifierAspectContext();
  
  public static orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties getSelf(final EClassifier _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EClassifier, orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EClassifier, strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties>();
  
  public Map<EClassifier, orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties> getMap() {
    return map;
  }
}
