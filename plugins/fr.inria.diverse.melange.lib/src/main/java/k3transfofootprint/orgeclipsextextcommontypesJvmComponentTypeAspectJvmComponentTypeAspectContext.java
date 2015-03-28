package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmComponentType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties getSelf(final JvmComponentType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmComponentType, orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmComponentType, k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties>();
  
  public Map<JvmComponentType, orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties> getMap() {
    return map;
  }
}
