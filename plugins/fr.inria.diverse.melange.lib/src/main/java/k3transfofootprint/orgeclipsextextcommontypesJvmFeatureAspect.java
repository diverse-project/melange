package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmGenericType;

@Aspect(className = JvmFeature.class, with = { orgeclipsextextcommontypesJvmMemberAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmFeatureAspect extends orgeclipsextextcommontypesJvmMemberAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmFeature _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmField)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmOperation)_self);
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
  public static void _visitToAddClasses(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationLiteralAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationLiteral){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationLiteralAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmField){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFieldAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmField)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmConstructorAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmConstructor)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmOperation){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmOperationAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmExecutable){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmExecutable)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmFeature){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmFeature)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmFeatureAspectJvmFeatureAspectProperties _self_;
  
  private static void super_reinit(final JvmFeature _self) {
     k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmFeature _self) {
    orgeclipsextextcommontypesJvmFeatureAspect.super_reinit(_self);
    EList<JvmGenericType> _localClasses = _self.getLocalClasses();
    final Consumer<JvmGenericType> _function = new Consumer<JvmGenericType>() {
      public void accept(final JvmGenericType it) {
        orgeclipsextextcommontypesJvmMemberAspect.reinit(it);
      }
    };
    _localClasses.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmFeatureAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmGenericType> _localClasses = _self.getLocalClasses();
    final Consumer<JvmGenericType> _function = new Consumer<JvmGenericType>() {
      public void accept(final JvmGenericType it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _localClasses.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmFeature _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmFeatureAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmGenericType> _localClasses = _self.getLocalClasses();
    final Consumer<JvmGenericType> _function = new Consumer<JvmGenericType>() {
      public void accept(final JvmGenericType _elt) {
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
          theSlicer.onlocalClassesSliced(_self, _elt);
        }
      }
    };
    _localClasses.forEach(_function);
  }
}
