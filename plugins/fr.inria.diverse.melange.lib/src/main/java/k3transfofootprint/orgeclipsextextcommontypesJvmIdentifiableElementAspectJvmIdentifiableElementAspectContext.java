package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectContext {
  public final static orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectContext INSTANCE = new orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectContext();
  
  public static orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties getSelf(final JvmIdentifiableElement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmIdentifiableElement, orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmIdentifiableElement, k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties>();
  
  public Map<JvmIdentifiableElement, orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties> getMap() {
    return map;
  }
}
