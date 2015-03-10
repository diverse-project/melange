package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.ETypeParameter;
import strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext {
  public final static orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext INSTANCE = new orgeclipseemfecoreETypeParameterAspectETypeParameterAspectContext();
  
  public static orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties getSelf(final ETypeParameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ETypeParameter, orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.ETypeParameter, strictecore.orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties>();
  
  public Map<ETypeParameter, orgeclipseemfecoreETypeParameterAspectETypeParameterAspectProperties> getMap() {
    return map;
  }
}
