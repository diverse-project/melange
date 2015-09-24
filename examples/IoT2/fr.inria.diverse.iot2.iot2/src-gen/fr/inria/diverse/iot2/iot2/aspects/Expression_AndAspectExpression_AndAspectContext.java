package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_And;
import fr.inria.diverse.iot2.iot2.aspects.Expression_AndAspectExpression_AndAspectProperties;

@SuppressWarnings("all")
public class Expression_AndAspectExpression_AndAspectContext {
  public final static Expression_AndAspectExpression_AndAspectContext INSTANCE = new Expression_AndAspectExpression_AndAspectContext();
  
  public static Expression_AndAspectExpression_AndAspectProperties getSelf(final Expression_And _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_AndAspectExpression_AndAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_And, Expression_AndAspectExpression_AndAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_And, fr.inria.diverse.iot2.iot2.aspects.Expression_AndAspectExpression_AndAspectProperties>();
  
  public Map<Expression_And, Expression_AndAspectExpression_AndAspectProperties> getMap() {
    return map;
  }
}
