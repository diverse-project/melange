package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import fr.inria.diverse.iot2.iot2.iot2.BooleanValue;
import fr.inria.diverse.iot2.iot2.iot2.BooleanVariable;
import fr.inria.diverse.iot2.iot2.iot2.ControlFlow;
import fr.inria.diverse.iot2.iot2.iot2.DecisionNode;
import fr.inria.diverse.iot2.iot2.iot2.Value;
import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspect;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@Aspect(className = DecisionNode.class)
@SuppressWarnings("all")
public class DecisionNodeAspect extends ActivityNodeAspect {
  @OverrideAspectMethod
  public static void execute(final DecisionNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.DecisionNode){
     fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.DecisionNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  @OverrideAspectMethod
  public static void sendOffers(final DecisionNode _self, final List<Token> tokens) {
    fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspectDecisionNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.DecisionNode){
     fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspect._privk3_sendOffers(_self_, (fr.inria.diverse.iot2.iot2.iot2.DecisionNode)_self,tokens);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect.sendOffers((fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,tokens);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  private static void super_execute(final DecisionNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final DecisionNodeAspectDecisionNodeAspectProperties _self_, final DecisionNode _self, final Context c) {
    c.output.executedNodes.add(_self);
    List<Token> _takeOfferdTokens = ActivityNodeAspect.takeOfferdTokens(_self);
    DecisionNodeAspect.sendOffers(_self, _takeOfferdTokens);
  }
  
  private static void super_sendOffers(final DecisionNode _self, final List<Token> tokens) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_sendOffers(_self_, _self,tokens);
  }
  
  protected static void _privk3_sendOffers(final DecisionNodeAspectDecisionNodeAspectProperties _self_, final DecisionNode _self, final List<Token> tokens) {
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    for (final ActivityEdge edge : _outgoing) {
      boolean _and = false;
      if (!(edge instanceof ControlFlow)) {
        _and = false;
      } else {
        BooleanVariable _guard = ((ControlFlow) edge).getGuard();
        boolean _notEquals = (!Objects.equal(_guard, null));
        _and = _notEquals;
      }
      if (_and) {
        BooleanVariable _guard_1 = ((ControlFlow) edge).getGuard();
        Value _currentValue = _guard_1.getCurrentValue();
        boolean _isValue = ((BooleanValue) _currentValue).isValue();
        if (_isValue) {
          ActivityEdgeAspect.sendOffer(edge, tokens);
        }
      }
    }
  }
}
