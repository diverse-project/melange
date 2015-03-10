package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXExpressionAspect;
import k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;

@Aspect(className = XVariableDeclaration.class, with = { orgeclipsextextxbaseXExpressionAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXVariableDeclarationAspect extends orgeclipsextextxbaseXExpressionAspect {
  @OverrideAspectMethod
  public static void reinit(final XVariableDeclaration _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    	      k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspect._privk3_reinit((org.eclipse.xtext.xbase.XVariableDeclaration)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    	      k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XVariableDeclaration){
    	      k3transfofootprint.orgeclipsextextxbaseXVariableDeclarationAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XVariableDeclaration)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXVariableDeclarationAspectXVariableDeclarationAspectProperties _self_;
  
  private static void super_reinit(final XVariableDeclaration _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XVariableDeclaration _self) {
    orgeclipsextextxbaseXVariableDeclarationAspect.super_reinit(_self);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.reinit(_type);
    }
    XExpression _right = _self.getRight();
    if (_right!=null) {
      __SlicerAspect__.reinit(_right);
    }
  }
  
  private static void super__visitToAddClasses(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXVariableDeclarationAspect.super__visitToAddClasses(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    if (_type!=null) {
      __SlicerAspect__.visitToAddClasses(_type, theSlicer);
    }
    XExpression _right = _self.getRight();
    if (_right!=null) {
      __SlicerAspect__.visitToAddClasses(_right, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XVariableDeclaration _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXVariableDeclarationAspect.super__visitToAddRelations(_self, theSlicer);
    JvmTypeReference _type = _self.getType();
    boolean _tripleNotEquals = (_type != null);
    if (_tripleNotEquals) {
      JvmTypeReference _type_1 = _self.getType();
      __SlicerAspect__.visitToAddRelations(_type_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        JvmTypeReference _type_2 = _self.getType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_type_2);
        _and = _sliced_1;
      }
      if (_and) {
        JvmTypeReference _type_3 = _self.getType();
        theSlicer.ontypeSliced(_self, _type_3);
      }
    }
    XExpression _right = _self.getRight();
    boolean _tripleNotEquals_1 = (_right != null);
    if (_tripleNotEquals_1) {
      XExpression _right_1 = _self.getRight();
      __SlicerAspect__.visitToAddRelations(_right_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _right_2 = _self.getRight();
        boolean _sliced_3 = __SlicerAspect__.sliced(_right_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _right_3 = _self.getRight();
        theSlicer.onrightSliced(_self, _right_3);
      }
    }
  }
}
