package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction;
import fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspectExpression_CallFunctionAspectProperties;

@SuppressWarnings("all")
public class Expression_CallFunctionAspectExpression_CallFunctionAspectContext {
  public final static Expression_CallFunctionAspectExpression_CallFunctionAspectContext INSTANCE = new Expression_CallFunctionAspectExpression_CallFunctionAspectContext();
  
  public static Expression_CallFunctionAspectExpression_CallFunctionAspectProperties getSelf(final Expression_CallFunction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspectExpression_CallFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_CallFunction, Expression_CallFunctionAspectExpression_CallFunctionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction, fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspectExpression_CallFunctionAspectProperties>();
  
  public Map<Expression_CallFunction, Expression_CallFunctionAspectExpression_CallFunctionAspectProperties> getMap() {
    return map;
  }
}
