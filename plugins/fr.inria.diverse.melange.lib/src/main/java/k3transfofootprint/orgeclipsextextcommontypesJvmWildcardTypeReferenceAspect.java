package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;

@Aspect(className = JvmWildcardTypeReference.class, with = { orgeclipsextextcommontypesJvmTypeReferenceAspect.class, orgeclipsextextcommontypesJvmConstraintOwnerAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmWildcardTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmWildcardTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmWildcardTypeReferenceAspectJvmWildcardTypeReferenceAspectProperties _self_;
  
  private static void super_JvmTypeReference__visitToAddClasses(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  private static void super_JvmConstraintOwner__visitToAddClasses(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect.super_JvmTypeReference__visitToAddClasses(_self, theSlicer);
    orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect.super_JvmConstraintOwner__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super_JvmTypeReference__visitToAddRelations(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  private static void super_JvmConstraintOwner__visitToAddRelations(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmWildcardTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect.super_JvmTypeReference__visitToAddRelations(_self, theSlicer);
    orgeclipsextextcommontypesJvmWildcardTypeReferenceAspect.super_JvmConstraintOwner__visitToAddRelations(_self, theSlicer);
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
  
  public static void reinit(final Object _self) {
    __SlicerAspect__.reinit(_self);
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
