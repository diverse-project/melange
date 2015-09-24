package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart;
import fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties;

@SuppressWarnings("all")
public class Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectContext {
  public final static Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectContext INSTANCE = new Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectContext();
  
  public static Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties getSelf(final Statement_If_Then_Else_ElseIfPart _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_If_Then_Else_ElseIfPart, Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart, fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties>();
  
  public Map<Statement_If_Then_Else_ElseIfPart, Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties> getMap() {
    return map;
  }
}
