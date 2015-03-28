package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

@Aspect(className = JvmInnerTypeReference.class, with = { orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmInnerTypeReferenceAspect extends orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmInnerTypeReference _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmInnerTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmInnerTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmInnerTypeReferenceAspectJvmInnerTypeReferenceAspectProperties _self_;
  
  private static void super_reinit(final JvmInnerTypeReference _self) {
     k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmInnerTypeReference _self) {
    orgeclipsextextcommontypesJvmInnerTypeReferenceAspect.super_reinit(_self);
    JvmParameterizedTypeReference _outer = _self.getOuter();
    if (_outer!=null) {
      orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect.reinit(_outer);
    }
  }
  
  private static void super__visitToAddClasses(final JvmInnerTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmInnerTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmInnerTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmParameterizedTypeReference _outer = _self.getOuter();
    if (_outer!=null) {
      __SlicerAspect__.visitToAddClasses(_outer, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmInnerTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmInnerTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmInnerTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmParameterizedTypeReference _outer = _self.getOuter();
    boolean _tripleNotEquals = (_outer != null);
    if (_tripleNotEquals) {
      JvmParameterizedTypeReference _outer_1 = _self.getOuter();
      __SlicerAspect__.visitToAddRelations(_outer_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmParameterizedTypeReference _outer_2 = _self.getOuter();
        boolean _sliced_1 = __SlicerAspect__.sliced(_outer_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmParameterizedTypeReference _outer_3 = _self.getOuter();
        theSlicer.onouterSliced(_self, _outer_3);
      }
    }
  }
}
