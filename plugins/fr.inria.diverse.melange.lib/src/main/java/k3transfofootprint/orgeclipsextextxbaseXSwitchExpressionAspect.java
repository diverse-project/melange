package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspectXSwitchExpressionAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XSwitchExpression;

@Aspect(className = XSwitchExpression.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXSwitchExpressionAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XSwitchExpression _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspectXSwitchExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspect._privk3_reinit((org.eclipse.xtext.xbase.XSwitchExpression)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspectXSwitchExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspectXSwitchExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXSwitchExpressionAspectXSwitchExpressionAspectProperties _self_;
  
  private static void super_reinit(final XSwitchExpression _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XSwitchExpression _self) {
    orgeclipsextextxbaseXSwitchExpressionAspect.super_reinit(_self);
    XExpression _switch = _self.getSwitch();
    if (_switch!=null) {
      __SlicerAspect__.reinit(_switch);
    }
    EList<XCasePart> _cases = _self.getCases();
    final Consumer<XCasePart> _function = new Consumer<XCasePart>() {
      public void accept(final XCasePart it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _cases.forEach(_function);
    XExpression _default = _self.getDefault();
    if (_default!=null) {
      __SlicerAspect__.reinit(_default);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.reinit(_declaredParam);
    }
  }
  
  private static void super__visitToAddClasses(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXSwitchExpressionAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _switch = _self.getSwitch();
    if (_switch!=null) {
      __SlicerAspect__.visitToAddClasses(_switch, theSlicer);
    }
    EList<XCasePart> _cases = _self.getCases();
    final Consumer<XCasePart> _function = new Consumer<XCasePart>() {
      public void accept(final XCasePart it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _cases.forEach(_function);
    XExpression _default = _self.getDefault();
    if (_default!=null) {
      __SlicerAspect__.visitToAddClasses(_default, theSlicer);
    }
    JvmFormalParameter _declaredParam = _self.getDeclaredParam();
    if (_declaredParam!=null) {
      __SlicerAspect__.visitToAddClasses(_declaredParam, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XSwitchExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXSwitchExpressionAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _switch = _self.getSwitch();
    boolean _tripleNotEquals = (_switch != null);
    if (_tripleNotEquals) {
      XExpression _switch_1 = _self.getSwitch();
      __SlicerAspect__.visitToAddRelations(_switch_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _switch_2 = _self.getSwitch();
        boolean _sliced_1 = __SlicerAspect__.sliced(_switch_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _switch_3 = _self.getSwitch();
        theSlicer.onswitchSliced(_self, _switch_3);
      }
    }
    EList<XCasePart> _cases = _self.getCases();
    final Consumer<XCasePart> _function = new Consumer<XCasePart>() {
      public void accept(final XCasePart _elt) {
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
          theSlicer.oncasesSliced(_self, _elt);
        }
      }
    };
    _cases.forEach(_function);
    XExpression _default = _self.getDefault();
    boolean _tripleNotEquals_1 = (_default != null);
    if (_tripleNotEquals_1) {
      XExpression _default_1 = _self.getDefault();
      __SlicerAspect__.visitToAddRelations(_default_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _default_2 = _self.getDefault();
        boolean _sliced_3 = __SlicerAspect__.sliced(_default_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _default_3 = _self.getDefault();
        theSlicer.ondefaultSliced(_self, _default_3);
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
