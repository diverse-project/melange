package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Length;
import fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspectExpression_LengthAspectProperties;

@SuppressWarnings("all")
public class Expression_LengthAspectExpression_LengthAspectContext {
  public final static Expression_LengthAspectExpression_LengthAspectContext INSTANCE = new Expression_LengthAspectExpression_LengthAspectContext();
  
  public static Expression_LengthAspectExpression_LengthAspectProperties getSelf(final Expression_Length _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspectExpression_LengthAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Length, Expression_LengthAspectExpression_LengthAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Length, fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspectExpression_LengthAspectProperties>();
  
  public Map<Expression_Length, Expression_LengthAspectExpression_LengthAspectProperties> getMap() {
    return map;
  }
}
