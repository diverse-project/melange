package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties;
import org.eclipse.xtext.common.types.JvmPrimitiveType;

@Aspect(className = JvmPrimitiveType.class, with = { orgeclipsextextcommontypesJvmComponentTypeAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmPrimitiveTypeAspect extends orgeclipsextextcommontypesJvmComponentTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmPrimitiveTypeAspectJvmPrimitiveTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmPrimitiveTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmPrimitiveType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmPrimitiveTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
