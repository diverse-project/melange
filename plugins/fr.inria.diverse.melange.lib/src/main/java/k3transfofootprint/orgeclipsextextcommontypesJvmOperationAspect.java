package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmOperation.class, with = { orgeclipsextextcommontypesJvmExecutableAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmOperationAspect extends orgeclipsextextcommontypesJvmExecutableAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmOperation _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmOperation)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmFeature)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmMember)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmOperationAspectJvmOperationAspectProperties _self_;
  
  private static void super_reinit(final JvmOperation _self) {
     k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmOperation _self) {
    orgeclipsextextcommontypesJvmOperationAspect.super_reinit(_self);
    JvmTypeReference _returnType = _self.getReturnType();
    if (_returnType!=null) {
      __SlicerAspect__.reinit(_returnType);
    }
    JvmAnnotationValue _defaultValue = _self.getDefaultValue();
    if (_defaultValue!=null) {
      __SlicerAspect__.reinit(_defaultValue);
    }
  }
  
  private static void super__visitToAddClasses(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmOperationAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _returnType = _self.getReturnType();
    if (_returnType!=null) {
      orgeclipsextextcommontypesJvmExecutableAspect.visitToAddClasses(_returnType, theSlicer);
    }
    JvmAnnotationValue _defaultValue = _self.getDefaultValue();
    if (_defaultValue!=null) {
      orgeclipsextextcommontypesJvmExecutableAspect.visitToAddClasses(_defaultValue, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmOperation _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmOperationAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _returnType = _self.getReturnType();
    boolean _tripleNotEquals = (_returnType != null);
    if (_tripleNotEquals) {
      JvmTypeReference _returnType_1 = _self.getReturnType();
      orgeclipsextextcommontypesJvmExecutableAspect.visitToAddRelations(_returnType_1, theSlicer);
      boolean _and = false;
      boolean _sliced = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _returnType_2 = _self.getReturnType();
        boolean _sliced_1 = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_returnType_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _returnType_3 = _self.getReturnType();
        theSlicer.onreturnTypeSliced(_self, _returnType_3);
      }
    }
    JvmAnnotationValue _defaultValue = _self.getDefaultValue();
    boolean _tripleNotEquals_1 = (_defaultValue != null);
    if (_tripleNotEquals_1) {
      JvmAnnotationValue _defaultValue_1 = _self.getDefaultValue();
      orgeclipsextextcommontypesJvmExecutableAspect.visitToAddRelations(_defaultValue_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        JvmAnnotationValue _defaultValue_2 = _self.getDefaultValue();
        boolean _sliced_3 = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_defaultValue_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        JvmAnnotationValue _defaultValue_3 = _self.getDefaultValue();
        theSlicer.ondefaultValueSliced(_self, _defaultValue_3);
      }
    }
  }
}
