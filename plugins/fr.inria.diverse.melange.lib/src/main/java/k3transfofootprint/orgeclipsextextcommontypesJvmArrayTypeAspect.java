package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmComponentType;

@Aspect(className = JvmArrayType.class, with = { orgeclipsextextcommontypesJvmComponentTypeAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmArrayTypeAspect extends orgeclipsextextcommontypesJvmComponentTypeAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
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
  public static void _visitToAddRelations(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmArrayTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmArrayType)_self,theSlicer);
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
  
  public static orgeclipsextextcommontypesJvmArrayTypeAspectJvmArrayTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmArrayTypeAspect.super__visitToAddClasses(_self, theSlicer);
    JvmComponentType _componentType = _self.getComponentType();
    if (_componentType!=null) {
      __SlicerAspect__.visitToAddClasses(_componentType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmArrayType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmArrayTypeAspect.super__visitToAddRelations(_self, theSlicer);
    JvmComponentType _componentType = _self.getComponentType();
    boolean _tripleNotEquals = (_componentType != null);
    if (_tripleNotEquals) {
      JvmComponentType _componentType_1 = _self.getComponentType();
      __SlicerAspect__.visitToAddRelations(_componentType_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmComponentType _componentType_2 = _self.getComponentType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_componentType_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmComponentType _componentType_3 = _self.getComponentType();
        theSlicer.oncomponentTypeSliced(_self, _componentType_3);
      }
    }
  }
}
