package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic;
import fr.inria.diverse.iot2.iot2.aspects.Statement_For_GenericAspectStatement_For_GenericAspectProperties;

@SuppressWarnings("all")
public class Statement_For_GenericAspectStatement_For_GenericAspectContext {
  public final static Statement_For_GenericAspectStatement_For_GenericAspectContext INSTANCE = new Statement_For_GenericAspectStatement_For_GenericAspectContext();
  
  public static Statement_For_GenericAspectStatement_For_GenericAspectProperties getSelf(final Statement_For_Generic _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_For_GenericAspectStatement_For_GenericAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_For_Generic, Statement_For_GenericAspectStatement_For_GenericAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_For_Generic, fr.inria.diverse.iot2.iot2.aspects.Statement_For_GenericAspectStatement_For_GenericAspectProperties>();
  
  public Map<Statement_For_Generic, Statement_For_GenericAspectStatement_For_GenericAspectProperties> getMap() {
    return map;
  }
}
