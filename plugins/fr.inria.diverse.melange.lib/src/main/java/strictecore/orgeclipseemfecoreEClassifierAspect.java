package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties;
import strictecore.orgeclipseemfecoreENamedElementAspect;
import strictecore.orgeclipseemfecoreETypeParameterAspect;

@Aspect(className = EClassifier.class, with = { orgeclipseemfecoreENamedElementAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipseemfecoreEClassifierAspect extends orgeclipseemfecoreENamedElementAspect {
  @OverrideAspectMethod
  public static void feedOpposites(final EClassifier _self) {
    _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EEnum)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EClass)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EClassifier)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_feedOpposites((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void reinit(final EClassifier _self) {
    _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3_reinit((org.eclipse.emf.ecore.EEnum)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3_reinit((org.eclipse.emf.ecore.EClass)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3_reinit((org.eclipse.emf.ecore.EClassifier)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    	      strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEClassifierAspectEClassifierAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    	      strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipseemfecoreEClassifierAspectEClassifierAspectProperties _self_;
  
  private static void super_feedOpposites(final EClassifier _self) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self);
  }
  
  protected static void _privk3_feedOpposites(final EClassifier _self) {
    orgeclipseemfecoreEClassifierAspect.super_feedOpposites(_self);
    EList<ETypeParameter> _eTypeParameters = _self.getETypeParameters();
    final Consumer<ETypeParameter> _function = new Consumer<ETypeParameter>() {
      public void accept(final ETypeParameter it) {
        orgeclipseemfecoreETypeParameterAspect.feedOpposites(it);
      }
    };
    _eTypeParameters.forEach(_function);
  }
  
  private static void super_reinit(final EClassifier _self) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final EClassifier _self) {
    orgeclipseemfecoreEClassifierAspect.super_reinit(_self);
    EList<ETypeParameter> _eTypeParameters = _self.getETypeParameters();
    final Consumer<ETypeParameter> _function = new Consumer<ETypeParameter>() {
      public void accept(final ETypeParameter it) {
        orgeclipseemfecoreETypeParameterAspect.reinit(it);
      }
    };
    _eTypeParameters.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EClassifier _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEClassifierAspect.super__visitToAddClasses(_self, theSlicer);
    EPackage _ePackage = _self.getEPackage();
    if (_ePackage!=null) {
      __SlicerAspect__.visitToAddClasses(_ePackage, theSlicer);
    }
  }
  
  private static void super__visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EClassifier _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEClassifierAspect.super__visitToAddRelations(_self, theSlicer);
    EPackage _ePackage = _self.getEPackage();
    boolean _tripleNotEquals = (_ePackage != null);
    if (_tripleNotEquals) {
      EPackage _ePackage_1 = _self.getEPackage();
      __SlicerAspect__.visitToAddRelations(_ePackage_1, theSlicer);
      boolean _and = false;
      boolean _sliced = __SlicerAspect__.sliced(_self);
      if (!_sliced) {
        _and = false;
      } else {
        EPackage _ePackage_2 = _self.getEPackage();
        boolean _sliced_1 = __SlicerAspect__.sliced(_ePackage_2);
        _and = _sliced_1;
      }
      if (_and) {
        EPackage _ePackage_3 = _self.getEPackage();
        EObject _clonedElt = __SlicerAspect__.clonedElt(_ePackage_3);
        EList<EClassifier> _eClassifiers = ((EPackage) _clonedElt).getEClassifiers();
        EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
        _eClassifiers.add(((EClassifier) _clonedElt_1));
      }
    }
    boolean _sliced_2 = __SlicerAspect__.sliced(_self);
    if (_sliced_2) {
      EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_self);
      String _instanceTypeName = _self.getInstanceTypeName();
      ((EClassifier) _clonedElt_2).setInstanceTypeName(_instanceTypeName);
    }
    boolean _sliced_3 = __SlicerAspect__.sliced(_self);
    if (_sliced_3) {
      EObject _clonedElt_3 = __SlicerAspect__.clonedElt(_self);
      String _instanceClassName = _self.getInstanceClassName();
      ((EClassifier) _clonedElt_3).setInstanceClassName(_instanceClassName);
    }
  }
}
