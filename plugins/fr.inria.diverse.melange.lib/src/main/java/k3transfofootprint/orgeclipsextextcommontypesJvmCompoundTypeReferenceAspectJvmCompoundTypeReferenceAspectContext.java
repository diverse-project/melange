package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmCompoundTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties getSelf(final JvmCompoundTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmCompoundTypeReference, orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmCompoundTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties>();
  
  public Map<JvmCompoundTypeReference, orgeclipsextextcommontypesJvmCompoundTypeReferenceAspectJvmCompoundTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
