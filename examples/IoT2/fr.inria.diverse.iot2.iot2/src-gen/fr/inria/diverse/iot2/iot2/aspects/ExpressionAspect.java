package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.aspects.ExpressionAspectExpressionAspectProperties;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ExpressionAspect {
  public static void execute(final Expression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void execute(final Expression _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.ExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ExpressionAspectExpressionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context c) {
    ActivityExpressionAspect.execute(_self, c);
  }
  
  protected static void _privk3_execute(final ExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Environment c) {
    LuaExpressionAspect.execute(((fr.inria.diverse.iot2.iot2.iot2.Expression) _self), c);
  }
}
