package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties;
import org.eclipse.xtext.common.types.JvmShortAnnotationValue;

@Aspect(className = JvmShortAnnotationValue.class, with = { orgeclipsextextcommontypesJvmAnnotationValueAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmShortAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmShortAnnotationValueAspectJvmShortAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmShortAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmShortAnnotationValueAspectJvmShortAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmShortAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmShortAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmShortAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmShortAnnotationValueAspectJvmShortAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmShortAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmShortAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmShortAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
