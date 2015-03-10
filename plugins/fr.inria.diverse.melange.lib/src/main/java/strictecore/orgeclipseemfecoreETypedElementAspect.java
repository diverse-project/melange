package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreENamedElementAspect;
import strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties;

@Aspect(className = ETypedElement.class, with = { orgeclipseemfecoreENamedElementAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipseemfecoreETypedElementAspect extends orgeclipseemfecoreENamedElementAspect {
  @OverrideAspectMethod
  public static void feedOpposites(final ETypedElement _self) {
    _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EOperation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.ETypedElement)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_feedOpposites((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void reinit(final ETypedElement _self) {
    _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3_reinit((org.eclipse.emf.ecore.EOperation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3_reinit((org.eclipse.emf.ecore.ETypedElement)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final ETypedElement _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    	      strictecore.orgeclipseemfecoreEAttributeAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    	      strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EParameter){
    	      strictecore.orgeclipseemfecoreEParameterAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final ETypedElement _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreETypedElementAspectETypedElementAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    	      strictecore.orgeclipseemfecoreEAttributeAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    	      strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EParameter){
    	      strictecore.orgeclipseemfecoreEParameterAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipseemfecoreETypedElementAspectETypedElementAspectProperties _self_;
  
  private static void super_feedOpposites(final ETypedElement _self) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self);
  }
  
  protected static void _privk3_feedOpposites(final ETypedElement _self) {
    orgeclipseemfecoreETypedElementAspect.super_feedOpposites(_self);
    EGenericType _eGenericType = _self.getEGenericType();
    if (_eGenericType!=null) {
      __SlicerAspect__.feedOpposites(_eGenericType);
    }
  }
  
  private static void super_reinit(final ETypedElement _self) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final ETypedElement _self) {
    orgeclipseemfecoreETypedElementAspect.super_reinit(_self);
    EGenericType _eGenericType = _self.getEGenericType();
    if (_eGenericType!=null) {
      __SlicerAspect__.reinit(_eGenericType);
    }
  }
  
  private static void super__visitToAddClasses(final ETypedElement _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final ETypedElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreETypedElementAspect.super__visitToAddClasses(_self, theSlicer);
    EClassifier _eType = _self.getEType();
    if (_eType!=null) {
      __SlicerAspect__.visitToAddClasses(_eType, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final ETypedElement _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final ETypedElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreETypedElementAspect.super__visitToAddRelations(_self, theSlicer);
    EClassifier _eType = _self.getEType();
    boolean _tripleNotEquals = (_eType != null);
    if (_tripleNotEquals) {
      EClassifier _eType_1 = _self.getEType();
      __SlicerAspect__.visitToAddRelations(_eType_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        EClassifier _eType_2 = _self.getEType();
        boolean _sliced_1 = __SlicerAspect__.sliced(_eType_2);
        _and = _sliced_1;
      }
      if (_and) {
        EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
        EClassifier _eType_3 = _self.getEType();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_eType_3);
        ((ETypedElement) _clonedElt).setEType(((EClassifier) _clonedElt_1));
      }
    }
    boolean _sliced_2 = __SlicerAspect__.sliced(_self);
    if (_sliced_2) {
      EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
      int _lowerBound = _self.getLowerBound();
      ((ETypedElement) _clonedElt_2).setLowerBound(_lowerBound);
    }
    boolean _sliced_3 = __SlicerAspect__.sliced(_self);
    if (_sliced_3) {
      EObject _clonedElt_3 = __SlicerAspect__.clonedElt(_self);
      boolean _isOrdered = _self.isOrdered();
      ((ETypedElement) _clonedElt_3).setOrdered(_isOrdered);
    }
    boolean _sliced_4 = __SlicerAspect__.sliced(_self);
    if (_sliced_4) {
      EObject _clonedElt_4 = __SlicerAspect__.clonedElt(_self);
      boolean _isUnique = _self.isUnique();
      ((ETypedElement) _clonedElt_4).setUnique(_isUnique);
    }
    boolean _sliced_5 = __SlicerAspect__.sliced(_self);
    if (_sliced_5) {
      EObject _clonedElt_5 = __SlicerAspect__.clonedElt(_self);
      int _upperBound = _self.getUpperBound();
      ((ETypedElement) _clonedElt_5).setUpperBound(_upperBound);
    }
  }
}
