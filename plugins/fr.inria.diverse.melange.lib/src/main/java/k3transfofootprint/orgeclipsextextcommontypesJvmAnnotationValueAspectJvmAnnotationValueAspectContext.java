package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties;
import org.eclipse.xtext.common.types.JvmAnnotationValue;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectContext {
  public final static orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectContext INSTANCE = new orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectContext();
  
  public static orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties getSelf(final JvmAnnotationValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmAnnotationValue, orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmAnnotationValue, k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties>();
  
  public Map<JvmAnnotationValue, orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties> getMap() {
    return map;
  }
}
