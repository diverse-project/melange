package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo;
import fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspectExpression_ModuloAspectProperties;

@SuppressWarnings("all")
public class Expression_ModuloAspectExpression_ModuloAspectContext {
  public final static Expression_ModuloAspectExpression_ModuloAspectContext INSTANCE = new Expression_ModuloAspectExpression_ModuloAspectContext();
  
  public static Expression_ModuloAspectExpression_ModuloAspectProperties getSelf(final Expression_Modulo _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspectExpression_ModuloAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_Modulo, Expression_ModuloAspectExpression_ModuloAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo, fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspectExpression_ModuloAspectProperties>();
  
  public Map<Expression_Modulo, Expression_ModuloAspectExpression_ModuloAspectProperties> getMap() {
    return map;
  }
}
