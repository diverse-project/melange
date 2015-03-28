package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmExecutable.class, with = { orgeclipsextextcommontypesJvmFeatureAspect.class, orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmExecutableAspect extends orgeclipsextextcommontypesJvmFeatureAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
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
  public static void _visitToAddRelations(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmConstructor){
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
  
  public static orgeclipsextextcommontypesJvmExecutableAspectJvmExecutableAspectProperties _self_;
  
  private static void super_JvmFeature__visitToAddClasses(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  private static void super_JvmTypeParameterDeclarator__visitToAddClasses(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmExecutableAspect.super_JvmFeature__visitToAddClasses(_self, theSlicer);
    orgeclipsextextcommontypesJvmExecutableAspect.super_JvmTypeParameterDeclarator__visitToAddClasses(_self, theSlicer);
    EList<JvmFormalParameter> _parameters = _self.getParameters();
    final Consumer<JvmFormalParameter> _function = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter it) {
        orgeclipsextextcommontypesJvmExecutableAspect.visitToAddClasses(it, theSlicer);
      }
    };
    _parameters.forEach(_function);
    EList<JvmTypeReference> _exceptions = _self.getExceptions();
    final Consumer<JvmTypeReference> _function_1 = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        orgeclipsextextcommontypesJvmExecutableAspect.visitToAddClasses(it, theSlicer);
      }
    };
    _exceptions.forEach(_function_1);
  }
  
  private static void super_JvmFeature__visitToAddRelations(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmFeatureAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  private static void super_JvmTypeParameterDeclarator__visitToAddRelations(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmExecutable _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmExecutableAspect.super_JvmFeature__visitToAddRelations(_self, theSlicer);
    orgeclipsextextcommontypesJvmExecutableAspect.super_JvmTypeParameterDeclarator__visitToAddRelations(_self, theSlicer);
    EList<JvmFormalParameter> _parameters = _self.getParameters();
    final Consumer<JvmFormalParameter> _function = new Consumer<JvmFormalParameter>() {
      public void accept(final JvmFormalParameter _elt) {
        orgeclipsextextcommontypesJvmExecutableAspect.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          theSlicer.onparametersSliced(_self, _elt);
        }
      }
    };
    _parameters.forEach(_function);
    EList<JvmTypeReference> _exceptions = _self.getExceptions();
    final Consumer<JvmTypeReference> _function_1 = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference _elt) {
        orgeclipsextextcommontypesJvmExecutableAspect.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = orgeclipsextextcommontypesJvmExecutableAspect.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          theSlicer.onexceptionsSliced(_self, _elt);
        }
      }
    };
    _exceptions.forEach(_function_1);
  }
  
  public static void reinit(final JvmTypeParameterDeclarator _self) {
    orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect.reinit(_self);
  }
  
  public static void visitToAddClasses(final Object _self, final K3TransfoFootprint theSlicer) {
    __SlicerAspect__.visitToAddClasses(_self,theSlicer);
  }
  
  public static void visitToAddRelations(final Object _self, final K3TransfoFootprint theSlicer) {
    __SlicerAspect__.visitToAddRelations(_self,theSlicer);
  }
  
  public static void feedOpposites(final Object _self) {
    __SlicerAspect__.feedOpposites(_self);
  }
  
  public static boolean visitedForRelations(final Object _self) {
    return __SlicerAspect__.visitedForRelations(_self);
  }
  
  public static boolean sliced(final Object _self) {
    return __SlicerAspect__.sliced(_self);
  }
  
  public static EObject clonedElt(final Object _self) {
    return __SlicerAspect__.clonedElt(_self);
  }
}
