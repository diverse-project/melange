package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;

@Aspect(className = JvmTypeParameterDeclarator.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void reinit(final JvmTypeParameterDeclarator _self) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameterDeclarator){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect._privk3_reinit((org.eclipse.xtext.common.types.JvmTypeParameterDeclarator)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameterDeclarator){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect._privk3__visitToAddClasses((org.eclipse.xtext.common.types.JvmTypeParameterDeclarator)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.common.types.JvmTypeParameterDeclarator){
    	      k3transfofootprint.orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect._privk3__visitToAddRelations((org.eclipse.xtext.common.types.JvmTypeParameterDeclarator)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspectJvmTypeParameterDeclaratorAspectProperties _self_;
  
  private static void super_reinit(final JvmTypeParameterDeclarator _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final JvmTypeParameterDeclarator _self) {
    orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect.super_reinit(_self);
    EList<JvmTypeParameter> _typeParameters = _self.getTypeParameters();
    final Consumer<JvmTypeParameter> _function = new Consumer<JvmTypeParameter>() {
      public void accept(final JvmTypeParameter it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _typeParameters.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect.super__visitToAddClasses(_self, theSlicer);
    EList<JvmTypeParameter> _typeParameters = _self.getTypeParameters();
    final Consumer<JvmTypeParameter> _function = new Consumer<JvmTypeParameter>() {
      public void accept(final JvmTypeParameter it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _typeParameters.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final JvmTypeParameterDeclarator _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextcommontypesJvmTypeParameterDeclaratorAspect.super__visitToAddRelations(_self, theSlicer);
    EList<JvmTypeParameter> _typeParameters = _self.getTypeParameters();
    final Consumer<JvmTypeParameter> _function = new Consumer<JvmTypeParameter>() {
      public void accept(final JvmTypeParameter _elt) {
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
          theSlicer.ontypeParametersSliced(_self, _elt);
        }
      }
    };
    _typeParameters.forEach(_function);
  }
}
