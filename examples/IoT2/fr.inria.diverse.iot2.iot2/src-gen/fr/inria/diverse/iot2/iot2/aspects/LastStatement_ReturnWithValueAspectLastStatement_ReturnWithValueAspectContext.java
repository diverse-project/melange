package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue;
import fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties;

@SuppressWarnings("all")
public class LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectContext {
  public final static LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectContext INSTANCE = new LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectContext();
  
  public static LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties getSelf(final LastStatement_ReturnWithValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LastStatement_ReturnWithValue, LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue, fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties>();
  
  public Map<LastStatement_ReturnWithValue, LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties> getMap() {
    return map;
  }
}
