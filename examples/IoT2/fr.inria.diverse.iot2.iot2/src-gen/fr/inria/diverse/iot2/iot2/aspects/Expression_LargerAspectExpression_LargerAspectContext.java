package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Larger;
import fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspectExpression_LargerAspectProperties;

@SuppressWarnings("all")
public class Expression_LargerAspectExpression_LargerAspectContext {
  public final static Expression_LargerAspectExpression_LargerAspectContext INSTANCE = new Expression_LargerAspectExpression_LargerAspectContext();
  
  public static Expression_LargerAspectExpression_LargerAspectProperties getSelf(final Expression_Larger _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspectExpression_LargerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Larger, Expression_LargerAspectExpression_LargerAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Larger, fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspectExpression_LargerAspectProperties>();
  
  public Map<Expression_Larger, Expression_LargerAspectExpression_LargerAspectProperties> getMap() {
    return map;
  }
}
