package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LastStatementAspectLastStatementAspectProperties;

@Aspect(className = LastStatement.class)
@SuppressWarnings("all")
public class LastStatementAspect {
  public static void execute(final LastStatement _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.LastStatementAspectLastStatementAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.LastStatementAspectLastStatementAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue){
     fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspect.execute((fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return){
     fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspect.execute((fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement){
     fr.inria.diverse.iot2.iot2.aspects.LastStatementAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.LastStatement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final LastStatementAspectLastStatementAspectProperties _self_, final LastStatement _self, final Environment c) {
  }
}
