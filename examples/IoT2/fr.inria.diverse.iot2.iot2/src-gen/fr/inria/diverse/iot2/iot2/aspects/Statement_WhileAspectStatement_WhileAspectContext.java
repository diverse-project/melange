package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_While;
import fr.inria.diverse.iot2.iot2.aspects.Statement_WhileAspectStatement_WhileAspectProperties;

@SuppressWarnings("all")
public class Statement_WhileAspectStatement_WhileAspectContext {
  public final static Statement_WhileAspectStatement_WhileAspectContext INSTANCE = new Statement_WhileAspectStatement_WhileAspectContext();
  
  public static Statement_WhileAspectStatement_WhileAspectProperties getSelf(final Statement_While _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_WhileAspectStatement_WhileAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_While, Statement_WhileAspectStatement_WhileAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_While, fr.inria.diverse.iot2.iot2.aspects.Statement_WhileAspectStatement_WhileAspectProperties>();
  
  public Map<Statement_While, Statement_WhileAspectStatement_WhileAspectProperties> getMap() {
    return map;
  }
}
