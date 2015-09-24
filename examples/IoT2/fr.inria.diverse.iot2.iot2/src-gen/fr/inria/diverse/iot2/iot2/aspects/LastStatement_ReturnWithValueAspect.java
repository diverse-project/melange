package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.iot2.Expression;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspect;
import fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.LuaExpressionAspect;

@Aspect(className = LastStatement_ReturnWithValue.class)
@SuppressWarnings("all")
public class LastStatement_ReturnWithValueAspect extends LastStatement_ReturnAspect {
  public static void execute(final LastStatement_ReturnWithValue _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue){
     fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnWithValueAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.LastStatement_ReturnWithValue)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return){
     fr.inria.diverse.iot2.iot2.aspects.LastStatement_ReturnAspect.execute((fr.inria.diverse.iot2.iot2.iot2.LastStatement_Return)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.LastStatement){
     fr.inria.diverse.iot2.iot2.aspects.LastStatementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.LastStatement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final LastStatement_ReturnWithValueAspectLastStatement_ReturnWithValueAspectProperties _self_, final LastStatement_ReturnWithValue _self, final Environment c) {
    EList<Expression> _returnValues = _self.getReturnValues();
    final Consumer<Expression> _function = (Expression e) -> {
      LuaExpressionAspect.execute(e, c);
    };
    _returnValues.forEach(_function);
  }
}
