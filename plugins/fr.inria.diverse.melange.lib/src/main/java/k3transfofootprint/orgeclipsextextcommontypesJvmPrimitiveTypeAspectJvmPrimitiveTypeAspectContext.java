package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmPrimitiveType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties getSelf(final JvmPrimitiveType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmPrimitiveType, orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmPrimitiveType, k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties>();
  
  public Map<JvmPrimitiveType, orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties> getMap() {
    return map;
  }
}
