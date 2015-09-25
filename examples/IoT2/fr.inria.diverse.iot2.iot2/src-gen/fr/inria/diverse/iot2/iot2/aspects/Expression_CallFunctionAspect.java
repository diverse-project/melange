package fr.inria.diverse.iot2.iot2.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.aspects.BlockAspect;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspectExpression_CallFunctionAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_CallFunction.class)
@SuppressWarnings("all")
public class Expression_CallFunctionAspect extends LuaExpressionAspect {
  public static void execute(final Expression_CallFunction _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspectExpression_CallFunctionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspectExpression_CallFunctionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction){
     fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_CallFunctionAspectExpression_CallFunctionAspectProperties _self_, final Expression_CallFunction _self, final Environment c) {
    final Expression x = _self.getObject();
    boolean _matched = false;
    if (!_matched) {
      if (x instanceof Expression_VariableName) {
        String _variable = ((Expression_VariableName)x).getVariable();
        boolean _equals = _variable.equals("rand");
        if (_equals) {
          _matched=true;
          Functioncall_Arguments _arguments = _self.getArguments();
          EList<Expression> _arguments_1 = _arguments.getArguments();
          Expression _get = _arguments_1.get(0);
          LuaExpressionAspect.execute(_get, c);
          Object _popValue = c.popValue();
          String _string = _popValue.toString();
          double _parseDouble = Double.parseDouble(_string);
          final int min = Double.valueOf(_parseDouble).intValue();
          Functioncall_Arguments _arguments_2 = _self.getArguments();
          EList<Expression> _arguments_3 = _arguments_2.getArguments();
          Expression _get_1 = _arguments_3.get(1);
          LuaExpressionAspect.execute(_get_1, c);
          Object _popValue_1 = c.popValue();
          String _string_1 = _popValue_1.toString();
          double _parseDouble_1 = Double.parseDouble(_string_1);
          final int max = Double.valueOf(_parseDouble_1).intValue();
          ThreadLocalRandom _current = ThreadLocalRandom.current();
          final int rand = _current.nextInt(min, max);
          c.pushValue(Double.valueOf(((double) rand)));
          return;
        }
      }
    }
    Expression _object = _self.getObject();
    LuaExpressionAspect.execute(_object, c);
    Functioncall_Arguments _arguments = _self.getArguments();
    EList<Expression> _arguments_1 = _arguments.getArguments();
    int _size = _arguments_1.size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      Functioncall_Arguments _arguments_2 = _self.getArguments();
      EList<Expression> _arguments_3 = _arguments_2.getArguments();
      Expression _get = _arguments_3.get(0);
      LuaExpressionAspect.execute(_get, c);
      Object res = c.popValue();
      boolean _equals = "\"*number\"".equals(res);
      if (_equals) {
        Object res1 = c.popValue();
        double _parseDouble = Double.parseDouble(("" + res1));
        c.pushValue(Double.valueOf(_parseDouble));
        return;
      }
    }
    Expression _object_1 = _self.getObject();
    if ((_object_1 instanceof Expression_VariableName)) {
      Map<String, Function> _functions = c.getFunctions();
      Expression _object_2 = _self.getObject();
      String _variable = ((Expression_VariableName) _object_2).getVariable();
      Function function = _functions.get(_variable);
      boolean _notEquals = (!Objects.equal(function, null));
      if (_notEquals) {
        final ArrayList<Object> params = new ArrayList<Object>();
        Functioncall_Arguments _arguments_4 = _self.getArguments();
        EList<Expression> _arguments_5 = _arguments_4.getArguments();
        final Consumer<Expression> _function = (Expression args) -> {
          LuaExpressionAspect.execute(args, c);
          Object _popValue = c.popValue();
          params.add(_popValue);
        };
        _arguments_5.forEach(_function);
        Environment newC = new Environment();
        newC.setParent(c);
        Map<String, Object> _variables = newC.getVariables();
        Map<String, Object> _variables_1 = c.getVariables();
        _variables.putAll(_variables_1);
        Map<String, Function> _functions_1 = newC.getFunctions();
        Map<String, Function> _functions_2 = c.getFunctions();
        _functions_1.putAll(_functions_2);
        Stack<Object> _values = newC.getValues();
        Stack<Object> _values_1 = c.getValues();
        _values.addAll(_values_1);
        for (int i = 0; (i < function.getParameters().size()); i++) {
          EList<String> _parameters = function.getParameters();
          String _get_1 = _parameters.get(i);
          Object _get_2 = params.get(i);
          newC.putVariable(_get_1, _get_2);
        }
        Block _body = function.getBody();
        BlockAspect.execute(_body, newC);
        Object _popValue = newC.popValue();
        c.pushValue(_popValue);
      }
    }
  }
}
