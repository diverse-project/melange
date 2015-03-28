package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties;
import org.eclipse.xtext.xbase.XStringLiteral;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectContext {
  public final static orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectContext INSTANCE = new orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectContext();
  
  public static orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties getSelf(final XStringLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XStringLiteral, orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XStringLiteral, k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties>();
  
  public Map<XStringLiteral, orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties> getMap() {
    return map;
  }
}
