package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspectExpressionAspectProperties;

@SuppressWarnings("all")
public class LuaExpressionAspectExpressionAspectContext {
  public final static LuaExpressionAspectExpressionAspectContext INSTANCE = new LuaExpressionAspectExpressionAspectContext();
  
  public static LuaExpressionAspectExpressionAspectProperties getSelf(final Expression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspectExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression, LuaExpressionAspectExpressionAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression, fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspectExpressionAspectProperties>();
  
  public Map<Expression, LuaExpressionAspectExpressionAspectProperties> getMap() {
    return map;
  }
}
