package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmUnknownTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties getSelf(final JvmUnknownTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmUnknownTypeReference, orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmUnknownTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties>();
  
  public Map<JvmUnknownTypeReference, orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
