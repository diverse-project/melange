package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation;
import fr.inria.diverse.iot2.iot2.aspects.Expression_ExponentiationAspectExpression_ExponentiationAspectProperties;

@SuppressWarnings("all")
public class Expression_ExponentiationAspectExpression_ExponentiationAspectContext {
  public final static Expression_ExponentiationAspectExpression_ExponentiationAspectContext INSTANCE = new Expression_ExponentiationAspectExpression_ExponentiationAspectContext();
  
  public static Expression_ExponentiationAspectExpression_ExponentiationAspectProperties getSelf(final Expression_Exponentiation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_ExponentiationAspectExpression_ExponentiationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Exponentiation, Expression_ExponentiationAspectExpression_ExponentiationAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation, fr.inria.diverse.iot2.iot2.aspects.Expression_ExponentiationAspectExpression_ExponentiationAspectProperties>();
  
  public Map<Expression_Exponentiation, Expression_ExponentiationAspectExpression_ExponentiationAspectProperties> getMap() {
    return map;
  }
}
