package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Or;
import fr.inria.diverse.iot2.iot2.aspects.Expression_OrAspectExpression_OrAspectProperties;

@SuppressWarnings("all")
public class Expression_OrAspectExpression_OrAspectContext {
  public final static Expression_OrAspectExpression_OrAspectContext INSTANCE = new Expression_OrAspectExpression_OrAspectContext();
  
  public static Expression_OrAspectExpression_OrAspectProperties getSelf(final Expression_Or _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_OrAspectExpression_OrAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Or, Expression_OrAspectExpression_OrAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Or, fr.inria.diverse.iot2.iot2.aspects.Expression_OrAspectExpression_OrAspectProperties>();
  
  public Map<Expression_Or, Expression_OrAspectExpression_OrAspectProperties> getMap() {
    return map;
  }
}
