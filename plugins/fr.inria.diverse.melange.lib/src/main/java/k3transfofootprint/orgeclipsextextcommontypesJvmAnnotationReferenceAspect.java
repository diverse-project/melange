package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;

@Aspect(className = JvmAnnotationReference.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmAnnotationReferenceAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void reinit(final JvmAnnotationReference _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmAnnotationReference)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmAnnotationReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmAnnotationReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmAnnotationReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmAnnotationReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmAnnotationReferenceAspectJvmAnnotationReferenceAspectProperties _self_;
  
  private static void super_reinit(final JvmAnnotationReference _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmAnnotationReference _self) {
    orgeclipsextextcommontypesJvmAnnotationReferenceAspect.super_reinit(_self);
    EList<JvmAnnotationValue> _explicitValues = _self.getExplicitValues();
    final Consumer<JvmAnnotationValue> _function = new Consumer<JvmAnnotationValue>() {
      public void accept(final JvmAnnotationValue it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _explicitValues.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    JvmAnnotationType _annotation = _self.getAnnotation();
    if (_annotation!=null) {
      __SlicerAspect__.visitToAddClasses(_annotation, theSlicer);
    }
    EList<JvmAnnotationValue> _explicitValues = _self.getExplicitValues();
    final Consumer<JvmAnnotationValue> _function = new Consumer<JvmAnnotationValue>() {
      public void accept(final JvmAnnotationValue it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _explicitValues.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmAnnotationReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmAnnotationReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    JvmAnnotationType _annotation = _self.getAnnotation();
    boolean _tripleNotEquals = (_annotation != null);
    if (_tripleNotEquals) {
      JvmAnnotationType _annotation_1 = _self.getAnnotation();
      __SlicerAspect__.visitToAddRelations(_annotation_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmAnnotationType _annotation_2 = _self.getAnnotation();
        boolean _sliced_1 = __SlicerAspect__.sliced(_annotation_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmAnnotationType _annotation_3 = _self.getAnnotation();
        theSlicer.onannotationSliced(_self, _annotation_3);
      }
    }
    EList<JvmAnnotationValue> _explicitValues = _self.getExplicitValues();
    final Consumer<JvmAnnotationValue> _function = new Consumer<JvmAnnotationValue>() {
      public void accept(final JvmAnnotationValue _elt) {
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
          theSlicer.onexplicitValuesSliced(_self, _elt);
        }
      }
    };
    _explicitValues.forEach(_function);
  }
}
