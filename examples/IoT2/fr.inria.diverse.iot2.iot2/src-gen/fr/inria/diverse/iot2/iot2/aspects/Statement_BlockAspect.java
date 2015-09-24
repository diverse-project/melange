package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Block;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_BlockAspectStatement_BlockAspectProperties;

@Aspect(className = Statement_Block.class)
@SuppressWarnings("all")
public class Statement_BlockAspect extends StatementAspect {
  public static void execute(final Statement_Block _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_BlockAspectStatement_BlockAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_BlockAspectStatement_BlockAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_Block){
     fr.inria.diverse.iot2.iot2.aspects.Statement_BlockAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_Block)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_BlockAspectStatement_BlockAspectProperties _self_, final Statement_Block _self, final Environment c) {
  }
}
