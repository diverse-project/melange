package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Field;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.FieldAspectFieldAspectProperties;

@Aspect(className = Field.class)
@SuppressWarnings("all")
public class FieldAspect {
  public static void execute(final Field _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.FieldAspectFieldAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.FieldAspectFieldAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets){
     fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTable_BracketsAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable_Brackets)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable){
     fr.inria.diverse.iot2.iot2.aspects.Field_AddEntryToTableAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Field_AddEntryToTable)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable){
     fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field){
     fr.inria.diverse.iot2.iot2.aspects.FieldAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Field)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final FieldAspectFieldAspectProperties _self_, final Field _self, final Environment c) {
  }
}
