package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.InitialNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.ControlToken;
import fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspectInitialNodeAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@Aspect(className = InitialNode.class)
@SuppressWarnings("all")
public class InitialNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final InitialNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspectInitialNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.InitialNode){
     fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.InitialNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static boolean hasOffers(final InitialNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspectInitialNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspectInitialNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.InitialNode){
    result = fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspect._privk3_hasOffers(_self_, (fr.inria.diverse.iot2.iot2.iot2.InitialNode)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
    result = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.hasOffers((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static void super_execute(final InitialNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self, final Context c) {
    ControlToken r = new ControlToken();
    r.holder = _self;
    ArrayList<Token> list = new ArrayList<Token>();
    list.add(r);
    ActivityNodeAspect.sendOffers(_self, list);
    c.output.executedNodes.add(_self);
  }
  
  private static boolean super_hasOffers(final InitialNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    return  fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_hasOffers(_self_, _self);
  }
  
  protected static boolean _privk3_hasOffers(final InitialNodeAspectInitialNodeAspectProperties _self_, final InitialNode _self) {
    return false;
  }
}
