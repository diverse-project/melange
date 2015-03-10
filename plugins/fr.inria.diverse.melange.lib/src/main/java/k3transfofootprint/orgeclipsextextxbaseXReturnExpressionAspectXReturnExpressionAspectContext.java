package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties;
import org.eclipse.xtext.xbase.XReturnExpression;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectContext {
  public final static orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectContext INSTANCE = new orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectContext();
  
  public static orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties getSelf(final XReturnExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XReturnExpression, orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XReturnExpression, k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties>();
  
  public Map<XReturnExpression, orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties> getMap() {
    return map;
  }
}
