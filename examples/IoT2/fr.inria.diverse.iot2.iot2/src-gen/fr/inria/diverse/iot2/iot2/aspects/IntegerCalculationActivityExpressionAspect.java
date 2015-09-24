package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationOperator;
import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties;

@Aspect(className = IntegerCalculationExpression.class)
@SuppressWarnings("all")
public class IntegerCalculationActivityExpressionAspect extends ActivityExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerCalculationExpression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression){
     fr.inria.diverse.iot2.iot2.aspects.IntegerCalculationActivityExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.IntegerCalculationExpression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final IntegerCalculationExpression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final IntegerCalculationActivityExpressionAspectIntegerCalculationExpressionAspectProperties _self_, final IntegerCalculationExpression _self, final Context c) {
    IntegerCalculationOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerCalculationOperator.ADD_VALUE);
    if (_equals) {
      IntegerVariable _assignee = _self.getAssignee();
      Value _currentValue = _assignee.getCurrentValue();
      IntegerVariable _operand1 = _self.getOperand1();
      Value _currentValue_1 = _operand1.getCurrentValue();
      int _value_1 = ((IntegerValue) _currentValue_1).getValue();
      IntegerVariable _operand2 = _self.getOperand2();
      Value _currentValue_2 = _operand2.getCurrentValue();
      int _value_2 = ((IntegerValue) _currentValue_2).getValue();
      int _plus = (_value_1 + _value_2);
      ((IntegerValue) _currentValue).setValue(_plus);
    } else {
      IntegerCalculationOperator _operator_1 = _self.getOperator();
      int _value_3 = _operator_1.getValue();
      boolean _equals_1 = (_value_3 == IntegerCalculationOperator.SUBRACT_VALUE);
      if (_equals_1) {
        IntegerVariable _assignee_1 = _self.getAssignee();
        Value _currentValue_3 = _assignee_1.getCurrentValue();
        IntegerVariable _operand1_1 = _self.getOperand1();
        Value _currentValue_4 = _operand1_1.getCurrentValue();
        int _value_4 = ((IntegerValue) _currentValue_4).getValue();
        IntegerVariable _operand2_1 = _self.getOperand2();
        Value _currentValue_5 = _operand2_1.getCurrentValue();
        int _value_5 = ((IntegerValue) _currentValue_5).getValue();
        int _minus = (_value_4 - _value_5);
        ((IntegerValue) _currentValue_3).setValue(_minus);
      }
    }
  }
}
