package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Larger;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspectExpression_LargerAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_Larger.class)
@SuppressWarnings("all")
public class Expression_LargerAspect extends LuaExpressionAspect {
  public static void execute(final Expression_Larger _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspectExpression_LargerAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspectExpression_LargerAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Larger){
     fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_Larger)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_LargerAspectExpression_LargerAspectProperties _self_, final Expression_Larger _self, final Environment c) {
    Expression _left = _self.getLeft();
    LuaExpressionAspect.execute(_left, c);
    Object _popValue = c.popValue();
    Comparable left = ((Comparable) _popValue);
    Expression _right = _self.getRight();
    LuaExpressionAspect.execute(_right, c);
    Object _popValue_1 = c.popValue();
    Comparable right = ((Comparable) _popValue_1);
    int _compareTo = left.compareTo(right);
    boolean _greaterThan = (_compareTo > 0);
    c.pushValue(Boolean.valueOf(_greaterThan));
  }
}
