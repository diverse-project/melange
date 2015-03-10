package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeConstraint;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectContext {
  public final static orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectContext INSTANCE = new orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectContext();
  
  public static orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties getSelf(final JvmTypeConstraint _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmTypeConstraint, orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmTypeConstraint, k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties>();
  
  public Map<JvmTypeConstraint, orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties> getMap() {
    return map;
  }
}
