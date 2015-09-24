package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.Iot2Factory;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.InputValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerValue;
import fr.inria.diverse.iot2.iot2.iot2.IntegerVariable;
import fr.inria.diverse.iot2.iot2.iot2.OpaqueAction;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import fr.inria.diverse.iot2.iot2.iot2.Variable;
import com.google.common.base.Objects;
import fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.OperationDefAspect;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import fr.inria.diverse.iot2.iot2.iot2.OperationDef;
import fr.inria.diverse.iot2.iot2.iot2.ParameterDef;
import fr.inria.diverse.iot2.iot2.iot2.ParameterMode;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import fr.inria.diverse.iot2.iot2.aspects.ActivityExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.Token;
import fr.inria.diverse.iot2.iot2.aspects.Environment;

@Aspect(className = OpaqueAction.class)
@SuppressWarnings("all")
public class OpaqueActionAspect extends ActivityNodeAspect {
  public static void execute(final OpaqueAction _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self,c);
  }
  
  public static String getValueAsString(final OpaqueAction _self, final Value v) {
    fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_getValueAsString(_self_, _self,v);
    return (java.lang.String)result;
  }
  
  public static OperationDef service(final OpaqueAction _self) {
    fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_service(_self_, _self);
    return _self.getService();
  }
  
  public static void service(final OpaqueAction _self, final OperationDef service) {
    fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspectOpaqueActionAspectContext.getSelf(_self);
    _privk3_service(_self_, _self,service);
  }
  
  protected static void _privk3_execute(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self, final Context c) {
    c.output.executedNodes.add(_self);
    EList<Expression> _expressions = _self.getExpressions();
    final Consumer<Expression> _function = (Expression e) -> {
      ActivityExpressionAspect.execute(e, c);
    };
    _expressions.forEach(_function);
    final Iot2Factory fact = Iot2Factory.eINSTANCE;
    OperationDef _service = OpaqueActionAspect.service(_self);
    boolean _tripleNotEquals = (_service != null);
    if (_tripleNotEquals) {
      Environment _environment = new Environment();
      final Procedure1<Environment> _function_1 = (Environment it) -> {
        OperationDef _service_1 = OpaqueActionAspect.service(_self);
        EList<ParameterDef> _parameters = _service_1.getParameters();
        final Function1<ParameterDef, Boolean> _function_2 = (ParameterDef it_1) -> {
          ParameterMode _direction = it_1.getDirection();
          return Boolean.valueOf(Collections.<ParameterMode>unmodifiableList(CollectionLiterals.<ParameterMode>newArrayList(ParameterMode.PARAM_IN, ParameterMode.PARAM_INOUT)).contains(_direction));
        };
        Iterable<ParameterDef> _filter = IterableExtensions.<ParameterDef>filter(_parameters, _function_2);
        final Consumer<ParameterDef> _function_3 = (ParameterDef p) -> {
          final Function1<InputValue, Boolean> _function_4 = (InputValue it_1) -> {
            Variable _variable = it_1.getVariable();
            String _name = _variable.getName();
            String _identifier = p.getIdentifier();
            return Boolean.valueOf(Objects.equal(_name, _identifier));
          };
          final InputValue find = IterableExtensions.<InputValue>findFirst(c.inputValues, _function_4);
          String _identifier = p.getIdentifier();
          Object _elvis = null;
          Variable _variable = null;
          if (find!=null) {
            _variable=find.getVariable();
          }
          Value _currentValue = null;
          if (_variable!=null) {
            _currentValue=_variable.getCurrentValue();
          }
          String _valueAsString = OpaqueActionAspect.getValueAsString(_self, _currentValue);
          if (_valueAsString != null) {
            _elvis = _valueAsString;
          } else {
            _elvis = null;
          }
          it.putVariable(_identifier, _elvis);
        };
        _filter.forEach(_function_3);
      };
      final Environment wrappedEnv = ObjectExtensions.<Environment>operator_doubleArrow(_environment, _function_1);
      OperationDef _service_1 = OpaqueActionAspect.service(_self);
      OperationDefAspect.execute(_service_1, wrappedEnv);
      OperationDef _service_2 = OpaqueActionAspect.service(_self);
      EList<ParameterDef> _parameters = _service_2.getParameters();
      final Function1<ParameterDef, Boolean> _function_2 = (ParameterDef it) -> {
        ParameterMode _direction = it.getDirection();
        return Boolean.valueOf(Collections.<ParameterMode>unmodifiableList(CollectionLiterals.<ParameterMode>newArrayList(ParameterMode.PARAM_OUT, ParameterMode.PARAM_INOUT)).contains(_direction));
      };
      Iterable<ParameterDef> _filter = IterableExtensions.<ParameterDef>filter(_parameters, _function_2);
      final Consumer<ParameterDef> _function_3 = (ParameterDef p) -> {
        final Function1<InputValue, Boolean> _function_4 = (InputValue it) -> {
          Variable _variable = it.getVariable();
          String _name = _variable.getName();
          String _identifier = p.getIdentifier();
          return Boolean.valueOf(Objects.equal(_name, _identifier));
        };
        final InputValue updated = IterableExtensions.<InputValue>findFirst(c.inputValues, _function_4);
        String _identifier = p.getIdentifier();
        Object _variable = wrappedEnv.getVariable(_identifier);
        String _string = _variable.toString();
        final Integer retInteger = new Integer(_string);
        if ((updated != null)) {
          Variable _variable_1 = updated.getVariable();
          IntegerValue _createIntegerValue = fact.createIntegerValue();
          final Procedure1<IntegerValue> _function_5 = (IntegerValue it) -> {
            it.setValue((retInteger).intValue());
          };
          IntegerValue _doubleArrow = ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue, _function_5);
          _variable_1.setCurrentValue(_doubleArrow);
        } else {
          InputValue _createInputValue = fact.createInputValue();
          final Procedure1<InputValue> _function_6 = (InputValue it) -> {
            IntegerVariable _createIntegerVariable = fact.createIntegerVariable();
            final Procedure1<IntegerVariable> _function_7 = (IntegerVariable it_1) -> {
              String _identifier_1 = p.getIdentifier();
              it_1.setName(_identifier_1);
              IntegerValue _createIntegerValue_1 = fact.createIntegerValue();
              final Procedure1<IntegerValue> _function_8 = (IntegerValue it_2) -> {
                it_2.setValue((retInteger).intValue());
              };
              IntegerValue _doubleArrow_1 = ObjectExtensions.<IntegerValue>operator_doubleArrow(_createIntegerValue_1, _function_8);
              it_1.setCurrentValue(_doubleArrow_1);
            };
            IntegerVariable _doubleArrow_1 = ObjectExtensions.<IntegerVariable>operator_doubleArrow(_createIntegerVariable, _function_7);
            it.setVariable(_doubleArrow_1);
          };
          InputValue _doubleArrow_1 = ObjectExtensions.<InputValue>operator_doubleArrow(_createInputValue, _function_6);
          c.inputValues.add(_doubleArrow_1);
        }
      };
      _filter.forEach(_function_3);
    }
    List<Token> _takeOfferdTokens = ActivityNodeAspect.takeOfferdTokens(_self);
    ActivityNodeAspect.sendOffers(_self, _takeOfferdTokens);
  }
  
  protected static String _privk3_getValueAsString(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self, final Value v) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (v instanceof IntegerValue) {
        _matched=true;
        int _value = ((IntegerValue)v).getValue();
        _switchResult = Integer.valueOf(_value).toString();
      }
    }
    if (!_matched) {
      if (v instanceof BooleanValue) {
        _matched=true;
        boolean _isValue = ((BooleanValue)v).isValue();
        _switchResult = Boolean.valueOf(_isValue).toString();
      }
    }
    if (!_matched) {
      _switchResult = null;
    }
    return _switchResult;
  }
  
  protected static OperationDef _privk3_service(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self) {
     return _self_.service; 
  }
  
  protected static void _privk3_service(final OpaqueActionAspectOpaqueActionAspectProperties _self_, final OpaqueAction _self, final OperationDef service) {
    _self_.service = service; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Service")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, service);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
