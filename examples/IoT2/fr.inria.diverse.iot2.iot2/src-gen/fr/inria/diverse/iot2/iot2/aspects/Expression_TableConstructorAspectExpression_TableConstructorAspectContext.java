package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor;
import fr.inria.diverse.iot2.iot2.aspects.Expression_TableConstructorAspectExpression_TableConstructorAspectProperties;

@SuppressWarnings("all")
public class Expression_TableConstructorAspectExpression_TableConstructorAspectContext {
  public final static Expression_TableConstructorAspectExpression_TableConstructorAspectContext INSTANCE = new Expression_TableConstructorAspectExpression_TableConstructorAspectContext();
  
  public static Expression_TableConstructorAspectExpression_TableConstructorAspectProperties getSelf(final Expression_TableConstructor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_TableConstructorAspectExpression_TableConstructorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_TableConstructor, Expression_TableConstructorAspectExpression_TableConstructorAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor, fr.inria.diverse.iot2.iot2.aspects.Expression_TableConstructorAspectExpression_TableConstructorAspectProperties>();
  
  public Map<Expression_TableConstructor, Expression_TableConstructorAspectExpression_TableConstructorAspectProperties> getMap() {
    return map;
  }
}
