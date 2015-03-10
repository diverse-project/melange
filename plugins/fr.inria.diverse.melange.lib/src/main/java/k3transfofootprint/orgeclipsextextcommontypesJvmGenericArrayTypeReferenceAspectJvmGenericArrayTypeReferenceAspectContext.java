package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties getSelf(final JvmGenericArrayTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmGenericArrayTypeReference, orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmGenericArrayTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties>();
  
  public Map<JvmGenericArrayTypeReference, orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
