package simple.constraints

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod

import java.util.Hashtable	

import simpleconstraintslanguage.RelationalConstraint
import simpleconstraintslanguage.CRelationalOperator
import simpleconstraintslanguage.CInteger
import simpleconstraintslanguage.CExpression
import simpleconstraintslanguage.CLiteral

import static extension simple.constraints.CExpressionAspect.*
import simpleconstraintslanguage.CVarRef
import simpleconstraintslanguage.Constraint

@Aspect(className=Constraint)
abstract class ConstraintAspect{
	def public boolean evalConstraint(Hashtable<String,Object> context)
}

@Aspect(className=RelationalConstraint)
class RelationalConstraintAspect extends ConstraintAspect{
	
	@OverrideAspectMethod
	def public boolean evalConstraint(Hashtable<String,Object> context){
		if(_self.operator == CRelationalOperator.EQUAL){
			return (_self.left.obtainValue(context) as Integer).intValue == (_self.right.obtainValue(context) as Integer).intValue 
		}else if(_self.operator == CRelationalOperator.NOT_EQUAL){
			return (_self.left.obtainValue(context) as Integer).intValue != (_self.right.obtainValue(context) as Integer).intValue
		}else if(_self.operator == CRelationalOperator.LESS_THAN){
			return (_self.left.obtainValue(context) as Integer).intValue < (_self.right.obtainValue(context) as Integer).intValue
		}else if(_self.operator == CRelationalOperator.GREATER_THAN){
			return (_self.left.obtainValue(context) as Integer).intValue > (_self.right.obtainValue(context) as Integer).intValue
		}else {
			return false;	
		}
	}
}

@Aspect(className=CExpression)
abstract class CExpressionAspect {
	def public Object obtainValue(Hashtable<String,Object> context)
}

@Aspect(className=CLiteral)
abstract class CLiteralAspect extends CExpressionAspect{
	
}

@Aspect(className=CInteger)
class CIntegerAspect extends CLiteralAspect{
	
	@OverrideAspectMethod
	def Object obtainValue(Hashtable<String,Object> context){
		return new Integer(_self.value)
	}
}

@Aspect(className=CVarRef)
class CVarRefAspect extends CExpressionAspect{
	
	@OverrideAspectMethod
	def Object obtainValue(Hashtable<String,Object> context){
		return context.get("memory.displays." + _self.name) as Integer
	}
}