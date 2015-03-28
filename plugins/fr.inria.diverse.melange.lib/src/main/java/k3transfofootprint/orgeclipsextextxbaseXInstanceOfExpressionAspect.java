package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspectXInstanceOfExpressionAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;

@Aspect(className = XInstanceOfExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXInstanceOfExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XInstanceOfExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspectXInstanceOfExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XInstanceOfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XInstanceOfExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XInstanceOfExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspectXInstanceOfExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XInstanceOfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XInstanceOfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XInstanceOfExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspectXInstanceOfExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XInstanceOfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XInstanceOfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXInstanceOfExpressionAspectXInstanceOfExpressionAspectProperties _self_;
  
  private static void super_reinit(final XInstanceOfExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XInstanceOfExpression _self) {
    orgeclipsextextxbaseXInstanceOfExpressionAspect.super_reinit(_self);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.reinit(_type);
    }
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.reinit(_expression);
    }
  }
  
  private static void super__visitToAddClasses(final XInstanceOfExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XInstanceOfExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXInstanceOfExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XInstanceOfExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XInstanceOfExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXInstanceOfExpressionAspect.super__visitToAddRelations(_self, theSlicer);
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
    XExpression _expression = _self.getExpression();
    boolean _tripleNotEquals_1 = (_expression != null);
    if (_tripleNotEquals_1) {
      XExpression _expression_1 = _self.getExpression();
      __SlicerAspect__.visitToAddRelations(_expression_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _expression_2 = _self.getExpression();
        boolean _sliced_3 = __SlicerAspect__.sliced(_expression_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _expression_3 = _self.getExpression();
        theSlicer.onexpressionSliced(_self, _expression_3);
      }
    }
  }
}
