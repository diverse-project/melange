package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement;
import fr.inria.diverse.iot2.iot2.aspects.StatementAspectStatementAspectProperties;

@SuppressWarnings("all")
public class StatementAspectStatementAspectContext {
  public final static StatementAspectStatementAspectContext INSTANCE = new StatementAspectStatementAspectContext();
  
  public static StatementAspectStatementAspectProperties getSelf(final Statement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.StatementAspectStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement, StatementAspectStatementAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement, fr.inria.diverse.iot2.iot2.aspects.StatementAspectStatementAspectProperties>();
  
  public Map<Statement, StatementAspectStatementAspectProperties> getMap() {
    return map;
  }
}
