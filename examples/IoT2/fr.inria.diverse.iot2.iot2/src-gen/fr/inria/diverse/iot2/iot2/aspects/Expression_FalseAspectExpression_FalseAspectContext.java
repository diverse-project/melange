package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_False;
import fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspectExpression_FalseAspectProperties;

@SuppressWarnings("all")
public class Expression_FalseAspectExpression_FalseAspectContext {
  public final static Expression_FalseAspectExpression_FalseAspectContext INSTANCE = new Expression_FalseAspectExpression_FalseAspectContext();
  
  public static Expression_FalseAspectExpression_FalseAspectProperties getSelf(final Expression_False _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspectExpression_FalseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_False, Expression_FalseAspectExpression_FalseAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_False, fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspectExpression_FalseAspectProperties>();
  
  public Map<Expression_False, Expression_FalseAspectExpression_FalseAspectProperties> getMap() {
    return map;
  }
}
