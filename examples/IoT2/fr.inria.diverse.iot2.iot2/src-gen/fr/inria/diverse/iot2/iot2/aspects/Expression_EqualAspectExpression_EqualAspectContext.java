package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Equal;
import fr.inria.diverse.iot2.iot2.aspects.Expression_EqualAspectExpression_EqualAspectProperties;

@SuppressWarnings("all")
public class Expression_EqualAspectExpression_EqualAspectContext {
  public final static Expression_EqualAspectExpression_EqualAspectContext INSTANCE = new Expression_EqualAspectExpression_EqualAspectContext();
  
  public static Expression_EqualAspectExpression_EqualAspectProperties getSelf(final Expression_Equal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_EqualAspectExpression_EqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Equal, Expression_EqualAspectExpression_EqualAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Equal, fr.inria.diverse.iot2.iot2.aspects.Expression_EqualAspectExpression_EqualAspectProperties>();
  
  public Map<Expression_Equal, Expression_EqualAspectExpression_EqualAspectProperties> getMap() {
    return map;
  }
}
