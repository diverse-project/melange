package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationTarget;

@Aspect(className = JvmAnnotationTarget.class, with = { orgeclipsextextcommontypesJvmIdentifiableElementAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmAnnotationTargetAspect extends orgeclipsextextcommontypesJvmIdentifiableElementAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmAnnotationTarget _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmField)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmOperation)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmFormalParameter)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmFeature)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmMember){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmMember)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationTarget){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmAnnotationTarget)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFormalParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFormalParameterAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFormalParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmDeclaredType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmDeclaredType)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmAnnotationTargetAspectJvmAnnotationTargetAspectProperties _self_;
  
  private static void super_reinit(final JvmAnnotationTarget _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmAnnotationTarget _self) {
    orgeclipsextextcommontypesJvmAnnotationTargetAspect.super_reinit(_self);
    EList<JvmAnnotationReference> _annotations = _self.getAnnotations();
    final Consumer<JvmAnnotationReference> _function = new Consumer<JvmAnnotationReference>() {
      public void accept(final JvmAnnotationReference it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _annotations.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationTargetAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmAnnotationReference> _annotations = _self.getAnnotations();
    final Consumer<JvmAnnotationReference> _function = new Consumer<JvmAnnotationReference>() {
      public void accept(final JvmAnnotationReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _annotations.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmIdentifiableElementAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmAnnotationTarget _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationTargetAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmAnnotationReference> _annotations = _self.getAnnotations();
    final Consumer<JvmAnnotationReference> _function = new Consumer<JvmAnnotationReference>() {
      public void accept(final JvmAnnotationReference _elt) {
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
          theSlicer.onannotationsSliced(_self, _elt);
        }
      }
    };
    _annotations.forEach(_function);
  }
}
