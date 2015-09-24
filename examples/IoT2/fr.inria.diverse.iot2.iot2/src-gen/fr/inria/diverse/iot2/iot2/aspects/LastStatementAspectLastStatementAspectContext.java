package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.LastStatement;
import fr.inria.diverse.iot2.iot2.aspects.LastStatementAspectLastStatementAspectProperties;

@SuppressWarnings("all")
public class LastStatementAspectLastStatementAspectContext {
  public final static LastStatementAspectLastStatementAspectContext INSTANCE = new LastStatementAspectLastStatementAspectContext();
  
  public static LastStatementAspectLastStatementAspectProperties getSelf(final LastStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.LastStatementAspectLastStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<LastStatement, LastStatementAspectLastStatementAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.LastStatement, fr.inria.diverse.iot2.iot2.aspects.LastStatementAspectLastStatementAspectProperties>();
  
  public Map<LastStatement, LastStatementAspectLastStatementAspectProperties> getMap() {
    return map;
  }
}
