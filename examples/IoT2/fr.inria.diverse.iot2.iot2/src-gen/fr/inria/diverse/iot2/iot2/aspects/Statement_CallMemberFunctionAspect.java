package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect;

@Aspect(className = Statement_CallMemberFunction.class)
@SuppressWarnings("all")
public class Statement_CallMemberFunctionAspect extends Statement_FunctioncallOrAssignmentAspect {
  public static void execute(final Statement_CallMemberFunction _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction){
     fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_CallMemberFunctionAspectStatement_CallMemberFunctionAspectProperties _self_, final Statement_CallMemberFunction _self, final Environment c) {
  }
}
