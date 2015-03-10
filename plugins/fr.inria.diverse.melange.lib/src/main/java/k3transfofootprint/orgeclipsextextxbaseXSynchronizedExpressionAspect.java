package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XSynchronizedExpression;

@Aspect(className = XSynchronizedExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXSynchronizedExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XSynchronizedExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XSynchronizedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XSynchronizedExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XSynchronizedExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XSynchronizedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XSynchronizedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XSynchronizedExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XSynchronizedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XSynchronizedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXSynchronizedExpressionAspectXSynchronizedExpressionAspectProperties _self_;
  
  private static void super_reinit(final XSynchronizedExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XSynchronizedExpression _self) {
    orgeclipsextextxbaseXSynchronizedExpressionAspect.super_reinit(_self);
    XExpression _param = _self.getParam();
    if (_param!=null) {
      __SlicerAspect__.reinit(_param);
    }
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.reinit(_expression);
    }
  }
  
  private static void super__visitToAddClasses(final XSynchronizedExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XSynchronizedExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXSynchronizedExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
    XExpression _param = _self.getParam();
    if (_param!=null) {
      __SlicerAspect__.visitToAddClasses(_param, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XSynchronizedExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XSynchronizedExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXSynchronizedExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _expression = _self.getExpression();
    boolean _tripleNotEquals = (_expression != null);
    if (_tripleNotEquals) {
      XExpression _expression_1 = _self.getExpression();
      __SlicerAspect__.visitToAddRelations(_expression_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _expression_2 = _self.getExpression();
        boolean _sliced_1 = __SlicerAspect__.sliced(_expression_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _expression_3 = _self.getExpression();
        theSlicer.onexpressionSliced(_self, _expression_3);
      }
    }
    XExpression _param = _self.getParam();
    boolean _tripleNotEquals_1 = (_param != null);
    if (_tripleNotEquals_1) {
      XExpression _param_1 = _self.getParam();
      __SlicerAspect__.visitToAddRelations(_param_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _param_2 = _self.getParam();
        boolean _sliced_3 = __SlicerAspect__.sliced(_param_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _param_3 = _self.getParam();
        theSlicer.onparamSliced(_self, _param_3);
      }
    }
  }
}
