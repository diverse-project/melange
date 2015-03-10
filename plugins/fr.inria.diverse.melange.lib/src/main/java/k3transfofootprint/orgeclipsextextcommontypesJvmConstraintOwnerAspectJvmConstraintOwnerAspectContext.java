package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties;
import org.eclipse.xtext.common.types.JvmConstraintOwner;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectContext {
  public final static orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectContext INSTANCE = new orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectContext();
  
  public static orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties getSelf(final JvmConstraintOwner _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmConstraintOwner, orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmConstraintOwner, k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties>();
  
  public Map<JvmConstraintOwner, orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties> getMap() {
    return map;
  }
}
