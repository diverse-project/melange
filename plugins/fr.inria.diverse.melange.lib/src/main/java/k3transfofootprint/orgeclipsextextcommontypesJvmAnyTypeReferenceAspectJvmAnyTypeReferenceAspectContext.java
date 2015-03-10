package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties getSelf(final JvmAnyTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmAnyTypeReference, orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmAnyTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties>();
  
  public Map<JvmAnyTypeReference, orgeclipsextextcommontypesJvmAnyTypeReferenceAspectJvmAnyTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
