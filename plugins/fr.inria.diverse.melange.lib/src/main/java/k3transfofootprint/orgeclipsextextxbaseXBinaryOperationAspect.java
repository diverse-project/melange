package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect;
import k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XBinaryOperation.class, with = { orgeclipsextextxbaseXAbstractFeatureCallAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXBinaryOperationAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void reinit(final XBinaryOperation _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3_reinit((org.eclipse.xtext.xbase.XBinaryOperation)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXBinaryOperationAspectXBinaryOperationAspectProperties _self_;
  
  private static void super_reinit(final XBinaryOperation _self) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XBinaryOperation _self) {
    orgeclipsextextxbaseXBinaryOperationAspect.super_reinit(_self);
    XExpression _leftOperand = _self.getLeftOperand();
    if (_leftOperand!=null) {
      __SlicerAspect__.reinit(_leftOperand);
    }
    XExpression _rightOperand = _self.getRightOperand();
    if (_rightOperand!=null) {
      __SlicerAspect__.reinit(_rightOperand);
    }
  }
  
  private static void super__visitToAddClasses(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXBinaryOperationAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _leftOperand = _self.getLeftOperand();
    if (_leftOperand!=null) {
      __SlicerAspect__.visitToAddClasses(_leftOperand, theSlicer);
    }
    XExpression _rightOperand = _self.getRightOperand();
    if (_rightOperand!=null) {
      __SlicerAspect__.visitToAddClasses(_rightOperand, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XBinaryOperation _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXBinaryOperationAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _leftOperand = _self.getLeftOperand();
    boolean _tripleNotEquals = (_leftOperand != null);
    if (_tripleNotEquals) {
      XExpression _leftOperand_1 = _self.getLeftOperand();
      __SlicerAspect__.visitToAddRelations(_leftOperand_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _leftOperand_2 = _self.getLeftOperand();
        boolean _sliced_1 = __SlicerAspect__.sliced(_leftOperand_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _leftOperand_3 = _self.getLeftOperand();
        theSlicer.onleftOperandSliced(_self, _leftOperand_3);
      }
    }
    XExpression _rightOperand = _self.getRightOperand();
    boolean _tripleNotEquals_1 = (_rightOperand != null);
    if (_tripleNotEquals_1) {
      XExpression _rightOperand_1 = _self.getRightOperand();
      __SlicerAspect__.visitToAddRelations(_rightOperand_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _rightOperand_2 = _self.getRightOperand();
        boolean _sliced_3 = __SlicerAspect__.sliced(_rightOperand_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _rightOperand_3 = _self.getRightOperand();
        theSlicer.onrightOperandSliced(_self, _rightOperand_3);
      }
    }
  }
}
