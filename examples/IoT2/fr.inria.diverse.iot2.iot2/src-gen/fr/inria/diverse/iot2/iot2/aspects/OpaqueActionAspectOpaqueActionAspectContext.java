package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.OpaqueAction;
import fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties;
import java.util.Map;

@SuppressWarnings("all")
public class OpaqueActionAspectOpaqueActionAspectContext {
  public final static OpaqueActionAspectOpaqueActionAspectContext INSTANCE = new OpaqueActionAspectOpaqueActionAspectContext();
  
  public static OpaqueActionAspectOpaqueActionAspectProperties getSelf(final OpaqueAction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OpaqueAction, OpaqueActionAspectOpaqueActionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.OpaqueAction, fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties>();
  
  public Map<OpaqueAction, OpaqueActionAspectOpaqueActionAspectProperties> getMap() {
    return map;
  }
}
