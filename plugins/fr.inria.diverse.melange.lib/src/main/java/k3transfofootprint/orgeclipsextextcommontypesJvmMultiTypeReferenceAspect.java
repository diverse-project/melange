package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmMultiTypeReference;

@Aspect(className = JvmMultiTypeReference.class, with = { orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmMultiTypeReferenceAspect extends orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmMultiTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMultiTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmMultiTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmCompoundTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmCompoundTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmMultiTypeReferenceAspectJvmMultiTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmMultiTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmCompoundTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmMultiTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmMultiTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
