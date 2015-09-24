package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.NamedElement;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.NamedElementAspectNamedElementAspectProperties;

@Aspect(className = NamedElement.class)
@SuppressWarnings("all")
public class NamedElementAspect {
  public static void execute(final NamedElement _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.Activity){
     fr.inria.diverse.iot2.iot2.aspects.ActivityAspect.execute((fr.inria.diverse.iot2.iot2.iot2.Activity)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.OpaqueAction){
     fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.OpaqueAction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.InitialNode){
     fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.InitialNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityFinalNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.MergeNode){
     fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.MergeNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.JoinNode){
     fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.JoinNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.DecisionNode){
     fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.DecisionNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ForkNode){
     fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ForkNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  protected static void _privk3_execute(final NamedElementAspectNamedElementAspectProperties _self_, final NamedElement _self, final Context c) {
  }
}
