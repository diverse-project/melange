package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmTypeAnnotationValue;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmTypeAnnotationValue.class, with = { orgeclipsextextcommontypesJvmAnnotationValueAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmTypeAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmTypeAnnotationValue _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmTypeAnnotationValueAspectJvmTypeAnnotationValueAspectProperties _self_;
  
  private static void super_reinit(final JvmTypeAnnotationValue _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmTypeAnnotationValue _self) {
    orgeclipsextextcommontypesJvmTypeAnnotationValueAspect.super_reinit(_self);
    EList<JvmTypeReference> _values = _self.getValues();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _values.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeReference> _values = _self.getValues();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _values.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmTypeAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeReference> _values = _self.getValues();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference _elt) {
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
          theSlicer.onvaluesSliced(_self, _elt);
        }
      }
    };
    _values.forEach(_function);
  }
}
