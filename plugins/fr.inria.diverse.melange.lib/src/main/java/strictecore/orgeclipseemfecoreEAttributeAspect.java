package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties;
import strictecore.orgeclipseemfecoreEStructuralFeatureAspect;

@Aspect(className = EAttribute.class, with = { orgeclipseemfecoreEStructuralFeatureAspect.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEAttributeAspect extends orgeclipseemfecoreEStructuralFeatureAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EAttribute _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEAttributeAspectEAttributeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    	      strictecore.orgeclipseemfecoreEAttributeAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
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
  public static void _visitToAddRelations(final EAttribute _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEAttributeAspectEAttributeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    	      strictecore.orgeclipseemfecoreEAttributeAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
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
  
  public static orgeclipseemfecoreEAttributeAspectEAttributeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EAttribute _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EAttribute _self, final StrictEcore theSlicer) {
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
        EAttribute _createEAttribute = EcoreFactory.eINSTANCE.createEAttribute();
        __SlicerAspect__.clonedElt(_self, _createEAttribute);
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        theSlicer.objectCloned(_clonedElt_1);
      }
      orgeclipseemfecoreEAttributeAspect.super__visitToAddClasses(_self, theSlicer);
      EDataType _eAttributeType = _self.getEAttributeType();
      if (_eAttributeType!=null) {
        __SlicerAspect__.visitToAddClasses(_eAttributeType, theSlicer);
      }
    }
  }
  
  private static void super__visitToAddRelations(final EAttribute _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EAttribute _self, final StrictEcore theSlicer) {
    boolean _or = false;
    if ((!theSlicer.card1)) {
      _or = true;
    } else {
      boolean _checkcard1 = orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self);
      _or = _checkcard1;
    }
    if (_or) {
      orgeclipseemfecoreEAttributeAspect.super__visitToAddRelations(_self, theSlicer);
      EDataType _eAttributeType = _self.getEAttributeType();
      boolean _tripleNotEquals = (_eAttributeType != null);
      if (_tripleNotEquals) {
        EDataType _eAttributeType_1 = _self.getEAttributeType();
        __SlicerAspect__.visitToAddRelations(_eAttributeType_1, theSlicer);
      }
    }
  }
}
