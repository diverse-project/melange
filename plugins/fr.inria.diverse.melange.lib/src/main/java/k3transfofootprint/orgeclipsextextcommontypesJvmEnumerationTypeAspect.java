package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;

@Aspect(className = JvmEnumerationType.class, with = { orgeclipsextextcommontypesJvmDeclaredTypeAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmEnumerationTypeAspect extends orgeclipsextextcommontypesJvmDeclaredTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmEnumerationType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmEnumerationTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmEnumerationType)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmEnumerationTypeAspectJvmEnumerationTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmEnumerationTypeAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmEnumerationLiteral> _literals = _self.getLiterals();
    final Consumer<JvmEnumerationLiteral> _function = new Consumer<JvmEnumerationLiteral>() {
      public void accept(final JvmEnumerationLiteral it) {
        orgeclipsextextcommontypesJvmDeclaredTypeAspect.visitToAddClasses(it, theSlicer);
      }
    };
    _literals.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmDeclaredTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmEnumerationType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmEnumerationTypeAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmEnumerationLiteral> _literals = _self.getLiterals();
    final Consumer<JvmEnumerationLiteral> _function = new Consumer<JvmEnumerationLiteral>() {
      public void accept(final JvmEnumerationLiteral _elt) {
        orgeclipsextextcommontypesJvmDeclaredTypeAspect.visitToAddRelations(_elt, theSlicer);
      }
    };
    _literals.forEach(_function);
  }
}
