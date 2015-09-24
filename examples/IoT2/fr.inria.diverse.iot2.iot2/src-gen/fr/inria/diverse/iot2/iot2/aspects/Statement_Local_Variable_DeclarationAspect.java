package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties;

@Aspect(className = Statement_Local_Variable_Declaration.class)
@SuppressWarnings("all")
public class Statement_Local_Variable_DeclarationAspect extends StatementAspect {
  public static void execute(final Statement_Local_Variable_Declaration _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration){
     fr.inria.diverse.iot2.iot2.aspects.Statement_Local_Variable_DeclarationAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties _self_, final Statement_Local_Variable_Declaration _self, final Environment c) {
  }
}
