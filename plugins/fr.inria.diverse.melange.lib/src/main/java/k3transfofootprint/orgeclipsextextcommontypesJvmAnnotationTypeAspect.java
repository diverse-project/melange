package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect;
import org.eclipse.xtext.common.types.JvmAnnotationType;

@Aspect(className = JvmAnnotationType.class, with = { orgeclipsextextcommontypesJvmDeclaredTypeAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnnotationTypeAspect extends orgeclipsextextcommontypesJvmDeclaredTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmAnnotationTypeAspectJvmAnnotationTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmAnnotationType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
