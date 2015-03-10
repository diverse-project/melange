package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspectXTryCatchFinallyExpressionAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;

@Aspect(className = XTryCatchFinallyExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXTryCatchFinallyExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XTryCatchFinallyExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspectXTryCatchFinallyExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XTryCatchFinallyExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XTryCatchFinallyExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XTryCatchFinallyExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspectXTryCatchFinallyExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XTryCatchFinallyExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XTryCatchFinallyExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XTryCatchFinallyExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspectXTryCatchFinallyExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XTryCatchFinallyExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XTryCatchFinallyExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXTryCatchFinallyExpressionAspectXTryCatchFinallyExpressionAspectProperties _self_;
  
  private static void super_reinit(final XTryCatchFinallyExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XTryCatchFinallyExpression _self) {
    orgeclipsextextxbaseXTryCatchFinallyExpressionAspect.super_reinit(_self);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.reinit(_expression);
    }
    XExpression _finallyExpression = _self.getFinallyExpression();
    if (_finallyExpression!=null) {
      __SlicerAspect__.reinit(_finallyExpression);
    }
    EList<XCatchClause> _catchClauses = _self.getCatchClauses();
    final Consumer<XCatchClause> _function = new Consumer<XCatchClause>() {
      public void accept(final XCatchClause it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _catchClauses.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final XTryCatchFinallyExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XTryCatchFinallyExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXTryCatchFinallyExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
    XExpression _finallyExpression = _self.getFinallyExpression();
    if (_finallyExpression!=null) {
      __SlicerAspect__.visitToAddClasses(_finallyExpression, theSlicer);
    }
    EList<XCatchClause> _catchClauses = _self.getCatchClauses();
    final Consumer<XCatchClause> _function = new Consumer<XCatchClause>() {
      public void accept(final XCatchClause it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _catchClauses.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final XTryCatchFinallyExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XTryCatchFinallyExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXTryCatchFinallyExpressionAspect.super__visitToAddRelations(_self, theSlicer);
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
    XExpression _finallyExpression = _self.getFinallyExpression();
    boolean _tripleNotEquals_1 = (_finallyExpression != null);
    if (_tripleNotEquals_1) {
      XExpression _finallyExpression_1 = _self.getFinallyExpression();
      __SlicerAspect__.visitToAddRelations(_finallyExpression_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _finallyExpression_2 = _self.getFinallyExpression();
        boolean _sliced_3 = __SlicerAspect__.sliced(_finallyExpression_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _finallyExpression_3 = _self.getFinallyExpression();
        theSlicer.onfinallyExpressionSliced(_self, _finallyExpression_3);
      }
    }
    EList<XCatchClause> _catchClauses = _self.getCatchClauses();
    final Consumer<XCatchClause> _function = new Consumer<XCatchClause>() {
      public void accept(final XCatchClause _elt) {
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
          theSlicer.oncatchClausesSliced(_self, _elt);
        }
      }
    };
    _catchClauses.forEach(_function);
  }
}
