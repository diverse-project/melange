package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.JoinNode;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspectJoinNodeAspectProperties;

@SuppressWarnings("all")
public class JoinNodeAspectJoinNodeAspectContext {
  public final static JoinNodeAspectJoinNodeAspectContext INSTANCE = new JoinNodeAspectJoinNodeAspectContext();
  
  public static JoinNodeAspectJoinNodeAspectProperties getSelf(final JoinNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspectJoinNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JoinNode, JoinNodeAspectJoinNodeAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.JoinNode, fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspectJoinNodeAspectProperties>();
  
  public Map<JoinNode, JoinNodeAspectJoinNodeAspectProperties> getMap() {
    return map;
  }
}
