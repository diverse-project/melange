package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties;
import org.eclipse.xtext.common.types.JvmConstructor;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectContext {
  public final static orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectContext INSTANCE = new orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectContext();
  
  public static orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties getSelf(final JvmConstructor _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmConstructor, orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmConstructor, k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties>();
  
  public Map<JvmConstructor, orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties> getMap() {
    return map;
  }
}
