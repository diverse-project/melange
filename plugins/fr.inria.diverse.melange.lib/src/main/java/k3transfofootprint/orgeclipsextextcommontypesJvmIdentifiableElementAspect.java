package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;

@Aspect(className = JvmIdentifiableElement.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmIdentifiableElementAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmVoidAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmVoid){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmVoidAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmVoid)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmComponentType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmMember)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmIdentifiableElement){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmIdentifiableElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmIdentifiableElementAspectJvmIdentifiableElementAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    theSlicer.onJvmIdentifiableElementSliced(_self);
    orgeclipsextextcommontypesJvmIdentifiableElementAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmIdentifiableElement _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmIdentifiableElementAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
