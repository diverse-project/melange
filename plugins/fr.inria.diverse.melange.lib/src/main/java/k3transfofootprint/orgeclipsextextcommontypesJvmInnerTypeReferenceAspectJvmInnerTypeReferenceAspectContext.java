package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties getSelf(final JvmInnerTypeReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmInnerTypeReference, orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmInnerTypeReference, k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties>();
  
  public Map<JvmInnerTypeReference, orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties> getMap() {
    return map;
  }
}
