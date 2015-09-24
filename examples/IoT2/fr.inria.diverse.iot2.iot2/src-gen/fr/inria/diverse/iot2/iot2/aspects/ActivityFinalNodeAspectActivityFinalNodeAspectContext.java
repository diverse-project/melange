package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties;

@SuppressWarnings("all")
public class ActivityFinalNodeAspectActivityFinalNodeAspectContext {
  public final static ActivityFinalNodeAspectActivityFinalNodeAspectContext INSTANCE = new ActivityFinalNodeAspectActivityFinalNodeAspectContext();
  
  public static ActivityFinalNodeAspectActivityFinalNodeAspectProperties getSelf(final ActivityFinalNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode, fr.inria.diverse.iot2.iot2.aspects.ActivityFinalNodeAspectActivityFinalNodeAspectProperties>();
  
  public Map<ActivityFinalNode, ActivityFinalNodeAspectActivityFinalNodeAspectProperties> getMap() {
    return map;
  }
}
