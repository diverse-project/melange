package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.__SlicerAspect__ObjectAspectProperties;

@SuppressWarnings("all")
public class __SlicerAspect__ObjectAspectContext {
  public final static __SlicerAspect__ObjectAspectContext INSTANCE = new __SlicerAspect__ObjectAspectContext();
  
  public static __SlicerAspect__ObjectAspectProperties getSelf(final Object _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.__SlicerAspect__ObjectAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Object, __SlicerAspect__ObjectAspectProperties> map = new java.util.HashMap<java.lang.Object, k3transfofootprint.__SlicerAspect__ObjectAspectProperties>();
  
  public Map<Object, __SlicerAspect__ObjectAspectProperties> getMap() {
    return map;
  }
}
