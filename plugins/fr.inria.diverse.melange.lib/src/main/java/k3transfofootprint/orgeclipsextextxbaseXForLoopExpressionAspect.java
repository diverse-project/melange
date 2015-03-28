package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;

@Aspect(className = XForLoopExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXForLoopExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XForLoopExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XForLoopExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXForLoopExpressionAspectXForLoopExpressionAspectProperties _self_;
  
  private static void super_reinit(final XForLoopExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XForLoopExpression _self) {
    orgeclipsextextxbaseXForLoopExpressionAspect.super_reinit(_self);
    XExpression _forExpression = _self.getForExpression();
    if (_forExpression!=null) {
      __SlicerAspect__.reinit(_forExpression);
    }
    XExpression _eachExpression = _self.getEachExpression();
    if (_eachExpression!=null) {
      __SlicerAspect__.reinit(_eachExpression);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.reinit(_declaredParam);
    }
  }
  
  private static void super__visitToAddClasses(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXForLoopExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _forExpression = _self.getForExpression();
    if (_forExpression!=null) {
      __SlicerAspect__.visitToAddClasses(_forExpression, theSlicer);
    }
    XExpression _eachExpression = _self.getEachExpression();
    if (_eachExpression!=null) {
      __SlicerAspect__.visitToAddClasses(_eachExpression, theSlicer);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.visitToAddClasses(_declaredParam, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXForLoopExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _forExpression = _self.getForExpression();
    boolean _tripleNotEquals = (_forExpression != null);
    if (_tripleNotEquals) {
      XExpression _forExpression_1 = _self.getForExpression();
      __SlicerAspect__.visitToAddRelations(_forExpression_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _forExpression_2 = _self.getForExpression();
        boolean _sliced_1 = __SlicerAspect__.sliced(_forExpression_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _forExpression_3 = _self.getForExpression();
        theSlicer.onforExpressionSliced(_self, _forExpression_3);
      }
    }
    XExpression _eachExpression = _self.getEachExpression();
    boolean _tripleNotEquals_1 = (_eachExpression != null);
    if (_tripleNotEquals_1) {
      XExpression _eachExpression_1 = _self.getEachExpression();
      __SlicerAspect__.visitToAddRelations(_eachExpression_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _eachExpression_2 = _self.getEachExpression();
        boolean _sliced_3 = __SlicerAspect__.sliced(_eachExpression_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _eachExpression_3 = _self.getEachExpression();
        theSlicer.oneachExpressionSliced(_self, _eachExpression_3);
      }
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    boolean _tripleNotEquals_2 = (_declaredParam != null);
    if (_tripleNotEquals_2) {
      JvmFormalParameter _declaredParam_1 = _self.getDeclaredParam();
      __SlicerAspect__.visitToAddRelations(_declaredParam_1, theSlicer);
      boolean _and_2 = false;
      boolean _sliced_4 = __SlicerAspect__.sliced(_self);
      if (!_sliced_4) {
        _and_2 = false;
      } else {
        JvmFormalParameter _declaredParam_2 = _self.getDeclaredParam();
        boolean _sliced_5 = __SlicerAspect__.sliced(_declaredParam_2);
        _and_2 = _sliced_5;
      }
      if (_and_2) {
        JvmFormalParameter _declaredParam_3 = _self.getDeclaredParam();
        theSlicer.ondeclaredParamSliced(_self, _declaredParam_3);
      }
    }
  }
}
