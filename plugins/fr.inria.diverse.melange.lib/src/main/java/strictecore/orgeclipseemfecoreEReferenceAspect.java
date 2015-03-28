package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties;
import strictecore.orgeclipseemfecoreEStructuralFeatureAspect;

@Aspect(className = EReference.class, with = { orgeclipseemfecoreEStructuralFeatureAspect.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEReferenceAspect extends orgeclipseemfecoreEStructuralFeatureAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    	      strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
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
  public static void _visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEReferenceAspectEReferenceAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    	      strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
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
  
  public static orgeclipseemfecoreEReferenceAspectEReferenceAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EReference _self, final StrictEcore theSlicer) {
    boolean _or = false;
    if ((!theSlicer.card1)) {
      _or = true;
    } else {
      boolean _checkcard1 = orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self);
      _or = _checkcard1;
    }
    if (_or) {
      EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
      boolean _tripleEquals = (_clonedElt == null);
      if (_tripleEquals) {
        EReference _createEReference = EcoreFactory.eINSTANCE.createEReference();
        __SlicerAspect__.clonedElt(_self, _createEReference);
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        theSlicer.objectCloned(_clonedElt_1);
      }
      orgeclipseemfecoreEReferenceAspect.super__visitToAddClasses(_self, theSlicer);
      EClass _eReferenceType = _self.getEReferenceType();
      if (_eReferenceType!=null) {
        __SlicerAspect__.visitToAddClasses(_eReferenceType, theSlicer);
      }
    }
  }
  
  private static void super__visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EReference _self, final StrictEcore theSlicer) {
    boolean _or = false;
    if ((!theSlicer.card1)) {
      _or = true;
    } else {
      boolean _checkcard1 = orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self);
      _or = _checkcard1;
    }
    if (_or) {
      orgeclipseemfecoreEReferenceAspect.super__visitToAddRelations(_self, theSlicer);
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (_sliced) {
        EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
        boolean _isContainment = _self.isContainment();
        ((EReference) _clonedElt).setContainment(_isContainment);
      }
      boolean _sliced_1 = __SlicerAspect__.sliced(_self);
      if (_sliced_1) {
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        boolean _isResolveProxies = _self.isResolveProxies();
        ((EReference) _clonedElt_1).setResolveProxies(_isResolveProxies);
      }
      EClass _eReferenceType = _self.getEReferenceType();
      boolean _tripleNotEquals = (_eReferenceType != null);
      if (_tripleNotEquals) {
        EClass _eReferenceType_1 = _self.getEReferenceType();
        __SlicerAspect__.visitToAddRelations(_eReferenceType_1, theSlicer);
      }
    }
  }
}
