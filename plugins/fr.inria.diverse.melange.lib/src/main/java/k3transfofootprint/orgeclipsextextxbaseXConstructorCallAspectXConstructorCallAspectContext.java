package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties;
import org.eclipse.xtext.xbase.XConstructorCall;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectContext {
  public final static orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectContext INSTANCE = new orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectContext();
  
  public static orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties getSelf(final XConstructorCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XConstructorCall, orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XConstructorCall, k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties>();
  
  public Map<XConstructorCall, orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties> getMap() {
    return map;
  }
}
