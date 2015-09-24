package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Statement_Block;
import fr.inria.diverse.iot2.iot2.aspects.Statement_BlockAspectStatement_BlockAspectProperties;

@SuppressWarnings("all")
public class Statement_BlockAspectStatement_BlockAspectContext {
  public final static Statement_BlockAspectStatement_BlockAspectContext INSTANCE = new Statement_BlockAspectStatement_BlockAspectContext();
  
  public static Statement_BlockAspectStatement_BlockAspectProperties getSelf(final Statement_Block _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Statement_BlockAspectStatement_BlockAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Statement_Block, Statement_BlockAspectStatement_BlockAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Statement_Block, fr.inria.diverse.iot2.iot2.aspects.Statement_BlockAspectStatement_BlockAspectProperties>();
  
  public Map<Statement_Block, Statement_BlockAspectStatement_BlockAspectProperties> getMap() {
    return map;
  }
}
