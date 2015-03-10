package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;

@Aspect(className = JvmParameterizedTypeReference.class, with = { orgeclipsextextcommontypesJvmTypeReferenceAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect extends orgeclipsextextcommontypesJvmTypeReferenceAspect {
  @OverrideAspectMethod
  public static void reinit(final JvmParameterizedTypeReference _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmInnerTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmInnerTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmInnerTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmParameterizedTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.common.types.JvmTypeReference){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeReference)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspectJvmParameterizedTypeReferenceAspectProperties _self_;
  
  private static void super_reinit(final JvmParameterizedTypeReference _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmParameterizedTypeReference _self) {
    orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect.super_reinit(_self);
    EList<JvmTypeReference> _arguments = _self.getArguments();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _arguments.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeReference> _arguments = _self.getArguments();
    final Consumer<JvmTypeReference> _function = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _arguments.forEach(_function);
    JvmType _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextcommontypesJvmTypeReferenceAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmParameterizedTypeReference _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmParameterizedTypeReferenceAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeReference> _arguments = _self.getArguments();
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
          theSlicer.onargumentsSliced(_self, _elt);
        }
      }
    };
    _arguments.forEach(_function);
    JvmType _type = _self.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      JvmType _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmType _type_2 = _self.getType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_type_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmType _type_3 = _self.getType();
        theSlicer.ontypeSliced(_self, _type_3);
      }
    }
  }
}
