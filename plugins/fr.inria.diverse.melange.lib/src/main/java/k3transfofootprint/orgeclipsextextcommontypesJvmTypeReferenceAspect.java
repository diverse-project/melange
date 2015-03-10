package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmTypeReference.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmTypeReferenceAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnyTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnyTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnyTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnyTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmSynonymTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSynonymTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmSynonymTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmTypeReferenceAspectJvmTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    theSlicer.onJvmTypeReferenceSliced(_self);
    orgeclipsextextcommontypesJvmTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
