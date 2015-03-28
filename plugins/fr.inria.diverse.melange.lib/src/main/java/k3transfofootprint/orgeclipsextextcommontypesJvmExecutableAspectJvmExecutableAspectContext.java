package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties;
import org.eclipse.xtext.common.types.JvmExecutable;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectContext {
  public final static orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectContext INSTANCE = new orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectContext();
  
  public static orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties getSelf(final JvmExecutable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmExecutable, orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmExecutable, k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties>();
  
  public Map<JvmExecutable, orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties> getMap() {
    return map;
  }
}
