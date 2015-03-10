package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EParameter;
import strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEParameterAspectEParameterAspectContext {
  public final static orgeclipseemfecoreEParameterAspectEParameterAspectContext INSTANCE = new orgeclipseemfecoreEParameterAspectEParameterAspectContext();
  
  public static orgeclipseemfecoreEParameterAspectEParameterAspectProperties getSelf(final EParameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EParameter, orgeclipseemfecoreEParameterAspectEParameterAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EParameter, strictecore.orgeclipseemfecoreEParameterAspectEParameterAspectProperties>();
  
  public Map<EParameter, orgeclipseemfecoreEParameterAspectEParameterAspectProperties> getMap() {
    return map;
  }
}
