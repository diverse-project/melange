package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Statement_While;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_WhileAspectStatement_WhileAspectProperties;

@Aspect(className = Statement_While.class)
@SuppressWarnings("all")
public class Statement_WhileAspect extends StatementAspect {
  public static void execute(final Statement_While _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_WhileAspectStatement_WhileAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_WhileAspectStatement_WhileAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_While){
     fr.inria.diverse.iot2.iot2.aspects.Statement_WhileAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_While)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_WhileAspectStatement_WhileAspectProperties _self_, final Statement_While _self, final Environment c) {
  }
}
