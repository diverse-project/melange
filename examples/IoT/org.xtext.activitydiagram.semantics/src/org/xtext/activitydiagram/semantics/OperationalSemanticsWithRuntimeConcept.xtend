package org.xtext.activitydiagram.semantics

import activitydiagram.Activity
import activitydiagram.ActivityEdge
import activitydiagram.ActivityFinalNode
import activitydiagram.ActivityNode
import activitydiagram.BooleanBinaryExpression
import activitydiagram.BooleanBinaryOperator
import activitydiagram.BooleanUnaryExpression
import activitydiagram.BooleanUnaryOperator
import activitydiagram.BooleanValue
import activitydiagram.BooleanVariable
import activitydiagram.ControlFlow
import activitydiagram.DecisionNode
import activitydiagram.Expression
import activitydiagram.ForkNode
import activitydiagram.InitialNode
import activitydiagram.InputValue
import activitydiagram.IntegerCalculationExpression
import activitydiagram.IntegerCalculationOperator
import activitydiagram.IntegerComparisonExpression
import activitydiagram.IntegerComparisonOperator
import activitydiagram.IntegerValue
import activitydiagram.IntegerVariable
import activitydiagram.JoinNode
import activitydiagram.MergeNode
import activitydiagram.NamedElement
import activitydiagram.OpaqueAction
import activitydiagram.Value
import activitydiagram.Variable
import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.ReplaceAspectMethod
import java.io.BufferedWriter
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.ArrayList
import java.util.List

import static extension org.xtext.activitydiagram.semantics.ActivityEdgeAspect.*
import static extension org.xtext.activitydiagram.semantics.ActivityNodeAspect.*
import static extension org.xtext.activitydiagram.semantics.ExpressionAspect.*
import static extension org.xtext.activitydiagram.semantics.VariableAspect.*

import org.eclipse.xtend.lib.annotations.Accessors

class Offer {
	@Accessors
	List<Token> offeredTokens = new ArrayList<Token>() ;

	def boolean hasTokens() {
		removeWithdrawnTokens();
		return offeredTokens.size() > 0;
	}

	def void removeWithdrawnTokens() {
		val tokensToBeRemoved = new ArrayList<Token>();
		offeredTokens.forEach [ token |
			if (token.withdrawn) {
				tokensToBeRemoved.add(token);
			}
		]
		this.offeredTokens.removeAll(tokensToBeRemoved);
	}

}

abstract class Token {
	@Accessors
	ActivityNode holder

	def Token transfer(ActivityNode holder) {
		if (this.holder != null) {
			this.withdraw();
		}
		this.holder = holder;
		return this;
	}

	def void withdraw() {
		if (!isWithdrawn()) {
			holder.removeToken(this);
			holder = null;
		}
	}

	def boolean isWithdrawn() {
		return this.holder == null;
	}
}

class Trace {
	@Accessors
	List<ActivityNode> executedNodes = new ArrayList<ActivityNode>();
}

class ControlToken extends Token {
}

class ForkedToken extends Token {
	@Accessors
	Token baseToken ;
	@Accessors
	Integer remainingOffersCount;
}

class Context {
	@Accessors
	Trace output;
	@Accessors
	Activity activity;
	@Accessors
	Context parent;
	@Accessors
	List<InputValue> inputValues ;
	@Accessors
	JoinNode node ;

	new() {
	}

	new(Trace c, Activity a, List<InputValue> inputValues, Context parent) {
		this.output = c
		this.activity = a
		this.inputValues = inputValues
		this.parent = parent
	}

}

@Aspect(className=Activity)
class ActivityAspect extends NamedElementAspect {

	Trace trace

	@ReplaceAspectMethod
	def void main(List<InputValue> value) {
		var c = new Context
		c.getInputValues() += value
		c.setActivity(_self)
		_self.trace = new Trace
		c.setOutput(_self.trace)
		value?.forEach[v|v.getVariable().setCurrentValue(v.getValue());]
		_self.nodes.forEach[n|n.running =true]
		_self.execute(c)
	}

	@OverrideAspectMethod
	def void execute(Context c) {
		_self.locals.forEach[v|v.init(c)]
		_self.nodes.filter[node|node instanceof InitialNode].get(0).execute(c)
		
		var list =  _self.nodes.filter[node|node.hasOffers]
		while (list!=null && list.size>0 ){
			list.get(0).execute(c)
			list =  _self.nodes.filter[node|node.hasOffers]
			
		}
	}

