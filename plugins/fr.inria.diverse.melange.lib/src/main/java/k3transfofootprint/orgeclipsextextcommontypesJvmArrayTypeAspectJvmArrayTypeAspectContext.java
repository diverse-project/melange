package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmArrayType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties getSelf(final JvmArrayType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmArrayType, orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmArrayType, k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties>();
  
  public Map<JvmArrayType, orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties> getMap() {
    return map;
  }
}
