package simple.imperative.aspects

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import simpleimperativelanguage.Expression
import simpleimperativelanguage.Literal
import simpleimperativelanguage.IntegerLit
import simpleimperativelanguage.StringLit
import simpleimperativelanguage.BoolLit
import simpleimperativelanguage.ArithmeticExpression
import simpleimperativelanguage.VarReference
import simpleimperativelanguage.RelationalExpression

import java.util.Hashtable
import simpleimperativelanguage.GetFromMemory

@Aspect(className=Expression)
abstract class ExpressionAspect {
	
	def public Object obtainValue(Hashtable<java.lang.String, Object> context)
}

@Aspect(className=Literal)
abstract class LiteralAspect extends ExpressionAspect {}

@Aspect(className=IntegerLit)
class IntegerLitAspect extends ExpressionAspect {
	
	@OverrideAspectMethod
	def public Object obtainValue(Hashtable<java.lang.String, Object> context){
		return new java.lang.Integer(_self.value)
	}
}

@Aspect(className=StringLit)
class StringLitAspect extends LiteralAspect {
	
	@OverrideAspectMethod
	def public Object obtainValue(Hashtable<java.lang.String, Object> context){
		return new java.lang.Boolean(_self.value)
	}
}

@Aspect(className=BoolLit)
class BoolLitAspect extends LiteralAspect {
	
	@OverrideAspectMethod
	def public Object obtainValue(Hashtable<java.lang.String, Object> context){
		return new java.lang.Boolean(_self.value)
	}
}

@Aspect(className=VarReference)
class VarReferenceAspect extends LiteralAspect {
	
	@OverrideAspectMethod
	def public Object obtainValue(Hashtable<java.lang.String, Object> context){
		return context.get(_self.ref.name)
	}
}

@Aspect(className=ArithmeticExpression)
class ArithmeticExpressionAspect extends ExpressionAspect {
	
	@OverrideAspectMethod
	def public Object obtainValue(Hashtable<java.lang.String, Object> context){
		
		// 1.  Obtaining the value of the left hand expression
		var Object leftValue = _self.left.obtainValue(context)
		if(leftValue == null)
			leftValue = new Integer(0)
			
		// 2.  Obtaining the value of the right hand expression
		var Object rightValue = _self.right.obtainValue(context)
		if(rightValue == null)
			rightValue = new Integer(0)
		
		// 3. Performing the operation and return the result
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

@Aspect(className=RelationalExpression)
class RelationalExpressionAspect extends ExpressionAspect {
	
	@OverrideAspectMethod
	def public Object obtainValue(Hashtable<java.lang.String, Object> context){
		
		// 1.  Obtaining the value of the left hand expression
		var Object leftValue = _self.left.obtainValue(context)
		
		// 2.  Obtaining the value of the right hand expression
		var Object rightValue = _self.right.obtainValue(context)
		
		// 3. Performing the operation and return the result
		var boolean result
		if(_self.operator.value == 0){
			result = (leftValue as Integer).intValue < (rightValue as Integer).intValue
		}else if(_self.operator.value == 1){
			result = (leftValue as Integer).intValue > (rightValue as Integer).intValue
		}else if(_self.operator.value == 2){
			result = (leftValue as Integer).intValue == (rightValue as Integer).intValue
		}else if(_self.operator.value == 3){
			result = (leftValue as Integer).intValue != (rightValue as Integer).intValue
		}else if(_self.operator.value == 4){
			result = (leftValue as Integer).intValue <= (rightValue as Integer).intValue
		}else if(_self.operator.value == 4){
			result = (leftValue as Integer).intValue >= (rightValue as Integer).intValue
		}
		
		return new java.lang.Boolean(result);
	}
}

@Aspect(className=GetFromMemory)
class GetFromMemoryAspect extends ExpressionAspect {
	
	@OverrideAspectMethod
	def public Object obtainValue(Hashtable<java.lang.String, Object> context){
		return context.get("memory.displays." + _self.key)
	}
}