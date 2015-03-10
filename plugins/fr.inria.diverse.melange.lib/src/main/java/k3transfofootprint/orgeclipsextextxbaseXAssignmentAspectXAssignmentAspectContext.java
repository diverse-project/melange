package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties;
import org.eclipse.xtext.xbase.XAssignment;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectContext {
  public final static orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectContext INSTANCE = new orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectContext();
  
  public static orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties getSelf(final XAssignment _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XAssignment, orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XAssignment, k3transfofootprint.orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties>();
  
  public Map<XAssignment, orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties> getMap() {
    return map;
  }
}
