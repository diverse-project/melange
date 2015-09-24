package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectContext {
  public final static BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectContext INSTANCE = new BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectContext();
  
  public static BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectProperties getSelf(final BooleanBinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BooleanBinaryExpression, BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression, fr.inria.diverse.iot2.iot2.aspects.BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectProperties>();
  
  public Map<BooleanBinaryExpression, BooleanBinaryActivityExpressionAspectBooleanBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
