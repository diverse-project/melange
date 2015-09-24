package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal;
import fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspectExpression_Not_EqualAspectProperties;

@SuppressWarnings("all")
public class Expression_Not_EqualAspectExpression_Not_EqualAspectContext {
  public final static Expression_Not_EqualAspectExpression_Not_EqualAspectContext INSTANCE = new Expression_Not_EqualAspectExpression_Not_EqualAspectContext();
  
  public static Expression_Not_EqualAspectExpression_Not_EqualAspectProperties getSelf(final Expression_Not_Equal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspectExpression_Not_EqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Not_Equal, Expression_Not_EqualAspectExpression_Not_EqualAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal, fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspectExpression_Not_EqualAspectProperties>();
  
  public Map<Expression_Not_Equal, Expression_Not_EqualAspectExpression_Not_EqualAspectProperties> getMap() {
    return map;
  }
}
