package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties;
import org.eclipse.xtext.xbase.XStringLiteral;

@Aspect(className = XStringLiteral.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXStringLiteralAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XStringLiteral){
    	      k3transfofootprint.orgeclipsextextxbaseXStringLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XStringLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXStringLiteralAspectXStringLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXStringLiteralAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XStringLiteral _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXStringLiteralAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
