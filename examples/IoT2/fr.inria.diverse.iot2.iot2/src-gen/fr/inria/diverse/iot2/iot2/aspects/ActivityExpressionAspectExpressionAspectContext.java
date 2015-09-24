package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.Expression;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties;

@SuppressWarnings("all")
public class ActivityExpressionAspectExpressionAspectContext {
  public final static ActivityExpressionAspectExpressionAspectContext INSTANCE = new ActivityExpressionAspectExpressionAspectContext();
  
  public static ActivityExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, ActivityExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression, fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties>();
  
  public Map<Expression, ActivityExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
