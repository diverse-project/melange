package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmMultiTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties getSelf(final JvmMultiTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmMultiTypeReference, orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmMultiTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties>();
  
  public Map<JvmMultiTypeReference, orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
