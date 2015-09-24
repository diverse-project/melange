package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable;
import fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties;

@SuppressWarnings("all")
public class Field_AppendEntryToTableAspectField_AppendEntryToTableAspectContext {
  public final static Field_AppendEntryToTableAspectField_AppendEntryToTableAspectContext INSTANCE = new Field_AppendEntryToTableAspectField_AppendEntryToTableAspectContext();
  
  public static Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties getSelf(final Field_AppendEntryToTable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Field_AppendEntryToTable, Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable, fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties>();
  
  public Map<Field_AppendEntryToTable, Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties> getMap() {
    return map;
  }
}
