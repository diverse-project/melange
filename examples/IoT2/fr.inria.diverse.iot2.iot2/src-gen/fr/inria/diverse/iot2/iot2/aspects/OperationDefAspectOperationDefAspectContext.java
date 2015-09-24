package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectProperties;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.OperationDef;

@SuppressWarnings("all")
public class OperationDefAspectOperationDefAspectContext {
  public final static OperationDefAspectOperationDefAspectContext INSTANCE = new OperationDefAspectOperationDefAspectContext();
  
  public static OperationDefAspectOperationDefAspectProperties getSelf(final OperationDef _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<OperationDef, OperationDefAspectOperationDefAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.OperationDef, fr.inria.diverse.iot2.iot2.aspects.OperationDefAspectOperationDefAspectProperties>();
  
  public Map<OperationDef, OperationDefAspectOperationDefAspectProperties> getMap() {
    return map;
  }
}
