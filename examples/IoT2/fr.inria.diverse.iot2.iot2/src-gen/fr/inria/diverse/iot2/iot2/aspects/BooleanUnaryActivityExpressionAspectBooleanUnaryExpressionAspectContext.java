package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectContext {
  public final static BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectContext INSTANCE = new BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectContext();
  
  public static BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties getSelf(final BooleanUnaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanUnaryExpression, BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression, fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties>();
  
  public Map<BooleanUnaryExpression, BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties> getMap() {
    return map;
  }
}
