package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspectExpression_Not_EqualAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_Not_Equal.class)
@SuppressWarnings("all")
public class Expression_Not_EqualAspect extends LuaExpressionAspect {
  public static void execute(final Expression_Not_Equal _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspectExpression_Not_EqualAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspectExpression_Not_EqualAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal){
     fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_Not_EqualAspectExpression_Not_EqualAspectProperties _self_, final Expression_Not_Equal _self, final Environment c) {
    Expression _left = _self.getLeft();
    LuaExpressionAspect.execute(_left, c);
    Object left = c.popValue();
    Expression _right = _self.getRight();
    LuaExpressionAspect.execute(_right, c);
    Object right = c.popValue();
    boolean _equals = left.equals(right);
    boolean _not = (!_equals);
    c.pushValue(Boolean.valueOf(_not));
  }
}
