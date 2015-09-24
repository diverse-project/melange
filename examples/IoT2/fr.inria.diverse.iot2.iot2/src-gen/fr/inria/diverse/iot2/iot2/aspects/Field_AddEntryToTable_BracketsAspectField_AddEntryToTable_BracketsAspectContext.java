package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets;
import fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties;

@SuppressWarnings("all")
public class Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectContext {
  public final static Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectContext INSTANCE = new Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectContext();
  
  public static Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties getSelf(final Field_AddEntryToTable_Brackets _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Field_AddEntryToTable_Brackets, Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets, fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties>();
  
  public Map<Field_AddEntryToTable_Brackets, Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties> getMap() {
    return map;
  }
}
