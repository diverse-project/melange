package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Block;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat;
import fr.inria.diverse.iot2.iot2.aspects.BlockAspect;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_RepeatAspectStatement_RepeatAspectProperties;

@Aspect(className = Statement_Repeat.class)
@SuppressWarnings("all")
public class Statement_RepeatAspect extends StatementAspect {
  public static void execute(final Statement_Repeat _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_RepeatAspectStatement_RepeatAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_RepeatAspectStatement_RepeatAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat){
     fr.inria.diverse.iot2.iot2.aspects.Statement_RepeatAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_Repeat)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_RepeatAspectStatement_RepeatAspectProperties _self_, final Statement_Repeat _self, final Environment c) {
    do {
      {
        Block _block = _self.getBlock();
        BlockAspect.execute(_block, c);
        Expression _expression = _self.getExpression();
        LuaExpressionAspect.execute(_expression, c);
      }
    } while((((Boolean) c.popValue())).booleanValue());
  }
}
