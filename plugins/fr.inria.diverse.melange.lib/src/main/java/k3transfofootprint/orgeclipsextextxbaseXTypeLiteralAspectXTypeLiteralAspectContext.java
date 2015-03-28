package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectProperties;
import org.eclipse.xtext.xbase.XTypeLiteral;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectContext {
  public final static orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectContext INSTANCE = new orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectContext();
  
  public static orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectProperties getSelf(final XTypeLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XTypeLiteral, orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XTypeLiteral, k3transfofootprint.orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectProperties>();
  
  public Map<XTypeLiteral, orgeclipsextextxbaseXTypeLiteralAspectXTypeLiteralAspectProperties> getMap() {
    return map;
  }
}
