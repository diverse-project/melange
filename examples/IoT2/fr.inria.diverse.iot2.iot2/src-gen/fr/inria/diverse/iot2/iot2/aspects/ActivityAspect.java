package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.Activity;
import fr.inria.diverse.iot2.iot2.iot2.ActivityNode;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.InitialNode;
import fr.inria.diverse.iot2.iot2.iot2.InputValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.iot2.iot2.iot2.Variable;
import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Trace;
import fr.inria.diverse.iot2.iot2.aspects.VariableAspect;

@Aspect(className = Activity.class)
@SuppressWarnings("all")
public class ActivityAspect extends NamedElementAspect {
  @ReplaceAspectMethod
  public static void main(final Activity _self, final List<InputValue> value) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_main(_self_, _self,value);
  }
  
  @OverrideAspectMethod
  public static void execute(final Activity _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Activity){
     fr.inria.diverse.iot2.iot2.aspects.ActivityAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Activity)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void reset(final Activity _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_reset(_self_, _self);
  }
  
  public static void writeToFile(final Activity _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_writeToFile(_self_, _self);
  }
  
  public static String printTrace(final Activity _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_printTrace(_self_, _self);
    return (java.lang.String)result;
  }
  
  public static int getIntegerVariableValue(final Activity _self, final String variableName) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getIntegerVariableValue(_self_, _self,variableName);
    return (int)result;
  }
  
  public static boolean getBooleanVariableValue(final Activity _self, final String variableName) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getBooleanVariableValue(_self_, _self,variableName);
    return (boolean)result;
  }
  
  public static Value getVariableValue(final Activity _self, final String variableName) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getVariableValue(_self_, _self,variableName);
    return (fr.inria.diverse.iot2.iot2.iot2.Value)result;
  }
  
  public static Variable getVariable(final Activity _self, final String variableName) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getVariable(_self_, _self,variableName);
    return (fr.inria.diverse.iot2.iot2.iot2.Variable)result;
  }
  
  public static void writeTrace(final Activity _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_writeTrace(_self_, _self);
  }
  
  private static Trace trace(final Activity _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_trace(_self_, _self);
    return (fr.inria.diverse.iot2.iot2.aspects.Trace)result;
  }
  
  private static void trace(final Activity _self, final Trace trace) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityAspectActivityAspectContext.getSelf(_self);
    _privk3_trace(_self_, _self,trace);
  }
  
  protected static void _privk3_main(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final List<InputValue> value) {
    Context c = new Context();
    Iterables.<InputValue>addAll(c.inputValues, value);
    c.activity = _self;
    Trace _trace = new Trace();
    ActivityAspect.trace(_self, _trace);
    Trace _trace_1 = ActivityAspect.trace(_self);
    c.output = _trace_1;
    if (value!=null) {
      final Consumer<InputValue> _function = (InputValue v) -> {
        Variable _variable = v.getVariable();
        Value _value = v.getValue();
        _variable.setCurrentValue(_value);
      };
      value.forEach(_function);
    }
    EList<ActivityNode> _nodes = _self.getNodes();
    final Consumer<ActivityNode> _function_1 = (ActivityNode n) -> {
      n.setRunning(true);
    };
    _nodes.forEach(_function_1);
    ActivityAspect.execute(_self, c);
  }
  
  private static void super_execute(final Activity _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final Context c) {
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function = (Variable v) -> {
      VariableAspect.init(v, c);
    };
    _locals.forEach(_function);
    EList<ActivityNode> _nodes = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function_1 = (ActivityNode node) -> {
      return Boolean.valueOf((node instanceof InitialNode));
    };
    Iterable<ActivityNode> _filter = IterableExtensions.<ActivityNode>filter(_nodes, _function_1);
    ActivityNode _get = ((ActivityNode[])Conversions.unwrapArray(_filter, ActivityNode.class))[0];
    ActivityNodeAspect.execute(_get, c);
    EList<ActivityNode> _nodes_1 = _self.getNodes();
    final Function1<ActivityNode, Boolean> _function_2 = (ActivityNode node) -> {
      return Boolean.valueOf(ActivityNodeAspect.hasOffers(node));
    };
    Iterable<ActivityNode> list = IterableExtensions.<ActivityNode>filter(_nodes_1, _function_2);
    while (((!Objects.equal(list, null)) && (IterableExtensions.size(list) > 0))) {
      {
        final Iterable<ActivityNode> _converted_list = (Iterable<ActivityNode>)list;
        ActivityNode _get_1 = ((ActivityNode[])Conversions.unwrapArray(_converted_list, ActivityNode.class))[0];
        ActivityNodeAspect.execute(_get_1, c);
        EList<ActivityNode> _nodes_2 = _self.getNodes();
        final Function1<ActivityNode, Boolean> _function_3 = (ActivityNode node) -> {
          return Boolean.valueOf(ActivityNodeAspect.hasOffers(node));
        };
        Iterable<ActivityNode> _filter_1 = IterableExtensions.<ActivityNode>filter(_nodes_2, _function_3);
        list = _filter_1;
      }
    }
  }
  
  protected static void _privk3_reset(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.trace(_self, null);
  }
  
  protected static void _privk3_writeToFile(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    String text = ActivityAspect.printTrace(_self);
    try {
      String _name = _self.getName();
      String _plus = ("trace/" + _name);
      String _plus_1 = (_plus + ".txt");
      File _file = new File(_plus_1);
      FileOutputStream _fileOutputStream = new FileOutputStream(_file);
      OutputStreamWriter _outputStreamWriter = new OutputStreamWriter(_fileOutputStream);
      BufferedWriter writer = new BufferedWriter(_outputStreamWriter);
      writer.write(text);
      writer.close();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected static String _privk3_printTrace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    final StringBuffer text = new StringBuffer();
    Trace _trace = ActivityAspect.trace(_self);
    final Consumer<ActivityNode> _function = (ActivityNode n) -> {
      String _name = n.getName();
      text.append(_name);
      String _property = System.getProperty("line.separator");
      text.append(_property);
    };
    _trace.executedNodes.forEach(_function);
    EList<Variable> _locals = _self.getLocals();
    final Consumer<Variable> _function_1 = (Variable v) -> {
      String _print = VariableAspect.print(v);
      text.append(_print);
      String _property = System.getProperty("line.separator");
      text.append(_property);
    };
    _locals.forEach(_function_1);
    return text.toString();
  }
  
  protected static int _privk3_getIntegerVariableValue(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    Value currentValue = ActivityAspect.getVariableValue(_self, variableName);
    if ((currentValue instanceof IntegerValue)) {
      IntegerValue integerValue = ((IntegerValue) currentValue);
      return integerValue.getValue();
    }
    return (-1);
  }
  
  protected static boolean _privk3_getBooleanVariableValue(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    Value currentValue = ActivityAspect.getVariableValue(_self, variableName);
    if ((currentValue instanceof BooleanValue)) {
      BooleanValue booleanValue = ((BooleanValue) currentValue);
      return booleanValue.isValue();
    }
    return false;
  }
  
  protected static Value _privk3_getVariableValue(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    Variable variable = ActivityAspect.getVariable(_self, variableName);
    Value currentValue = variable.getCurrentValue();
    return currentValue;
  }
  
  protected static Variable _privk3_getVariable(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final String variableName) {
    ArrayList<Variable> allVariables = new ArrayList<Variable>();
    EList<Variable> _locals = _self.getLocals();
    allVariables.addAll(_locals);
    EList<Variable> _inputs = _self.getInputs();
    allVariables.addAll(_inputs);
    for (final Variable var1 : allVariables) {
      String _name = var1.getName();
      boolean _equals = _name.equals(variableName);
      if (_equals) {
        return var1;
      }
    }
    return null;
  }
  
  protected static void _privk3_writeTrace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    ActivityAspect.writeToFile(_self);
    ActivityAspect.reset(_self);
  }
  
  protected static Trace _privk3_trace(final ActivityAspectActivityAspectProperties _self_, final Activity _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getTrace") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (fr.inria.diverse.iot2.iot2.aspects.Trace) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    
    return _self_.trace;
  }
  
  protected static void _privk3_trace(final ActivityAspectActivityAspectProperties _self_, final Activity _self, final Trace trace) {
    _self_.trace = trace; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Trace")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, trace);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
