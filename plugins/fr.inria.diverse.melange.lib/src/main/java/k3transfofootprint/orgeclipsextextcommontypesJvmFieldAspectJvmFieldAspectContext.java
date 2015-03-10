package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectProperties;
import org.eclipse.xtext.common.types.JvmField;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectContext {
  public final static orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectContext INSTANCE = new orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectContext();
  
  public static orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectProperties getSelf(final JvmField _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmField, orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmField, k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectProperties>();
  
  public Map<JvmField, orgeclipsextextcommontypesJvmFieldAspectJvmFieldAspectProperties> getMap() {
    return map;
  }
}
