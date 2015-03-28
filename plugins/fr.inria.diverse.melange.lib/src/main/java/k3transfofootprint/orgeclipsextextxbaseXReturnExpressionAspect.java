package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XReturnExpression;

@Aspect(className = XReturnExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXReturnExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XReturnExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XReturnExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XReturnExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XReturnExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XReturnExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XReturnExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XReturnExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XReturnExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XReturnExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXReturnExpressionAspectXReturnExpressionAspectProperties _self_;
  
  private static void super_reinit(final XReturnExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XReturnExpression _self) {
    orgeclipsextextxbaseXReturnExpressionAspect.super_reinit(_self);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.reinit(_expression);
    }
  }
  
  private static void super__visitToAddClasses(final XReturnExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XReturnExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXReturnExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XReturnExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XReturnExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXReturnExpressionAspect.super__visitToAddRelations(_self, theSlicer);
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
  }
}
