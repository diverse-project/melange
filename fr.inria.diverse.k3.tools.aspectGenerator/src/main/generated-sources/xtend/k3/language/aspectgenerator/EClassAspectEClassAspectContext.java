package k3.language.aspectgenerator;

import java.util.Map;
import k3.language.aspectgenerator.EClassAspectEClassAspectProperties;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("all")
public class EClassAspectEClassAspectContext {
  public final static EClassAspectEClassAspectContext INSTANCE = new EClassAspectEClassAspectContext();
  
  public static EClassAspectEClassAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EClass,EClassAspectEClassAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EClass, k3.language.aspectgenerator.EClassAspectEClassAspectProperties>();
  
  public Map<EClass,EClassAspectEClassAspectProperties> getMap() {
    return map;
  }
}
