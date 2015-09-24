package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.FieldAspect;
import fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties;

@Aspect(className = Field_AddEntryToTable_Brackets.class)
@SuppressWarnings("all")
public class Field_AddEntryToTable_BracketsAspect extends FieldAspect {
  public static void execute(final Field_AddEntryToTable_Brackets _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets){
     fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field){
     fr.inria.diverse.iot2.iot2.aspects.FieldAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Field)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Field_AddEntryToTable_BracketsAspectField_AddEntryToTable_BracketsAspectProperties _self_, final Field_AddEntryToTable_Brackets _self, final Environment c) {
  }
}
