package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties;
import org.eclipse.xtext.common.types.JvmFormalParameter;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectContext {
  public final static orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectContext INSTANCE = new orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectContext();
  
  public static orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties getSelf(final JvmFormalParameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmFormalParameter, orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmFormalParameter, k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties>();
  
  public Map<JvmFormalParameter, orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties> getMap() {
    return map;
  }
}
