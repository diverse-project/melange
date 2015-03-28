package k3transfofootprint;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import k3transfofootprint.K3TransfoFootprint;
import k3transfofootprint.__SlicerAspect__;
import k3transfofootprint.orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XExpression;

@Aspect(className = XCasePart.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public class orgeclipsextextxbaseXCasePartAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void reinit(final XCasePart _self) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCasePartAspectXCasePartAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCasePart){
    	      k3transfofootprint.orgeclipsextextxbaseXCasePartAspect._privk3_reinit((org.eclipse.xtext.xbase.XCasePart)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCasePartAspectXCasePartAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCasePart){
    	      k3transfofootprint.orgeclipsextextxbaseXCasePartAspect._privk3__visitToAddClasses((org.eclipse.xtext.xbase.XCasePart)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    _self_ = k3transfofootprint.orgeclipsextextxbaseXCasePartAspectXCasePartAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.xtext.xbase.XCasePart){
    	      k3transfofootprint.orgeclipsextextxbaseXCasePartAspect._privk3__visitToAddRelations((org.eclipse.xtext.xbase.XCasePart)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipsextextxbaseXCasePartAspectXCasePartAspectProperties _self_;
  
  private static void super_reinit(final XCasePart _self) {
     k3transfofootprint.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final XCasePart _self) {
    orgeclipsextextxbaseXCasePartAspect.super_reinit(_self);
    XExpression _case = _self.getCase();
    if (_case!=null) {
      __SlicerAspect__.reinit(_case);
    }
    XExpression _then = _self.getThen();
    if (_then!=null) {
      __SlicerAspect__.reinit(_then);
    }
    JvmTypeReference _typeGuard = _self.getTypeGuard();
    if (_typeGuard!=null) {
      __SlicerAspect__.reinit(_typeGuard);
    }
  }
  
  private static void super__visitToAddClasses(final XCasePart _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXCasePartAspect.super__visitToAddClasses(_self, theSlicer);
    XExpression _case = _self.getCase();
    if (_case!=null) {
      __SlicerAspect__.visitToAddClasses(_case, theSlicer);
    }
    XExpression _then = _self.getThen();
    if (_then!=null) {
      __SlicerAspect__.visitToAddClasses(_then, theSlicer);
    }
    JvmTypeReference _typeGuard = _self.getTypeGuard();
    if (_typeGuard!=null) {
      __SlicerAspect__.visitToAddClasses(_typeGuard, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final XCasePart _self, final K3TransfoFootprint theSlicer) {
     k3transfofootprint.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final XCasePart _self, final K3TransfoFootprint theSlicer) {
    orgeclipsextextxbaseXCasePartAspect.super__visitToAddRelations(_self, theSlicer);
    XExpression _case = _self.getCase();
    boolean _tripleNotEquals = (_case != null);
    if (_tripleNotEquals) {
      XExpression _case_1 = _self.getCase();
      __SlicerAspect__.visitToAddRelations(_case_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        XExpression _case_2 = _self.getCase();
        boolean _sliced_1 = __SlicerAspect__.sliced(_case_2);
        _and = _sliced_1;
      }
      if (_and) {
        XExpression _case_3 = _self.getCase();
        theSlicer.oncaseSliced(_self, _case_3);
      }
    }
    XExpression _then = _self.getThen();
    boolean _tripleNotEquals_1 = (_then != null);
    if (_tripleNotEquals_1) {
      XExpression _then_1 = _self.getThen();
      __SlicerAspect__.visitToAddRelations(_then_1, theSlicer);
      boolean _and_1 = false;
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (!_sliced_2) {
        _and_1 = false;
      } else {
        XExpression _then_2 = _self.getThen();
        boolean _sliced_3 = __SlicerAspect__.sliced(_then_2);
        _and_1 = _sliced_3;
      }
      if (_and_1) {
        XExpression _then_3 = _self.getThen();
        theSlicer.onthenSliced(_self, _then_3);
      }
    }
    JvmTypeReference _typeGuard = _self.getTypeGuard();
    boolean _tripleNotEquals_2 = (_typeGuard != null);
    if (_tripleNotEquals_2) {
      JvmTypeReference _typeGuard_1 = _self.getTypeGuard();
      __SlicerAspect__.visitToAddRelations(_typeGuard_1, theSlicer);
      boolean _and_2 = false;
      boolean _sliced_4 = __SlicerAspect__.sliced(_self);
      if (!_sliced_4) {
        _and_2 = false;
      } else {
        JvmTypeReference _typeGuard_2 = _self.getTypeGuard();
        boolean _sliced_5 = __SlicerAspect__.sliced(_typeGuard_2);
        _and_2 = _sliced_5;
      }
      if (_and_2) {
        JvmTypeReference _typeGuard_3 = _self.getTypeGuard();
        theSlicer.ontypeGuardSliced(_self, _typeGuard_3);
      }
    }
  }
}
