package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EPackage;
import strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEPackageAspectEPackageAspectContext {
  public final static orgeclipseemfecoreEPackageAspectEPackageAspectContext INSTANCE = new orgeclipseemfecoreEPackageAspectEPackageAspectContext();
  
  public static orgeclipseemfecoreEPackageAspectEPackageAspectProperties getSelf(final EPackage _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EPackage, orgeclipseemfecoreEPackageAspectEPackageAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EPackage, strictecore.orgeclipseemfecoreEPackageAspectEPackageAspectProperties>();
  
  public Map<EPackage, orgeclipseemfecoreEPackageAspectEPackageAspectProperties> getMap() {
    return map;
  }
}
