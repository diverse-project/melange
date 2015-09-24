package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction;
import fr.inria.diverse.iot2.iot2.aspects.Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectProperties;

@SuppressWarnings("all")
public class Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectContext {
  public final static Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectContext INSTANCE = new Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectContext();
  
  public static Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectProperties getSelf(final Expression_CallMemberFunction _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_CallMemberFunction, Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction, fr.inria.diverse.iot2.iot2.aspects.Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectProperties>();
  
  public Map<Expression_CallMemberFunction, Expression_CallMemberFunctionAspectExpression_CallMemberFunctionAspectProperties> getMap() {
    return map;
  }
}
