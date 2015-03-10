package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmDeclaredType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties getSelf(final JvmDeclaredType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmDeclaredType, orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmDeclaredType, k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties>();
  
  public Map<JvmDeclaredType, orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties> getMap() {
    return map;
  }
}
