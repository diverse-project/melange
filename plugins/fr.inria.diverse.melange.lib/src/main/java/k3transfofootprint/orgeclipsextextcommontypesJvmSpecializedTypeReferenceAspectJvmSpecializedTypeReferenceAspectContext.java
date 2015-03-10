package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmSpecializedTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties getSelf(final JvmSpecializedTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmSpecializedTypeReference, orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmSpecializedTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties>();
  
  public Map<JvmSpecializedTypeReference, orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
