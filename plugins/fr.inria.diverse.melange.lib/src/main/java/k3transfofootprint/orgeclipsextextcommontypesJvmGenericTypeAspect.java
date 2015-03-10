package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;

@Aspect(className = JvmGenericType.class, with = { orgeclipsextextcommontypesJvmDeclaredTypeAspect.class, orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmGenericTypeAspect extends orgeclipsextextcommontypesJvmDeclaredTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
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
  public static void _visitToAddRelations(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmGenericType){
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
  
  public static orgeclipsextextcommontypesJvmGenericTypeAspectJvmGenericTypeAspectProperties _self_;
  
  private static void super_JvmDeclaredType__visitToAddClasses(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  private static void super_JvmTypeParameterDeclarator__visitToAddClasses(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmGenericTypeAspect.super_JvmDeclaredType__visitToAddClasses(_self, theSlicer);
    orgeclipsextextcommontypesJvmGenericTypeAspect.super_JvmTypeParameterDeclarator__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super_JvmDeclaredType__visitToAddRelations(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  private static void super_JvmTypeParameterDeclarator__visitToAddRelations(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmGenericType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmGenericTypeAspect.super_JvmDeclaredType__visitToAddRelations(_self, theSlicer);
    orgeclipsextextcommontypesJvmGenericTypeAspect.super_JvmTypeParameterDeclarator__visitToAddRelations(_self, theSlicer);
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
