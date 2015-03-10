package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties;
import org.eclipse.xtext.xbase.XSynchronizedExpression;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectContext {
  public final static orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectContext INSTANCE = new orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectContext();
  
  public static orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties getSelf(final XSynchronizedExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XSynchronizedExpression, orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XSynchronizedExpression, k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties>();
  
  public Map<XSynchronizedExpression, orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties> getMap() {
    return map;
  }
}
