package fr.inria.diverse.iot2.iot2.aspects;

import java.util.Map;
import fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember;
import fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspectExpression_AccessMemberAspectProperties;

@SuppressWarnings("all")
public class Expression_AccessMemberAspectExpression_AccessMemberAspectContext {
  public final static Expression_AccessMemberAspectExpression_AccessMemberAspectContext INSTANCE = new Expression_AccessMemberAspectExpression_AccessMemberAspectContext();
  
  public static Expression_AccessMemberAspectExpression_AccessMemberAspectProperties getSelf(final Expression_AccessMember _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspectExpression_AccessMemberAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Expression_AccessMember, Expression_AccessMemberAspectExpression_AccessMemberAspectProperties> map = new java.util.WeakHashMap<fr.inria.diverse.iot2.iot2.iot2.Expression_AccessMember, fr.inria.diverse.iot2.iot2.aspects.Expression_AccessMemberAspectExpression_AccessMemberAspectProperties>();
  
  public Map<Expression_AccessMember, Expression_AccessMemberAspectExpression_AccessMemberAspectProperties> getMap() {
    return map;
  }
}
