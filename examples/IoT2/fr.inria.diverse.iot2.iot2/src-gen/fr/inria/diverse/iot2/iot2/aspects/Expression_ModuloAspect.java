package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspectExpression_ModuloAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_Modulo.class)
@SuppressWarnings("all")
public class Expression_ModuloAspect extends LuaExpressionAspect {
  public static void execute(final Expression_Modulo _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspectExpression_ModuloAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspectExpression_ModuloAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo){
     fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_ModuloAspectExpression_ModuloAspectProperties _self_, final Expression_Modulo _self, final Environment c) {
    Expression _left = _self.getLeft();
    LuaExpressionAspect.execute(_left, c);
    Object _popValue = c.popValue();
    Double left = ((Double) _popValue);
    Expression _right = _self.getRight();
    LuaExpressionAspect.execute(_right, c);
    Object _popValue_1 = c.popValue();
    Double right = ((Double) _popValue_1);
    c.pushValue(Double.valueOf(((left).doubleValue() % (right).doubleValue())));
  }
}
