package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression;
import java.util.Map;
import fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties;

@SuppressWarnings("all")
public class IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectContext {
  public final static IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectContext INSTANCE = new IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectContext();
  
  public static IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties getSelf(final IntegerCalculationExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IntegerCalculationExpression, IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression, fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties>();
  
  public Map<IntegerCalculationExpression, IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties> getMap() {
    return map;
  }
}
