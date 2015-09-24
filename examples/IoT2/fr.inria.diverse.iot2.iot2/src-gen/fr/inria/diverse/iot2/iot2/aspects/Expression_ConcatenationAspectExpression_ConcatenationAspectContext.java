package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation;
import fr.inria.diverse.iot2.iot2.aspects.Expression_ConcatenationAspectExpression_ConcatenationAspectProperties;

@SuppressWarnings("all")
public class Expression_ConcatenationAspectExpression_ConcatenationAspectContext {
  public final static Expression_ConcatenationAspectExpression_ConcatenationAspectContext INSTANCE = new Expression_ConcatenationAspectExpression_ConcatenationAspectContext();
  
  public static Expression_ConcatenationAspectExpression_ConcatenationAspectProperties getSelf(final Expression_Concatenation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_ConcatenationAspectExpression_ConcatenationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Concatenation, Expression_ConcatenationAspectExpression_ConcatenationAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation, fr.inria.diverse.iot2.iot2.aspects.Expression_ConcatenationAspectExpression_ConcatenationAspectProperties>();
  
  public Map<Expression_Concatenation, Expression_ConcatenationAspectExpression_ConcatenationAspectProperties> getMap() {
    return map;
  }
}
