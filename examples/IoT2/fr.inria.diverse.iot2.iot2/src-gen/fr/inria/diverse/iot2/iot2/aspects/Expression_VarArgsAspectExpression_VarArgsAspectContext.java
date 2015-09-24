package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs;
import fr.inria.diverse.iot2.iot2.aspects.Expression_VarArgsAspectExpression_VarArgsAspectProperties;

@SuppressWarnings("all")
public class Expression_VarArgsAspectExpression_VarArgsAspectContext {
  public final static Expression_VarArgsAspectExpression_VarArgsAspectContext INSTANCE = new Expression_VarArgsAspectExpression_VarArgsAspectContext();
  
  public static Expression_VarArgsAspectExpression_VarArgsAspectProperties getSelf(final Expression_VarArgs _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_VarArgsAspectExpression_VarArgsAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_VarArgs, Expression_VarArgsAspectExpression_VarArgsAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs, fr.inria.diverse.iot2.iot2.aspects.Expression_VarArgsAspectExpression_VarArgsAspectProperties>();
  
  public Map<Expression_VarArgs, Expression_VarArgsAspectExpression_VarArgsAspectProperties> getMap() {
    return map;
  }
}
