package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectProperties;
import org.eclipse.xtext.xbase.XListLiteral;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectContext {
  public final static orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectContext INSTANCE = new orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectContext();
  
  public static orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectProperties getSelf(final XListLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XListLiteral, orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XListLiteral, k3transfofootprint.orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectProperties>();
  
  public Map<XListLiteral, orgeclipsextextxbaseXListLiteralAspectXListLiteralAspectProperties> getMap() {
    return map;
  }
}
