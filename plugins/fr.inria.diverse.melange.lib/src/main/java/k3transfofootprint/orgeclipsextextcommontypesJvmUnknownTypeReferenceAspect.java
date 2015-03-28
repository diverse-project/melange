package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties;
import org.eclipse.xtext.common.types.JvmUnknownTypeReference;

@Aspect(className = JvmUnknownTypeReference.class, with = { orgeclipsextextcommontypesJvmTypeReferenceAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmUnknownTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmUnknownTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmUnknownTypeReferenceAspectJvmUnknownTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmUnknownTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmUnknownTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
