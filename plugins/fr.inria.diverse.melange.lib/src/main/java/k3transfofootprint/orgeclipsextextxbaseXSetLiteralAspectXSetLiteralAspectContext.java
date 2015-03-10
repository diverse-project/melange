package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectProperties;
import org.eclipse.xtext.xbase.XSetLiteral;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectContext {
  public final static orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectContext INSTANCE = new orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectContext();
  
  public static orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectProperties getSelf(final XSetLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XSetLiteral, orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XSetLiteral, k3transfofootprint.orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectProperties>();
  
  public Map<XSetLiteral, orgeclipsextextxbaseXSetLiteralAspectXSetLiteralAspectProperties> getMap() {
    return map;
  }
}
