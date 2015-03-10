package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmAnnotationType;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectContext {
  public final static orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectContext INSTANCE = new orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectContext();
  
  public static orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties getSelf(final JvmAnnotationType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmAnnotationType, orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmAnnotationType, k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties>();
  
  public Map<JvmAnnotationType, orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties> getMap() {
    return map;
  }
}
