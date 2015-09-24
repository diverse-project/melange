package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName;
import fr.inria.diverse.iot2.iot2.aspects.Expression_VariableNameAspectExpression_VariableNameAspectProperties;

@SuppressWarnings("all")
public class Expression_VariableNameAspectExpression_VariableNameAspectContext {
  public final static Expression_VariableNameAspectExpression_VariableNameAspectContext INSTANCE = new Expression_VariableNameAspectExpression_VariableNameAspectContext();
  
  public static Expression_VariableNameAspectExpression_VariableNameAspectProperties getSelf(final Expression_VariableName _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_VariableNameAspectExpression_VariableNameAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_VariableName, Expression_VariableNameAspectExpression_VariableNameAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName, fr.inria.diverse.iot2.iot2.aspects.Expression_VariableNameAspectExpression_VariableNameAspectProperties>();
  
  public Map<Expression_VariableName, Expression_VariableNameAspectExpression_VariableNameAspectProperties> getMap() {
    return map;
  }
}
