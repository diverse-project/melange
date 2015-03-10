package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties;
import org.eclipse.xtext.xbase.XExpression;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXExpressionAspectXExpressionAspectContext {
  public final static orgeclipsextextxbaseXExpressionAspectXExpressionAspectContext INSTANCE = new orgeclipsextextxbaseXExpressionAspectXExpressionAspectContext();
  
  public static orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties getSelf(final XExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XExpression, orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XExpression, k3transfofootprint.orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties>();
  
  public Map<XExpression, orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties> getMap() {
    return map;
  }
}
