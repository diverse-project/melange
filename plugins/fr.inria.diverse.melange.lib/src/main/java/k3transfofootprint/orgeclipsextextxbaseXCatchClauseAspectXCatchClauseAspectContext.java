package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties;
import org.eclipse.xtext.xbase.XCatchClause;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectContext {
  public final static orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectContext INSTANCE = new orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectContext();
  
  public static orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties getSelf(final XCatchClause _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XCatchClause, orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XCatchClause, k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties>();
  
  public Map<XCatchClause, orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties> getMap() {
    return map;
  }
}
