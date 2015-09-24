package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment;
import fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties;

@SuppressWarnings("all")
public class Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectContext {
  public final static Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectContext INSTANCE = new Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectContext();
  
  public static Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties getSelf(final Statement_FunctioncallOrAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_FunctioncallOrAssignment, Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment, fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties>();
  
  public Map<Statement_FunctioncallOrAssignment, Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties> getMap() {
    return map;
  }
}
