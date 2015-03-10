package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties;
import org.eclipse.xtext.xbase.XBinaryOperation;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectContext {
  public final static orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectContext INSTANCE = new orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectContext();
  
  public static orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties getSelf(final XBinaryOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XBinaryOperation, orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XBinaryOperation, k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties>();
  
  public Map<XBinaryOperation, orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties> getMap() {
    return map;
  }
}
