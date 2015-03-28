package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties;
import org.eclipse.xtext.xbase.XCasePart;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXCasePartAspectXCasePartAspectContext {
  public final static orgeclipsextextxbaseXCasePartAspectXCasePartAspectContext INSTANCE = new orgeclipsextextxbaseXCasePartAspectXCasePartAspectContext();
  
  public static orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties getSelf(final XCasePart _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XCasePart, orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XCasePart, k3transfofootprint.orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties>();
  
  public Map<XCasePart, orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties> getMap() {
    return map;
  }
}
