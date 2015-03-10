package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXClosureAspectXClosureAspectProperties;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XClosure.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXClosureAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XClosure _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXClosureAspectXClosureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    	      k3transfofootprint.orgeclipsextextxbaseXClosureAspect._privk3_reinit((org.eclipse.xtext.xbase.XClosure)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XClosure _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXClosureAspectXClosureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    	      k3transfofootprint.orgeclipsextextxbaseXClosureAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XClosure _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXClosureAspectXClosureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    	      k3transfofootprint.orgeclipsextextxbaseXClosureAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXClosureAspectXClosureAspectProperties _self_;
  
  private static void super_reinit(final XClosure _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XClosure _self) {
    orgeclipsextextxbaseXClosureAspect.super_reinit(_self);
    EList<JvmFormalParameter> _declaredFormalParameters = _self.getDeclaredFormalParameters();
    final Consumer<JvmFormalParameter> _function = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _declaredFormalParameters.forEach(_function);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.reinit(_expression);
    }
    EList<JvmFormalParameter> _implicitFormalParameters = _self.getImplicitFormalParameters();
    final Consumer<JvmFormalParameter> _function_1 = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _implicitFormalParameters.forEach(_function_1);
  }
  
  private static void super__visitToAddClasses(final XClosure _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XClosure _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXClosureAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmFormalParameter> _declaredFormalParameters = _self.getDeclaredFormalParameters();
    final Consumer<JvmFormalParameter> _function = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _declaredFormalParameters.forEach(_function);
    XExpression _expression = _self.getExpression();
    if (_expression!=null) {
      __SlicerAspect__.visitToAddClasses(_expression, theSlicer);
    }
    EList<JvmFormalParameter> _implicitFormalParameters = _self.getImplicitFormalParameters();
    final Consumer<JvmFormalParameter> _function_1 = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _implicitFormalParameters.forEach(_function_1);
  }
  
  private static void super__visitToAddRelations(final XClosure _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XClosure _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXClosureAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmFormalParameter> _declaredFormalParameters = _self.getDeclaredFormalParameters();
    final Consumer<JvmFormalParameter> _function = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter _elt) {
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
          theSlicer.ondeclaredFormalParametersSliced(_self, _elt);
        }
      }
    };
    _declaredFormalParameters.forEach(_function);
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
    EList<JvmFormalParameter> _implicitFormalParameters = _self.getImplicitFormalParameters();
    final Consumer<JvmFormalParameter> _function_1 = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
      }
    };
    _implicitFormalParameters.forEach(_function_1);
  }
}
