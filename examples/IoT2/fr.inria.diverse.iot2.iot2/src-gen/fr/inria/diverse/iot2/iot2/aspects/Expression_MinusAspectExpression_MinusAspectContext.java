package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Minus;
import fr.inria.diverse.iot2.iot2.aspects.Expression_MinusAspectExpression_MinusAspectProperties;

@SuppressWarnings("all")
public class Expression_MinusAspectExpression_MinusAspectContext {
  public final static Expression_MinusAspectExpression_MinusAspectContext INSTANCE = new Expression_MinusAspectExpression_MinusAspectContext();
  
  public static Expression_MinusAspectExpression_MinusAspectProperties getSelf(final Expression_Minus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_MinusAspectExpression_MinusAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Minus, Expression_MinusAspectExpression_MinusAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Minus, fr.inria.diverse.iot2.iot2.aspects.Expression_MinusAspectExpression_MinusAspectProperties>();
  
  public Map<Expression_Minus, Expression_MinusAspectExpression_MinusAspectProperties> getMap() {
    return map;
  }
}
