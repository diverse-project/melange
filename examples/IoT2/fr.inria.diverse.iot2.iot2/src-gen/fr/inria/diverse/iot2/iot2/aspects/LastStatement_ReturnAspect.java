package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LastStatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspectLastStatement_ReturnAspectProperties;

@Aspect(className = LastStatement_Return.class)
@SuppressWarnings("all")
public class LastStatement_ReturnAspect extends LastStatementAspect {
  public static void execute(final LastStatement_Return _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspectLastStatement_ReturnAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspectLastStatement_ReturnAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue){
     fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspect.execute((fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return){
     fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement){
     fr.inria.diverse.iot2.iot2.aspects.LastStatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.LastStatement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final LastStatement_ReturnAspectLastStatement_ReturnAspectProperties _self_, final LastStatement_Return _self, final Environment c) {
  }
}
