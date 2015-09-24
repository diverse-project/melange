package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Function;
import fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspectExpression_FunctionAspectProperties;

@SuppressWarnings("all")
public class Expression_FunctionAspectExpression_FunctionAspectContext {
  public final static Expression_FunctionAspectExpression_FunctionAspectContext INSTANCE = new Expression_FunctionAspectExpression_FunctionAspectContext();
  
  public static Expression_FunctionAspectExpression_FunctionAspectProperties getSelf(final Expression_Function _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspectExpression_FunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Function, Expression_FunctionAspectExpression_FunctionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Function, fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspectExpression_FunctionAspectProperties>();
  
  public Map<Expression_Function, Expression_FunctionAspectExpression_FunctionAspectProperties> getMap() {
    return map;
  }
}
