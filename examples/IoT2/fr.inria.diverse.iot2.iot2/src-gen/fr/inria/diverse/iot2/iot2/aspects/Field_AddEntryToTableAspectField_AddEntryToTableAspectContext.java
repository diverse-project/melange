package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable;
import fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTableAspectField_AddEntryToTableAspectProperties;

@SuppressWarnings("all")
public class Field_AddEntryToTableAspectField_AddEntryToTableAspectContext {
  public final static Field_AddEntryToTableAspectField_AddEntryToTableAspectContext INSTANCE = new Field_AddEntryToTableAspectField_AddEntryToTableAspectContext();
  
  public static Field_AddEntryToTableAspectField_AddEntryToTableAspectProperties getSelf(final Field_AddEntryToTable _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTableAspectField_AddEntryToTableAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Field_AddEntryToTable, Field_AddEntryToTableAspectField_AddEntryToTableAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable, fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTableAspectField_AddEntryToTableAspectProperties>();
  
  public Map<Field_AddEntryToTable, Field_AddEntryToTableAspectField_AddEntryToTableAspectProperties> getMap() {
    return map;
  }
}
