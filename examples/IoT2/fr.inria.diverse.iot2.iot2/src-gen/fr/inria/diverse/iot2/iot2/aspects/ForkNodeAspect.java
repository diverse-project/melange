package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import fr.inria.diverse.iot2.iot2.iot2.ForkNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspectForkNodeAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.ForkedToken;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@Aspect(className = ForkNode.class)
@SuppressWarnings("all")
public class ForkNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final ForkNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspectForkNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspectForkNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ForkNode){
     fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.ForkNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final ForkNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final ForkNodeAspectForkNodeAspectProperties _self_, final ForkNode _self, final Context c) {
    c.output.executedNodes.add(_self);
    List<Token> tokens = ActivityNodeAspect.takeOfferdTokens(_self);
    ArrayList<Token> forkedTokens = new ArrayList<Token>();
    for (final Token token : tokens) {
      {
        ForkedToken forkedToken = new ForkedToken();
        forkedToken.baseToken = token;
        EList<ActivityEdge> _outgoing = _self.getOutgoing();
        int _size = _outgoing.size();
        forkedToken.remainingOffersCount = Integer.valueOf(_size);
        forkedTokens.add(forkedToken);
      }
    }
    ActivityNodeAspect.addTokens(_self, forkedTokens);
    ActivityNodeAspect.sendOffers(_self, forkedTokens);
  }
}
