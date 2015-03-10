package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue;
import org.eclipse.xtext.common.types.JvmAnnotationReference;

@Aspect(className = JvmAnnotationAnnotationValue.class, with = { orgeclipsextextcommontypesJvmAnnotationValueAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect extends orgeclipsextextcommontypesJvmAnnotationValueAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmAnnotationAnnotationValue _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationValue){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationValue)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspectJvmAnnotationAnnotationValueAspectProperties _self_;
  
  private static void super_reinit(final JvmAnnotationAnnotationValue _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmAnnotationAnnotationValue _self) {
    orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect.super_reinit(_self);
    EList<JvmAnnotationReference> _values = _self.getValues();
    final Consumer<JvmAnnotationReference> _function = new Consumer<JvmAnnotationReference>() {
      public void accept(final JvmAnnotationReference it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _values.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmAnnotationReference> _values = _self.getValues();
    final Consumer<JvmAnnotationReference> _function = new Consumer<JvmAnnotationReference>() {
      public void accept(final JvmAnnotationReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _values.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationValueAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmAnnotationAnnotationValue _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationAnnotationValueAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmAnnotationReference> _values = _self.getValues();
    final Consumer<JvmAnnotationReference> _function = new Consumer<JvmAnnotationReference>() {
      public void accept(final JvmAnnotationReference _elt) {
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
