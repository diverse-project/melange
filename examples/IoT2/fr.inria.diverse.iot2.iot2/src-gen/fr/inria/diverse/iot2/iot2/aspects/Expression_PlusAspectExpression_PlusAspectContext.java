package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Plus;
import fr.inria.diverse.iot2.iot2.aspects.Expression_PlusAspectExpression_PlusAspectProperties;

@SuppressWarnings("all")
public class Expression_PlusAspectExpression_PlusAspectContext {
  public final static Expression_PlusAspectExpression_PlusAspectContext INSTANCE = new Expression_PlusAspectExpression_PlusAspectContext();
  
  public static Expression_PlusAspectExpression_PlusAspectProperties getSelf(final Expression_Plus _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_PlusAspectExpression_PlusAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Plus, Expression_PlusAspectExpression_PlusAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Plus, fr.inria.diverse.iot2.iot2.aspects.Expression_PlusAspectExpression_PlusAspectProperties>();
  
  public Map<Expression_Plus, Expression_PlusAspectExpression_PlusAspectProperties> getMap() {
    return map;
  }
}
