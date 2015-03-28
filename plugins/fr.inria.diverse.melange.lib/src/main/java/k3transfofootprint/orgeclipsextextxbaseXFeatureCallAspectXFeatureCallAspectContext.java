package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties;
import org.eclipse.xtext.xbase.XFeatureCall;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectContext {
  public final static orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectContext INSTANCE = new orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectContext();
  
  public static orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties getSelf(final XFeatureCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XFeatureCall, orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XFeatureCall, k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties>();
  
  public Map<XFeatureCall, orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties> getMap() {
    return map;
  }
}
