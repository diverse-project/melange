package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal;
import fr.inria.diverse.iot2.iot2.aspects.Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectProperties;

@SuppressWarnings("all")
public class Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectContext {
  public final static Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectContext INSTANCE = new Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectContext();
  
  public static Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectProperties getSelf(final Expression_Smaller_Equal _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Smaller_Equal, Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal, fr.inria.diverse.iot2.iot2.aspects.Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectProperties>();
  
  public Map<Expression_Smaller_Equal, Expression_Smaller_EqualAspectExpression_Smaller_EqualAspectProperties> getMap() {
    return map;
  }
}
