package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XIfExpression;

@Aspect(className = XIfExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXIfExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XIfExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XIfExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXIfExpressionAspectXIfExpressionAspectProperties _self_;
  
  private static void super_reinit(final XIfExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XIfExpression _self) {
    orgeclipsextextxbaseXIfExpressionAspect.super_reinit(_self);
    XExpression _if = _self.getIf();
    if (_if!=null) {
      __SlicerAspect__.reinit(_if);
    }
    XExpression _then = _self.getThen();
    if (_then!=null) {
      __SlicerAspect__.reinit(_then);
    }
    XExpression _else = _self.getElse();
    if (_else!=null) {
      __SlicerAspect__.reinit(_else);
    }
  }
  
  private static void super__visitToAddClasses(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXIfExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _if = _self.getIf();
    if (_if!=null) {
      __SlicerAspect__.visitToAddClasses(_if, theSlicer);
    }
    XExpression _then = _self.getThen();
    if (_then!=null) {
      __SlicerAspect__.visitToAddClasses(_then, theSlicer);
    }
    XExpression _else = _self.getElse();
    if (_else!=null) {
      __SlicerAspect__.visitToAddClasses(_else, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XIfExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXIfExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _if = _self.getIf();
    boolean _tripleNotEquals = (_if != null);
    if (_tripleNotEquals) {
      XExpression _if_1 = _self.getIf();
      __SlicerAspect__.visitToAddRelations(_if_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _if_2 = _self.getIf();
        boolean _sliced_1 = __SlicerAspect__.sliced(_if_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _if_3 = _self.getIf();
        theSlicer.onifSliced(_self, _if_3);
      }
    }
    XExpression _then = _self.getThen();
    boolean _tripleNotEquals_1 = (_then != null);
    if (_tripleNotEquals_1) {
      XExpression _then_1 = _self.getThen();
      __SlicerAspect__.visitToAddRelations(_then_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _then_2 = _self.getThen();
        boolean _sliced_3 = __SlicerAspect__.sliced(_then_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _then_3 = _self.getThen();
        theSlicer.onthenSliced(_self, _then_3);
      }
    }
    XExpression _else = _self.getElse();
    boolean _tripleNotEquals_2 = (_else != null);
    if (_tripleNotEquals_2) {
      XExpression _else_1 = _self.getElse();
      __SlicerAspect__.visitToAddRelations(_else_1, theSlicer);
      boolean _and_2 = false;
      boolean _sliced_4 = __SlicerAspect__.sliced(_self);
      if (!_sliced_4) {
        _and_2 = false;
      } else {
        XExpression _else_2 = _self.getElse();
        boolean _sliced_5 = __SlicerAspect__.sliced(_else_2);
        _and_2 = _sliced_5;
      }
      if (_and_2) {
        XExpression _else_3 = _self.getElse();
        theSlicer.onelseSliced(_self, _else_3);
      }
    }
  }
}
