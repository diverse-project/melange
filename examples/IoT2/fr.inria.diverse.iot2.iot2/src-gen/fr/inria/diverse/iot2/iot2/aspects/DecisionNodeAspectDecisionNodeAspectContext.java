package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.DecisionNode;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectProperties;

@SuppressWarnings("all")
public class DecisionNodeAspectDecisionNodeAspectContext {
  public final static DecisionNodeAspectDecisionNodeAspectContext INSTANCE = new DecisionNodeAspectDecisionNodeAspectContext();
  
  public static DecisionNodeAspectDecisionNodeAspectProperties getSelf(final DecisionNode _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.DecisionNode, fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectProperties>();
  
  public Map<DecisionNode, DecisionNodeAspectDecisionNodeAspectProperties> getMap() {
    return map;
  }
}
