package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspectXBasicForLoopExpressionAspectProperties;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XBasicForLoopExpression;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XBasicForLoopExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXBasicForLoopExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XBasicForLoopExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspectXBasicForLoopExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBasicForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XBasicForLoopExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XBasicForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspectXBasicForLoopExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBasicForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBasicForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XBasicForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspectXBasicForLoopExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBasicForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBasicForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXBasicForLoopExpressionAspectXBasicForLoopExpressionAspectProperties _self_;
  
  private static void super_reinit(final XBasicForLoopExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XBasicForLoopExpression _self) {
    orgeclipsextextxbaseXBasicForLoopExpressionAspect.super_reinit(_self);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.reinit(_expression);
    }
    XExpression _eachExpression = _self.getEachExpression();
    if (_eachExpression!=null) {
      __SlicerAspect__.reinit(_eachExpression);
    }
    EList<XExpression> _initExpressions = _self.getInitExpressions();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _initExpressions.forEach(_function);
    EList<XExpression> _updateExpressions = _self.getUpdateExpressions();
    final Consumer<XExpression> _function_1 = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _updateExpressions.forEach(_function_1);
  }
  
  private static void super__visitToAddClasses(final XBasicForLoopExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XBasicForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXBasicForLoopExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _eachExpression = _self.getEachExpression();
    if (_eachExpression!=null) {
      __SlicerAspect__.visitToAddClasses(_eachExpression, theSlicer);
    }
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
    EList<XExpression> _initExpressions = _self.getInitExpressions();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _initExpressions.forEach(_function);
    EList<XExpression> _updateExpressions = _self.getUpdateExpressions();
    final Consumer<XExpression> _function_1 = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _updateExpressions.forEach(_function_1);
  }
  
  private static void super__visitToAddRelations(final XBasicForLoopExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XBasicForLoopExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXBasicForLoopExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _eachExpression = _self.getEachExpression();
    boolean _tripleNotEquals = (_eachExpression != null);
    if (_tripleNotEquals) {
      XExpression _eachExpression_1 = _self.getEachExpression();
      __SlicerAspect__.visitToAddRelations(_eachExpression_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _eachExpression_2 = _self.getEachExpression();
        boolean _sliced_1 = __SlicerAspect__.sliced(_eachExpression_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _eachExpression_3 = _self.getEachExpression();
        theSlicer.oneachExpressionSliced(_self, _eachExpression_3);
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
    EList<XExpression> _initExpressions = _self.getInitExpressions();
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
          theSlicer.oninitExpressionsSliced(_self, _elt);
        }
      }
    };
    _initExpressions.forEach(_function);
    EList<XExpression> _updateExpressions = _self.getUpdateExpressions();
    final Consumer<XExpression> _function_1 = new Consumer<XExpression>() {
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
          theSlicer.onupdateExpressionsSliced(_self, _elt);
        }
      }
    };
    _updateExpressions.forEach(_function_1);
  }
}
