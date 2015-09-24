package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Negate;
import fr.inria.diverse.iot2.iot2.aspects.Expression_NegateAspectExpression_NegateAspectProperties;

@SuppressWarnings("all")
public class Expression_NegateAspectExpression_NegateAspectContext {
  public final static Expression_NegateAspectExpression_NegateAspectContext INSTANCE = new Expression_NegateAspectExpression_NegateAspectContext();
  
  public static Expression_NegateAspectExpression_NegateAspectProperties getSelf(final Expression_Negate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_NegateAspectExpression_NegateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Negate, Expression_NegateAspectExpression_NegateAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Negate, fr.inria.diverse.iot2.iot2.aspects.Expression_NegateAspectExpression_NegateAspectProperties>();
  
  public Map<Expression_Negate, Expression_NegateAspectExpression_NegateAspectProperties> getMap() {
    return map;
  }
}
