package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray;
import fr.inria.diverse.iot2.iot2.aspects.Expression_AccessArrayAspectExpression_AccessArrayAspectProperties;

@SuppressWarnings("all")
public class Expression_AccessArrayAspectExpression_AccessArrayAspectContext {
  public final static Expression_AccessArrayAspectExpression_AccessArrayAspectContext INSTANCE = new Expression_AccessArrayAspectExpression_AccessArrayAspectContext();
  
  public static Expression_AccessArrayAspectExpression_AccessArrayAspectProperties getSelf(final Expression_AccessArray _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_AccessArrayAspectExpression_AccessArrayAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_AccessArray, Expression_AccessArrayAspectExpression_AccessArrayAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray, fr.inria.diverse.iot2.iot2.aspects.Expression_AccessArrayAspectExpression_AccessArrayAspectProperties>();
  
  public Map<Expression_AccessArray, Expression_AccessArrayAspectExpression_AccessArrayAspectProperties> getMap() {
    return map;
  }
}
