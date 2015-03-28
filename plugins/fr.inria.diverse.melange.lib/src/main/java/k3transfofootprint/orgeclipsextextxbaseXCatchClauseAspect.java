package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XCatchClause.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXCatchClauseAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void reinit(final XCatchClause _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCatchClause){
    	      k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspect._privk3_reinit((org.eclipse.xtext.xbase.XCatchClause)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCatchClause){
    	      k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XCatchClause)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCatchClause){
    	      k3transfofootprint.orgeclipsextextxbaseXCatchClauseAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XCatchClause)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXCatchClauseAspectXCatchClauseAspectProperties _self_;
  
  private static void super_reinit(final XCatchClause _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XCatchClause _self) {
    orgeclipsextextxbaseXCatchClauseAspect.super_reinit(_self);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.reinit(_expression);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.reinit(_declaredParam);
    }
  }
  
  private static void super__visitToAddClasses(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXCatchClauseAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.visitToAddClasses(_declaredParam, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XCatchClause _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXCatchClauseAspect.super__visitToAddRelations(_self, theSlicer);
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
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    boolean _tripleNotEquals_1 = (_declaredParam != null);
    if (_tripleNotEquals_1) {
      JvmFormalParameter _declaredParam_1 = _self.getDeclaredParam();
      __SlicerAspect__.visitToAddRelations(_declaredParam_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        JvmFormalParameter _declaredParam_2 = _self.getDeclaredParam();
        boolean _sliced_3 = __SlicerAspect__.sliced(_declaredParam_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        JvmFormalParameter _declaredParam_3 = _self.getDeclaredParam();
        theSlicer.ondeclaredParamSliced(_self, _declaredParam_3);
      }
    }
  }
}
