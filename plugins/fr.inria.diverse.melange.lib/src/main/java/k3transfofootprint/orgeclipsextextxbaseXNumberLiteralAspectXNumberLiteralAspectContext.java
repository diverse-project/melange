package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectProperties;
import org.eclipse.xtext.xbase.XNumberLiteral;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectContext {
  public final static orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectContext INSTANCE = new orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectContext();
  
  public static orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectProperties getSelf(final XNumberLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XNumberLiteral, orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XNumberLiteral, k3transfofootprint.orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectProperties>();
  
  public Map<XNumberLiteral, orgeclipsextextxbaseXNumberLiteralAspectXNumberLiteralAspectProperties> getMap() {
    return map;
  }
}
