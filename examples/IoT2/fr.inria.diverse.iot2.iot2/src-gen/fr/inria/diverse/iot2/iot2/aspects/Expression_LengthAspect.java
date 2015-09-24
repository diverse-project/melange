package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Length;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspectExpression_LengthAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_Length.class)
@SuppressWarnings("all")
public class Expression_LengthAspect extends LuaExpressionAspect {
  public static void execute(final Expression_Length _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspectExpression_LengthAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspectExpression_LengthAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Length){
     fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_Length)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_LengthAspectExpression_LengthAspectProperties _self_, final Expression_Length _self, final Environment c) {
    Expression _exp = _self.getExp();
    LuaExpressionAspect.execute(_exp, c);
    Object _popValue = c.popValue();
    String left = ((String) _popValue);
    int _length = left.length();
    c.pushValue(Integer.valueOf(_length));
  }
}
