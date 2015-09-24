package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break;
import fr.inria.diverse.iot2.iot2.aspects.LastStatement_BreakAspectLastStatement_BreakAspectProperties;

@SuppressWarnings("all")
public class LastStatement_BreakAspectLastStatement_BreakAspectContext {
  public final static LastStatement_BreakAspectLastStatement_BreakAspectContext INSTANCE = new LastStatement_BreakAspectLastStatement_BreakAspectContext();
  
  public static LastStatement_BreakAspectLastStatement_BreakAspectProperties getSelf(final LastStatement_Break _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.LastStatement_BreakAspectLastStatement_BreakAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LastStatement_Break, LastStatement_BreakAspectLastStatement_BreakAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.LastStatement_Break, fr.inria.diverse.iot2.iot2.aspects.LastStatement_BreakAspectLastStatement_BreakAspectProperties>();
  
  public Map<LastStatement_Break, LastStatement_BreakAspectLastStatement_BreakAspectProperties> getMap() {
    return map;
  }
}
