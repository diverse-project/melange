package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEAnnotationAspect;
import strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties;

@Aspect(className = EModelElement.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public abstract class orgeclipseemfecoreEModelElementAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void feedOpposites(final EModelElement _self) {
    _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
    	    
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
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_feedOpposites((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void reinit(final EModelElement _self) {
    _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
    	    
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
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
    	    
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
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEModelElementAspectEModelElementAspectContext.getSelf(_self);
    	    
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
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipseemfecoreEModelElementAspectEModelElementAspectProperties _self_;
  
  private static void super_feedOpposites(final EModelElement _self) {
     strictecore.__SlicerAspect__._privk3_feedOpposites(_self);
  }
  
  protected static void _privk3_feedOpposites(final EModelElement _self) {
    orgeclipseemfecoreEModelElementAspect.super_feedOpposites(_self);
    EList<EAnnotation> _eAnnotations = _self.getEAnnotations();
    final Consumer<EAnnotation> _function = new Consumer<EAnnotation>() {
      public void accept(final EAnnotation it) {
        orgeclipseemfecoreEAnnotationAspect.feedOpposites(it);
      }
    };
    _eAnnotations.forEach(_function);
  }
  
  private static void super_reinit(final EModelElement _self) {
     strictecore.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final EModelElement _self) {
    orgeclipseemfecoreEModelElementAspect.super_reinit(_self);
    EList<EAnnotation> _eAnnotations = _self.getEAnnotations();
    final Consumer<EAnnotation> _function = new Consumer<EAnnotation>() {
      public void accept(final EAnnotation it) {
        orgeclipseemfecoreEAnnotationAspect.reinit(it);
      }
    };
    _eAnnotations.forEach(_function);
  }
  
  private static void super__visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
     strictecore.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EModelElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEModelElementAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
     strictecore.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EModelElement _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEModelElementAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
