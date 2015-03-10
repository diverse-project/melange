package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectProperties;
import org.eclipse.xtext.common.types.JvmMember;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectContext {
  public final static orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectContext INSTANCE = new orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectContext();
  
  public static orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectProperties getSelf(final JvmMember _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmMember, orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmMember, k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectProperties>();
  
  public Map<JvmMember, orgeclipsextextcommontypesJvmMemberAspectJvmMemberAspectProperties> getMap() {
    return map;
  }
}
