package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect;
import k3transfofootprint.orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XAssignment.class, with = { orgeclipsextextxbaseXAbstractFeatureCallAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXAssignmentAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void reinit(final XAssignment _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3_reinit((org.eclipse.xtext.xbase.XAssignment)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXAssignmentAspectXAssignmentAspectProperties _self_;
  
  private static void super_reinit(final XAssignment _self) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XAssignment _self) {
    orgeclipsextextxbaseXAssignmentAspect.super_reinit(_self);
    XExpression _assignable = _self.getAssignable();
    if (_assignable!=null) {
      __SlicerAspect__.reinit(_assignable);
    }
    XExpression _value = _self.getValue();
    if (_value!=null) {
      __SlicerAspect__.reinit(_value);
    }
  }
  
  private static void super__visitToAddClasses(final XAssignment _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXAssignmentAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _assignable = _self.getAssignable();
    if (_assignable!=null) {
      __SlicerAspect__.visitToAddClasses(_assignable, theSlicer);
    }
    XExpression _value = _self.getValue();
    if (_value!=null) {
      __SlicerAspect__.visitToAddClasses(_value, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XAssignment _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XAssignment _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXAssignmentAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _assignable = _self.getAssignable();
    boolean _tripleNotEquals = (_assignable != null);
    if (_tripleNotEquals) {
      XExpression _assignable_1 = _self.getAssignable();
      __SlicerAspect__.visitToAddRelations(_assignable_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _assignable_2 = _self.getAssignable();
        boolean _sliced_1 = __SlicerAspect__.sliced(_assignable_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _assignable_3 = _self.getAssignable();
        theSlicer.onassignableSliced(_self, _assignable_3);
      }
    }
    XExpression _value = _self.getValue();
    boolean _tripleNotEquals_1 = (_value != null);
    if (_tripleNotEquals_1) {
      XExpression _value_1 = _self.getValue();
      __SlicerAspect__.visitToAddRelations(_value_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _value_2 = _self.getValue();
        boolean _sliced_3 = __SlicerAspect__.sliced(_value_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _value_3 = _self.getValue();
        theSlicer.onvalueSliced(_self, _value_3);
      }
    }
  }
}
