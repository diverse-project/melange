package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties;
import org.eclipse.xtext.xbase.XBlockExpression;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectContext {
  public final static orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectContext INSTANCE = new orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectContext();
  
  public static orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties getSelf(final XBlockExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XBlockExpression, orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XBlockExpression, k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties>();
  
  public Map<XBlockExpression, orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties> getMap() {
    return map;
  }
}
