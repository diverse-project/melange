package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties;
import org.eclipse.xtext.common.types.JvmFeature;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectContext {
  public final static orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectContext INSTANCE = new orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectContext();
  
  public static orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties getSelf(final JvmFeature _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmFeature, orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmFeature, k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties>();
  
  public Map<JvmFeature, orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties> getMap() {
    return map;
  }
}
