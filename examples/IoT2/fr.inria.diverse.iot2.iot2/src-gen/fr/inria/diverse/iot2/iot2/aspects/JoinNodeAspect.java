package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.JoinNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.ForkedToken;
import fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspectJoinNodeAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@Aspect(className = JoinNode.class)
@SuppressWarnings("all")
public class JoinNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final JoinNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspectJoinNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspectJoinNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.JoinNode){
     fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.JoinNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final JoinNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final JoinNodeAspectJoinNodeAspectProperties _self_, final JoinNode _self, final Context c) {
    c.output.executedNodes.add(_self);
    List<Token> tokens = ActivityNodeAspect.takeOfferdTokens(_self);
    final Consumer<Token> _function = (Token t) -> {
      if (((((ForkedToken) t).remainingOffersCount).intValue() > 1)) {
        ((ForkedToken) t).remainingOffersCount = Integer.valueOf(((((ForkedToken) t).remainingOffersCount).intValue() - 1));
      } else {
        ArrayList<Token> list = new ArrayList<Token>();
        list.add(t);
        ActivityNodeAspect.sendOffers(_self, list);
      }
    };
    tokens.forEach(_function);
  }
}
