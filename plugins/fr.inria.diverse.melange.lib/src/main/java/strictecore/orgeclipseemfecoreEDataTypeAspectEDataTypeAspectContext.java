package strictecore;

import java.util.Map;
import org.eclipse.emf.ecore.EDataType;
import strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties;

@SuppressWarnings("all")
public class orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext {
  public final static orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext INSTANCE = new orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext();
  
  public static orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties getSelf(final EDataType _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<EDataType, orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties> map = new java.util.HashMap<org.eclipse.emf.ecore.EDataType, strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties>();
  
  public Map<EDataType, orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties> getMap() {
    return map;
  }
}
