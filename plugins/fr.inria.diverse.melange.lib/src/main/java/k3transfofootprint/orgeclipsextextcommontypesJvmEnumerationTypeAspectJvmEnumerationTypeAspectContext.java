package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmEnumerationType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties getSelf(final JvmEnumerationType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmEnumerationType, orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmEnumerationType, k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties>();
  
  public Map<JvmEnumerationType, orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties> getMap() {
    return map;
  }
}
