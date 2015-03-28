package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmSynonymTypeReference;

@Aspect(className = JvmSynonymTypeReference.class, with = { orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect extends orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmSynonymTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmSynonymTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmSynonymTypeReferenceAspectJvmSynonymTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmSynonymTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmSynonymTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmSynonymTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmSynonymTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
