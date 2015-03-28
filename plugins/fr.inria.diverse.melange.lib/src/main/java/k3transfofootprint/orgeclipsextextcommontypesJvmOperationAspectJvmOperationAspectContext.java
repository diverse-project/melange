package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties;
import org.eclipse.xtext.common.types.JvmOperation;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectContext {
  public final static orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectContext INSTANCE = new orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectContext();
  
  public static orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties getSelf(final JvmOperation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmOperation, orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmOperation, k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties>();
  
  public Map<JvmOperation, orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties> getMap() {
    return map;
  }
}
