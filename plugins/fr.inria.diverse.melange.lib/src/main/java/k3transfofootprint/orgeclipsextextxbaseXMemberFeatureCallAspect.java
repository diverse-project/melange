package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect;
import k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XMemberFeatureCall;

@Aspect(className = XMemberFeatureCall.class, with = { orgeclipsextextxbaseXAbstractFeatureCallAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXMemberFeatureCallAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void reinit(final XMemberFeatureCall _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XMemberFeatureCall)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXMemberFeatureCallAspectXMemberFeatureCallAspectProperties _self_;
  
  private static void super_reinit(final XMemberFeatureCall _self) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XMemberFeatureCall _self) {
    orgeclipsextextxbaseXMemberFeatureCallAspect.super_reinit(_self);
    XExpression _memberCallTarget = _self.getMemberCallTarget();
    if (_memberCallTarget!=null) {
      __SlicerAspect__.reinit(_memberCallTarget);
    }
    EList<XExpression> _memberCallArguments = _self.getMemberCallArguments();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _memberCallArguments.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXMemberFeatureCallAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _memberCallTarget = _self.getMemberCallTarget();
    if (_memberCallTarget!=null) {
      __SlicerAspect__.visitToAddClasses(_memberCallTarget, theSlicer);
    }
    EList<XExpression> _memberCallArguments = _self.getMemberCallArguments();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _memberCallArguments.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XMemberFeatureCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXMemberFeatureCallAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _memberCallTarget = _self.getMemberCallTarget();
    boolean _tripleNotEquals = (_memberCallTarget != null);
    if (_tripleNotEquals) {
      XExpression _memberCallTarget_1 = _self.getMemberCallTarget();
      __SlicerAspect__.visitToAddRelations(_memberCallTarget_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _memberCallTarget_2 = _self.getMemberCallTarget();
        boolean _sliced_1 = __SlicerAspect__.sliced(_memberCallTarget_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _memberCallTarget_3 = _self.getMemberCallTarget();
        theSlicer.onmemberCallTargetSliced(_self, _memberCallTarget_3);
      }
    }
    EList<XExpression> _memberCallArguments = _self.getMemberCallArguments();
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
          theSlicer.onmemberCallArgumentsSliced(_self, _elt);
        }
      }
    };
    _memberCallArguments.forEach(_function);
  }
}
