package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal;
import fr.inria.diverse.iot2.iot2.aspects.Expression_Larger_EqualAspectExpression_Larger_EqualAspectProperties;

@SuppressWarnings("all")
public class Expression_Larger_EqualAspectExpression_Larger_EqualAspectContext {
  public final static Expression_Larger_EqualAspectExpression_Larger_EqualAspectContext INSTANCE = new Expression_Larger_EqualAspectExpression_Larger_EqualAspectContext();
  
  public static Expression_Larger_EqualAspectExpression_Larger_EqualAspectProperties getSelf(final Expression_Larger_Equal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_Larger_EqualAspectExpression_Larger_EqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Larger_Equal, Expression_Larger_EqualAspectExpression_Larger_EqualAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal, fr.inria.diverse.iot2.iot2.aspects.Expression_Larger_EqualAspectExpression_Larger_EqualAspectProperties>();
  
  public Map<Expression_Larger_Equal, Expression_Larger_EqualAspectExpression_Larger_EqualAspectProperties> getMap() {
    return map;
  }
}
