package strictecore;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EGenericType;
import strictecore.StrictEcore;
import strictecore.__SlicerAspect__;
import strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties;

@Aspect(className = EGenericType.class, with = { __SlicerAspect__.class })
@SuppressWarnings("all")
public class orgeclipseemfecoreEGenericTypeAspect extends __SlicerAspect__ {
  @OverrideAspectMethod
  public static void feedOpposites(final EGenericType _self) {
    _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3_feedOpposites((org.eclipse.emf.ecore.EGenericType)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_feedOpposites((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void reinit(final EGenericType _self) {
    _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3_reinit((org.eclipse.emf.ecore.EGenericType)_self);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3_reinit((java.lang.Object)_self);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3__visitToAddClasses((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddClasses((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  @OverrideAspectMethod
  public static void _visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
    _self_ = strictecore.orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectContext.getSelf(_self);
    	    
    	      if (_self instanceof org.eclipse.emf.ecore.EGenericType){
    	      strictecore.orgeclipseemfecoreEGenericTypeAspect._privk3__visitToAddRelations((org.eclipse.emf.ecore.EGenericType)_self,theSlicer);
    	     } else  if (_self instanceof java.lang.Object){
    	      strictecore.__SlicerAspect__._privk3__visitToAddRelations((java.lang.Object)_self,theSlicer);
    	     } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); }
  }
  
  public static orgeclipseemfecoreEGenericTypeAspectEGenericTypeAspectProperties _self_;
  
  private static void super_feedOpposites(final EGenericType _self) {
     strictecore.__SlicerAspect__._privk3_feedOpposites(_self);
  }
  
  protected static void _privk3_feedOpposites(final EGenericType _self) {
    orgeclipseemfecoreEGenericTypeAspect.super_feedOpposites(_self);
    EGenericType _eUpperBound = _self.getEUpperBound();
    if (_eUpperBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.feedOpposites(_eUpperBound);
    }
    EList<EGenericType> _eTypeArguments = _self.getETypeArguments();
    final Consumer<EGenericType> _function = new Consumer<EGenericType>() {
      public void accept(final EGenericType it) {
        orgeclipseemfecoreEGenericTypeAspect.feedOpposites(it);
      }
    };
    _eTypeArguments.forEach(_function);
    EGenericType _eLowerBound = _self.getELowerBound();
    if (_eLowerBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.feedOpposites(_eLowerBound);
    }
  }
  
  private static void super_reinit(final EGenericType _self) {
     strictecore.__SlicerAspect__._privk3_reinit(_self);
  }
  
  protected static void _privk3_reinit(final EGenericType _self) {
    orgeclipseemfecoreEGenericTypeAspect.super_reinit(_self);
    EGenericType _eUpperBound = _self.getEUpperBound();
    if (_eUpperBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.reinit(_eUpperBound);
    }
    EList<EGenericType> _eTypeArguments = _self.getETypeArguments();
    final Consumer<EGenericType> _function = new Consumer<EGenericType>() {
      public void accept(final EGenericType it) {
        orgeclipseemfecoreEGenericTypeAspect.reinit(it);
      }
    };
    _eTypeArguments.forEach(_function);
    EGenericType _eLowerBound = _self.getELowerBound();
    if (_eLowerBound!=null) {
      orgeclipseemfecoreEGenericTypeAspect.reinit(_eLowerBound);
    }
  }
  
  private static void super__visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
     strictecore.__SlicerAspect__._privk3__visitToAddClasses(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddClasses(final EGenericType _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEGenericTypeAspect.super__visitToAddClasses(_self, theSlicer);
  }
  
  private static void super__visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
     strictecore.__SlicerAspect__._privk3__visitToAddRelations(_self,theSlicer);
  }
  
  protected static void _privk3__visitToAddRelations(final EGenericType _self, final StrictEcore theSlicer) {
    orgeclipseemfecoreEGenericTypeAspect.super__visitToAddRelations(_self, theSlicer);
  }
}
