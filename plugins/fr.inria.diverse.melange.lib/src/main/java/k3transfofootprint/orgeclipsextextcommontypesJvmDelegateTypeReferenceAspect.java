package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect;
import org.eclipse.xtext.common.types.JvmDelegateTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmDelegateTypeReference.class, with = { orgeclipsextextcommontypesJvmTypeReferenceAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmDelegateTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmDelegateTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmDelegateTypeReferenceAspectJvmDelegateTypeReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _delegate = _self.getDelegate();
    if (_delegate!=null) {
      __SlicerAspect__.visitToAddClasses(_delegate, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmDelegateTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmDelegateTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _delegate = _self.getDelegate();
    boolean _tripleNotEquals = (_delegate != null);
    if (_tripleNotEquals) {
      JvmTypeReference _delegate_1 = _self.getDelegate();
      __SlicerAspect__.visitToAddRelations(_delegate_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _delegate_2 = _self.getDelegate();
        boolean _sliced_1 = __SlicerAspect__.sliced(_delegate_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _delegate_3 = _self.getDelegate();
        theSlicer.ondelegateSliced(_self, _delegate_3);
      }
    }
  }
}
