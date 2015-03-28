package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeParameter;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectContext {
  public final static orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectContext INSTANCE = new orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectContext();
  
  public static orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties getSelf(final JvmTypeParameter _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmTypeParameter, orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmTypeParameter, k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties>();
  
  public Map<JvmTypeParameter, orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties> getMap() {
    return map;
  }
}
