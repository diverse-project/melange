package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect;
import org.eclipse.xtext.common.types.JvmConstructor;

@Aspect(className = JvmConstructor.class, with = { orgeclipsextextcommontypesJvmExecutableAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmConstructorAspect extends orgeclipsextextcommontypesJvmExecutableAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmConstructor _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmConstructor _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmConstructorAspectJvmConstructorAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmConstructor _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmConstructor _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmConstructorAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmConstructor _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmConstructor _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmConstructorAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
