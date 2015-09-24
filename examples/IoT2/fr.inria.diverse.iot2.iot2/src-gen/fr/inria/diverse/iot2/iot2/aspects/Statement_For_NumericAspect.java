package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_For_NumericAspectStatement_For_NumericAspectProperties;

@Aspect(className = Statement_For_Numeric.class)
@SuppressWarnings("all")
public class Statement_For_NumericAspect extends StatementAspect {
  public static void execute(final Statement_For_Numeric _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_For_NumericAspectStatement_For_NumericAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_For_NumericAspectStatement_For_NumericAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric){
     fr.inria.diverse.iot2.iot2.aspects.Statement_For_NumericAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_For_Numeric)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_For_NumericAspectStatement_For_NumericAspectProperties _self_, final Statement_For_Numeric _self, final Environment c) {
  }
}
