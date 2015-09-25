package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties;

@Aspect(className = Statement_FunctioncallOrAssignment.class)
@SuppressWarnings("all")
public class Statement_FunctioncallOrAssignmentAspect extends StatementAspect {
  @OverrideAspectMethod
  public static void execute(final Statement_FunctioncallOrAssignment _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_And){
     fr.inria.diverse.iot2.iot2.aspects.Expression_AndAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_And)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName){
     fr.inria.diverse.iot2.iot2.aspects.Expression_VariableNameAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction){
     fr.inria.diverse.iot2.iot2.aspects.Statement_CallMemberFunctionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_CallMemberFunction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Function){
     fr.inria.diverse.iot2.iot2.aspects.Expression_FunctionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Function)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation){
     fr.inria.diverse.iot2.iot2.aspects.Expression_ConcatenationAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Concatenation)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal){
     fr.inria.diverse.iot2.iot2.aspects.Expression_Not_EqualAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Not_Equal)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction){
     fr.inria.diverse.iot2.iot2.aspects.Statement_CallFunctionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_CallFunction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Minus){
     fr.inria.diverse.iot2.iot2.aspects.Expression_MinusAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Minus)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Nil){
     fr.inria.diverse.iot2.iot2.aspects.Expression_NilAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Nil)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Plus){
     fr.inria.diverse.iot2.iot2.aspects.Expression_PlusAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Plus)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction){
     fr.inria.diverse.iot2.iot2.aspects.Expression_CallFunctionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_CallFunction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs){
     fr.inria.diverse.iot2.iot2.aspects.Expression_VarArgsAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_VarArgs)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_String){
     fr.inria.diverse.iot2.iot2.aspects.Expression_StringAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_String)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_True){
     fr.inria.diverse.iot2.iot2.aspects.Expression_TrueAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_True)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Negate){
     fr.inria.diverse.iot2.iot2.aspects.Expression_NegateAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Negate)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation){
     fr.inria.diverse.iot2.iot2.aspects.Expression_ExponentiationAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Exponentiation)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Division){
     fr.inria.diverse.iot2.iot2.aspects.Expression_DivisionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Division)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Larger){
     fr.inria.diverse.iot2.iot2.aspects.Expression_LargerAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Larger)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_False){
     fr.inria.diverse.iot2.iot2.aspects.Expression_FalseAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_False)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Or){
     fr.inria.diverse.iot2.iot2.aspects.Expression_OrAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Or)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction){
     fr.inria.diverse.iot2.iot2.aspects.Expression_CallMemberFunctionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_CallMemberFunction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication){
     fr.inria.diverse.iot2.iot2.aspects.Expression_MultiplicationAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Multiplication)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Length){
     fr.inria.diverse.iot2.iot2.aspects.Expression_LengthAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Length)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Equal){
     fr.inria.diverse.iot2.iot2.aspects.Expression_EqualAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Equal)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember){
     fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal){
     fr.inria.diverse.iot2.iot2.aspects.Expression_Smaller_EqualAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller_Equal)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Invert){
     fr.inria.diverse.iot2.iot2.aspects.Expression_InvertAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Invert)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray){
     fr.inria.diverse.iot2.iot2.aspects.Expression_AccessArrayAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_AccessArray)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor){
     fr.inria.diverse.iot2.iot2.aspects.Expression_TableConstructorAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_TableConstructor)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo){
     fr.inria.diverse.iot2.iot2.aspects.Expression_ModuloAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Modulo)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_AssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_Assignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Number){
     fr.inria.diverse.iot2.iot2.aspects.Expression_NumberAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Number)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller){
     fr.inria.diverse.iot2.iot2.aspects.Expression_SmallerAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Smaller)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal){
     fr.inria.diverse.iot2.iot2.aspects.Expression_Larger_EqualAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression_Larger_Equal)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final Statement_FunctioncallOrAssignment _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.StatementAspectStatementAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.StatementAspectStatementAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final Statement_FunctioncallOrAssignmentAspectStatement_FunctioncallOrAssignmentAspectProperties _self_, final Statement_FunctioncallOrAssignment _self, final Environment c) {
  }
}
