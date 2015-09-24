package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration;
import fr.inria.diverse.iot2.iot2.aspects.Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectProperties;

@SuppressWarnings("all")
public class Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectContext {
  public final static Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectContext INSTANCE = new Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectContext();
  
  public static Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectProperties getSelf(final Statement_LocalFunction_Declaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_LocalFunction_Declaration, Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_LocalFunction_Declaration, fr.inria.diverse.iot2.iot2.aspects.Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectProperties>();
  
  public Map<Statement_LocalFunction_Declaration, Statement_LocalFunction_DeclarationAspectStatement_LocalFunction_DeclarationAspectProperties> getMap() {
    return map;
  }
}
