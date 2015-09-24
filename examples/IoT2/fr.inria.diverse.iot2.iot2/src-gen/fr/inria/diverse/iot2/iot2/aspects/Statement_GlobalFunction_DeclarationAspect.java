package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.iot2.Function;
import fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties;

@Aspect(className = Statement_GlobalFunction_Declaration.class)
@SuppressWarnings("all")
public class Statement_GlobalFunction_DeclarationAspect extends StatementAspect {
  public static void execute(final Statement_GlobalFunction_Declaration _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration){
     fr.inria.diverse.iot2.iot2.aspects.Statement_GlobalFunction_DeclarationAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Statement){
     fr.inria.diverse.iot2.iot2.aspects.StatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Statement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties _self_, final Statement_GlobalFunction_Declaration _self, final Environment c) {
    EList<String> _prefix = _self.getPrefix();
    String _get = _prefix.get(0);
    Function _function = _self.getFunction();
    c.putFunction(_get, _function);
  }
}
