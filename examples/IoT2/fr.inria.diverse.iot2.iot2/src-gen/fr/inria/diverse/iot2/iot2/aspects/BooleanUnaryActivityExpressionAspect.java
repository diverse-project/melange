package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression;
import fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryOperator;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Context;

@Aspect(className = BooleanUnaryExpression.class)
@SuppressWarnings("all")
public class BooleanUnaryActivityExpressionAspect extends ActivityExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final BooleanUnaryExpression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression){
     fr.inria.diverse.iot2.iot2.aspects.BooleanUnaryActivityExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.BooleanUnaryExpression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final BooleanUnaryExpression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final BooleanUnaryActivityExpressionAspectBooleanUnaryExpressionAspectProperties _self_, final BooleanUnaryExpression _self, final Context c) {
    BooleanUnaryOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == BooleanUnaryOperator.NOT_VALUE);
    if (_equals) {
      BooleanVariable _assignee = _self.getAssignee();
      Value _currentValue = _assignee.getCurrentValue();
      BooleanVariable _operand = _self.getOperand();
      Value _currentValue_1 = _operand.getCurrentValue();
      boolean _isValue = ((BooleanValue) _currentValue_1).isValue();
      boolean _not = (!_isValue);
      ((BooleanValue) _currentValue).setValue(_not);
    }
  }
}
