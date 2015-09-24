package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller;
import fr.inria.diverse.iot2.iot2.aspects.Expression_SmallerAspectExpression_SmallerAspectProperties;

@SuppressWarnings("all")
public class Expression_SmallerAspectExpression_SmallerAspectContext {
  public final static Expression_SmallerAspectExpression_SmallerAspectContext INSTANCE = new Expression_SmallerAspectExpression_SmallerAspectContext();
  
  public static Expression_SmallerAspectExpression_SmallerAspectProperties getSelf(final Expression_Smaller _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_SmallerAspectExpression_SmallerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Smaller, Expression_SmallerAspectExpression_SmallerAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller, fr.inria.diverse.iot2.iot2.aspects.Expression_SmallerAspectExpression_SmallerAspectProperties>();
  
  public Map<Expression_Smaller, Expression_SmallerAspectExpression_SmallerAspectProperties> getMap() {
    return map;
  }
}
