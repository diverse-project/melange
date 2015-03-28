package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties;
import org.eclipse.xtext.xbase.XPostfixOperation;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectContext {
  public final static orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectContext INSTANCE = new orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectContext();
  
  public static orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties getSelf(final XPostfixOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XPostfixOperation, orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XPostfixOperation, k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties>();
  
  public Map<XPostfixOperation, orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties> getMap() {
    return map;
  }
}
