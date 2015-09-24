package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ControlFlow;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.ControlFlowAspectControlFlowAspectProperties;

@SuppressWarnings("all")
public class ControlFlowAspectControlFlowAspectContext {
  public final static ControlFlowAspectControlFlowAspectContext INSTANCE = new ControlFlowAspectControlFlowAspectContext();
  
  public static ControlFlowAspectControlFlowAspectProperties getSelf(final ControlFlow _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.ControlFlowAspectControlFlowAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlFlow, ControlFlowAspectControlFlowAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.ControlFlow, fr.inria.diverse.iot2.iot2.aspects.ControlFlowAspectControlFlowAspectProperties>();
  
  public Map<ControlFlow, ControlFlowAspectControlFlowAspectProperties> getMap() {
    return map;
  }
}
