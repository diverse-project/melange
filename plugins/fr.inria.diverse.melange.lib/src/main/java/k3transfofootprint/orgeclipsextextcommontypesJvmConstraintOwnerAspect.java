package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmConstraintOwner;
import org.eclipse.xtext.common.types.JvmTypeConstraint;

@Aspect(className = JvmConstraintOwner.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmConstraintOwnerAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void reinit(final JvmConstraintOwner _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmConstraintOwner){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmConstraintOwner)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmConstraintOwner){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmConstraintOwner)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmConstraintOwner){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmConstraintOwner)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmConstraintOwnerAspectJvmConstraintOwnerAspectProperties _self_;
  
  private static void super_reinit(final JvmConstraintOwner _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmConstraintOwner _self) {
    orgeclipsextextcommontypesJvmConstraintOwnerAspect.super_reinit(_self);
    EList<JvmTypeConstraint> _constraints = _self.getConstraints();
    final Consumer<JvmTypeConstraint> _function = new Consumer<JvmTypeConstraint>() {
      public void accept(final JvmTypeConstraint it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _constraints.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmConstraintOwnerAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeConstraint> _constraints = _self.getConstraints();
    final Consumer<JvmTypeConstraint> _function = new Consumer<JvmTypeConstraint>() {
      public void accept(final JvmTypeConstraint it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _constraints.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmConstraintOwner _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmConstraintOwnerAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeConstraint> _constraints = _self.getConstraints();
    final Consumer<JvmTypeConstraint> _function = new Consumer<JvmTypeConstraint>() {
      public void accept(final JvmTypeConstraint _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = __SlicerAspect__.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = __SlicerAspect__.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          theSlicer.onconstraintsSliced(_self, _elt);
        }
      }
    };
    _constraints.forEach(_function);
  }
}