	def void reset() {
		_self.trace = null;
	}

	def void writeToFile() {
		var text = _self.printTrace();
		try {
			var writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(new File("trace/" + _self.getName() + ".txt"))));
			writer.write(text);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	def String printTrace() {
		val text = new StringBuffer();
		_self.trace.executedNodes.forEach[n|text.append(n.getName()); text.append(System.getProperty("line.separator"));]

		_self.getLocals().forEach [ v |
			text.append(v.print);
			text.append(System.getProperty("line.separator"));
		]
		return text.toString();
	}

	def int getIntegerVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof IntegerValue) {
			var integerValue = currentValue as IntegerValue;
			return integerValue.getValue();
		}
		return -1;
	}

	def boolean getBooleanVariableValue(String variableName) {
		var currentValue = _self.getVariableValue(variableName);
		if (currentValue instanceof BooleanValue) {
			var booleanValue = currentValue as BooleanValue;
			return booleanValue.isValue();
		}
		return false;
	}

	def Value getVariableValue(String variableName) {
		var variable = _self.getVariable(variableName);
		var currentValue = variable.getCurrentValue();
		return currentValue;
	}

	def Variable getVariable(String variableName) {
		var allVariables = new ArrayList<Variable>();
		allVariables.addAll(_self.getLocals());
		allVariables.addAll(_self.getInputs());
		for (Variable var1 : allVariables) {
			if (var1.getName().equals(variableName)) {
				return var1;
			}
		}
		return null;
	}

	def void writeTrace() {
		_self.writeToFile;
		_self.reset();
	}

}

@Aspect(className=NamedElement)
class NamedElementAspect {
	def void execute(Context c) {
	}
}

@Aspect(className=ActivityNode)
class ActivityNodeAspect extends NamedElementAspect {
	List<Token> heldTokens = new ArrayList<Token>

	@OverrideAspectMethod
	def void execute(Context c) {
		//_self.sendOffers1(_self.takeOfferdTokens1)
	}

	def void terminate() {
		_self.running = false;
	}

	def boolean isReady() {
		return _self.isRunning();
	}

	def void sendOffers(List<Token> tokens) {
		_self.outgoing.forEach[edge|edge.sendOffer(tokens)]		
	}

	def List<Token> takeOfferdTokens() {
		val allTokens = new ArrayList<Token>();
		_self.getIncoming.forEach[edge|
			val tokens = edge.takeOfferedTokens();
			for (Token token : tokens) {
				token.withdraw();
				token.holder=_self
			}
			allTokens.addAll(tokens);
		]
		return allTokens;
	}

	/**
	 * @generated NOT
	 */
	def void addTokens(List<Token> tokens) {
		for (Token token : tokens) {
			var transferredToken = token.transfer(_self);
			_self.heldTokens.add(transferredToken);
		}
	}

	def boolean hasOffers() {
		var hasOffer = true;
		for (ActivityEdge edge : _self.getIncoming()) {
			if (!edge.hasOffer()) {
				hasOffer = false;
			}
		}
		return hasOffer;
	}

	def void removeToken(Token token) {
		_self.heldTokens.remove(token);
	}

}

@Aspect(className=ActivityEdge)
class ActivityEdgeAspect extends NamedElementAspect {
	public List<Offer> offers = new ArrayList<Offer>

	def void sendOffer(List<Token> tokens) {
		val offer = new Offer;
		tokens.forEach[token|offer.offeredTokens.add(token)];
		_self.offers.add(offer);
	}

	def List<Token> takeOfferedTokens() {
		val tokens = new ArrayList<Token>()
		_self.offers.forEach[o|tokens.addAll(o.offeredTokens)]
		_self.offers.clear();
		return tokens;
	}

	def boolean hasOffer() {
		return _self.offers.exists[o1|o1.hasTokens()]
	}

}

@Aspect(className=ControlFlow)
class ControlFlowAspect extends ActivityEdgeAspect {

}

@Aspect(className=OpaqueAction)
class OpaqueActionAspect extends ActivityNodeAspect {
	public List<Expression> expressions

	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.expressions.forEach[e|e.execute(c)]
		_self.sendOffers(_self.takeOfferdTokens)
	}
}

@Aspect(className=InitialNode)
class InitialNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		var r = new ControlToken
		r.holder = _self
		var list = new ArrayList<Token>
		list.add(r)
		_self.sendOffers(list)
		c.output.executedNodes.add(_self)
	}
	@OverrideAspectMethod
	def boolean hasOffers() {		
		return false;
	}
	
}

