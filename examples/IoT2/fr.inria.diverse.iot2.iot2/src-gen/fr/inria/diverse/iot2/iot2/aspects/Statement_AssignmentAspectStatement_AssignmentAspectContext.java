package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment;
import fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspectStatement_AssignmentAspectProperties;

@SuppressWarnings("all")
public class Statement_AssignmentAspectStatement_AssignmentAspectContext {
  public final static Statement_AssignmentAspectStatement_AssignmentAspectContext INSTANCE = new Statement_AssignmentAspectStatement_AssignmentAspectContext();
  
  public static Statement_AssignmentAspectStatement_AssignmentAspectProperties getSelf(final Statement_Assignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspectStatement_AssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_Assignment, Statement_AssignmentAspectStatement_AssignmentAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment, fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspectStatement_AssignmentAspectProperties>();
  
  public Map<Statement_Assignment, Statement_AssignmentAspectStatement_AssignmentAspectProperties> getMap() {
    return map;
  }
}
