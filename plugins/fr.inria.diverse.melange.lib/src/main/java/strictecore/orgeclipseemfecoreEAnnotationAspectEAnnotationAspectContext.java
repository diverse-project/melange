package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EAnnotation;
import strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext {
  public final static orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext INSTANCE = new orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext();
  
  public static orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties getSelf(final EAnnotation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EAnnotation, orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EAnnotation, strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties>();
  
  public Map<EAnnotation, orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties> getMap() {
    return map;
  }
}
