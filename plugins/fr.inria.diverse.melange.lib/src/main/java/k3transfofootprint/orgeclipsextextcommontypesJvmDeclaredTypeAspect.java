package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmComponentType;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmDeclaredType.class, with = { orgeclipsextextcommontypesJvmMemberAspect.class, orgeclipsextextcommontypesJvmComponentTypeAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmDeclaredTypeAspect extends orgeclipsextextcommontypesJvmMemberAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericType)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmDeclaredTypeAspectJvmDeclaredTypeAspectProperties _self_;
  
  private static void super_JvmMember__visitToAddClasses(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  private static void super_JvmComponentType__visitToAddClasses(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmDeclaredTypeAspect.super_JvmMember__visitToAddClasses(_self, theSlicer);
    orgeclipsextextcommontypesJvmDeclaredTypeAspect.super_JvmComponentType__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeReference> _superTypes = _self.getSuperTypes();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        orgeclipsextextcommontypesJvmDeclaredTypeAspect.visitToAddClasses(it, theSlicer);
      }
    };
    _superTypes.forEach(_function);
    EList<JvmMember> _members = _self.getMembers();
    final Consumer<JvmMember> _function_1 = new Consumer<JvmMember>() {
      public void accept(final JvmMember it) {
        orgeclipsextextcommontypesJvmDeclaredTypeAspect.visitToAddClasses(it, theSlicer);
      }
    };
    _members.forEach(_function_1);
  }
  
  private static void super_JvmMember__visitToAddRelations(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmMemberAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  private static void super_JvmComponentType__visitToAddRelations(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmDeclaredType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmDeclaredTypeAspect.super_JvmMember__visitToAddRelations(_self, theSlicer);
    orgeclipsextextcommontypesJvmDeclaredTypeAspect.super_JvmComponentType__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeReference> _superTypes = _self.getSuperTypes();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference _elt) {
        orgeclipsextextcommontypesJvmDeclaredTypeAspect.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = orgeclipsextextcommontypesJvmDeclaredTypeAspect.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = orgeclipsextextcommontypesJvmDeclaredTypeAspect.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          theSlicer.onsuperTypesSliced(_self, _elt);
        }
      }
    };
    _superTypes.forEach(_function);
    EList<JvmMember> _members = _self.getMembers();
    final Consumer<JvmMember> _function_1 = new Consumer<JvmMember>() {
      public void accept(final JvmMember _elt) {
        orgeclipsextextcommontypesJvmDeclaredTypeAspect.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _sliced = orgeclipsextextcommontypesJvmDeclaredTypeAspect.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          boolean _sliced_1 = orgeclipsextextcommontypesJvmDeclaredTypeAspect.sliced(_elt);
          _and = _sliced_1;
        }
        if (_and) {
          theSlicer.onmembersSliced(_self, _elt);
        }
      }
    };
    _members.forEach(_function_1);
  }
  
  public static void reinit(final JvmComponentType _self) {
    orgeclipsextextcommontypesJvmComponentTypeAspect.reinit(_self);
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
