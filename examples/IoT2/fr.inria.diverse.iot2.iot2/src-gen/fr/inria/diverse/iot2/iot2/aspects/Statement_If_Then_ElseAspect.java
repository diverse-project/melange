package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else;
import fr.inria.diverse.iot2.iot2.aspects.BlockAspect;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties;

@Aspect(className = Statement_If_Then_Else.class)
@SuppressWarnings("all")
public class Statement_If_Then_ElseAspect extends StatementAspect {
  public static void execute(final Statement_If_Then_Else _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else){
     fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_ElseAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_If_Then_ElseAspectStatement_If_Then_ElseAspectProperties _self_, final Statement_If_Then_Else _self, final Environment c) {
    Expression _ifExpression = _self.getIfExpression();
    LuaExpressionAspect.execute(_ifExpression, c);
    Object _popValue = c.popValue();
    if ((((Boolean) _popValue)).booleanValue()) {
      Block _ifBlock = _self.getIfBlock();
      BlockAspect.execute(_ifBlock, c);
    } else {
      Block _elseBlock = _self.getElseBlock();
      BlockAspect.execute(_elseBlock, c);
    }
  }
}
