package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Number;
import fr.inria.diverse.iot2.iot2.aspects.Expression_NumberAspectExpression_NumberAspectProperties;

@SuppressWarnings("all")
public class Expression_NumberAspectExpression_NumberAspectContext {
  public final static Expression_NumberAspectExpression_NumberAspectContext INSTANCE = new Expression_NumberAspectExpression_NumberAspectContext();
  
  public static Expression_NumberAspectExpression_NumberAspectProperties getSelf(final Expression_Number _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_NumberAspectExpression_NumberAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Number, Expression_NumberAspectExpression_NumberAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Number, fr.inria.diverse.iot2.iot2.aspects.Expression_NumberAspectExpression_NumberAspectProperties>();
  
  public Map<Expression_Number, Expression_NumberAspectExpression_NumberAspectProperties> getMap() {
    return map;
  }
}
