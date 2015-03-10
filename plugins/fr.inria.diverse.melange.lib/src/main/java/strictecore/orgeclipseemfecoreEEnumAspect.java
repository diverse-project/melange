package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEDataTypeAspect;
import strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectProperties;
import strictecore.orgeclipseemfecoreEModelElementAspect;

@Aspect(className = EEnum.class, with = { orgeclipseemfecoreEDataTypeAspect.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEEnumAspect extends orgeclipseemfecoreEDataTypeAspect {
  @OverrideAspectMethod
  public static void feedOpposites(final EEnum _self) {
    _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EEnum)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EClassifier)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_feedOpposites((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void reinit(final EEnum _self) {
    _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3_reinit((org.eclipse.emf.ecore.EEnum)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3_reinit((org.eclipse.emf.ecore.EClassifier)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
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
  public static void _visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEEnumAspectEEnumAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
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
  
  public static orgeclipseemfecoreEEnumAspectEEnumAspectProperties _self_;
  
  private static void super_feedOpposites(final EEnum _self) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3_feedOpposites(_self);
  }
  
  protected static void _privk3_feedOpposites(final EEnum _self) {
    orgeclipseemfecoreEEnumAspect.super_feedOpposites(_self);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      public void accept(final EEnumLiteral it) {
        orgeclipseemfecoreEModelElementAspect.feedOpposites(it);
      }
    };
    _eLiterals.forEach(_function);
  }
  
  private static void super_reinit(final EEnum _self) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final EEnum _self) {
    orgeclipseemfecoreEEnumAspect.super_reinit(_self);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      public void accept(final EEnumLiteral it) {
        orgeclipseemfecoreEModelElementAspect.reinit(it);
      }
    };
    _eLiterals.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EEnum _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EEnum _createEEnum = EcoreFactory.eINSTANCE.createEEnum();
      __SlicerAspect__.clonedElt(_self, _createEEnum);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEEnumAspect.super__visitToAddClasses(_self, theSlicer);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      public void accept(final EEnumLiteral it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _eLiterals.forEach(_function);
  }
  
  private static void super__visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EEnum _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEEnumAspect.super__visitToAddRelations(_self, theSlicer);
    EList<EEnumLiteral> _eLiterals = _self.getELiterals();
    final Consumer<EEnumLiteral> _function = new Consumer<EEnumLiteral>() {
      public void accept(final EEnumLiteral _elt) {
        __SlicerAspect__.visitToAddRelations(_elt, theSlicer);
        boolean _and = false;
        boolean _and_1 = false;
        boolean _sliced = __SlicerAspect__.sliced(_self);
        if (!_sliced) {
          _and_1 = false;
        } else {
          boolean _sliced_1 = __SlicerAspect__.sliced(_elt);
          _and_1 = _sliced_1;
        }
        if (!_and_1) {
          _and = false;
        } else {
          EObject _clonedElt = __SlicerAspect__.clonedElt(_elt);
          boolean _tripleNotEquals = (_clonedElt != null);
          _and = _tripleNotEquals;
        }
        if (_and) {
          EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
          EList<EEnumLiteral> _eLiterals = ((EEnum) _clonedElt_1).getELiterals();
          EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_elt);
          _eLiterals.add(((EEnumLiteral) _clonedElt_2));
        }
      }
    };
    _eLiterals.forEach(_function);
  }
}
