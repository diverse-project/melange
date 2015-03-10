package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties;
import org.eclipse.xtext.xbase.XMemberFeatureCall;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectContext {
  public final static orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectContext INSTANCE = new orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectContext();
  
  public static orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties getSelf(final XMemberFeatureCall _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XMemberFeatureCall, orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XMemberFeatureCall, k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties>();
  
  public Map<XMemberFeatureCall, orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties> getMap() {
    return map;
  }
}
