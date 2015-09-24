package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import fr.inria.diverse.iot2.iot2.iot2.MergeNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspect;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@Aspect(className = MergeNode.class)
@SuppressWarnings("all")
public class MergeNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final MergeNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.MergeNode){
     fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.MergeNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static boolean hasOffers(final MergeNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspectMergeNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.MergeNode){
    result = fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspect._privk3_hasOffers(_self_, (fr.inria.diverse.iot2.iot2.iot2.MergeNode)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
    result = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.hasOffers((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  private static void super_execute(final MergeNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self, final Context c) {
    c.output.executedNodes.add(_self);
    List<Token> _takeOfferdTokens = ActivityNodeAspect.takeOfferdTokens(_self);
    ActivityNodeAspect.sendOffers(_self, _takeOfferdTokens);
  }
  
  protected static boolean _privk3_hasOffers(final MergeNodeAspectMergeNodeAspectProperties _self_, final MergeNode _self) {
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Function1<ActivityEdge, Boolean> _function = (ActivityEdge edge) -> {
      return Boolean.valueOf(ActivityEdgeAspect.hasOffer(edge));
    };
    return IterableExtensions.<ActivityEdge>exists(_incoming, _function);
  }
}
