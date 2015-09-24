package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.aspects.Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties;

@SuppressWarnings("all")
public class Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectContext {
  public final static Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectContext INSTANCE = new Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectContext();
  
  public static Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties getSelf(final Functioncall_Arguments _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Functioncall_Arguments, Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments, fr.inria.diverse.iot2.iot2.aspects.Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties>();
  
  public Map<Functioncall_Arguments, Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties> getMap() {
    return map;
  }
}
