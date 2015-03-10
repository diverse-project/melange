package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties;
import strictecore.orgeclipseemfecoreETypedElementAspect;

@Aspect(className = EStructuralFeature.class, with = { orgeclipseemfecoreETypedElementAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipseemfecoreEStructuralFeatureAspect extends orgeclipseemfecoreETypedElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
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
  public static void _visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
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
  
  public static boolean checkcard1(final EStructuralFeature _self) {
    _self_ = strictecore.orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectContext.getSelf(_self);
    	    
    	     return _privk3_checkcard1(_self); 
  }
  
  public static orgeclipseemfecoreEStructuralFeatureAspectEStructuralFeatureAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EStructuralFeature _self, final StrictEcore theSlicer) {
    boolean _or = false;
    if ((!theSlicer.card1)) {
      _or = true;
    } else {
      boolean _checkcard1 = orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self);
      _or = _checkcard1;
    }
    if (_or) {
      orgeclipseemfecoreEStructuralFeatureAspect.super__visitToAddClasses(_self, theSlicer);
      EClass _eContainingClass = _self.getEContainingClass();
      if (_eContainingClass!=null) {
        __SlicerAspect__.visitToAddClasses(_eContainingClass, theSlicer);
      }
    }
  }
  
  private static void super__visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EStructuralFeature _self, final StrictEcore theSlicer) {
    boolean _or = false;
    if ((!theSlicer.card1)) {
      _or = true;
    } else {
      boolean _checkcard1 = orgeclipseemfecoreEStructuralFeatureAspect.checkcard1(_self);
      _or = _checkcard1;
    }
    if (_or) {
      orgeclipseemfecoreEStructuralFeatureAspect.super__visitToAddRelations(_self, theSlicer);
      EClass _eContainingClass = _self.getEContainingClass();
      boolean _tripleNotEquals = (_eContainingClass != null);
      if (_tripleNotEquals) {
        EClass _eContainingClass_1 = _self.getEContainingClass();
        __SlicerAspect__.visitToAddRelations(_eContainingClass_1, theSlicer);
        boolean _and = false;
        boolean _sliced = __SlicerAspect__.sliced(_self);
        if (!_sliced) {
          _and = false;
        } else {
          EClass _eContainingClass_2 = _self.getEContainingClass();
          boolean _sliced_1 = __SlicerAspect__.sliced(_eContainingClass_2);
          _and = _sliced_1;
        }
        if (_and) {
          EClass _eContainingClass_3 = _self.getEContainingClass();
          EObject _clonedElt = __SlicerAspect__.clonedElt(_eContainingClass_3);
          EList<EStructuralFeature> _eStructuralFeatures = ((EClass) _clonedElt).getEStructuralFeatures();
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
          _eStructuralFeatures.add(((EStructuralFeature) _clonedElt_1));
        }
      }
      boolean _sliced_2 = __SlicerAspect__.sliced(_self);
      if (_sliced_2) {
        EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
        boolean _isChangeable = _self.isChangeable();
        ((EStructuralFeature) _clonedElt_2).setChangeable(_isChangeable);
      }
      boolean _sliced_3 = __SlicerAspect__.sliced(_self);
      if (_sliced_3) {
        EObject _clonedElt_3 = __SlicerAspect__.clonedElt(_self);
        String _defaultValueLiteral = _self.getDefaultValueLiteral();
        ((EStructuralFeature) _clonedElt_3).setDefaultValueLiteral(_defaultValueLiteral);
      }
      boolean _sliced_4 = __SlicerAspect__.sliced(_self);
      if (_sliced_4) {
        EObject _clonedElt_4 = __SlicerAspect__.clonedElt(_self);
        boolean _isDerived = _self.isDerived();
        ((EStructuralFeature) _clonedElt_4).setDerived(_isDerived);
      }
      boolean _sliced_5 = __SlicerAspect__.sliced(_self);
      if (_sliced_5) {
        EObject _clonedElt_5 = __SlicerAspect__.clonedElt(_self);
        boolean _isTransient = _self.isTransient();
        ((EStructuralFeature) _clonedElt_5).setTransient(_isTransient);
      }
      boolean _sliced_6 = __SlicerAspect__.sliced(_self);
      if (_sliced_6) {
        EObject _clonedElt_6 = __SlicerAspect__.clonedElt(_self);
        boolean _isUnsettable = _self.isUnsettable();
        ((EStructuralFeature) _clonedElt_6).setUnsettable(_isUnsettable);
      }
      boolean _sliced_7 = __SlicerAspect__.sliced(_self);
      if (_sliced_7) {
        EObject _clonedElt_7 = __SlicerAspect__.clonedElt(_self);
        boolean _isVolatile = _self.isVolatile();
        ((EStructuralFeature) _clonedElt_7).setVolatile(_isVolatile);
      }
    }
  }
  
  protected static boolean _privk3_checkcard1(final EStructuralFeature _self) {
    boolean _xblockexpression = false;
    {
      final EStructuralFeature feat = _self;
      int _lowerBound = feat.getLowerBound();
      _xblockexpression = (_lowerBound > 0);
    }
    return _xblockexpression;
  }
}
