package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEClassAspectEClassAspectProperties;
import strictecore.orgeclipseemfecoreEClassifierAspect;
import strictecore.orgeclipseemfecoreEOperationAspect;
import strictecore.orgeclipseemfecoreETypedElementAspect;

@Aspect(className = EClass.class, with = { orgeclipseemfecoreEClassifierAspect.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEClassAspect extends orgeclipseemfecoreEClassifierAspect {
  @OverrideAspectMethod
  public static void feedOpposites(final EClass _self) {
    _self_ = strictecore.orgeclipseemfecoreEClassAspectEClassAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EClass){
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
  public static void reinit(final EClass _self) {
    _self_ = strictecore.orgeclipseemfecoreEClassAspectEClassAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EClass){
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
  public static void _visitToAddClasses(final EClass _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEClassAspectEClassAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
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
  public static void _visitToAddRelations(final EClass _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEClassAspectEClassAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
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
  
  public static orgeclipseemfecoreEClassAspectEClassAspectProperties _self_;
  
  public static List<EClass> lowerTypes(final EClass _self) {
    _self_ = strictecore.orgeclipseemfecoreEClassAspectEClassAspectContext.getSelf(_self);
    	    
    	     return _privk3_lowerTypes(_self); 
  }
  
  private static void super_feedOpposites(final EClass _self) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3_feedOpposites(_self);
  }
  
  protected static void _privk3_feedOpposites(final EClass _self) {
    orgeclipseemfecoreEClassAspect.super_feedOpposites(_self);
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    final Consumer<EClass> _function = new Consumer<EClass>() {
      public void accept(final EClass it) {
        List<EClass> _lowerTypes = orgeclipseemfecoreEClassAspect.lowerTypes(it);
        _lowerTypes.add(_self);
      }
    };
    _eSuperTypes.forEach(_function);
    EList<EOperation> _eOperations = _self.getEOperations();
    final Consumer<EOperation> _function_1 = new Consumer<EOperation>() {
      public void accept(final EOperation it) {
        orgeclipseemfecoreEOperationAspect.feedOpposites(it);
      }
    };
    _eOperations.forEach(_function_1);
    EList<EStructuralFeature> _eStructuralFeatures = _self.getEStructuralFeatures();
    final Consumer<EStructuralFeature> _function_2 = new Consumer<EStructuralFeature>() {
      public void accept(final EStructuralFeature it) {
        orgeclipseemfecoreETypedElementAspect.feedOpposites(it);
      }
    };
    _eStructuralFeatures.forEach(_function_2);
    EList<EGenericType> _eGenericSuperTypes = _self.getEGenericSuperTypes();
    final Consumer<EGenericType> _function_3 = new Consumer<EGenericType>() {
      public void accept(final EGenericType it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    _eGenericSuperTypes.forEach(_function_3);
  }
  
  private static void super_reinit(final EClass _self) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final EClass _self) {
    orgeclipseemfecoreEClassAspect.super_reinit(_self);
    EList<EOperation> _eOperations = _self.getEOperations();
    final Consumer<EOperation> _function = new Consumer<EOperation>() {
      public void accept(final EOperation it) {
        orgeclipseemfecoreEOperationAspect.reinit(it);
      }
    };
    _eOperations.forEach(_function);
    EList<EStructuralFeature> _eStructuralFeatures = _self.getEStructuralFeatures();
    final Consumer<EStructuralFeature> _function_1 = new Consumer<EStructuralFeature>() {
      public void accept(final EStructuralFeature it) {
        orgeclipseemfecoreETypedElementAspect.reinit(it);
      }
    };
    _eStructuralFeatures.forEach(_function_1);
    EList<EGenericType> _eGenericSuperTypes = _self.getEGenericSuperTypes();
    final Consumer<EGenericType> _function_2 = new Consumer<EGenericType>() {
      public void accept(final EGenericType it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _eGenericSuperTypes.forEach(_function_2);
  }
  
  private static void super__visitToAddClasses(final EClass _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EClass _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EClass _createEClass = EcoreFactory.eINSTANCE.createEClass();
      __SlicerAspect__.clonedElt(_self, _createEClass);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEClassAspect.super__visitToAddClasses(_self, theSlicer);
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    final Consumer<EClass> _function = new Consumer<EClass>() {
      public void accept(final EClass it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _eSuperTypes.forEach(_function);
    if (theSlicer.optionlowerTypes) {
      List<EClass> _lowerTypes = orgeclipseemfecoreEClassAspect.lowerTypes(_self);
      final Consumer<EClass> _function_1 = new Consumer<EClass>() {
        public void accept(final EClass it) {
          __SlicerAspect__.visitToAddClasses(it, theSlicer);
        }
      };
      _lowerTypes.forEach(_function_1);
    }
    EList<EStructuralFeature> _eStructuralFeatures = _self.getEStructuralFeatures();
    final Consumer<EStructuralFeature> _function_2 = new Consumer<EStructuralFeature>() {
      public void accept(final EStructuralFeature it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _eStructuralFeatures.forEach(_function_2);
    EList<EOperation> _eOperations = _self.getEOperations();
    final Consumer<EOperation> _function_3 = new Consumer<EOperation>() {
      public void accept(final EOperation it) {
        __SlicerAspect__.visitToAddClasses(it, theSlicer);
      }
    };
    _eOperations.forEach(_function_3);
  }
  
  private static void super__visitToAddRelations(final EClass _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EClass _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEClassAspect.super__visitToAddRelations(_self, theSlicer);
    EList<EClass> _eSuperTypes = _self.getESuperTypes();
    final Consumer<EClass> _function = new Consumer<EClass>() {
      public void accept(final EClass _elt) {
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
          EList<EClass> _eSuperTypes = ((EClass) _clonedElt_1).getESuperTypes();
          EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_elt);
          _eSuperTypes.add(((EClass) _clonedElt_2));
        }
      }
    };
    _eSuperTypes.forEach(_function);
    if (theSlicer.optionlowerTypes) {
      List<EClass> _lowerTypes = orgeclipseemfecoreEClassAspect.lowerTypes(_self);
      final Consumer<EClass> _function_1 = new Consumer<EClass>() {
        public void accept(final EClass _elt) {
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
            List<EClass> _lowerTypes = orgeclipseemfecoreEClassAspect.lowerTypes(((EClass) _clonedElt_1));
            EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_elt);
            _lowerTypes.add(((EClass) _clonedElt_2));
          }
        }
      };
      _lowerTypes.forEach(_function_1);
    }
    EList<EStructuralFeature> _eStructuralFeatures = _self.getEStructuralFeatures();
    final Consumer<EStructuralFeature> _function_2 = new Consumer<EStructuralFeature>() {
      public void accept(final EStructuralFeature _elt) {
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
          EList<EStructuralFeature> _eStructuralFeatures = ((EClass) _clonedElt_1).getEStructuralFeatures();
          EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_elt);
          _eStructuralFeatures.add(((EStructuralFeature) _clonedElt_2));
        }
      }
    };
    _eStructuralFeatures.forEach(_function_2);
    EList<EOperation> _eOperations = _self.getEOperations();
    final Consumer<EOperation> _function_3 = new Consumer<EOperation>() {
      public void accept(final EOperation _elt) {
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
          EList<EOperation> _eOperations = ((EClass) _clonedElt_1).getEOperations();
          EObject _clonedElt_2 = __SlicerAspect__.clonedElt(_elt);
          _eOperations.add(((EOperation) _clonedElt_2));
        }
      }
    };
    _eOperations.forEach(_function_3);
    boolean _sliced = __SlicerAspect__.sliced(_self);
    if (_sliced) {
      EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
      boolean _isAbstract = _self.isAbstract();
      ((EClass) _clonedElt).setAbstract(_isAbstract);
    }
    boolean _sliced_1 = __SlicerAspect__.sliced(_self);
    if (_sliced_1) {
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      boolean _isInterface = _self.isInterface();
      ((EClass) _clonedElt_1).setInterface(_isInterface);
    }
  }
  
  protected static List<EClass> _privk3_lowerTypes(final EClass _self) {
     return strictecore.orgeclipseemfecoreEClassAspect._self_.lowerTypes; 
  }
}
