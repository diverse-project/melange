package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectProperties;

@SuppressWarnings("all")
public class IntegerVariableAspectIntegerVariableAspectContext {
  public final static IntegerVariableAspectIntegerVariableAspectContext INSTANCE = new IntegerVariableAspectIntegerVariableAspectContext();
  
  public static IntegerVariableAspectIntegerVariableAspectProperties getSelf(final IntegerVariable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerVariable, IntegerVariableAspectIntegerVariableAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.IntegerVariable, fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectProperties>();
  
  public Map<IntegerVariable, IntegerVariableAspectIntegerVariableAspectProperties> getMap() {
    return map;
  }
}
