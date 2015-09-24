package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric;
import fr.inria.diverse.iot2.iot2.aspects.Statement_For_NumericAspectStatement_For_NumericAspectProperties;

@SuppressWarnings("all")
public class Statement_For_NumericAspectStatement_For_NumericAspectContext {
  public final static Statement_For_NumericAspectStatement_For_NumericAspectContext INSTANCE = new Statement_For_NumericAspectStatement_For_NumericAspectContext();
  
  public static Statement_For_NumericAspectStatement_For_NumericAspectProperties getSelf(final Statement_For_Numeric _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_For_NumericAspectStatement_For_NumericAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_For_Numeric, Statement_For_NumericAspectStatement_For_NumericAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric, fr.inria.diverse.iot2.iot2.aspects.Statement_For_NumericAspectStatement_For_NumericAspectProperties>();
  
  public Map<Statement_For_Numeric, Statement_For_NumericAspectStatement_For_NumericAspectProperties> getMap() {
    return map;
  }
}
