package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XAbstractWhileExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextxbaseXAbstractWhileExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XAbstractWhileExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspectXAbstractWhileExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspectXAbstractWhileExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXDoWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspectXAbstractWhileExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXDoWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXAbstractWhileExpressionAspectXAbstractWhileExpressionAspectProperties _self_;
  
  private static void super_reinit(final XAbstractWhileExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XAbstractWhileExpression _self) {
    orgeclipsextextxbaseXAbstractWhileExpressionAspect.super_reinit(_self);
    XExpression _predicate = _self.getPredicate();
    if (_predicate!=null) {
      __SlicerAspect__.reinit(_predicate);
    }
    XExpression _body = _self.getBody();
    if (_body!=null) {
      __SlicerAspect__.reinit(_body);
    }
  }
  
  private static void super__visitToAddClasses(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXAbstractWhileExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _predicate = _self.getPredicate();
    if (_predicate!=null) {
      __SlicerAspect__.visitToAddClasses(_predicate, theSlicer);
    }
    XExpression _body = _self.getBody();
    if (_body!=null) {
      __SlicerAspect__.visitToAddClasses(_body, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XAbstractWhileExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXAbstractWhileExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _predicate = _self.getPredicate();
    boolean _tripleNotEquals = (_predicate != null);
    if (_tripleNotEquals) {
      XExpression _predicate_1 = _self.getPredicate();
      __SlicerAspect__.visitToAddRelations(_predicate_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _predicate_2 = _self.getPredicate();
        boolean _sliced_1 = __SlicerAspect__.sliced(_predicate_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _predicate_3 = _self.getPredicate();
        theSlicer.onpredicateSliced(_self, _predicate_3);
      }
    }
    XExpression _body = _self.getBody();
    boolean _tripleNotEquals_1 = (_body != null);
    if (_tripleNotEquals_1) {
      XExpression _body_1 = _self.getBody();
      __SlicerAspect__.visitToAddRelations(_body_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _body_2 = _self.getBody();
        boolean _sliced_3 = __SlicerAspect__.sliced(_body_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _body_3 = _self.getBody();
        theSlicer.onbodySliced(_self, _body_3);
      }
    }
  }
}
