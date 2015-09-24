package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction;
import fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspectStatement_CallFunctionAspectProperties;

@SuppressWarnings("all")
public class Statement_CallFunctionAspectStatement_CallFunctionAspectContext {
  public final static Statement_CallFunctionAspectStatement_CallFunctionAspectContext INSTANCE = new Statement_CallFunctionAspectStatement_CallFunctionAspectContext();
  
  public static Statement_CallFunctionAspectStatement_CallFunctionAspectProperties getSelf(final Statement_CallFunction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspectStatement_CallFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_CallFunction, Statement_CallFunctionAspectStatement_CallFunctionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction, fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspectStatement_CallFunctionAspectProperties>();
  
  public Map<Statement_CallFunction, Statement_CallFunctionAspectStatement_CallFunctionAspectProperties> getMap() {
    return map;
  }
}
