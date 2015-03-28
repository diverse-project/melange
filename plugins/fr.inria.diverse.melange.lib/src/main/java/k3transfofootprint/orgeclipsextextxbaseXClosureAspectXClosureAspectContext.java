package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXClosureAspectXClosureAspectProperties;
import org.eclipse.xtext.xbase.XClosure;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXClosureAspectXClosureAspectContext {
  public final static orgeclipsextextxbaseXClosureAspectXClosureAspectContext INSTANCE = new orgeclipsextextxbaseXClosureAspectXClosureAspectContext();
  
  public static orgeclipsextextxbaseXClosureAspectXClosureAspectProperties getSelf(final XClosure _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXClosureAspectXClosureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XClosure, orgeclipsextextxbaseXClosureAspectXClosureAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XClosure, k3transfofootprint.orgeclipsextextxbaseXClosureAspectXClosureAspectProperties>();
  
  public Map<XClosure, orgeclipsextextxbaseXClosureAspectXClosureAspectProperties> getMap() {
    return map;
  }
}
