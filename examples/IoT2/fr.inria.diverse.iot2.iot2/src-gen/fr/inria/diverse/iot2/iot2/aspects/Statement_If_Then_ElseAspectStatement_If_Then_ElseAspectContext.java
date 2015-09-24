package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else;
import fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties;

@SuppressWarnings("all")
public class Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectContext {
  public final static Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectContext INSTANCE = new Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectContext();
  
  public static Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties getSelf(final Statement_If_Then_Else _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_If_Then_Else, Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else, fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties>();
  
  public Map<Statement_If_Then_Else, Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties> getMap() {
    return map;
  }
}
