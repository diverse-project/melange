package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Field;
import fr.inria.diverse.iot2.iot2.aspects.FieldAspectFieldAspectProperties;

@SuppressWarnings("all")
public class FieldAspectFieldAspectContext {
  public final static FieldAspectFieldAspectContext INSTANCE = new FieldAspectFieldAspectContext();
  
  public static FieldAspectFieldAspectProperties getSelf(final Field _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.FieldAspectFieldAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Field, FieldAspectFieldAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Field, fr.inria.diverse.iot2.iot2.aspects.FieldAspectFieldAspectProperties>();
  
  public Map<Field, FieldAspectFieldAspectProperties> getMap() {
    return map;
  }
}
