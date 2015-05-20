package Expressions

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import Expressions.Expression
import Expressions.Statement
import Expressions.Literal
import Expressions.IntegerLit
import Expressions.StringLit
import Expressions.ArithmeticExpression
import Expressions.VarDeclaration
import Expressions.VarReference
import java.util.Hashtable

@Aspect(className=Expression)
abstract class ExpressionAspect {
	
	def abstract public void eval (Hashtable<java.lang.String, Object> context)
	
	def public Object value(Hashtable<java.lang.String, Object> context){
		return null
	}
}

@Aspect(className=Statement)
class StatementAspect extends ExpressionAspect {
	
	@OverrideAspectMethod
	def public void eval (Hashtable<java.lang.String, Object> context) { 
		for(Expression _expression : _self.expressions){
			_expression.eval(context)
		}
	}	
}

@Aspect(className=Literal)
abstract class LiteralAspect extends ExpressionAspect {

}

@Aspect(className=IntegerLit)
class IntegerAspect extends LiteralAspect {
	@OverrideAspectMethod
	def public Object value (Hashtable<java.lang.String, Object> context) { 
		return new java.lang.Integer(_self.value)	
	}
}

@Aspect(className=StringLit)
class StringAspect extends LiteralAspect {
	@OverrideAspectMethod
	def public Object value (Hashtable<java.lang.String, Object> context) { 
		return new java.lang.String(_self.value)
	}
}

@Aspect(className=ArithmeticExpression)
class ArithmeticExpressionAspect extends ExpressionAspect {

	def public Object value (Hashtable<java.lang.String, Object> context) { 
		// Obtaining the value of the left hand expression
		var Object leftValue = null
		if(_self.left instanceof ArithmeticExpression)
			leftValue = (_self.left as ArithmeticExpression).value(context)
		else if(_self.left instanceof Literal)
			leftValue = (_self.left as Literal).value(context)
		else if(_self.left instanceof VarReference)
			leftValue = (_self.left as VarReference).value(context)
			
		// Obtaining the value of the right hand expression
		var Object rightValue = null
		if(_self.right instanceof ArithmeticExpression)
			rightValue = (_self.right as ArithmeticExpression).value(context)
		else if(_self.right instanceof Literal)
			rightValue = (_self.right as Literal).value(context)
		else if(_self.right instanceof VarReference)
			rightValue = (_self.right as VarReference).value(context)
		
			
		// Performing the operation
		var int result
		if(_self.operator.value == 0){
			result = (leftValue as Integer).intValue + (rightValue as Integer).intValue
		}else if(_self.operator.value == 1){
			result = (leftValue as Integer).intValue - (rightValue as Integer).intValue
		}else if(_self.operator.value == 2){
			result = (leftValue as Integer).intValue * (rightValue as Integer).intValue
		}else{
			result = (leftValue as Integer).intValue / (rightValue as Integer).intValue
		}
		return new java.lang.Integer(result)
	}
}

@Aspect(className=VarDeclaration)
class VarDeclarationAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def public void eval (Hashtable<java.lang.String, Object> context) { 
		context.put(_self.name, _self.expr.value(context))
	}
}

@Aspect(className=VarReference)
class VarReferenceAspect extends ExpressionAspect {
	@OverrideAspectMethod
	def public Object value (Hashtable<java.lang.String, Object> context) { 
		return context.get(_self.name)
	}
}