package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEClassifierAspect;
import strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties;

@Aspect(className = EDataType.class, with = { orgeclipseemfecoreEClassifierAspect.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEDataTypeAspect extends orgeclipseemfecoreEClassifierAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
    	    
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
  public static void _visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEDataTypeAspectEDataTypeAspectContext.getSelf(_self);
    	    
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
  
  public static orgeclipseemfecoreEDataTypeAspectEDataTypeAspectProperties _self_;
  
  private static void super__visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EDataType _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EDataType _createEDataType = EcoreFactory.eINSTANCE.createEDataType();
      __SlicerAspect__.clonedElt(_self, _createEDataType);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEDataTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEClassifierAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EDataType _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEDataTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
