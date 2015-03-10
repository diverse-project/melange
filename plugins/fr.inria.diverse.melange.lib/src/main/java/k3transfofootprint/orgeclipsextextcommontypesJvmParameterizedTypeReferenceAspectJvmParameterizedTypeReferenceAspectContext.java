package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties getSelf(final JvmParameterizedTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmParameterizedTypeReference, orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties>();
  
  public Map<JvmParameterizedTypeReference, orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
