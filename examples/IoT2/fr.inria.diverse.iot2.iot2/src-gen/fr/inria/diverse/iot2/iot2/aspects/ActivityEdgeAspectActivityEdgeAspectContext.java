package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;

@SuppressWarnings("all")
public class ActivityEdgeAspectActivityEdgeAspectContext {
  public final static ActivityEdgeAspectActivityEdgeAspectContext INSTANCE = new ActivityEdgeAspectActivityEdgeAspectContext();
  
  public static ActivityEdgeAspectActivityEdgeAspectProperties getSelf(final ActivityEdge _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ActivityEdge, ActivityEdgeAspectActivityEdgeAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.ActivityEdge, fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties>();
  
  public Map<ActivityEdge, ActivityEdgeAspectActivityEdgeAspectProperties> getMap() {
    return map;
  }
}
