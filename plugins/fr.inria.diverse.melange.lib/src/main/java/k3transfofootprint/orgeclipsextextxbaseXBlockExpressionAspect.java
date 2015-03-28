package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XBlockExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXBlockExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XBlockExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XBlockExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XBlockExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XBlockExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXBlockExpressionAspectXBlockExpressionAspectProperties _self_;
  
  private static void super_reinit(final XBlockExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XBlockExpression _self) {
    orgeclipsextextxbaseXBlockExpressionAspect.super_reinit(_self);
    EList<XExpression> _expressions = _self.getExpressions();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _expressions.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final XBlockExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XBlockExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXBlockExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    EList<XExpression> _expressions = _self.getExpressions();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _expressions.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final XBlockExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XBlockExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXBlockExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    EList<XExpression> _expressions = _self.getExpressions();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression _elt) {
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
          theSlicer.onexpressionsSliced(_self, _elt);
        }
      }
    };
    _expressions.forEach(_function);
  }
}
