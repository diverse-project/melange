package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmGenericArrayTypeReference.class, with = { orgeclipsextextcommontypesJvmTypeReferenceAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmGenericArrayTypeReference _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmGenericArrayTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmGenericArrayTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspectJvmGenericArrayTypeReferenceAspectProperties _self_;
  
  private static void super_reinit(final JvmGenericArrayTypeReference _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmGenericArrayTypeReference _self) {
    orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect.super_reinit(_self);
    JvmTypeReference _componentType = _self.getComponentType();
    if (_componentType!=null) {
      __SlicerAspect__.reinit(_componentType);
    }
  }
  
  private static void super__visitToAddClasses(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _componentType = _self.getComponentType();
    if (_componentType!=null) {
      __SlicerAspect__.visitToAddClasses(_componentType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmGenericArrayTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmGenericArrayTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _componentType = _self.getComponentType();
    boolean _tripleNotEquals = (_componentType != null);
    if (_tripleNotEquals) {
      JvmTypeReference _componentType_1 = _self.getComponentType();
      __SlicerAspect__.visitToAddRelations(_componentType_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _componentType_2 = _self.getComponentType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_componentType_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _componentType_3 = _self.getComponentType();
        theSlicer.oncomponentTypeSliced(_self, _componentType_3);
      }
    }
  }
}
