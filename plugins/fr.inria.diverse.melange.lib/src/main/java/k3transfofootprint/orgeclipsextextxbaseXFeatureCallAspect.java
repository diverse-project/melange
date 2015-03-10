package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect;
import k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;

@Aspect(className = XFeatureCall.class, with = { orgeclipsextextxbaseXAbstractFeatureCallAspect.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXFeatureCallAspect extends orgeclipsextextxbaseXAbstractFeatureCallAspect {
  @OverrideAspectMethod
  public static void reinit(final XFeatureCall _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XFeatureCall)_self);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XAbstractFeatureCall){
    	      k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XAbstractFeatureCall)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.xtext.xbase.XExpression){
    	      k3transfofootprint.orgeclipsextextxbaseXExpressionAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XExpression)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXFeatureCallAspectXFeatureCallAspectProperties _self_;
  
  private static void super_reinit(final XFeatureCall _self) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XFeatureCall _self) {
    orgeclipsextextxbaseXFeatureCallAspect.super_reinit(_self);
    EList<XExpression> _featureCallArguments = _self.getFeatureCallArguments();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _featureCallArguments.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXFeatureCallAspect.super__visitToAddClasses(_self, theSlicer);
    EList<XExpression> _featureCallArguments = _self.getFeatureCallArguments();
    final Consumer<XExpression> _function = new Consumer<XExpression>() {
      public void accept(final XExpression it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _featureCallArguments.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.orgeclipsextextxbaseXAbstractFeatureCallAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XFeatureCall _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXFeatureCallAspect.super__visitToAddRelations(_self, theSlicer);
    EList<XExpression> _featureCallArguments = _self.getFeatureCallArguments();
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
          theSlicer.onfeatureCallArgumentsSliced(_self, _elt);
        }
      }
    };
    _featureCallArguments.forEach(_function);
  }
}
