package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_True;
import fr.inria.diverse.iot2.iot2.aspects.Expression_TrueAspectExpression_TrueAspectProperties;

@SuppressWarnings("all")
public class Expression_TrueAspectExpression_TrueAspectContext {
  public final static Expression_TrueAspectExpression_TrueAspectContext INSTANCE = new Expression_TrueAspectExpression_TrueAspectContext();
  
  public static Expression_TrueAspectExpression_TrueAspectProperties getSelf(final Expression_True _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_TrueAspectExpression_TrueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_True, Expression_TrueAspectExpression_TrueAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_True, fr.inria.diverse.iot2.iot2.aspects.Expression_TrueAspectExpression_TrueAspectProperties>();
  
  public Map<Expression_True, Expression_TrueAspectExpression_TrueAspectProperties> getMap() {
    return map;
  }
}
