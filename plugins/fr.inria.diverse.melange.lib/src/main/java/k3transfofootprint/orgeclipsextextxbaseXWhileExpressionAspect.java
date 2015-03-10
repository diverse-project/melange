package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspectXWhileExpressionAspectProperties;
import org.eclipse.xtext.xbase.XWhileExpression;

@Aspect(className = XWhileExpression.class, with = { orgeclipsextextxbaseXAbstractWhileExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXWhileExpressionAspect extends orgeclipsextextxbaseXAbstractWhileExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspectXWhileExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspectXWhileExpressionAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractWhileExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractWhileExpression)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXWhileExpressionAspectXWhileExpressionAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXWhileExpressionAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractWhileExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XWhileExpression _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXWhileExpressionAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
