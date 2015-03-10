package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties;
import org.eclipse.xtext.xbase.XCastedExpression;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectContext {
  public final static orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectContext INSTANCE = new orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectContext();
  
  public static orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties getSelf(final XCastedExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XCastedExpression, orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XCastedExpression, k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties>();
  
  public Map<XCastedExpression, orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties> getMap() {
    return map;
  }
}
