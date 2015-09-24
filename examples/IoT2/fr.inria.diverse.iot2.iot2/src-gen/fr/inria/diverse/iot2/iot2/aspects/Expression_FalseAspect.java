package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Expression_False;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspectExpression_FalseAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_False.class)
@SuppressWarnings("all")
public class Expression_FalseAspect extends LuaExpressionAspect {
  public static void execute(final Expression_False _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspectExpression_FalseAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspectExpression_FalseAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_False){
     fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_False)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_FalseAspectExpression_FalseAspectProperties _self_, final Expression_False _self, final Environment c) {
    c.pushValue(Boolean.valueOf(false));
  }
}
