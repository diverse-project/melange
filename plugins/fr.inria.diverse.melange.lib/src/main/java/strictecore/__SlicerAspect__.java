package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__ObjectAspectProperties;

@Aspect(className = Object.class)
@SuppressWarnings("all")
public abstract class __SlicerAspect__ {
  public static void visitToAddClasses(final Object _self, final StrictEcore theSlicer) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      _privk3_visitToAddClasses(_self,theSlicer); 
  }
  
  protected static void _visitToAddClasses(final Object _self, final StrictEcore theSlicer) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    	      strictecore.orgeclipseemfecoreEAttributeAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    	      strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EParameter){
    	      strictecore.orgeclipseemfecoreEParameterAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    	      strictecore.orgeclipseemfecoreETypeParameterAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    	      strictecore.orgeclipseemfecoreEPackageAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    	      strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    	      strictecore.orgeclipseemfecoreEEnumLiteralAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static void visitToAddRelations(final Object _self, final StrictEcore theSlicer) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      _privk3_visitToAddRelations(_self,theSlicer); 
  }
  
  protected static void _visitToAddRelations(final Object _self, final StrictEcore theSlicer) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EEnum)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EReference){
    	      strictecore.orgeclipseemfecoreEReferenceAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EReference)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EClass)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAttribute){
    	      strictecore.orgeclipseemfecoreEAttributeAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EAttribute)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EDataType){
    	      strictecore.orgeclipseemfecoreEDataTypeAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EDataType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EParameter){
    	      strictecore.orgeclipseemfecoreEParameterAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    	      strictecore.orgeclipseemfecoreETypeParameterAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.ETypeParameter)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    	      strictecore.orgeclipseemfecoreEPackageAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EPackage)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EStructuralFeature){
    	      strictecore.orgeclipseemfecoreEStructuralFeatureAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EStructuralFeature)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EEnumLiteral){
    	      strictecore.orgeclipseemfecoreEEnumLiteralAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EEnumLiteral)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EOperation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.ETypedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EClassifier)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ENamedElement){
    	      strictecore.orgeclipseemfecoreENamedElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.ENamedElement)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static void feedOpposites(final Object _self) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EEnum)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EClass)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    	      strictecore.orgeclipseemfecoreETypeParameterAspect._privk3_feedOpposites((org.eclipse.emf.ecore.ETypeParameter)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    	      strictecore.orgeclipseemfecoreEPackageAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EPackage)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EAnnotation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EOperation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.ETypedElement)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EClassifier)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EGenericType)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_feedOpposites((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static void reinit(final Object _self) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EEnum){
    	      strictecore.orgeclipseemfecoreEEnumAspect._privk3_reinit((org.eclipse.emf.ecore.EEnum)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClass){
    	      strictecore.orgeclipseemfecoreEClassAspect._privk3_reinit((org.eclipse.emf.ecore.EClass)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypeParameter){
    	      strictecore.orgeclipseemfecoreETypeParameterAspect._privk3_reinit((org.eclipse.emf.ecore.ETypeParameter)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EPackage){
    	      strictecore.orgeclipseemfecoreEPackageAspect._privk3_reinit((org.eclipse.emf.ecore.EPackage)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3_reinit((org.eclipse.emf.ecore.EAnnotation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EOperation){
    	      strictecore.orgeclipseemfecoreEOperationAspect._privk3_reinit((org.eclipse.emf.ecore.EOperation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.ETypedElement){
    	      strictecore.orgeclipseemfecoreETypedElementAspect._privk3_reinit((org.eclipse.emf.ecore.ETypedElement)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EClassifier){
    	      strictecore.orgeclipseemfecoreEClassifierAspect._privk3_reinit((org.eclipse.emf.ecore.EClassifier)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3_reinit((org.eclipse.emf.ecore.EGenericType)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static __SlicerAspect__ObjectAspectProperties _self_;
  
  public static boolean visitedForRelations(final Object _self) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	     return _privk3_visitedForRelations(_self); 
  }
  
  public static void visitedForRelations(final Object _self, final boolean visitedForRelations) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      _privk3_visitedForRelations(_self,visitedForRelations); 
  }
  
  public static boolean sliced(final Object _self) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	     return _privk3_sliced(_self); 
  }
  
  public static void sliced(final Object _self, final boolean sliced) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      _privk3_sliced(_self,sliced); 
  }
  
  public static EObject clonedElt(final Object _self) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	     return _privk3_clonedElt(_self); 
  }
  
  public static void clonedElt(final Object _self, final EObject clonedElt) {
    _self_ = strictecore.__SlicerAspect__ObjectAspectContext.getSelf(_self);
    	    
    	      _privk3_clonedElt(_self,clonedElt); 
  }
  
  protected static void _privk3_visitToAddClasses(final Object _self, final StrictEcore theSlicer) {
    boolean _sliced = __SlicerAspect__.sliced(_self);
    boolean _not = (!_sliced);
    if (_not) {
      __SlicerAspect__.sliced(_self, true);
      __SlicerAspect__._visitToAddClasses(_self, theSlicer);
    }
  }
  
  protected static void _privk3__visitToAddClasses(final Object _self, final StrictEcore theSlicer) {
  }
  
  protected static void _privk3_visitToAddRelations(final Object _self, final StrictEcore theSlicer) {
    boolean _visitedForRelations = __SlicerAspect__.visitedForRelations(_self);
    boolean _not = (!_visitedForRelations);
    if (_not) {
      __SlicerAspect__.visitedForRelations(_self, true);
      __SlicerAspect__._visitToAddRelations(_self, theSlicer);
    }
  }
  
  protected static void _privk3__visitToAddRelations(final Object _self, final StrictEcore theSlicer) {
  }
  
  protected static void _privk3_feedOpposites(final Object _self) {
  }
  
  protected static void _privk3_reinit(final Object _self) {
    __SlicerAspect__.visitedForRelations(_self, false);
    __SlicerAspect__.sliced(_self, false);
    __SlicerAspect__.clonedElt(_self, null);
  }
  
  protected static boolean _privk3_visitedForRelations(final Object _self) {
     return strictecore.__SlicerAspect__._self_.visitedForRelations; 
  }
  
  protected static void _privk3_visitedForRelations(final Object _self, final boolean visitedForRelations) {
    strictecore.__SlicerAspect__._self_.visitedForRelations = visitedForRelations; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "VisitedForRelations")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, visitedForRelations); 
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
  
  protected static boolean _privk3_sliced(final Object _self) {
     return strictecore.__SlicerAspect__._self_.sliced; 
  }
  
  protected static void _privk3_sliced(final Object _self, final boolean sliced) {
    strictecore.__SlicerAspect__._self_.sliced = sliced; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Sliced")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, sliced); 
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
  
  protected static EObject _privk3_clonedElt(final Object _self) {
     return strictecore.__SlicerAspect__._self_.clonedElt; 
  }
  
  protected static void _privk3_clonedElt(final Object _self, final EObject clonedElt) {
    strictecore.__SlicerAspect__._self_.clonedElt = clonedElt; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "ClonedElt")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, clonedElt); 
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
