package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectProperties getSelf(final JvmType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmType, orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmType, k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectProperties>();
  
  public Map<JvmType, orgeclipsextextcommontypesJvmTypeAspectJvmTypeAspectProperties> getMap() {
    return map;
  }
}
