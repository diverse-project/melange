package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Expression_Function;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspectExpression_FunctionAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_Function.class)
@SuppressWarnings("all")
public class Expression_FunctionAspect extends LuaExpressionAspect {
  public static void execute(final Expression_Function _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspectExpression_FunctionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspectExpression_FunctionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Function){
     fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_Function)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_FunctionAspectExpression_FunctionAspectProperties _self_, final Expression_Function _self, final Environment c) {
  }
}
