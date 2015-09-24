package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Context;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public class ActivityExpressionAspect {
  public static void execute(final Expression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression){
     fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression){
     fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression){
     fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression){
     fr.inria.diverse.iot2.iot2.aspects.BooleanBinaryActivityExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.BooleanBinaryExpression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final ActivityExpressionAspectExpressionAspectProperties _self_, final Expression _self, final Context c) {
  }
}
