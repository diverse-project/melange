package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectProperties;
import org.eclipse.xtext.xbase.XCollectionLiteral;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectContext {
  public final static orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectContext INSTANCE = new orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectContext();
  
  public static orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectProperties getSelf(final XCollectionLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XCollectionLiteral, orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XCollectionLiteral, k3transfofootprint.orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectProperties>();
  
  public Map<XCollectionLiteral, orgeclipsextextxbaseXCollectionLiteralAspectXCollectionLiteralAspectProperties> getMap() {
    return map;
  }
}
