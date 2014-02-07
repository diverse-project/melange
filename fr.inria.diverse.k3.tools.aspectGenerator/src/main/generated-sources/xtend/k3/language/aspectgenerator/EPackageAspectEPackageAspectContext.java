package k3.language.aspectgenerator;

import java.util.Map;
import k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties;
import org.eclipse.emf.ecore.EPackage;

@SuppressWarnings("all")
public class EPackageAspectEPackageAspectContext {
  public final static EPackageAspectEPackageAspectContext INSTANCE = new EPackageAspectEPackageAspectContext();
  
  public static EPackageAspectEPackageAspectContext getInstance() {
    return INSTANCE;
  }
  
  private Map<EPackage,EPackageAspectEPackageAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EPackage, k3.language.aspectgenerator.EPackageAspectEPackageAspectProperties>();
  
  public Map<EPackage,EPackageAspectEPackageAspectProperties> getMap() {
    return map;
  }
}
