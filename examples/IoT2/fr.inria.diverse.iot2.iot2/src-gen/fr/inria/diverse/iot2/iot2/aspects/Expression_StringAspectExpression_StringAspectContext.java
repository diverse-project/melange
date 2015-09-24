package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_String;
import fr.inria.diverse.iot2.iot2.aspects.Expression_StringAspectExpression_StringAspectProperties;

@SuppressWarnings("all")
public class Expression_StringAspectExpression_StringAspectContext {
  public final static Expression_StringAspectExpression_StringAspectContext INSTANCE = new Expression_StringAspectExpression_StringAspectContext();
  
  public static Expression_StringAspectExpression_StringAspectProperties getSelf(final Expression_String _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_StringAspectExpression_StringAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_String, Expression_StringAspectExpression_StringAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_String, fr.inria.diverse.iot2.iot2.aspects.Expression_StringAspectExpression_StringAspectProperties>();
  
  public Map<Expression_String, Expression_StringAspectExpression_StringAspectProperties> getMap() {
    return map;
  }
}
