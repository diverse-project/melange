package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties;
import org.eclipse.xtext.common.types.JvmConstraintOwner;
import org.eclipse.xtext.common.types.JvmTypeConstraint;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmTypeConstraint.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmTypeConstraintAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void reinit(final JvmTypeConstraint _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeConstraint){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmTypeConstraint)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmUpperBoundAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmLowerBoundAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmLowerBound)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeConstraint){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeConstraint)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmUpperBound){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmUpperBoundAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmUpperBound)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmLowerBound){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmLowerBoundAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmLowerBound)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeConstraint){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeConstraintAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeConstraint)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmTypeConstraintAspectJvmTypeConstraintAspectProperties _self_;
  
  private static void super_reinit(final JvmTypeConstraint _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmTypeConstraint _self) {
    orgeclipsextextcommontypesJvmTypeConstraintAspect.super_reinit(_self);
    JvmTypeReference _typeReference = _self.getTypeReference();
    if (_typeReference!=null) {
      __SlicerAspect__.reinit(_typeReference);
    }
  }
  
  private static void super__visitToAddClasses(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeConstraintAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _typeReference = _self.getTypeReference();
    if (_typeReference!=null) {
      __SlicerAspect__.visitToAddClasses(_typeReference, theSlicer);
    }
    JvmConstraintOwner _owner = _self.getOwner();
    if (_owner!=null) {
      __SlicerAspect__.visitToAddClasses(_owner, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmTypeConstraint _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeConstraintAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _typeReference = _self.getTypeReference();
    boolean _tripleNotEquals = (_typeReference != null);
    if (_tripleNotEquals) {
      JvmTypeReference _typeReference_1 = _self.getTypeReference();
      __SlicerAspect__.visitToAddRelations(_typeReference_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _typeReference_2 = _self.getTypeReference();
        boolean _sliced_1 = __SlicerAspect__.sliced(_typeReference_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _typeReference_3 = _self.getTypeReference();
        theSlicer.ontypeReferenceSliced(_self, _typeReference_3);
      }
    }
    JvmConstraintOwner _owner = _self.getOwner();
    boolean _tripleNotEquals_1 = (_owner != null);
    if (_tripleNotEquals_1) {
      JvmConstraintOwner _owner_1 = _self.getOwner();
      __SlicerAspect__.visitToAddRelations(_owner_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        JvmConstraintOwner _owner_2 = _self.getOwner();
        boolean _sliced_3 = __SlicerAspect__.sliced(_owner_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        JvmConstraintOwner _owner_3 = _self.getOwner();
        theSlicer.onownerSliced(_self, _owner_3);
      }
    }
  }
}
