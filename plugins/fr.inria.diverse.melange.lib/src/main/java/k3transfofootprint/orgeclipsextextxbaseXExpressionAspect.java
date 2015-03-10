package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XExpression.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextxbaseXExpressionAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXExpressionAspectXExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XNullLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXNullLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XNullLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXListLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXSetLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XReturnExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XReturnExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    	      k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XSynchronizedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XSynchronizedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XPostfixOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    	      k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XThrowExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXThrowExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XThrowExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXCollectionLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXTypeLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXNumberLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XInstanceOfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XInstanceOfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XTryCatchFinallyExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XTryCatchFinallyExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBooleanLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXBooleanLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBooleanLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBasicForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XBasicForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    	      k3transfofootprint.orgeclipsextextxbaseXClosureAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXDoWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXExpressionAspectXExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XNullLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXNullLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XNullLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XListLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXListLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XListLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XUnaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXUnaryOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XUnaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XSetLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXSetLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XSetLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XReturnExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXReturnExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XReturnExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    	      k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBlockExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBlockExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBlockExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XSynchronizedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSynchronizedExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XSynchronizedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XPostfixOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXPostfixOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XPostfixOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    	      k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XThrowExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXThrowExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XThrowExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XIfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXIfExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XIfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XCollectionLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXCollectionLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XCollectionLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XMemberFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXMemberFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XMemberFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBinaryOperation){
    	      k3transfofootprint.orgeclipsextextxbaseXBinaryOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBinaryOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XTypeLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXTypeLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XTypeLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XCastedExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXCastedExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XCastedExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAssignment){
    	      k3transfofootprint.orgeclipsextextxbaseXAssignmentAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAssignment)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XNumberLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXNumberLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XNumberLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XInstanceOfExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXInstanceOfExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XInstanceOfExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XTryCatchFinallyExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXTryCatchFinallyExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XTryCatchFinallyExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XSwitchExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXSwitchExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XSwitchExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBooleanLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXBooleanLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBooleanLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XBasicForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXBasicForLoopExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XBasicForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XForLoopExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXForLoopExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XForLoopExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XClosure){
    	      k3transfofootprint.orgeclipsextextxbaseXClosureAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XClosure)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XDoWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXDoWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XDoWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXExpressionAspectXExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXExpressionAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXExpressionAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
