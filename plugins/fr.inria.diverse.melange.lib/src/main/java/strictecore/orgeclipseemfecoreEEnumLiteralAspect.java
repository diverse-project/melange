package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties;
import strictecore.orgeclipseemfecoreENamedElementAspect;

@Aspect(className = EEnumLiteral.class, with = { orgeclipseemfecoreENamedElementAspect.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEEnumLiteralAspect extends orgeclipseemfecoreENamedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    	      strictecore.orgeclipseemfecoreEEnumLiteralAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    	      strictecore.orgeclipseemfecoreEEnumLiteralAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipseemfecoreEEnumLiteralAspectEEnumLiteralAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EEnumLiteral _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EEnumLiteral _createEEnumLiteral = EcoreFactory.eINSTANCE.createEEnumLiteral();
      __SlicerAspect__.clonedElt(_self, _createEEnumLiteral);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEEnumLiteralAspect.super__visitToAddClasses(_self, theSlicer);
    EEnum _eEnum = _self.getEEnum();
    if (_eEnum!=null) {
      __SlicerAspect__.visitToAddClasses(_eEnum, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EEnumLiteral _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEEnumLiteralAspect.super__visitToAddRelations(_self, theSlicer);
    EEnum _eEnum = _self.getEEnum();
    boolean _tripleNotEquals = (_eEnum != null);
    if (_tripleNotEquals) {
      EEnum _eEnum_1 = _self.getEEnum();
      __SlicerAspect__.visitToAddRelations(_eEnum_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        EEnum _eEnum_2 = _self.getEEnum();
        boolean _sliced_1 = __SlicerAspect__.sliced(_eEnum_2);
        _and = _sliced_1;
      }
      if (_and) {
        EEnum _eEnum_3 = _self.getEEnum();
        EObject _clonedElt = __SlicerAspect__.clonedElt(_eEnum_3);
        EList<EEnumLiteral> _eLiterals = ((EEnum) _clonedElt).getELiterals();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        _eLiterals.add(((EEnumLiteral) _clonedElt_1));
      }
    }
    boolean _sliced_2 = __SlicerAspect__.sliced(_self);
    if (_sliced_2) {
      EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
      int _value = _self.getValue();
      ((EEnumLiteral) _clonedElt_2).setValue(_value);
    }
  }
}
