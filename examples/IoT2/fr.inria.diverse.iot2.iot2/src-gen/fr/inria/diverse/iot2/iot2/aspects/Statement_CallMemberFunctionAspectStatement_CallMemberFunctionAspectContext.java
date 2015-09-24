package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction;
import fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties;

@SuppressWarnings("all")
public class Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectContext {
  public final static Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectContext INSTANCE = new Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectContext();
  
  public static Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties getSelf(final Statement_CallMemberFunction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_CallMemberFunction, Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction, fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties>();
  
  public Map<Statement_CallMemberFunction, Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties> getMap() {
    return map;
  }
}
