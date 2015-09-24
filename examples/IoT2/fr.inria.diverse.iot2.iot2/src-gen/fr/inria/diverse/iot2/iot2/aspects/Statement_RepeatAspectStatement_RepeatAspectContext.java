package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat;
import fr.inria.diverse.iot2.iot2.aspects.Statement_RepeatAspectStatement_RepeatAspectProperties;

@SuppressWarnings("all")
public class Statement_RepeatAspectStatement_RepeatAspectContext {
  public final static Statement_RepeatAspectStatement_RepeatAspectContext INSTANCE = new Statement_RepeatAspectStatement_RepeatAspectContext();
  
  public static Statement_RepeatAspectStatement_RepeatAspectProperties getSelf(final Statement_Repeat _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_RepeatAspectStatement_RepeatAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_Repeat, Statement_RepeatAspectStatement_RepeatAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat, fr.inria.diverse.iot2.iot2.aspects.Statement_RepeatAspectStatement_RepeatAspectProperties>();
  
  public Map<Statement_Repeat, Statement_RepeatAspectStatement_RepeatAspectProperties> getMap() {
    return map;
  }
}
