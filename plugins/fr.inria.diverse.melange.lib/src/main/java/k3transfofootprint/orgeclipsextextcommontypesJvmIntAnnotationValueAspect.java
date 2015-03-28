package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmIntAnnotationValueAspectJvmIntAnnotationValueAspectProperties;
import org.eclipse.xtext.common.types.JvmIntAnnotationValue;

@Aspect(className = JvmIntAnnotationValue.class, with = { orgeclipsextextcommontypesJvmAnnotationValueAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmIntAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmIntAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmIntAnnotationValueAspectJvmIntAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIntAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmIntAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmIntAnnotationValueAspectJvmIntAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmIntAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIntAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmIntAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmIntAnnotationValueAspectJvmIntAnnotationValueAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmIntAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmIntAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmIntAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmIntAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmIntAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmIntAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
