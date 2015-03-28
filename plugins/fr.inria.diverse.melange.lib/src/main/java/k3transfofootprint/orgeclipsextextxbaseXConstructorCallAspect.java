package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XConstructorCall.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXConstructorCallAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XConstructorCall _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    	      k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XConstructorCall)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    	      k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XConstructorCall){
    	      k3transfofootprint.orgeclipsextextxbaseXConstructorCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XConstructorCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXConstructorCallAspectXConstructorCallAspectProperties _self_;
  
  private static void super_reinit(final XConstructorCall _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XConstructorCall _self) {
    orgeclipsextextxbaseXConstructorCallAspect.super_reinit(_self);
    EList<XExpression> _arguments = _self.getArguments();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _arguments.forEach(_function);
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Consumer<JvmTypeReference> _function_1 = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _typeArguments.forEach(_function_1);
  }
  
  private static void super__visitToAddClasses(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXConstructorCallAspect.super__visitToAddClasses(_self, theSlicer);
    JvmConstructor _constructor = _self.getConstructor();
    if (_constructor!=null) {
      __SlicerAspect__.visitToAddClasses(_constructor, theSlicer);
    }
    EList<XExpression> _arguments = _self.getArguments();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _arguments.forEach(_function);
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Consumer<JvmTypeReference> _function_1 = new Consumer<JvmTypeReference>() {
      public void accept(final JvmTypeReference it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _typeArguments.forEach(_function_1);
  }
  
  private static void super__visitToAddRelations(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XConstructorCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXConstructorCallAspect.super__visitToAddRelations(_self, theSlicer);
    JvmConstructor _constructor = _self.getConstructor();
    boolean _tripleNotEquals = (_constructor != null);
    if (_tripleNotEquals) {
      JvmConstructor _constructor_1 = _self.getConstructor();
      __SlicerAspect__.visitToAddRelations(_constructor_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmConstructor _constructor_2 = _self.getConstructor();
        boolean _sliced_1 = __SlicerAspect__.sliced(_constructor_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmConstructor _constructor_3 = _self.getConstructor();
        theSlicer.onconstructorSliced(_self, _constructor_3);
      }
    }
    EList<XExpression> _arguments = _self.getArguments();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression _elt) {
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
    EList<JvmTypeReference> _typeArguments = _self.getTypeArguments();
    final Consumer<JvmTypeReference> _function_1 = new Consumer<JvmTypeReference>() {
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
          theSlicer.ontypeArgumentsSliced(_self, _elt);
        }
      }
    };
    _typeArguments.forEach(_function_1);
  }
}
