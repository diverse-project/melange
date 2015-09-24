package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration;
import fr.inria.diverse.iot2.iot2.aspects.Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties;

@SuppressWarnings("all")
public class Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectContext {
  public final static Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectContext INSTANCE = new Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectContext();
  
  public static Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties getSelf(final Statement_Local_Variable_Declaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_Local_Variable_Declaration, Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_Local_Variable_Declaration, fr.inria.diverse.iot2.iot2.aspects.Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties>();
  
  public Map<Statement_Local_Variable_Declaration, Statement_Local_Variable_DeclarationAspectStatement_Local_Variable_DeclarationAspectProperties> getMap() {
    return map;
  }
}
