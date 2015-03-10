package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspect;
import org.eclipse.xtext.common.types.JvmArrayType;
import org.eclipse.xtext.common.types.JvmComponentType;

@Aspect(className = JvmComponentType.class, with = { orgeclipsextextcommontypesJvmTypeAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmComponentTypeAspect extends orgeclipsextextcommontypesJvmTypeAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmComponentType _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmComponentType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmComponentType)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
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
  public static void _visitToAddRelations(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmPrimitiveType){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmPrimitiveTypeAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmPrimitiveType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameter){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmArrayType){
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
  
  public static orgeclipsextextcommontypesJvmComponentTypeAspectJvmComponentTypeAspectProperties _self_;
  
  private static void super_reinit(final JvmComponentType _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmComponentType _self) {
    orgeclipsextextcommontypesJvmComponentTypeAspect.super_reinit(_self);
    JvmArrayType _arrayType = _self.getArrayType();
    if (_arrayType!=null) {
      orgeclipsextextcommontypesJvmComponentTypeAspect.reinit(_arrayType);
    }
  }
  
  private static void super__visitToAddClasses(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmComponentTypeAspect.super__visitToAddClasses(_self, theSlicer);
    JvmArrayType _arrayType = _self.getArrayType();
    if (_arrayType!=null) {
      __SlicerAspect__.visitToAddClasses(_arrayType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmComponentType _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmComponentTypeAspect.super__visitToAddRelations(_self, theSlicer);
    JvmArrayType _arrayType = _self.getArrayType();
    boolean _tripleNotEquals = (_arrayType != null);
    if (_tripleNotEquals) {
      JvmArrayType _arrayType_1 = _self.getArrayType();
      __SlicerAspect__.visitToAddRelations(_arrayType_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmArrayType _arrayType_2 = _self.getArrayType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_arrayType_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmArrayType _arrayType_3 = _self.getArrayType();
        theSlicer.onarrayTypeSliced(_self, _arrayType_3);
      }
    }
  }
}
