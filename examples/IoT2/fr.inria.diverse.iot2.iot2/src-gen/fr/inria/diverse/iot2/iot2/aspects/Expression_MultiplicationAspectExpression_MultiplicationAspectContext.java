package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication;
import fr.inria.diverse.iot2.iot2.aspects.Expression_MultiplicationAspectExpression_MultiplicationAspectProperties;

@SuppressWarnings("all")
public class Expression_MultiplicationAspectExpression_MultiplicationAspectContext {
  public final static Expression_MultiplicationAspectExpression_MultiplicationAspectContext INSTANCE = new Expression_MultiplicationAspectExpression_MultiplicationAspectContext();
  
  public static Expression_MultiplicationAspectExpression_MultiplicationAspectProperties getSelf(final Expression_Multiplication _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_MultiplicationAspectExpression_MultiplicationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Multiplication, Expression_MultiplicationAspectExpression_MultiplicationAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication, fr.inria.diverse.iot2.iot2.aspects.Expression_MultiplicationAspectExpression_MultiplicationAspectProperties>();
  
  public Map<Expression_Multiplication, Expression_MultiplicationAspectExpression_MultiplicationAspectProperties> getMap() {
    return map;
  }
}
