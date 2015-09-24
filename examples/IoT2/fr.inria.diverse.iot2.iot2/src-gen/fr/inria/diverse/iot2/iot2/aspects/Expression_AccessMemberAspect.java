package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.Scanner;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember;
import fr.inria.diverse.iot2.iot2.iot2.Expression_VariableName;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspectExpression_AccessMemberAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = Expression_AccessMember.class)
@SuppressWarnings("all")
public class Expression_AccessMemberAspect extends LuaExpressionAspect {
  public static void execute(final Expression_AccessMember _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspectExpression_AccessMemberAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspectExpression_AccessMemberAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember){
     fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Expression){
     fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Expression)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment){
     fr.inria.diverse.iot2.iot2.aspects.Statement_FunctioncallOrAssignmentAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement_FunctioncallOrAssignment)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Expression_AccessMemberAspectExpression_AccessMemberAspectProperties _self_, final Expression_AccessMember _self, final Environment c) {
    String _memberName = _self.getMemberName();
    boolean _equals = _memberName.equals("read");
    if (_equals) {
      Expression x = _self.getObject();
      boolean _matched = false;
      if (!_matched) {
        if (x instanceof Expression_VariableName) {
          String _variable = ((Expression_VariableName)x).getVariable();
          boolean _equals_1 = _variable.equals("io");
          if (_equals_1) {
            _matched=true;
            Scanner scanIn = new Scanner(System.in);
            String in = scanIn.nextLine();
            scanIn.close();
            c.pushValue(in);
          }
        }
      }
    }
  }
}
