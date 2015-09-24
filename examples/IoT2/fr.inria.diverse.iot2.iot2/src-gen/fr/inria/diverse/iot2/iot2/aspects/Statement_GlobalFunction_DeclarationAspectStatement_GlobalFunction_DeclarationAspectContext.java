package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration;
import fr.inria.diverse.iot2.iot2.aspects.Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties;

@SuppressWarnings("all")
public class Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectContext {
  public final static Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectContext INSTANCE = new Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectContext();
  
  public static Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties getSelf(final Statement_GlobalFunction_Declaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_GlobalFunction_Declaration, Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_GlobalFunction_Declaration, fr.inria.diverse.iot2.iot2.aspects.Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties>();
  
  public Map<Statement_GlobalFunction_Declaration, Statement_GlobalFunction_DeclarationAspectStatement_GlobalFunction_DeclarationAspectProperties> getMap() {
    return map;
  }
}
