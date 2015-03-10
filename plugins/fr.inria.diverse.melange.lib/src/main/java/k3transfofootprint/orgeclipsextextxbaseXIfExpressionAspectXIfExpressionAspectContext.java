package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties;
import org.eclipse.xtext.xbase.XIfExpression;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectContext {
  public final static orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectContext INSTANCE = new orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectContext();
  
  public static orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties getSelf(final XIfExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XIfExpression, orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XIfExpression, k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties>();
  
  public Map<XIfExpression, orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties> getMap() {
    return map;
  }
}
