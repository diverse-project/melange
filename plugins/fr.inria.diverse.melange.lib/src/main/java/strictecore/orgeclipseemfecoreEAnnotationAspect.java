package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties;
import strictecore.orgeclipseemfecoreEModelElementAspect;

@Aspect(className = EAnnotation.class, with = { orgeclipseemfecoreEModelElementAspect.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEAnnotationAspect extends orgeclipseemfecoreEModelElementAspect {
  @OverrideAspectMethod
  public static void feedOpposites(final EAnnotation _self) {
    _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EAnnotation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_feedOpposites((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void reinit(final EAnnotation _self) {
    _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3_reinit((org.eclipse.emf.ecore.EAnnotation)_self);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit((org.eclipse.emf.ecore.EModelElement)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEAnnotationAspectEAnnotationAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EAnnotation){
    	      strictecore.orgeclipseemfecoreEAnnotationAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EAnnotation)_self,theSlicer);
    	     } else  if (_self instanceof org.eclipse.emf.ecore.EModelElement){
    	      strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EModelElement)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipseemfecoreEAnnotationAspectEAnnotationAspectProperties _self_;
  
  private static void super_feedOpposites(final EAnnotation _self) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_feedOpposites(_self);
  }
  
  protected static void _privk3_feedOpposites(final EAnnotation _self) {
    orgeclipseemfecoreEAnnotationAspect.super_feedOpposites(_self);
    EMap<String, String> _details = _self.getDetails();
    final Consumer<Map.Entry<String, String>> _function = new Consumer<Map.Entry<String, String>>() {
      public void accept(final Map.Entry<String, String> it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    _details.forEach(_function);
    EList<EObject> _contents = _self.getContents();
    final Consumer<EObject> _function_1 = new Consumer<EObject>() {
      public void accept(final EObject it) {
        __SlicerAspect__.feedOpposites(it);
      }
    };
    _contents.forEach(_function_1);
  }
  
  private static void super_reinit(final EAnnotation _self) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final EAnnotation _self) {
    orgeclipseemfecoreEAnnotationAspect.super_reinit(_self);
    EMap<String, String> _details = _self.getDetails();
    final Consumer<Map.Entry<String, String>> _function = new Consumer<Map.Entry<String, String>>() {
      public void accept(final Map.Entry<String, String> it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _details.forEach(_function);
    EList<EObject> _contents = _self.getContents();
    final Consumer<EObject> _function_1 = new Consumer<EObject>() {
      public void accept(final EObject it) {
        __SlicerAspect__.reinit(it);
      }
    };
    _contents.forEach(_function_1);
  }
  
  private static void super__visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EAnnotation _self, final StrictEcore theSlicer) {
    EObject _clonedElt = __SlicerAspect__.clonedElt(_self);
    boolean _tripleEquals = (_clonedElt == null);
    if (_tripleEquals) {
      EAnnotation _createEAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
      __SlicerAspect__.clonedElt(_self, _createEAnnotation);
      EObject _clonedElt_1 = __SlicerAspect__.clonedElt(_self);
      theSlicer.objectCloned(_clonedElt_1);
    }
    orgeclipseemfecoreEAnnotationAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
     strictecore.orgeclipseemfecoreEModelElementAspect._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EAnnotation _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEAnnotationAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
