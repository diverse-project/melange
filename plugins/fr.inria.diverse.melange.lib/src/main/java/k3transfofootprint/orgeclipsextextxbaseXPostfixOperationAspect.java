package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect;
import k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XPostfixOperation;

@Aspect(className = XPostfixOperation.class, with = { orgeclipsextextxbaseXAbstractFeatureCallAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXPostfixOperationAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void reinit(final XPostfixOperation _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3_reinit((org.eclipse.xtext.xbase.XPostfixOperation)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XPostfixOperation _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XPostfixOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XPostfixOperation _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XPostfixOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXPostfixOperationAspectXPostfixOperationAspectProperties _self_;
  
  private static void super_reinit(final XPostfixOperation _self) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XPostfixOperation _self) {
    orgeclipsextextxbaseXPostfixOperationAspect.super_reinit(_self);
    XExpression _operand = _self.getOperand();
    if (_operand!=null) {
      __SlicerAspect__.reinit(_operand);
    }
  }
  
  private static void super__visitToAddClasses(final XPostfixOperation _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XPostfixOperation _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXPostfixOperationAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _operand = _self.getOperand();
    if (_operand!=null) {
      __SlicerAspect__.visitToAddClasses(_operand, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XPostfixOperation _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XPostfixOperation _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXPostfixOperationAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _operand = _self.getOperand();
    boolean _tripleNotEquals = (_operand != null);
    if (_tripleNotEquals) {
      XExpression _operand_1 = _self.getOperand();
      __SlicerAspect__.visitToAddRelations(_operand_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _operand_2 = _self.getOperand();
        boolean _sliced_1 = __SlicerAspect__.sliced(_operand_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _operand_3 = _self.getOperand();
        theSlicer.onoperandSliced(_self, _operand_3);
      }
    }
  }
}
