package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Functioncall_Arguments;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties;

@Aspect(className = Functioncall_Arguments.class)
@SuppressWarnings("all")
public class Functioncall_ArgumentsAspect {
  public static void execute(final Functioncall_Arguments _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final Functioncall_ArgumentsAspectFunctioncall_ArgumentsAspectProperties _self_, final Functioncall_Arguments _self, final Environment c) {
  }
}
