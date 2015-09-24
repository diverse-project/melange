package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Statement_If_Then_Else_ElseIfPart;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties;

@Aspect(className = Statement_If_Then_Else_ElseIfPart.class)
@SuppressWarnings("all")
public class Statement_If_Then_Else_ElseIfPartAspect {
  public static void execute(final Statement_If_Then_Else_ElseIfPart _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectContext.getSelf(_self);
    _privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final Statement_If_Then_Else_ElseIfPartAspectStatement_If_Then_Else_ElseIfPartAspectProperties _self_, final Statement_If_Then_Else_ElseIfPart _self, final Environment c) {
  }
}
