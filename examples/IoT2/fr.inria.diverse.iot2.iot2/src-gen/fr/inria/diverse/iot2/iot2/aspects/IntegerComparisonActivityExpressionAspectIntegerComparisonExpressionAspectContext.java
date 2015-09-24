package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectContext {
  public final static IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectContext INSTANCE = new IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectContext();
  
  public static IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties getSelf(final IntegerComparisonExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerComparisonExpression, IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression, fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties>();
  
  public Map<IntegerComparisonExpression, IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties> getMap() {
    return map;
  }
}
