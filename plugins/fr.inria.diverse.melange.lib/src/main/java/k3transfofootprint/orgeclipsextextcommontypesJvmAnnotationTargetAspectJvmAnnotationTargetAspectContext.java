package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectContext {
  public final static orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectContext INSTANCE = new orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectContext();
  
  public static orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties getSelf(final JvmAnnotationTarget _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmAnnotationTarget, orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmAnnotationTarget, k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties>();
  
  public Map<JvmAnnotationTarget, orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties> getMap() {
    return map;
  }
}
