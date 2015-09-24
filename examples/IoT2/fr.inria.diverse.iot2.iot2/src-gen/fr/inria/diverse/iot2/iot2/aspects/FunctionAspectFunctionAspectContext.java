package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.aspects.FunctionAspectFunctionAspectProperties;

@SuppressWarnings("all")
public class FunctionAspectFunctionAspectContext {
  public final static FunctionAspectFunctionAspectContext INSTANCE = new FunctionAspectFunctionAspectContext();
  
  public static FunctionAspectFunctionAspectProperties getSelf(final Function _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.FunctionAspectFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Function, FunctionAspectFunctionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Function, fr.inria.diverse.iot2.iot2.aspects.FunctionAspectFunctionAspectProperties>();
  
  public Map<Function, FunctionAspectFunctionAspectProperties> getMap() {
    return map;
  }
}
