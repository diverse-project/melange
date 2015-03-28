package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;

@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext {
  public final static orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext INSTANCE = new orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext();
  
  public static orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties getSelf(final JvmTypeParameterDeclarator _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<JvmTypeParameterDeclarator, orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.common.types.JvmTypeParameterDeclarator, k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties>();
  
  public Map<JvmTypeParameterDeclarator, orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties> getMap() {
    return map;
  }
}
