package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties;
import org.eclipse.xtext.xbase.XForLoopExpression;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectContext {
  public final static orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectContext INSTANCE = new orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectContext();
  
  public static orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties getSelf(final XForLoopExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XForLoopExpression, orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XForLoopExpression, k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties>();
  
  public Map<XForLoopExpression, orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties> getMap() {
    return map;
  }
}
