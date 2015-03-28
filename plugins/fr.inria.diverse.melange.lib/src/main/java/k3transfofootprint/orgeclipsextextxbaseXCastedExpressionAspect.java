package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XCastedExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXCastedExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XCastedExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XCastedExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXCastedExpressionAspectXCastedExpressionAspectProperties _self_;
  
  private static void super_reinit(final XCastedExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XCastedExpression _self) {
    orgeclipsextextxbaseXCastedExpressionAspect.super_reinit(_self);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.reinit(_type);
    }
    XExpression _target = _self.getTarget();
    if (_target!=null) {
      __SlicerAspect__.reinit(_target);
    }
  }
  
  private static void super__visitToAddClasses(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXCastedExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
    XExpression _target = _self.getTarget();
    if (_target!=null) {
      __SlicerAspect__.visitToAddClasses(_target, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XCastedExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXCastedExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      JvmTypeReference _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _type_2 = _self.getType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_type_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _type_3 = _self.getType();
        theSlicer.ontypeSliced(_self, _type_3);
      }
    }
    XExpression _target = _self.getTarget();
    boolean _tripleNotEquals_1 = (_target != null);
    if (_tripleNotEquals_1) {
      XExpression _target_1 = _self.getTarget();
      __SlicerAspect__.visitToAddRelations(_target_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _target_2 = _self.getTarget();
        boolean _sliced_3 = __SlicerAspect__.sliced(_target_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _target_3 = _self.getTarget();
        theSlicer.ontargetSliced(_self, _target_3);
      }
    }
  }
}
