package k3transfofootprint;

import java.util.Map;
import k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties;
import org.eclipse.xtext.xbase.XVariableDeclaration;

@SuppressWarnings("all")
public class orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectContext {
  public final static orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectContext INSTANCE = new orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectContext();
  
  public static orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties getSelf(final XVariableDeclaration _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<XVariableDeclaration, orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties> map = new java.util.HashMap<org.eclipse.xtext.xbase.XVariableDeclaration, k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties>();
  
  public Map<XVariableDeclaration, orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties> getMap() {
    return map;
  }
}
