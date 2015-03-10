package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EOperation;
import strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEOperationAspectEOperationAspectContext {
  public final static orgeclipseemfecoreEOperationAspectEOperationAspectContext INSTANCE = new orgeclipseemfecoreEOperationAspectEOperationAspectContext();
  
  public static orgeclipseemfecoreEOperationAspectEOperationAspectProperties getSelf(final EOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EOperation, orgeclipseemfecoreEOperationAspectEOperationAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EOperation, strictecore.orgeclipseemfecoreEOperationAspectEOperationAspectProperties>();
  
  public Map<EOperation, orgeclipseemfecoreEOperationAspectEOperationAspectProperties> getMap() {
    return map;
  }
}
