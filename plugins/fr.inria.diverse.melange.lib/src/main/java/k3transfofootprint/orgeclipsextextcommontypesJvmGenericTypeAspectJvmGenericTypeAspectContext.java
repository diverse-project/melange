package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmGenericType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties getSelf(final JvmGenericType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmGenericType, orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmGenericType, k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties>();
  
  public Map<JvmGenericType, orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties> getMap() {
    return map;
  }
}
