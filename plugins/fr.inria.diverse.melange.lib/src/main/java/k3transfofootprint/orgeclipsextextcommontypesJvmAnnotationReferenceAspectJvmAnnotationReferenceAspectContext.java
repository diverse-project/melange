package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmAnnotationReference;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext {
  public final static orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext INSTANCE = new orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext();
  
  public static orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties getSelf(final JvmAnnotationReference _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmAnnotationReference, orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmAnnotationReference, k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties>();
  
  public Map<JvmAnnotationReference, orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties> getMap() {
    return map;
  }
}
