package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Invert;
import fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspectExpression_InvertAspectProperties;

@SuppressWarnings("all")
public class Expression_InvertAspectExpression_InvertAspectContext {
  public final static Expression_InvertAspectExpression_InvertAspectContext INSTANCE = new Expression_InvertAspectExpression_InvertAspectContext();
  
  public static Expression_InvertAspectExpression_InvertAspectProperties getSelf(final Expression_Invert _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspectExpression_InvertAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Invert, Expression_InvertAspectExpression_InvertAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Invert, fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspectExpression_InvertAspectProperties>();
  
  public Map<Expression_Invert, Expression_InvertAspectExpression_InvertAspectProperties> getMap() {
    return map;
  }
}
