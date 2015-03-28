package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;

@Aspect(className = JvmTypeParameter.class, with = { orgeclipsextextcommontypesJvmComponentTypeAspect.class, orgeclipsextextcommontypesJvmConstraintOwnerAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmTypeParameterAspect extends orgeclipsextextcommontypesJvmComponentTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmTypeParameterAspectJvmTypeParameterAspectProperties _self_;
  
  private static void super_JvmComponentType__visitToAddClasses(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  private static void super_JvmConstraintOwner__visitToAddClasses(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeParameterAspect.super_JvmComponentType__visitToAddClasses(_self, theSlicer);
    orgeclipsextextcommontypesJvmTypeParameterAspect.super_JvmConstraintOwner__visitToAddClasses(_self, theSlicer);
    JvmTypeParameterDeclarator _declarator = _self.getDeclarator();
    if (_declarator!=null) {
      orgeclipsextextcommontypesJvmTypeParameterAspect.visitToAddClasses(_declarator, theSlicer);
    }
  }
  
  private static void super_JvmComponentType__visitToAddRelations(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  private static void super_JvmConstraintOwner__visitToAddRelations(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmConstraintOwnerAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmTypeParameter _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeParameterAspect.super_JvmComponentType__visitToAddRelations(_self, theSlicer);
    orgeclipsextextcommontypesJvmTypeParameterAspect.super_JvmConstraintOwner__visitToAddRelations(_self, theSlicer);
    JvmTypeParameterDeclarator _declarator = _self.getDeclarator();
    boolean _tripleNotEquals = (_declarator != null);
    if (_tripleNotEquals) {
      JvmTypeParameterDeclarator _declarator_1 = _self.getDeclarator();
      orgeclipsextextcommontypesJvmTypeParameterAspect.visitToAddRelations(_declarator_1, theSlicer);
      boolean _and = false;
      boolean _sliced = orgeclipsextextcommontypesJvmTypeParameterAspect.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeParameterDeclarator _declarator_2 = _self.getDeclarator();
        boolean _sliced_1 = orgeclipsextextcommontypesJvmTypeParameterAspect.sliced(_declarator_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeParameterDeclarator _declarator_3 = _self.getDeclarator();
        theSlicer.ondeclaratorSliced(_self, _declarator_3);
      }
    }
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
