package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return;
import fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspectLastStatement_ReturnAspectProperties;

@SuppressWarnings("all")
public class LastStatement_ReturnAspectLastStatement_ReturnAspectContext {
  public final static LastStatement_ReturnAspectLastStatement_ReturnAspectContext INSTANCE = new LastStatement_ReturnAspectLastStatement_ReturnAspectContext();
  
  public static LastStatement_ReturnAspectLastStatement_ReturnAspectProperties getSelf(final LastStatement_Return _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspectLastStatement_ReturnAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LastStatement_Return, LastStatement_ReturnAspectLastStatement_ReturnAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return, fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspectLastStatement_ReturnAspectProperties>();
  
  public Map<LastStatement_Return, LastStatement_ReturnAspectLastStatement_ReturnAspectProperties> getMap() {
    return map;
  }
}
