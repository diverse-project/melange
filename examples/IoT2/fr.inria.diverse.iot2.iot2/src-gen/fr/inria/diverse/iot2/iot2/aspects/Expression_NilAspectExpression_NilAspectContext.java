package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Nil;
import fr.inria.diverse.iot2.iot2.aspects.Expression_NilAspectExpression_NilAspectProperties;

@SuppressWarnings("all")
public class Expression_NilAspectExpression_NilAspectContext {
  public final static Expression_NilAspectExpression_NilAspectContext INSTANCE = new Expression_NilAspectExpression_NilAspectContext();
  
  public static Expression_NilAspectExpression_NilAspectProperties getSelf(final Expression_Nil _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_NilAspectExpression_NilAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Nil, Expression_NilAspectExpression_NilAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Nil, fr.inria.diverse.iot2.iot2.aspects.Expression_NilAspectExpression_NilAspectProperties>();
  
  public Map<Expression_Nil, Expression_NilAspectExpression_NilAspectProperties> getMap() {
    return map;
  }
}
