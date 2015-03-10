package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectContext {
  public final static orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectContext INSTANCE = new orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectContext();
  
  public static orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties getSelf(final XAbstractFeatureCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XAbstractFeatureCall, orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XAbstractFeatureCall, k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties>();
  
  public Map<XAbstractFeatureCall, orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties> getMap() {
    return map;
  }
}
