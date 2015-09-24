package fr.inria.diverse.iot2.iot2.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction;
import fr.inria.diverse.iot2.iot2.aspects.BlockAspect;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspectStatement_CallFunctionAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect;

@Aspect(className = Statement_CallFunction.class)
@SuppressWarnings("all")
public class Statement_CallFunctionAspect extends Statement_FunctioncallOrAssignmentAspect {
  @OverrideAspectMethod
  public static void execute(final Statement_CallFunction _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspectStatement_CallFunctionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspectStatement_CallFunctionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction){
     fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Statement_CallFunction _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final Statement_CallFunctionAspectStatement_CallFunctionAspectProperties _self_, final Statement_CallFunction _self, final Environment c) {
    Expression x = _self.getObject();
    boolean _matched = false;
    if (!_matched) {
      if (x instanceof Expression_VariableName) {
        String _variable = ((Expression_VariableName)x).getVariable();
        boolean _equals = _variable.equals("print");
        if (_equals) {
          _matched=true;
          Functioncall_Arguments _arguments = _self.getArguments();
          EList<Expression> _arguments_1 = _arguments.getArguments();
          Expression _get = _arguments_1.get(0);
          LuaExpressionAspect.execute(_get, c);
          Object _popValue = c.popValue();
          InputOutput.<Object>println(_popValue);
          return;
        }
      }
    }
    Expression _object = _self.getObject();
    if ((_object instanceof Expression_VariableName)) {
      Expression _object_1 = _self.getObject();
      String _variable = ((Expression_VariableName) _object_1).getVariable();
      Function function = c.getFunction(_variable);
      boolean _notEquals = (!Objects.equal(function, null));
      if (_notEquals) {
        final ArrayList<Object> params = new ArrayList<Object>();
        Functioncall_Arguments _arguments = _self.getArguments();
        EList<Expression> _arguments_1 = _arguments.getArguments();
        final Consumer<Expression> _function = (Expression args) -> {
          LuaExpressionAspect.execute(args, c);
          Object _popValue = c.popValue();
          params.add(_popValue);
        };
        _arguments_1.forEach(_function);
        Environment newC = new Environment();
        newC.setParent(c);
        Map<String, Object> _variables = c.getVariables();
        newC.putAllVariables(_variables);
        Map<String, Function> _functions = c.getFunctions();
        newC.putAllFunctions(_functions);
        Stack<Object> _values = c.getValues();
        newC.pushAllValues(_values);
        for (int i = 0; (i < function.getParameters().size()); i++) {
          EList<String> _parameters = function.getParameters();
          String _get = _parameters.get(i);
          Object _get_1 = params.get(i);
          newC.putVariable(_get, _get_1);
        }
        Block _body = function.getBody();
        BlockAspect.execute(_body, newC);
        Object _popValue = newC.popValue();
        c.pushValue(_popValue);
      }
    }
  }
}
