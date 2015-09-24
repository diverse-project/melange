package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspectStatement_AssignmentAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect;

@Aspect(className = Statement_Assignment.class)
@SuppressWarnings("all")
public class Statement_AssignmentAspect extends Statement_FunctioncallOrAssignmentAspect {
  public static void execute(final Statement_Assignment _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspectStatement_AssignmentAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspectStatement_AssignmentAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_AssignmentAspectStatement_AssignmentAspectProperties _self_, final Statement_Assignment _self, final Environment c) {
    EList<Expression> _variable = _self.getVariable();
    Expression _get = _variable.get(0);
    String variableName = ((Expression_VariableName) _get).getVariable();
    EList<Expression> _values = _self.getValues();
    Expression _get_1 = _values.get(0);
    LuaExpressionAspect.execute(_get_1, c);
    Object value = c.popValue();
    c.putVariable(((String) variableName), value);
  }
}
