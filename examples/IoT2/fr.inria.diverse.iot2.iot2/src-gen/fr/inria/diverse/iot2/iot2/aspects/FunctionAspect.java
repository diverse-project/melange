package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.FunctionAspectFunctionAspectProperties;

@Aspect(className = Function.class)
@SuppressWarnings("all")
public class FunctionAspect {
  public static void execute(final Function _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.FunctionAspectFunctionAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.FunctionAspectFunctionAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final FunctionAspectFunctionAspectProperties _self_, final Function _self, final Environment c) {
  }
}
