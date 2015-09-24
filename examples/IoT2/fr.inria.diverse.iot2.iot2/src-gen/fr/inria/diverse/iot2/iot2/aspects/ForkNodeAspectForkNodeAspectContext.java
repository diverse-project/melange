package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ForkNode;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspectForkNodeAspectProperties;

@SuppressWarnings("all")
public class ForkNodeAspectForkNodeAspectContext {
  public final static ForkNodeAspectForkNodeAspectContext INSTANCE = new ForkNodeAspectForkNodeAspectContext();
  
  public static ForkNodeAspectForkNodeAspectProperties getSelf(final ForkNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspectForkNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForkNode, ForkNodeAspectForkNodeAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.ForkNode, fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspectForkNodeAspectProperties>();
  
  public Map<ForkNode, ForkNodeAspectForkNodeAspectProperties> getMap() {
    return map;
  }
}
