package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEModelElementAspect;
import strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties;

@Aspect(className = ENamedElement.class, with = { orgeclipseemfecoreEModelElementAspect.class })
@SuppressWarnings("all")
public abstract class orgeclipseemfecoreENamedElementAspect extends orgeclipseemfecoreEModelElementAspect {
  @OverrideAspectMethod
  public static void _visitToAddClasses(final ENamedElement _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
    	    
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
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final ENamedElement _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreENamedElementAspectENamedElementAspectContext.getSelf(_self);
    	    
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
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipseemfecoreENamedElementAspectENamedElementAspectProperties _self_;
  
  private static void super__visitToAddClasses(final ENamedElement _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final ENamedElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreENamedElementAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final ENamedElement _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final ENamedElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreENamedElementAspect.super__visitToAddRelations(_self, theSlicer);
    boolean _sliced = __SlicerAspect__.sliced(_self);
    if (_sliced) {
      EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
      String _name = _self.getName();
      ((ENamedElement) _clonedElt).setName(_name);
    }
  }
}
