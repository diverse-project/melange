package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XAbstractFeatureCall.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextxbaseXAbstractFeatureCallAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XAbstractFeatureCall _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3_reinit((org.eclipse.xtext.xbase.XBinaryOperation)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspect._privk3_reinit((org.eclipse.xtext.xbase.XUnaryOperation)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3_reinit((org.eclipse.xtext.xbase.XAssignment)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XFeatureCall)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3_reinit((org.eclipse.xtext.xbase.XPostfixOperation)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XMemberFeatureCall)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XPostfixOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
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
  public static void _visitToAddRelations(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XPostfixOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXAbstractFeatureCallAspectXAbstractFeatureCallAspectProperties _self_;
  
  private static void super_reinit(final XAbstractFeatureCall _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XAbstractFeatureCall _self) {
    orgeclipsextextxbaseXAbstractFeatureCallAspect.super_reinit(_self);
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _typeArguments.forEach(_function);
    XExpression _implicitReceiver = _self.getImplicitReceiver();
    if (_implicitReceiver!=null) {
      __SlicerAspect__.reinit(_implicitReceiver);
    }
    XExpression _implicitFirstArgument = _self.getImplicitFirstArgument();
    if (_implicitFirstArgument!=null) {
      __SlicerAspect__.reinit(_implicitFirstArgument);
    }
  }
  
  private static void super__visitToAddClasses(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXAbstractFeatureCallAspect.super__visitToAddClasses(_self, theSlicer);
    JvmIdentifiableElement _feature = _self.getFeature();
    if (_feature!=null) {
      __SlicerAspect__.visitToAddClasses(_feature, theSlicer);
    }
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _typeArguments.forEach(_function);
    XExpression _implicitReceiver = _self.getImplicitReceiver();
    if (_implicitReceiver!=null) {
      __SlicerAspect__.visitToAddClasses(_implicitReceiver, theSlicer);
    }
    XExpression _implicitFirstArgument = _self.getImplicitFirstArgument();
    if (_implicitFirstArgument!=null) {
      __SlicerAspect__.visitToAddClasses(_implicitFirstArgument, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XAbstractFeatureCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXAbstractFeatureCallAspect.super__visitToAddRelations(_self, theSlicer);
    JvmIdentifiableElement _feature = _self.getFeature();
    boolean _tripleNotEquals = (_feature != null);
    if (_tripleNotEquals) {
      JvmIdentifiableElement _feature_1 = _self.getFeature();
      __SlicerAspect__.visitToAddRelations(_feature_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmIdentifiableElement _feature_2 = _self.getFeature();
        boolean _sliced_1 = __SlicerAspect__.sliced(_feature_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmIdentifiableElement _feature_3 = _self.getFeature();
        theSlicer.onfeatureSliced(_self, _feature_3);
      }
    }
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference _elt) {
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
          theSlicer.ontypeArgumentsSliced(_self, _elt);
        }
      }
    };
    _typeArguments.forEach(_function);
    XExpression _implicitReceiver = _self.getImplicitReceiver();
    boolean _tripleNotEquals_1 = (_implicitReceiver != null);
    if (_tripleNotEquals_1) {
      XExpression _implicitReceiver_1 = _self.getImplicitReceiver();
      __SlicerAspect__.visitToAddRelations(_implicitReceiver_1, theSlicer);
    }
    XExpression _implicitFirstArgument = _self.getImplicitFirstArgument();
    boolean _tripleNotEquals_2 = (_implicitFirstArgument != null);
    if (_tripleNotEquals_2) {
      XExpression _implicitFirstArgument_1 = _self.getImplicitFirstArgument();
      __SlicerAspect__.visitToAddRelations(_implicitFirstArgument_1, theSlicer);
    }
  }
}
