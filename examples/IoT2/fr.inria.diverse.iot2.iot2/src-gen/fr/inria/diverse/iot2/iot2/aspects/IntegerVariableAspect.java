package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.VariableAspect;

@Aspect(className = IntegerVariable.class)
@SuppressWarnings("all")
public class IntegerVariableAspect extends VariableAspect {
  @OverrideAspectMethod
  public static void execute(final IntegerVariable _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerVariable){
     fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.IntegerVariable)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Variable){
     fr.inria.diverse.iot2.iot2.aspects.VariableAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Variable)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final IntegerVariable _self) {
    fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspectIntegerVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerVariable){
    result = fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspect._privk3_print(_self_, (fr.inria.diverse.iot2.iot2.iot2.IntegerVariable)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Variable){
    result = fr.inria.diverse.iot2.iot2.aspects.VariableAspect.print((fr.inria.diverse.iot2.iot2.iot2.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  private static void super_execute(final IntegerVariable _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.VariableAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self, final Context c) {
  }
  
  private static String super_print(final IntegerVariable _self) {
    fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  fr.inria.diverse.iot2.iot2.aspects.VariableAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final IntegerVariableAspectIntegerVariableAspectProperties _self_, final IntegerVariable _self) {
    StringBuffer text = new StringBuffer();
    String _name = _self.getName();
    text.append(_name);
    text.append(" = ");
    Value _currentValue = _self.getCurrentValue();
    int _value = ((IntegerValue) _currentValue).getValue();
    text.append(_value);
    return text.toString();
  }
}
