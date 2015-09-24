package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression;
import fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonOperator;
import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties;

@Aspect(className = IntegerComparisonExpression.class)
@SuppressWarnings("all")
public class IntegerComparisonActivityExpressionAspect extends ActivityExpressionAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerComparisonExpression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression){
     fr.inria.diverse.iot2.iot2.aspects.IntegerComparisonActivityExpressionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.IntegerComparisonExpression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final IntegerComparisonExpression _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspectExpressionAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final IntegerComparisonActivityExpressionAspectIntegerComparisonExpressionAspectProperties _self_, final IntegerComparisonExpression _self, final Context c) {
    IntegerComparisonOperator _operator = _self.getOperator();
    int _value = _operator.getValue();
    boolean _equals = (_value == IntegerComparisonOperator.EQUALS_VALUE);
    if (_equals) {
      BooleanVariable _assignee = _self.getAssignee();
      Value _currentValue = _assignee.getCurrentValue();
      IntegerVariable _operand1 = _self.getOperand1();
      Value _currentValue_1 = _operand1.getCurrentValue();
      int _value_1 = ((IntegerValue) _currentValue_1).getValue();
      IntegerVariable _operand2 = _self.getOperand2();
      Value _currentValue_2 = _operand2.getCurrentValue();
      int _value_2 = ((IntegerValue) _currentValue_2).getValue();
      boolean _equals_1 = (_value_1 == _value_2);
      ((BooleanValue) _currentValue).setValue(_equals_1);
    } else {
      IntegerComparisonOperator _operator_1 = _self.getOperator();
      int _value_3 = _operator_1.getValue();
      boolean _equals_2 = (_value_3 == IntegerComparisonOperator.GREATER_EQUALS_VALUE);
      if (_equals_2) {
        BooleanVariable _assignee_1 = _self.getAssignee();
        Value _currentValue_3 = _assignee_1.getCurrentValue();
        IntegerVariable _operand1_1 = _self.getOperand1();
        Value _currentValue_4 = _operand1_1.getCurrentValue();
        int _value_4 = ((IntegerValue) _currentValue_4).getValue();
        IntegerVariable _operand2_1 = _self.getOperand2();
        Value _currentValue_5 = _operand2_1.getCurrentValue();
        int _value_5 = ((IntegerValue) _currentValue_5).getValue();
        boolean _greaterEqualsThan = (_value_4 >= _value_5);
        ((BooleanValue) _currentValue_3).setValue(_greaterEqualsThan);
      } else {
        IntegerComparisonOperator _operator_2 = _self.getOperator();
        int _value_6 = _operator_2.getValue();
        boolean _equals_3 = (_value_6 == IntegerComparisonOperator.GREATER_VALUE);
        if (_equals_3) {
          BooleanVariable _assignee_2 = _self.getAssignee();
          Value _currentValue_6 = _assignee_2.getCurrentValue();
          IntegerVariable _operand1_2 = _self.getOperand1();
          Value _currentValue_7 = _operand1_2.getCurrentValue();
          int _value_7 = ((IntegerValue) _currentValue_7).getValue();
          IntegerVariable _operand2_2 = _self.getOperand2();
          Value _currentValue_8 = _operand2_2.getCurrentValue();
          int _value_8 = ((IntegerValue) _currentValue_8).getValue();
          boolean _greaterThan = (_value_7 > _value_8);
          ((BooleanValue) _currentValue_6).setValue(_greaterThan);
        } else {
          IntegerComparisonOperator _operator_3 = _self.getOperator();
          int _value_9 = _operator_3.getValue();
          boolean _equals_4 = (_value_9 == IntegerComparisonOperator.SMALLER_EQUALS_VALUE);
          if (_equals_4) {
            BooleanVariable _assignee_3 = _self.getAssignee();
            Value _currentValue_9 = _assignee_3.getCurrentValue();
            IntegerVariable _operand1_3 = _self.getOperand1();
            Value _currentValue_10 = _operand1_3.getCurrentValue();
            int _value_10 = ((IntegerValue) _currentValue_10).getValue();
            IntegerVariable _operand2_3 = _self.getOperand2();
            Value _currentValue_11 = _operand2_3.getCurrentValue();
            int _value_11 = ((IntegerValue) _currentValue_11).getValue();
            boolean _lessEqualsThan = (_value_10 <= _value_11);
            ((BooleanValue) _currentValue_9).setValue(_lessEqualsThan);
          } else {
            IntegerComparisonOperator _operator_4 = _self.getOperator();
            int _value_12 = _operator_4.getValue();
            boolean _equals_5 = (_value_12 == IntegerComparisonOperator.SMALLER_VALUE);
            if (_equals_5) {
              BooleanVariable _assignee_4 = _self.getAssignee();
              Value _currentValue_12 = _assignee_4.getCurrentValue();
              IntegerVariable _operand1_4 = _self.getOperand1();
              Value _currentValue_13 = _operand1_4.getCurrentValue();
              int _value_13 = ((IntegerValue) _currentValue_13).getValue();
              IntegerVariable _operand2_4 = _self.getOperand2();
              Value _currentValue_14 = _operand2_4.getCurrentValue();
              int _value_14 = ((IntegerValue) _currentValue_14).getValue();
              boolean _lessThan = (_value_13 < _value_14);
              ((BooleanValue) _currentValue_12).setValue(_lessThan);
            }
          }
        }
      }
    }
  }
}
