package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectProperties;
import org.eclipse.xtext.xbase.XUnaryOperation;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectContext {
  public final static orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectContext INSTANCE = new orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectContext();
  
  public static orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectProperties getSelf(final XUnaryOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XUnaryOperation, orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XUnaryOperation, k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectProperties>();
  
  public Map<XUnaryOperation, orgeclipsextextxbaseXUnaryOperationAspectXUnaryOperationAspectProperties> getMap() {
    return map;
  }
}
