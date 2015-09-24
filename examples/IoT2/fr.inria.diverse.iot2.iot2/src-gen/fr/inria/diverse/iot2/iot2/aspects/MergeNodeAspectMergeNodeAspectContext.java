package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.MergeNode;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectProperties;

@SuppressWarnings("all")
public class MergeNodeAspectMergeNodeAspectContext {
  public final static MergeNodeAspectMergeNodeAspectContext INSTANCE = new MergeNodeAspectMergeNodeAspectContext();
  
  public static MergeNodeAspectMergeNodeAspectProperties getSelf(final MergeNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.MergeNode, fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectProperties>();
  
  public Map<MergeNode, MergeNodeAspectMergeNodeAspectProperties> getMap() {
    return map;
  }
}
