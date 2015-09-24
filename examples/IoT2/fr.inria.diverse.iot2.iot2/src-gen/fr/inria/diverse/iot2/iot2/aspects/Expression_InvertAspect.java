package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Invert;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspectExpression_InvertAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_Invert.class)
@SuppressWarnings("all")
public class Expression_InvertAspect extends LuaExpressionAspect {
  public static void execute(final Expression_Invert _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspectExpression_InvertAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspectExpression_InvertAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Invert){
     fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_Invert)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_InvertAspectExpression_InvertAspectProperties _self_, final Expression_Invert _self, final Environment c) {
    Expression _exp = _self.getExp();
    LuaExpressionAspect.execute(_exp, c);
    Object _popValue = c.popValue();
    Double left = ((Double) _popValue);
    c.pushValue(Double.valueOf(((left).doubleValue() * (-1))));
  }
}
