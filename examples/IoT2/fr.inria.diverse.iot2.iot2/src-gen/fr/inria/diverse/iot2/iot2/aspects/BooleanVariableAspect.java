package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspectBooleanVariableAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.VariableAspect;

@Aspect(className = BooleanVariable.class)
@OverrideAspectMethod
@SuppressWarnings("all")
public class BooleanVariableAspect extends VariableAspect {
  public static void execute(final BooleanVariable _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.BooleanVariable){
     fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.BooleanVariable)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Variable){
     fr.inria.diverse.iot2.iot2.aspects.VariableAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Variable)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static String print(final BooleanVariable _self) {
    fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspectBooleanVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspectBooleanVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.BooleanVariable){
    result = fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspect._privk3_print(_self_, (fr.inria.diverse.iot2.iot2.iot2.BooleanVariable)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Variable){
    result = fr.inria.diverse.iot2.iot2.aspects.VariableAspect.print((fr.inria.diverse.iot2.iot2.iot2.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_execute(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self, final Context c) {
  }
  
  private static String super_print(final BooleanVariable _self) {
    fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    return  fr.inria.diverse.iot2.iot2.aspects.VariableAspect._privk3_print(_self_, _self);
  }
  
  protected static String _privk3_print(final BooleanVariableAspectBooleanVariableAspectProperties _self_, final BooleanVariable _self) {
    StringBuffer text = new StringBuffer();
    String _name = _self.getName();
    text.append(_name);
    text.append(" = ");
    Value _currentValue = _self.getCurrentValue();
    boolean _isValue = ((BooleanValue) _currentValue).isValue();
    text.append(_isValue);
    return text.toString();
  }
}
