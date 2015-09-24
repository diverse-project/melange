package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.iot2.iot2.iot2.Variable;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectProperties;

@Aspect(className = Variable.class)
@SuppressWarnings("all")
public class VariableAspect {
  public static void execute(final Variable _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerVariable){
     fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspect.execute((fr.inria.diverse.iot2.iot2.iot2.IntegerVariable)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.BooleanVariable){
     fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspect.execute((fr.inria.diverse.iot2.iot2.iot2.BooleanVariable)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Variable){
     fr.inria.diverse.iot2.iot2.aspects.VariableAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Variable)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void init(final Variable _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    _privk3_init(_self_, _self,c);
  }
  
  public static String print(final Variable _self) {
    fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.VariableAspectVariableAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.IntegerVariable){
    result = fr.inria.diverse.iot2.iot2.aspects.IntegerVariableAspect.print((fr.inria.diverse.iot2.iot2.iot2.IntegerVariable)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.BooleanVariable){
    result = fr.inria.diverse.iot2.iot2.aspects.BooleanVariableAspect.print((fr.inria.diverse.iot2.iot2.iot2.BooleanVariable)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Variable){
    result = fr.inria.diverse.iot2.iot2.aspects.VariableAspect._privk3_print(_self_, (fr.inria.diverse.iot2.iot2.iot2.Variable)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.String)result;
  }
  
  protected static void _privk3_execute(final VariableAspectVariableAspectProperties _self_, final Variable _self, final Context c) {
  }
  
  protected static void _privk3_init(final VariableAspectVariableAspectProperties _self_, final Variable _self, final Context c) {
    Value _initialValue = _self.getInitialValue();
    _self.setCurrentValue(_initialValue);
  }
  
  protected static String _privk3_print(final VariableAspectVariableAspectProperties _self_, final Variable _self) {
    return null;
  }
}
