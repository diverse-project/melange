package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EEnumLiteral;
import strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext {
  public final static orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext INSTANCE = new orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext();
  
  public static orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties getSelf(final EEnumLiteral _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EEnumLiteral, orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EEnumLiteral, strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties>();
  
  public Map<EEnumLiteral, orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties> getMap() {
    return map;
  }
}