@Aspect(className=Expression)
class ExpressionAspect {
	def void execute(Context c) {
	}
}

@Aspect(className=ActivityFinalNode)
class ActivityFinalNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.sendOffers(_self.takeOfferdTokens)
	}
}


@Aspect(className=ForkNode)
class ForkNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		var tokens  =_self.takeOfferdTokens	
		var forkedTokens = new ArrayList<Token>();
		for(Token token : tokens) {
			var forkedToken = new ForkedToken();
			forkedToken.baseToken = token;
			forkedToken.remainingOffersCount = _self.outgoing.size();
			forkedTokens.add(forkedToken);
		}
		_self.addTokens(forkedTokens);
		_self.sendOffers(forkedTokens);
	}
}

@Aspect(className=JoinNode)
class JoinNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		var tokens = _self.takeOfferdTokens
		tokens.forEach[t| if ((t as ForkedToken).remainingOffersCount>1){
			(t as ForkedToken).remainingOffersCount = (t as ForkedToken).remainingOffersCount -1
		}else{
			var list = new ArrayList<Token>
			list.add(t)
			_self.sendOffers(list)
		}
		]
	}
}

@Aspect(className=MergeNode)
class MergeNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)		
		_self.sendOffers(_self.takeOfferdTokens)

	}
	def boolean hasOffers() {
		return  _self.incoming.exists[edge|edge.hasOffer()]
	}
}

@Aspect(className=DecisionNode)
class DecisionNodeAspect extends ActivityNodeAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		c.output.executedNodes.add(_self)
		_self.sendOffers(_self.takeOfferdTokens)

	}
	@OverrideAspectMethod
	def void sendOffers(List<Token> tokens) {
		for (ActivityEdge edge : _self.getOutgoing()) {
			if (edge instanceof ControlFlow &&  ( edge as ControlFlow).guard != null) {
				if ((( edge as ControlFlow).guard.currentValue as BooleanValue).value) {
					edge.sendOffer(tokens);
				}
			}		
		}
	}
}

@Aspect(className=Variable)
class VariableAspect {
	def void execute(Context c) {
	}

	def void init(Context c) {
		_self.currentValue = _self.initialValue
	}

	def String print() {
	}
}

@Aspect(className=IntegerVariable)
class IntegerVariableAspect extends VariableAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as IntegerValue).getValue());
		return text.toString();
	}
}

@Aspect(className=BooleanVariable)
@OverrideAspectMethod
class BooleanVariableAspect extends VariableAspect {
	def void execute(Context c) {
	}

	@OverrideAspectMethod
	def String print() {
		var text = new StringBuffer();
		text.append(_self.getName());
		text.append(" = ");
		text.append((_self.getCurrentValue() as BooleanValue).isValue());
		return text.toString();
	}

}



@Aspect(className=IntegerCalculationExpression)
class IntegerCalculationExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if (_self.operator.value == IntegerCalculationOperator.ADD_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value +
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerCalculationOperator.SUBRACT_VALUE) {
			(_self.assignee.currentValue as IntegerValue).value = (_self.operand1.currentValue as IntegerValue).value -
				(_self.operand2.currentValue as IntegerValue).value
		}

	}
}

@Aspect(className=IntegerComparisonExpression)
class IntegerComparisonExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if (_self.operator.value == IntegerComparisonOperator.EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value ==
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >=
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.GREATER_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value >
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_EQUALS_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <=
				(_self.operand2.currentValue as IntegerValue).value
		} else if (_self.operator.value == IntegerComparisonOperator.SMALLER_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as IntegerValue).value <
				(_self.operand2.currentValue as IntegerValue).value
		}
	}
}

@Aspect(className=BooleanUnaryExpression)
class BooleanUnaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if (_self.operator.value == BooleanUnaryOperator.NOT_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = !(_self.operand.currentValue as BooleanValue).value
		}

	}
}

@Aspect(className=BooleanBinaryExpression)
class BooleanBinaryExpressionAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def void execute(Context c) {
		if (_self.operator.value == BooleanBinaryOperator.AND_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value &&
				(_self.operand2.currentValue as BooleanValue).value
		} else if (_self.operator.value == BooleanBinaryOperator.OR_VALUE) {
			(_self.assignee.currentValue as BooleanValue).value = (_self.operand1.currentValue as BooleanValue).value ||
				(_self.operand2.currentValue as BooleanValue).value
		}
	}
}

