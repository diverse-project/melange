package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Division;
import fr.inria.diverse.iot2.iot2.aspects.Expression_DivisionAspectExpression_DivisionAspectProperties;

@SuppressWarnings("all")
public class Expression_DivisionAspectExpression_DivisionAspectContext {
  public final static Expression_DivisionAspectExpression_DivisionAspectContext INSTANCE = new Expression_DivisionAspectExpression_DivisionAspectContext();
  
  public static Expression_DivisionAspectExpression_DivisionAspectProperties getSelf(final Expression_Division _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_DivisionAspectExpression_DivisionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Division, Expression_DivisionAspectExpression_DivisionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Division, fr.inria.diverse.iot2.iot2.aspects.Expression_DivisionAspectExpression_DivisionAspectProperties>();
  
  public Map<Expression_Division, Expression_DivisionAspectExpression_DivisionAspectProperties> getMap() {
    return map;
  }
}
