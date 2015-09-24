package fr.inria.diverse.iot2.iot2.aspects;

import fr.inria.diverse.iot2.iot2.iot2.ActivityEdge;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties;
import fr.inria.diverse.iot2.iot2.aspects.NamedElementAspect;
import fr.inria.diverse.iot2.iot2.aspects.Offer;
import fr.inria.diverse.iot2.iot2.aspects.Token;

@Aspect(className = ActivityEdge.class)
@SuppressWarnings("all")
public class ActivityEdgeAspect extends NamedElementAspect {
  public static void sendOffer(final ActivityEdge _self, final List<Token> tokens) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_sendOffer(_self_, _self,tokens);
  }
  
  public static List<Token> takeOfferedTokens(final ActivityEdge _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_takeOfferedTokens(_self_, _self);
    return (java.util.List<fr.inria.diverse.iot2.iot2.aspects.Token>)result;
  }
  
  public static boolean hasOffer(final ActivityEdge _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_hasOffer(_self_, _self);
    return (boolean)result;
  }
  
  public static List<Offer> offers(final ActivityEdge _self) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    Object result = null;
    result =_privk3_offers(_self_, _self);
    return (java.util.List<fr.inria.diverse.iot2.iot2.aspects.Offer>)result;
  }
  
  public static void offers(final ActivityEdge _self, final List<Offer> offers) {
    fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectProperties _self_ = fr.inria.diverse.iot2.iot2.aspects.ActivityEdgeAspectActivityEdgeAspectContext.getSelf(_self);
    _privk3_offers(_self_, _self,offers);
  }
  
  protected static void _privk3_sendOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final List<Token> tokens) {
    final Offer offer = new Offer();
    final Consumer<Token> _function = (Token token) -> {
      offer.offeredTokens.add(token);
    };
    tokens.forEach(_function);
    List<Offer> _offers = ActivityEdgeAspect.offers(_self);
    _offers.add(offer);
  }
  
  protected static List<Token> _privk3_takeOfferedTokens(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    final ArrayList<Token> tokens = new ArrayList<Token>();
    List<Offer> _offers = ActivityEdgeAspect.offers(_self);
    final Consumer<Offer> _function = (Offer o) -> {
      tokens.addAll(o.offeredTokens);
    };
    _offers.forEach(_function);
    List<Offer> _offers_1 = ActivityEdgeAspect.offers(_self);
    _offers_1.clear();
    return tokens;
  }
  
  protected static boolean _privk3_hasOffer(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    List<Offer> _offers = ActivityEdgeAspect.offers(_self);
    final Function1<Offer, Boolean> _function = (Offer o1) -> {
      return Boolean.valueOf(o1.hasTokens());
    };
    return IterableExtensions.<Offer>exists(_offers, _function);
  }
  
  protected static List<Offer> _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOffers") &&
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
    
    return _self_.offers;
  }
  
  protected static void _privk3_offers(final ActivityEdgeAspectActivityEdgeAspectProperties _self_, final ActivityEdge _self, final List<Offer> offers) {
    _self_.offers = offers; try {
    
    			for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    				if (m.getName().equals("set" + "Offers")
    						&& m.getParameterTypes().length == 1) {
    					m.invoke(_self, offers);
    
    				}
    			}
    		} catch (Exception e) {
    			// Chut !
    		} 
  }
}
