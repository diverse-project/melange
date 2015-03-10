package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmFormalParameter.class, with = { orgeclipsextextcommontypesJvmAnnotationTargetAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmFormalParameterAspect extends orgeclipsextextcommontypesJvmAnnotationTargetAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmFormalParameter _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmFormalParameter)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmFormalParameterAspectJvmFormalParameterAspectProperties _self_;
  
  private static void super_reinit(final JvmFormalParameter _self) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmFormalParameter _self) {
    orgeclipsextextcommontypesJvmFormalParameterAspect.super_reinit(_self);
    JvmTypeReference _parameterType = _self.getParameterType();
    if (_parameterType!=null) {
      __SlicerAspect__.reinit(_parameterType);
    }
  }
  
  private static void super__visitToAddClasses(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmFormalParameterAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _parameterType = _self.getParameterType();
    if (_parameterType!=null) {
      __SlicerAspect__.visitToAddClasses(_parameterType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmFormalParameter _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmFormalParameterAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _parameterType = _self.getParameterType();
    boolean _tripleNotEquals = (_parameterType != null);
    if (_tripleNotEquals) {
      JvmTypeReference _parameterType_1 = _self.getParameterType();
      __SlicerAspect__.visitToAddRelations(_parameterType_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _parameterType_2 = _self.getParameterType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_parameterType_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _parameterType_3 = _self.getParameterType();
        theSlicer.onparameterTypeSliced(_self, _parameterType_3);
      }
    }
  }
}
