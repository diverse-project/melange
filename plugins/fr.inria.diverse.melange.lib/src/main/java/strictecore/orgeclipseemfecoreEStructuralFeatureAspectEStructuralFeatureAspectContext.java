package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EStructuralFeature;
import strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext {
  public final static orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext INSTANCE = new orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext();
  
  public static orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties getSelf(final EStructuralFeature _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EStructuralFeature, orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EStructuralFeature, strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties>();
  
  public Map<EStructuralFeature, orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties> getMap() {
    return map;
  }
}
