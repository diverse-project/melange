package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import fr.inria.diverse.iot2.iot2.iot2.ActivityNode;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspect;
import fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.Context;
import fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@Aspect(className = ActivityNode.class)
@SuppressWarnings("all")
public class ActivityNodeAspect extends NamedElementAspect {
  @OverrideAspectMethod
  public static void execute(final ActivityNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.JoinNode){
     fr.inria.diverse.iot2.iot2.aspects.JoinNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.JoinNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.OpaqueAction){
     fr.inria.diverse.iot2.iot2.aspects.OpaqueActionAspect.execute((fr.inria.diverse.iot2.iot2.iot2.OpaqueAction)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.MergeNode){
     fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.MergeNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ForkNode){
     fr.inria.diverse.iot2.iot2.aspects.ForkNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ForkNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityFinalNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.ActivityFinalNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.DecisionNode){
     fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.DecisionNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.InitialNode){
     fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspect.execute((fr.inria.diverse.iot2.iot2.iot2.InitialNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_execute(_self_, (fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,c);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.NamedElement){
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect.execute((fr.inria.diverse.iot2.iot2.iot2.NamedElement)_self,c);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static void terminate(final ActivityNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_terminate(_self_, _self);
  }
  
  public static boolean isReady(final ActivityNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_isReady(_self_, _self);
    return (boolean)result;
  }
  
  public static void sendOffers(final ActivityNode _self, final List<Token> tokens) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.DecisionNode){
     fr.inria.diverse.iot2.iot2.aspects.DecisionNodeAspect.sendOffers((fr.inria.diverse.iot2.iot2.iot2.DecisionNode)_self,tokens);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
     fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_sendOffers(_self_, (fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self,tokens);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
  }
  
  public static List<Token> takeOfferdTokens(final ActivityNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_takeOfferdTokens(_self_, _self);
    return (java.util.List<fr.inria.diverse.iot2.iot2.aspects.Token>)result;
  }
  
  /**
   * @generated NOT
   */
  public static void addTokens(final ActivityNode _self, final List<Token> tokens) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_addTokens(_self_, _self,tokens);
  }
  
  public static boolean hasOffers(final ActivityNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.MergeNode){
    result = fr.inria.diverse.iot2.iot2.aspects.MergeNodeAspect.hasOffers((fr.inria.diverse.iot2.iot2.iot2.MergeNode)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.InitialNode){
    result = fr.inria.diverse.iot2.iot2.aspects.InitialNodeAspect.hasOffers((fr.inria.diverse.iot2.iot2.iot2.InitialNode)_self);
    } else  if (_self instanceof fr.inria.diverse.iot2.iot2.iot2.ActivityNode){
    result = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspect._privk3_hasOffers(_self_, (fr.inria.diverse.iot2.iot2.iot2.ActivityNode)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (boolean)result;
  }
  
  public static void removeToken(final ActivityNode _self, final Token token) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_removeToken(_self_, _self,token);
  }
  
  private static List<Token> heldTokens(final ActivityNode _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_heldTokens(_self_, _self);
    return (java.util.List<fr.inria.diverse.iot2.iot2.aspects.Token>)result;
  }
  
  private static void heldTokens(final ActivityNode _self, final List<Token> heldTokens) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityNodeAspectActivityNodeAspectContext.getSelf(_self);
    _privk3_heldTokens(_self_, _self,heldTokens);
  }
  
  private static void super_execute(final ActivityNode _self, final Context c) {
    fr.inria.diverse.iot2.iot2.aspects.NamedElementAspectNamedElementAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.NamedElementAspectNamedElementAspectContext.getSelf(_self);
     fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect._privk3_execute(_self_, _self,c);
  }
  
  protected static void _privk3_execute(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Context c) {
  }
  
  protected static void _privk3_terminate(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    _self.setRunning(false);
  }
  
  protected static boolean _privk3_isReady(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    return _self.isRunning();
  }
  
  protected static void _privk3_sendOffers(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final List<Token> tokens) {
    EList<ActivityEdge> _outgoing = _self.getOutgoing();
    final Consumer<ActivityEdge> _function = (ActivityEdge edge) -> {
      ActivityEdgeAspect.sendOffer(edge, tokens);
    };
    _outgoing.forEach(_function);
  }
  
  protected static List<Token> _privk3_takeOfferdTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    final ArrayList<Token> allTokens = new ArrayList<Token>();
    EList<ActivityEdge> _incoming = _self.getIncoming();
    final Consumer<ActivityEdge> _function = (ActivityEdge edge) -> {
      final List<Token> tokens = ActivityEdgeAspect.takeOfferedTokens(edge);
      for (final Token token : tokens) {
        {
          token.withdraw();
          token.holder = _self;
        }
      }
      allTokens.addAll(tokens);
    };
    _incoming.forEach(_function);
    return allTokens;
  }
  
  protected static void _privk3_addTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final List<Token> tokens) {
    for (final Token token : tokens) {
      {
        Token transferredToken = token.transfer(_self);
        List<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
        _heldTokens.add(transferredToken);
      }
    }
  }
  
  protected static boolean _privk3_hasOffers(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    boolean hasOffer = true;
    EList<ActivityEdge> _incoming = _self.getIncoming();
    for (final ActivityEdge edge : _incoming) {
      boolean _hasOffer = ActivityEdgeAspect.hasOffer(edge);
      boolean _not = (!_hasOffer);
      if (_not) {
        hasOffer = false;
      }
    }
    return hasOffer;
  }
  
  protected static void _privk3_removeToken(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final Token token) {
    List<Token> _heldTokens = ActivityNodeAspect.heldTokens(_self);
    _heldTokens.remove(token);
  }
  
  protected static List<Token> _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getHeldTokens") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.heldTokens;
  }
  
  protected static void _privk3_heldTokens(final ActivityNodeAspectActivityNodeAspectProperties _self_, final ActivityNode _self, final List<Token> heldTokens) {
    _self_.heldTokens = heldTokens; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setHeldTokens")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, heldTokens);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
