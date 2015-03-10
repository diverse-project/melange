package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties getSelf(final JvmTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmTypeReference, orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties>();
  
  public Map<JvmTypeReference, orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
