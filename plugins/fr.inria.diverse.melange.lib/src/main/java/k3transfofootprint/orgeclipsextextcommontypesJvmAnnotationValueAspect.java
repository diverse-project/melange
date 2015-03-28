package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmOperation;

@Aspect(className = JvmAnnotationValue.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmAnnotationValueAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmStringAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmStringAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmStringAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmByteAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmByteAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmByteAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmBooleanAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmBooleanAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmBooleanAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmLongAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmLongAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmLongAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCustomAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCustomAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmCustomAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFloatAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFloatAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFloatAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmShortAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIntAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCharAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCharAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmCharAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDoubleAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDoubleAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmDoubleAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmStringAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmStringAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmStringAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmByteAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmByteAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmByteAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmBooleanAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmBooleanAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmBooleanAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmLongAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmLongAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmLongAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCustomAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCustomAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmCustomAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFloatAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFloatAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFloatAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmShortAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIntAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCharAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCharAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmCharAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDoubleAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDoubleAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmDoubleAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmAnnotationValueAspectJvmAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
    JvmOperation _operation = _self.getOperation();
    if (_operation!=null) {
      __SlicerAspect__.visitToAddClasses(_operation, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
    JvmOperation _operation = _self.getOperation();
    boolean _tripleNotEquals = (_operation != null);
    if (_tripleNotEquals) {
      JvmOperation _operation_1 = _self.getOperation();
      __SlicerAspect__.visitToAddRelations(_operation_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmOperation _operation_2 = _self.getOperation();
        boolean _sliced_1 = __SlicerAspect__.sliced(_operation_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmOperation _operation_3 = _self.getOperation();
        theSlicer.onoperationSliced(_self, _operation_3);
      }
    }
  }
}
