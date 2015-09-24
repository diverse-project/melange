package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable;
import fr.inria.diverse.iot2.iot2.aspects.Environment;
import fr.inria.diverse.iot2.iot2.aspects.FieldAspect;
import fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties;

@Aspect(className = Field_AppendEntryToTable.class)
@SuppressWarnings("all")
public class Field_AppendEntryToTableAspect extends FieldAspect {
  public static void execute(final Field_AppendEntryToTable _self, final Environment c) {
    fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspectField_AppendEntryToTableAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable){
     fr.inria.diverse.iot2.iot2.aspects.Field_AppendEntryToTableAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.Field_AppendEntryToTable)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Field){
     fr.inria.diverse.iot2.iot2.aspects.FieldAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Field)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final Field_AppendEntryToTableAspectField_AppendEntryToTableAspectProperties _self_, final Field_AppendEntryToTable _self, final Environment c) {
  }
}
