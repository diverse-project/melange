package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect;
import org.eclipse.xtext.common.types.JvmSpecializedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmSpecializedTypeReference.class, with = { orgeclipsextextcommontypesJvmTypeReferenceAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmSpecializedTypeReference _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmSpecializedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmSpecializedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspectJvmSpecializedTypeReferenceAspectProperties _self_;
  
  private static void super_reinit(final JvmSpecializedTypeReference _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmSpecializedTypeReference _self) {
    orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect.super_reinit(_self);
    JvmTypeReference _equivalent = _self.getEquivalent();
    if (_equivalent!=null) {
      __SlicerAspect__.reinit(_equivalent);
    }
  }
  
  private static void super__visitToAddClasses(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _equivalent = _self.getEquivalent();
    if (_equivalent!=null) {
      __SlicerAspect__.visitToAddClasses(_equivalent, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmSpecializedTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmSpecializedTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _equivalent = _self.getEquivalent();
    boolean _tripleNotEquals = (_equivalent != null);
    if (_tripleNotEquals) {
      JvmTypeReference _equivalent_1 = _self.getEquivalent();
      __SlicerAspect__.visitToAddRelations(_equivalent_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _equivalent_2 = _self.getEquivalent();
        boolean _sliced_1 = __SlicerAspect__.sliced(_equivalent_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _equivalent_3 = _self.getEquivalent();
        theSlicer.onequivalentSliced(_self, _equivalent_3);
      }
    }
  }
}
