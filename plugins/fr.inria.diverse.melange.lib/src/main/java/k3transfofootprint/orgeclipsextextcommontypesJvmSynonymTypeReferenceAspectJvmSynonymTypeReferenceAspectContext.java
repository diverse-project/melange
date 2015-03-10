package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmSynonymTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties getSelf(final JvmSynonymTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmSynonymTypeReference, orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmSynonymTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties>();
  
  public Map<JvmSynonymTypeReference, orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
